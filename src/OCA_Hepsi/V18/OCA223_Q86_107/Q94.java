package OCA_Hepsi.V18.OCA223_Q86_107;


public class Q94 {

}

class Person {
    String name; //eger ikinci metod calissaydi, Person p2 = new Person("Walter", 52); Walter buraya gelemezdi ve
    // name olarak null degerini alirdi
    int age = 25;

    //    Person person = new Person("Ali");
    Person(String name) {    // line n1
//        super();
        setName(name);
    }

    public Person(String name, int age) {    // line n2
        new Person(name); //bu bir contructor oldugu icin, metodun cagrilmasi bekleniyor
//         new anahtar kelimesiyle
//        person.
        //burada setName(name) olmadigi icin bu constructor un icindeki name kismi alinamiyor ve new Person(name),
        // new keyword olup calissaydi tek parametreli contructor u cagiracak ve ona islem yaptiracak, name kismina
        // herhangi birsey atanmamis oldugundan dolayi global olan name degerini alir ona da deger atanmadigi icin
        // null olur
        setAge(age);
    }

//    public Person() {  //this(); keyword needs empty constructor
//
//    }
    //super(); keyword can call directly global varibles

    // setter and getter methods go here

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");  //heap memory de yer acti ve degerler olarak name e Jesse ve age e 25 atadi
        // bunu Person@466 yerlestirdi hafizada tutuyor buna giden referans da p1 verildi, bir kutu dusun bu kutunun,
        // bu kutunun adi heap memory deki adi Person@466,  icersine name: Jesse, age: 25 atandi ve bu kutu ya
        // referans olarak p1 degiskeni atandi
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age;
    }

}

/*
 * What is the result?
A. Compilation fails at both line n1 and line n2. 
B. Compilation fails only at line n2. 
C. Compilation fails only at line n1. 
D. Jesse 25Walter 52

Answer: B
 */

// Answer B => compilation fails at line n2
/*
Error on console:
Error:(12, 9) java: cannot find symbol
  symbol:   method Person(java.lang.String)
  location: class Q84.Person
 */
