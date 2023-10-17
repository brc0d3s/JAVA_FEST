package OOP.Object_Class;

public class This_class_method {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m(); // same as this.m()
        this.m();
    }
}

class TestThis4 {
    public static void main(String args[]) {
        This_class_method obj = new This_class_method();
        obj.n();
    }
}
