package OOP.Object_Class;

//Java Program to demonstrate the use of a static method.  

public class Static_method {
    int rollno;
    String name;
    static String college = "ITS";

    // Static method to change the value of the static variable
    static void change() {
        college = "BBDIT";
    }

    // Constructor to initialize the variable
    Static_method(int r, String n) {
        rollno = r;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to create and display the values of the object
class TestStaticMethod {
    public static void main(String args[]) {
        // Calling change method
        Static_method.change();

        // Creating objects
        Static_method s1 = new Static_method(111, "Karan");
        Static_method s2 = new Static_method(222, "Aryan");
        Static_method s3 = new Static_method(333, "Sonoo");

        // Calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
