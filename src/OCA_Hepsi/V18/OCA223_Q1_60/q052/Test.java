package OCA_Hepsi.V18.OCA223_Q1_60.q052;

public class Test {

    public static void main(String[] args) {

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs[a].length; b++) {  //eger burasi chs[a].length olursa bosluklarin hepsini
                // degerleriyle dolduracak
                // 97  98
                // 99  100  101  102  103
                //diger turlu
                // 97  98
                // 99  100 null null null
                chs[a][b] = " " + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

//What is the result?
//A. 97 98
//    99 100 null null null 
//B. 97 98
//    99 100 101 102 103
//C.	Compilation fails.
//D.	A NullPointerException is thrown at runtime.
//E.	An ArraylndexOutOfBoundsException is thrown at runtime.


class cybertekQ19 {

    public static void main(String[] args) {
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs[a].length; b++) {
                System.out.print(chs[a][b] + " ");
            }
            System.out.println();
        }
    }
}