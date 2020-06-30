package OCA_Hepsi.V18.OCA223_Q61_71;


	interface I {
  public void displayI();
}

abstract class C22 implements I {
  public void displayC2() {
      System.out.print("C2");
  }
//  public void displayI(){
//
//  }
}


class C11 extends C22 {
  public void displayI() {
      System.out.print("C1");
  }
}

public class Q_66 {
  // And the code fragment:
  public static void main(String[] args) {

      C22 obj1 = new C11(); //obj1 abstract turunden bir degisken ve onun ozelliklerini tasiyor ve C1 objesine referans
      I obj2 = new C11(); //obj2 interface turunden bir degisken ve C1 e objesine referans yapiliyor.

      C22 s = (C22) obj2;
      I t = obj1; //t obj1 referans yapiyor ve obj1 ise C1 objesine referans yapiyor t.displayI da C1 sinifi
      // icerisindeki metodu cagirir
      t.displayI();
      s.displayC2(); //buradaysa C2 ye cast yapilmis (line 31) eger yapilmasaydi hata verirdi,

  }
}
//What is the result?
//A. C1C2
//B. C1C1
//C. Compilation fails.
//D. C2C2
//Answer: A

