package A14__oops.src.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        String[] name = new String[5];
        int[] rno = new int[5];
        float[] marks = new float[5];

        // instantiating an object out of a class
        Student ranit = new Student();
        ranit.name = "Ranit Manik";
        ranit.rno = 34;
        ranit.mark = 40;

        System.out.println(ranit.name);
        System.out.println(ranit.rno);
        System.out.println(ranit.mark);
    }
}

// creating a class
// classes => datatypes
class Student {
    String name;
    int rno;
    float mark;
}