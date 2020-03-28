package mainStructures.toolsModule;

import java.util.ArrayList;

import mainStructures.dataFramework.Table_database;
import mainStructures.saveStockpile.CyDatabase;
import mainStructures.textExecutable.ExecutionTree;
import mainStructures.textExecutable.TreeBuilder;
import mainStructures.textExecutable.commands.CommandJointJOIN;
import mainStructures.textExecutable.commands.CommandProjectionSELECT;
import mainStructures.textExecutable.commands.CommandSelectionWHERE;
import mainStructures.toolsModule.makeAnalysis.SyntaxHandling;

public class Test {
	public static void main(String[] args){
		/*SyntaxHandling test = new SyntaxHandling("SELECT aa.you, bb.him cc.her FROM tb1 AS aa JOIN tb2 AS bb ON condition JOIN tb3 AS cc ON condition WHERE you=1;");
		ArrayList<ExecutionTree> abc = test.getNodes();
		
		CommandJointJOIN join1=new CommandJointJOIN();
		CommandJointJOIN join2=new CommandJointJOIN();*/
	
		
		Table_database tab1=new Table_database("tab1", null);
		Table_database tab2=new Table_database("tab2", null);
		Table_database tab3=new Table_database("tab3", null);
		
		CyDatabase base=new CyDatabase();
		base.addTable(tab1);
		base.addTable(tab2);
		base.addTable(tab3);
		 
		base.serializationSave("fichier.ser");
		base.serializationRead("fichier.ser");
		
		
		
		CyDatabase myDB = new CyDatabase();
		


	


		/*
		String select = "SELECT c.nom, c.prenom " +
				" FROM  (client AS c INNER JOIN commande AS co " +
				" ON (c.id_client = co.id_client)) " +
				" INNER JOIN voiture AS v " +
				" ON (co.id_voiture = v.id_voiture) " +
				" WHERE v.marque = \"Peugeot\" AND co.quantite >= 20; ";
		SyntaxHandling selectSQL = new SyntaxHandling(myDB.getMyTables(),select);
*/

		
		
		

		String creat = "CREATE TABLE adresse(" +
				"id_adresse AUTOINCREMENT, " +
				"numero TEXT, " +
				"nom TEXT, " +
				"ville TEXT, " +
				"code_postal TEXT, " +
				"PRIMARY KEY(id_adresse));";
		SyntaxHandling creatSQL = new SyntaxHandling(myDB.getMyTables(),creat);
		System.out.println(myDB.toString());


		String insert1 = "INSERT INTO adresse (numero, nom, ville, code_postal) " +
				"VALUES (\"2\", \"Jean\", \"Paris\", \"75015\") ;";
		SyntaxHandling insertSQL1 = new SyntaxHandling(myDB.getMyTables(),insert1);
		System.out.println(myDB.getTable("adresse"));


		String insert2 = "INSERT INTO adresse (numero, nom, ville, code_postal) " +
				"VALUES (\"3\", \"Michel\", \"Paris\", \"75005\") ;";
		SyntaxHandling insertSQL2 = new SyntaxHandling(myDB.getMyTables(),insert2);
		System.out.println(myDB.getTable("adresse"));

		System.out.println("wesh?");
		String insert3 = "INSERT INTO adresse (numero, nom, ville, code_postal)" +
				"VALUES (\"8\", \"MACRON\", \"Cergy\", \"95000\") ;";
		SyntaxHandling insertSQL3 = new SyntaxHandling(myDB.getMyTables(),insert3);
		System.out.println(myDB.getTable("adresse"));







		/*
		CommandProjectionSELECT proj=new CommandProjectionSELECT();
		CommandSelectionWHERE sel=new CommandSelectionWHERE();
		
		TreeBuilder tree= new TreeBuilder();
		tree.add(proj);
		tree.add(sel);
		*/
		/*for(ExecutionTree tests : abc) {
		System.out.println(tree.getName(tests));
		}*/
		//tree.buildTree();
}
}
//(tests.getClass().getName()