package OCA_Hepsi.V18.OCA223_Q120_180.q128;

public class MyField {
    int x;
    int y;

    public void doStuff(int x, int y) {
        x = x;
        y = this.y;
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;
        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display(); //Global variable olduklari icinn degerleri 0 dir, ancak static int x; static int y; olsaydi m1
        // ile ayni cevabi olurdu
//Answer A.  100 200 : 0 0 :
    }
}
