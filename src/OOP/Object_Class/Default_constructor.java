package OOP.Object_Class;

public class Default_constructor {
    int id;
    String name;

    // Method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating objects using the default constructor
        Default_constructor d1 = new Default_constructor();
        Default_constructor d2 = new Default_constructor();

        // Displaying values of the objects
        d1.display();
        d2.display();
    }
}
