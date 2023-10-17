package OOP;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);

    int id;
    String name;
    float salary;

    void insert() {
        System.out.print("Enter ID:");
        id = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Salary:");
        salary = sc.nextFloat();
    }

    void display() {
        System.out.println("Your ID is: " + id);
        System.out.println("Your Name is: " + name);
        System.out.println("Your salary is: " + salary);
    }
}
