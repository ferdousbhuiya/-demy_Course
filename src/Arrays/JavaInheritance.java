package Arrays;

public class JavaInheritance {

    /*
    We group the "inheritance concept" into two categories:

    1. subclass (child) - the class that inherits from another class
    2. superclass (parent) - the class being inherited from
    To inherit from a class, use the extends keyword.

    In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

     */

    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("This is 'honk' method inside of JavaInheritance class");
    }
}

    class Car extends JavaInheritance {
        private String modelName = "Mustang";    // Car attribute


        public static void main(String[] args) {
            // Create a myCar object
            Car myCar = new Car();

            // Call the honk() method (from the Vehicle class) on the myCar object
            myCar.honk();

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }



