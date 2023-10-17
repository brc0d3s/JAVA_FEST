package OOP;
import java.util.Scanner;


public class Rectangle {
    Scanner sc= new Scanner(System.in);
    float Length;
    float Width;
    float Area=Length*Width;

    void insert(){
        System.out.println("Enter the Length : ");
        Length=sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter the width : ");
        Width=sc.nextFloat();
    }

    void display(){
        System.out.println("The area is " + Area);
    }
}
