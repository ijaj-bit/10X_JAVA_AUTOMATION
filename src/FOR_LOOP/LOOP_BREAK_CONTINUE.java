package FOR_LOOP;

public class LOOP_BREAK_CONTINUE {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            if (i==4)
            {
                break;//it will print value till 4 - 0 1 2 3 =4
            }
            System.out.println(i);
        }
        System.out.println("______________");
        for(int x=0;x<=10;x++)
        {
            if(x==4)//here all the number will be printed except 4
            {
                continue;
            }
            System.out.println(x);
        }
    }


}
