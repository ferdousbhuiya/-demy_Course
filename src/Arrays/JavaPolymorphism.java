package Arrays;

public class JavaPolymorphism {
    /*

    Polymorphism means "many forms", and it occurs when we have many classes that are
    related to each other by inheritance.

    Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods
    from another class. Polymorphism uses those methods to perform different tasks. This allows
    us to perform a single action in different ways.

    For example, think of a superclass called Animal that has a method called animalSound().
    Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their
    own implementation of an animal sound (the pig oinks, and the cat meows, etc.):


     */

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
    class Cow extends JavaPolymorphism {
        public void animalSound() {
            System.out.println("The Cow says, Hamba, Hamba");
        }

    }

    class Dog extends JavaPolymorphism {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

class Main {
    public static void main(String[] args) {
        JavaPolymorphism myAnimal = new JavaPolymorphism();  // Create an  object of JavaPolymorphism.
        JavaPolymorphism myCow = new Cow();  // Create a Cow object
        JavaPolymorphism myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myCow.animalSound();
        myDog.animalSound();
    }
}
