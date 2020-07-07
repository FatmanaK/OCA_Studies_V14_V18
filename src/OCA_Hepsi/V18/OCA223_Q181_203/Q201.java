package OCA_Hepsi.V18.OCA223_Q181_203;

import java.util.Arrays;

public class Q201 {
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {

        Student[] students = new Student[3]; // 0. index olusturulmamis
////      students[0] = new Student("Ali");
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.println(" " + s.name);
        }
    }


//second way

//        Student[] students = new Student[3];
//        students[0] = new Student("Richard");
//        students[1] = new Student("Donald");
//        for (Student s : students) {
//            System.out.println(" " + s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


