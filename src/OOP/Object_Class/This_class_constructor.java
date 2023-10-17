package OOP.Object_Class;

public class This_class_constructor {
    This_class_constructor() {
        System.out.println("hello a");
    }

    This_class_constructor(int x) {
        this(); // invoking the default constructor
        System.out.println(x);
    }
}

class TestThis5 {
    public static void main(String args[]) {
        This_class_constructor a = new This_class_constructor(10);
    }
}
