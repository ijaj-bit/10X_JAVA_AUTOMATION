package STRING.TASK;

public class Memory_Pool {

    public static void main(String[] args) {
        String s1  = "hello";//Stored in String Pool(heap)
        String s2 = new String("hello");//Stored in heap outside String Pool

        Integer num1 =10;//Uses Integer Pool
        Integer num2 = Integer.valueOf(10);//auto boxing uses same object from integer pool

        System.out.println(num1==num2);//TRUE-same memory location
        System.out.println(s1==s2);//FALSE-Diffrent memory location


    }
}
