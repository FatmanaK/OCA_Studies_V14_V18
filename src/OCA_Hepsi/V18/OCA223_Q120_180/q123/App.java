package OCA_Hepsi.V18.OCA223_Q120_180.q123;

public class App {

    String myStr = "9009"; //global variable

    public void doStuff(String str) {
        int myNum = 0;


//        if (Integer.parseInt(str) > 7006){
//        	myNum = Integer.parseInt(str);
//		}

        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }  //buradaki myNum degeri guncelleniyor ve 7007 olarak sout a deger olarak gidiyor

        catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");

        //Answer C myStr: 9009, myNum: 7007
    }
}
