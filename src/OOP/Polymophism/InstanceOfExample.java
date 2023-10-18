package OOP.Polymophism;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        checkAnimalSound(animal1);
        checkAnimalSound(animal2);
    }

    static void checkAnimalSound(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.makeSound();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.makeSound();
        } else {
            System.out.println("Unknown animal type");
        }
    }
}
