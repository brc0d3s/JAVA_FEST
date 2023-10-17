package OOP.Object_Class;

/*
 * In this example, we have created a class which has two data members id and name.
 * We are creating the object of the class by new keyword and printing the object's value.
    Here, we are creating a main() method inside the class.
 */
public class Object_and_Class_Example {
    // defining fields
    int id;// field or data member or instance variable
    String name;

    // creating main method inside the Object_and_Class_Example class
    public static void main(String args[]) {
        // Creating an object or instance
        Object_and_Class_Example s1 = new Object_and_Class_Example();// creating an object of Object_and_Class_Example
        // Printing values of the object
        System.out.println(s1.id);// accessing member through reference variable
        System.out.println(s1.name);
    }
}
