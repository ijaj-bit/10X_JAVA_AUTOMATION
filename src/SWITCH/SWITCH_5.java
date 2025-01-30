package SWITCH;

public class SWITCH_5 {

    public static void main(String[] args) {

        int itemcode=005;

        switch(itemcode){
        case 001,002,003:
        System.out.println("IT DDEPARTMENT");
        break;

        case 004,005,006:
        System.out.println("HEALTHCARE DEPARTMENT");
        break;

        default:
            System.out.println("No department");
    }
    }
}
