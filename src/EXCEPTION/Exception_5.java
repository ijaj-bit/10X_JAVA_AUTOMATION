package EXCEPTION;

public class Exception_5 {

    public static void main(String[] args) {
        int a=0;
        int b=0;

        try {
            int c=10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
        catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
