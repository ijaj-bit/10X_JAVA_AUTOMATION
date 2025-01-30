package IF_CONDITION;
// ✅ Triangle Classifier:
//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal),
// or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side2 → eq, iso, scalene


import java.util.Scanner;

// Logic Building
// Step 1
// Find the inputs / outputs
// Input | side1,side2,side3 -> data type -> double
// Output | SOP -> String or message -> Equilateral, Isosceles, Scalene.
public class INTERVIWE_TRIAGLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of side 1:");
        double side1=sc.nextDouble();

        System.out.println("Length of side 2:");
        double side2=sc.nextDouble();

        System.out.println("Length of side 3:");
        double side3=sc.nextDouble();

        if(side1==side2 && side1==side3 && side2==side3)
        {
            System.out.println("Equilateral");
        } else if (side1==side2 || side1==side3 || side2!=side3)
        {
            System.out.println("Isosceles");
        }else
        {
            System.out.println("Scalene");
        }

        sc.close();
    }
}



