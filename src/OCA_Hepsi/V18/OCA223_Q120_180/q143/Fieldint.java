package OCA_Hepsi.V18.OCA223_Q120_180.q143;

public class Fieldint { //Public class Fieldinit
    char c;
    boolean b;
    float f;

    public static void main(String[] args) {
        Fieldint f = new Fieldint();
        f.printAll();
    }

    void printAll() {
        System.out.println("c= " + c);//c=
        System.out.println("b= " + b);//b=false
        System.out.println("f= " + f);//f=0.0
    }

}

//		System.out.println("\u0000");  // 
//Answer: c=
//		b = false
//		f = 0.0