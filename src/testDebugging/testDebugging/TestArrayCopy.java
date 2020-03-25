package testDebugging;
/*
public class TestArrayCopy {
    public static void main(String[] args) {

        int i = 0;
        while(true) {
            i++;
            System.out.println(i);
            if(i==5) {break;}
        }


        String[][] tab = new String[6][6];

        String[][] vag = new String[5][5];

        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                tab[i][j]="hello";
            }
        }

        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(vag[i][j]);
            }
            System.out.println();
        }
        vag = tab;


        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                System.out.print(vag[i][j]);
            }
            System.out.println();
        }


        String[][] yes = new String[12][12];
        yes = tab + vag;
        //NOT OK


        for(String[] ha : yes) {
            for(String yo : ha) {
                System.out.print(yo);
            }
            System.out.println();
        }


        String[] c = new String[10];
        int[] array = {1, 2, 3, 4, 5};
        int[] targetArr = new int[10];
        System.arraycopy(array,0,targetArr,3,array.length);
        for(int test : targetArr)
            System.out.println(test);
        //VERY OK


        int[][] mult = new int[5][5];
        int[] sing = new int[] {1,2,3,4,};

        int n =1;
        System.arraycopy(sing,0,mult[n],0,sing.length);
        n=2;
        System.arraycopy(sing,0,mult[n],0,sing.length);
        //PERFECT



    }
}
*/