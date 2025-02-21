package OPPS.ABSTRACTION.TASK_AC;

public class BOOK {
    public static void main(String[] args) {
        PrintMyBook myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", "120");
    }
}

abstract class Book{
//    String name;
//    String author;
//    String price;

    public abstract void getDetails(String Name, String Author, String Price);
}

class PrintMyBook extends Book{
    @Override
    public void getDetails(String Name, String Author, String Price) {
//        this.name= Name;
//        this.author= Author;
//        this.price= Price;
        System.out.println(Name +", " + Author +", " + Price);
    }
 }

