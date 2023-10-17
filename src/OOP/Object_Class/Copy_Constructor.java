package OOP.Object_Class;

public class Copy_Constructor {
    int id;
    String name;

    // constructor to initialize integer and string
    Copy_Constructor(int i, String n) {
        id = i;
        name = n;
    }

    // constructor to initialize another object
    Copy_Constructor(Copy_Constructor s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Copy_Constructor s1 = new Copy_Constructor(111, "Karan");
        Copy_Constructor s2 = new Copy_Constructor(s1);
        s1.display();
        s2.display();
    }
}
