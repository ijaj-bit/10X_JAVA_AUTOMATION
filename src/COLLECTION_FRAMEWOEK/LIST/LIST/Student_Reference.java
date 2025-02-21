package COLLECTION_FRAMEWOEK.LIST.LIST;

import java.util.ArrayList;
import java.util.List;

public class Student_Reference {

    public static void main(String[] args) {
        Student s1 = new Student("ABC","23");

        Student s2 = new Student("XYZ","34");

        Student s3 = new Student("PQR","23");

        List myStudent = new ArrayList();

        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();


    }
}
