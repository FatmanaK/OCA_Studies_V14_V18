package OCA_Hepsi.V18.OCA223_Q181_203;

public class Q184 {
    private double length;
    private double heigth;
    private double area;


    public void setLength(double length){
        this.length = length;

    }
    public void setHeigth(double heigth){
        this.heigth = heigth;

    }


    public void setArea(){
        area = length*heigth;
    }


    public static void main(String[] args) {
        Q184 alan = new Q184();
        System.out.println(alan.area);
    }

}
/*
Which two changes would encapsulate this class and ensure that the area field is always equal to length * height whenever the Rectangle class is used?
A.	Call the setArea method at the end of the setHeight method.
B.	Call the setArea method at the beginning of the setHeight method.
C.	Call the setArea method at the end of the setLength method.
D.	Call the setArea method at the beginning of the setLength method.
E.	Change the setArea method to private.
F.	Change the area field to public.
Answer: AC

 */
