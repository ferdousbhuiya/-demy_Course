package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    /*
Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array
cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

Example
Create an ArrayList object called cars that will store strings:

import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

     */

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        //Access an Item
        //To access an element in the ArrayList, use the get() method and refer to the index number:

        // Example
        cars.get(0);



        //Change an Item
        //To modify an element, use the set() method and refer to the index number:

       // Example
        cars.set(0, "Opel");


       // Remove an Item
       // To remove an element, use the remove() method and refer to the index number:

       /// Example
        cars.remove(0);


       // To remove all the elements in the ArrayList, use the clear() method:

      //  Example
     //   cars.clear();

        //Loop Through an ArrayList
       // Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }



        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }





    }
}
