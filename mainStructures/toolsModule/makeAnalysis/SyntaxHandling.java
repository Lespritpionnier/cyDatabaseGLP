package mainStructures.toolsModule.makeAnalysis;

import java.util.StringTokenizer;

public class SyntaxHandling {

    StringTokenizer request;

    public SyntaxHandling(String request) {
        this.request = new StringTokenizer(request);
    }


    /*
    if (now = SELECT)
        new BoxSELECT,
        while(now != FROM),
            BoxSELECT.add(now)
            then new BoxJOINorFROM
            while(now != WHERE && now != JOIN && now != ;)
                BoxJOINorFROM.add(now)
                if (now = JOIN)
                    new BoxJOINorFROM
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
