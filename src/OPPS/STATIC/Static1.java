package OPPS.STATIC;

public class Static1 {


    public static void main(String[] args) {
        Student s1 = new Student(24);
        Student s2 = new Student(34);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
        Student.m1();
    }
}

class Student{
    static String course_name="JAVA";
    int age;

    public Student(int age)
    {
        this.age=age;
    }

    static void m1()
    {
        System.out.println("THIS IS STATIC WORLD:");
    }
}