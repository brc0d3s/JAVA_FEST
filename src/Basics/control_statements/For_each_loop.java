package Basics.control_statements;

public class For_each_loop {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
        System.out.println("Printing the content of the array names:\n");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
