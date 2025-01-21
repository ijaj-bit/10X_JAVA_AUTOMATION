package TERNARY;

public class T_GRADE_CAL {
    public static void main(String[] args) {
        int n=90;
        /*
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
    */

        String result= (n>0 && n<59)?"F":((n>60 && n<69)? "D":((n>70 && n<79)?"C":((n>80 && n<89)? "B":"A")));
        System.out.println("STUDENT GRADE IS:"+result);
    }
}
