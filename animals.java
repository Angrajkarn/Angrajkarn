import java.util.*;

class Animals {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animals {
    public void animalSound() {
        System.out.println("The pig says: wee wee");

    }
}

class Dog extends Animals {
    public voif animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

public class main {
    public static void main(String args[]) {
        Animals MyAnimals = new Animals();
        Animals myPig = new Pig();
        Animals myDog = new Dog();
        MyAnimals.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}