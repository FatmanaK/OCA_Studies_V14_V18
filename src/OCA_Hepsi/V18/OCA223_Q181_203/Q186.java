package OCA_Hepsi.V18.OCA223_Q181_203;

public class Q186 {
}

class S1 {
    protected void display(int x) {
        System.out.println("Parent" + x);
    }
}
//active polymorphism
//static binding?

class S2 extends S1 {
    public void display(int x, int y) {
        this.display(x);
        display(y); //buradaki y ifadesi 100 olur ve bu cild e gider ve 100 degerini alir
        super.display(y); //buradaki y ifadesi 100 olur ve bu parent e gider (cunku super. var) ve 100 degerini alir
    }

    public void display(int x) {
        System.out.println("Child " + x);
    }

    public static void main(String[] args) {
        S2 sobj = new S2();
        sobj.display(10, 100);
    }
}

/*
What is the result?
A. Child 10
Child 100
Parent 100
B. Parent 10
Child 10
Parent 1000
C. Child 10
Parent 100
Parent 100
D. A compile time error occurs.

Answer = A
Child 10
Child 100
Parent100
* */
