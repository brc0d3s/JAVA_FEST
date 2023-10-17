package OOP.Object_Class;

public class This_instance_variable {
    int rollno;
    String name;
    float fee;

    This_instance_variable(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        This_instance_variable s1 = new This_instance_variable(111, "ankit", 5000f);
        This_instance_variable s2 = new This_instance_variable(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
