package mainStructures.toolsModule.makeAnalysis;

import java.util.StringTokenizer;

public class SyntaxHandling {

    StringTokenizer request;

    public SyntaxHandling(String request) {
        this.request = new StringTokenizer(request);
    }


    /**
     *   1SELECT
     *  2FROM
     * 3JOIN
     *
     * 4WHERE
     *  5ORDERBY (ORDERBY | ORDER then BY
     */



    // Il va peut-etre utiliser/creer les objet de textExecutable
}
