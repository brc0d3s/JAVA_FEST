package OOP.Object_Class;

public class Copying_values_without_constructor {
    int id;
    String name;

    Copying_values_without_constructor(int i, String n) {
        id = i;
        name = n;
    }

    Copying_values_without_constructor() {
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Copying_values_without_constructor s1 = new Copying_values_without_constructor(111, "Karan");
        Copying_values_without_constructor s2 = new Copying_values_without_constructor();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}
