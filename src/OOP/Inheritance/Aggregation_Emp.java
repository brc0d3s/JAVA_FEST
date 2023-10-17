package OOP.Inheritance;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Getter methods
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}

public class Aggregation_Emp {
    int id;
    String name;
    Address address;

    public Aggregation_Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.getCity() + " " + address.getState() + " " + address.getCountry());
    }

    public static void main(String[] args) {
        Address address1 = new Address("gzb", "UP", "india");
        Address address2 = new Address("gno", "UP", "india");

        Aggregation_Emp e = new Aggregation_Emp(111, "varun", address1);
        Aggregation_Emp e2 = new Aggregation_Emp(112, "arun", address2);

        e.display();
        e2.display();
    }
}
