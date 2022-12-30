package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMaps {

    /*
    A HashMap however, store items in "key/value" pairs, and you can access
    them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value).
It can store different types: String keys and Integer values,
or the same type, like: String keys and String values:
     */

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
// Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // To access a value in the HashMap, use the get() method and refer to its key:

        capitalCities.get("England");

        //To remove an item, use the remove() method and refer to the key:

        capitalCities.remove("England");

        //To remove all items, use the clear() method:

        //capitalCities.clear();

        //To find out how many items there are, use the size() method:

        capitalCities.size();

        //Loop through the items of a HashMap with a for-each loop.

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }


        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }



        /*

        ***********  Java HashSet   **************
        */

        //Create a HashSet object called cars that will store strings:



        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

//To check whether an item exists in a HashSet, use the contains() method:

        cars.contains("Mazda");

        // To remove an item, use the remove() method:

        cars.remove("Volvo");

       // To remove all items, use the clear() method:

        // cars.clear();

        cars.size();  // for size of HashSet


        for (String i : cars) {
            System.out.println(i);
        }


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }



        // Make a collection
        ArrayList<String> cars1 = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars1.iterator();

        // Print the first item
        System.out.println(it.next());
    }

    }


