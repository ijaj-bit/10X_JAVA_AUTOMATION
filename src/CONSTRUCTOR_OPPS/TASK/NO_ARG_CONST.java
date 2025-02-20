package CONSTRUCTOR_OPPS.TASK;

public class NO_ARG_CONST {

    int id;
    String name;
    NO_ARG_CONST()
    {
        id =100;
        name="FARAN";
    }


    public static void main(String[] args) {
        NO_ARG_CONST Student = new NO_ARG_CONST();
        System.out.println("ID IS: "+Student.id);
        System.out.println("NAMEIS: "+Student.name);
    }
}
