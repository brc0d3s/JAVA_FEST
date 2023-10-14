package Basics.control_statements;

public class Ternary_Operator {
    public static void main(String[] args) {
        int number = 13;
        // Using ternary operator
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);
    }
}
