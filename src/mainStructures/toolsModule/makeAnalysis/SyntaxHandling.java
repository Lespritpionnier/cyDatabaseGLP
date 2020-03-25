package mainStructures.toolsModule.makeAnalysis;

import mainStructures.dataFramework.Item_row;
import mainStructures.dataFramework.Row_table;
import mainStructures.dataFramework.Table_database;
import mainStructures.dataFramework.itemTypes.DataBit;
import mainStructures.dataFramework.itemTypes.DataNumber;
import mainStructures.dataFramework.itemTypes.DataText;
import mainStructures.dataFramework.itemTypes.KeyForeign;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.toolsModule.makeAnalysis.comdAutomate.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SyntaxHandling {


    HashMap<String, Table_database> myTables;


    String request;
    ArrayList<ExecutionTree> nodes = new ArrayList<>();


    public ArrayList<ExecutionTree> getNodes() {
        return nodes;
    }

    public SyntaxHandling(HashMap<String, Table_database> myTables, String request) {
        this.myTables = myTables;
        this.request = request;
        StringTokenizer handling = new StringTokenizer(convertSyntax(request));
        makeNodes(handling);
    }


    //This method needs to be improved a bit
    private void makeNodes(StringTokenizer handling) {
        String temp;
        if (handling.hasMoreTokens()){
            temp = handling.nextToken();

            //////////////////////////////////////////////////////////////////////////////////////////////////SELECT
            if(temp.equals("SELECT")){
                ArrayList<String> selectInfo = new ArrayList<>();
                while (handling.hasMoreTokens()){
                    temp = handling.nextToken();
                    if (temp.equals("FROM")){break;}
                    selectInfo.add(temp);
                }
                BoxSELECT boxSelect = new BoxSELECT(selectInfo);
                nodes.add(boxSelect.makeNode());
            }
            if (temp.equals("FROM")) {
                temp = handling.nextToken();
                nodes.add(myTables.get(temp));
                /*BoxFROM boxFrom = new BoxFROM(temp);
                nodes.add(boxFrom.makeNode());
                temp = handling.nextToken();*/
            }
            while (temp.equals("JOIN")){
                temp = handling.nextToken();
                nodes.add(myTables.get(temp));
                //////////////////CONDITION???
                temp = handling.nextToken();
                if(temp.equals("ON")){
                    boxJoin.addChoiceON(handling.nextToken());
                    boxJoin.addChoiceON(handling.nextToken());
                    boxJoin.addChoiceON(handling.nextToken());
                }
                nodes.add(boxJoin.makeNode());
                temp = handling.nextToken();
            }
            if (temp.equals("WHERE")){
                ArrayList<String> whereInfo = new ArrayList<>();
                ///////////////////En 3 parties
                while (handling.hasMoreTokens()){
                    temp = handling.nextToken();
                    if (!temp.equals("AND")){
                        whereInfo.add(temp);
                    }
                }
                BoxWHERE boxWhere = new BoxWHERE(whereInfo);
                nodes.add(boxWhere.makeNode());
            }



            //////////////////////////////////////////////////////////////////////////////////////////////////CREAT
            if(temp.equals("CREAT")){
                temp = handling.nextToken();
                String nameNewTable  = handling.nextToken();

                ArrayList<String> keyHT = new ArrayList<>();
                ArrayList<String> valueHT = new ArrayList<>();
                HashMap<String,String> infoDatatype = new HashMap<>();


                int wish = 2;
                    do { if(wish%2==0){
                        keyHT.add(temp);
                    } else {
                        if (temp.equals("AUTOINCREMENT")){
                            valueHT.add("PRIMARY_KEY");
                        }else if (temp.equals("LONG")){
                            valueHT.add("FOREIGN_KEY");
                        }
                            valueHT.add(temp);
                    }
                        wish++;
                        temp = handling.nextToken();
                    }while (!temp.equals("PRIMARY"));

                for (int index=0 ; index<keyHT.size();index++)
                    infoDatatype.put(keyHT.get(index),valueHT.get(index));
                Table_database yeahTable = new Table_database(nameNewTable,infoDatatype);

                    while (!temp.equals("FOREIGN") && handling.hasMoreTokens()){ temp = handling.nextToken(); }
                        if(temp.equals("FOREIGN")){
                            HashMap<String,String> foreignKeys = new HashMap<>();
                            while (temp.equals("FOREIGN")) {
                                temp = handling.nextToken();
                                String nameTF = handling.nextToken();
                                temp = handling.nextToken();
                                String nameFK = handling.nextToken();
                                foreignKeys.put(nameFK, nameTF);
                                if (handling.hasMoreTokens()) {
                                    temp = handling.nextToken();
                                }
                            }
                            yeahTable.setForeignKeys(foreignKeys);
                        }
                myTables.put(nameNewTable,yeahTable);
            }



            //////////////////////////////////////////////////////////////////////////////////////////////////INSERT
            if(temp.equals("INSERT")) {
                temp = handling.nextToken();
                String nameToTable = handling.nextToken();
                temp = handling.nextToken();
                ArrayList<String> toNameCol = new ArrayList<>();
                    while (!temp.equals("VALUES")){ toNameCol.add(temp); }
                ArrayList<String> newDataCol = new ArrayList<>();
                    while (handling.hasMoreTokens()){ newDataCol.add(temp); }
                Row_table welcome = new Row_table();
                    for (int index=0 ; index<toNameCol.size() ; index++){
                        welcome.put(toNameCol.get(index),
                                makeItem(myTables.get(nameToTable).getColumnsType(toNameCol.get(index)),
                                        newDataCol.get(index)));
                    }
                myTables.get(nameToTable).add(welcome);
            }
        }
    }

    private Item_row makeItem(String columnsType, String value) {
        switch (columnsType){
            case "BIT": {
                DataBit result = new DataBit(value);
                break;
            }
            case "TEXT": {
                DataText result = new DataText(value);
                break;
            }
            case "NUMBER": {
                DataNumber result = new DataNumber(value);
                break;
            }
            case "FOREIGN_KEY": {
                KeyForeign result = new KeyForeign(value);
                break;
            }
        }
        return result;
    }






    //This method needs to be improved a lot
    public String convertSyntax (String originalCommand){
        String onlyWords = (originalCommand.toString().replaceFirst(";", "")).replaceAll(",", "");
        String withoutAS = onlyWords.replaceAll(" AS ","AS");
        ArrayList<String> offAS = new ArrayList<>();
        StringTokenizer checkAS = new StringTokenizer(withoutAS);
        String temp = checkAS.nextToken();
        while (checkAS.hasMoreTokens()) {
            if(Pattern.matches(".*AS.*", temp)) {
                offAS.add(temp);
            }
            temp = checkAS.nextToken();
        }
        for (String mes : offAS) {
            StringTokenizer rep = new StringTokenizer(mes.replaceFirst("AS", " "));
            String tableName = rep.nextToken();
            String nickName = rep.nextToken();
            String offNickName = tableName + "AS" + nickName;
            withoutAS = (withoutAS.replace(nickName + ".", tableName + ".")
            ).replaceAll(offNickName, tableName)
                    .replaceAll("\\("," ").replaceAll("\\)"," ")
                    .replaceAll(","," ").replaceAll(";","").replaceAll("\"","");
        }
        return withoutAS;
    }

















        /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private void startAutomate (StringTokenizer handling){
        String head = handling.nextToken();
        switch (head) {
            case "SELECT": {
                BoxSELECT box = new BoxSELECT(nodes, handling);
                break;
            }
            case "CREAT": {
                BoxCREAT box = new BoxCREAT(nodes, handling);
                break;
            }
            case "INSERT": {
                BoxINSERT box = new BoxINSERT(nodes, handling);
                break;
            }
            case "UPDATE": {
                BoxUPDATE box = new BoxUPDATE(nodes, handling);
                break;
            }
        }
    }
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

/*
    private class BoxSELECT extends AutoBoxArchetype {
        public BoxSELECT(ArrayList<ExecutionTree> nodes, StringTokenizer remain) {
            super(nodes, remain);
        }

        public BoxSELECT(ArrayList<String> selectInfo) {
            super();
        }

        @Override
        public void runAutomate() {
        }

    }



 !!!!!!!!!!!!!!!!!!!*/


    /*
    StringTokenizer request;
    public SyntaxHandling(String request) {
        this.request = new StringTokenizer(request);
    }
    */


    /*
    if (now = SELECT)
        new BoxSELECT,
        while(now != FROM),
            BoxSELECT.add(now)
            then new BoxFROM
            while(now != WHERE && now != JOIN && now != ;)
                BoxJOIN.add(now)
                if (now = JOIN)
                    new BoxJOIN
                    ADD while(!= WHERE && != ;)
                if (now = WHERE)
                    new BoxWHERE
                    ADD while(!= ;)
     */


    /**
     * Use keywords to decider which loop to go in.
     * LIKE: if CREAT is in the Syntax / if SELECT is in the Syntax
     *
     * RULES: Only AND allowed space between the word.
     *
     *
     *
     *   1SELECT
     *  2FROM
     * 3JOIN
     *
     * 4WHERE
     *  5ORDERBY (ORDERBY | ORDER then BY)
     *
     *
     */



    // Il va peut-etre utiliser/creer les objet de textExecutable
}
