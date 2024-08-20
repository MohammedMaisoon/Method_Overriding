class Animals {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Barks");
    }
}

class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Animals dog = new Dog();
        Animals cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

    }
}
