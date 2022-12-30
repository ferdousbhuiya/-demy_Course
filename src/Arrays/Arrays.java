package Arrays;

public class Arrays {
    /*
    Java Arrays
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets:

String[] cars;
We have now declared a variable that holds an array of strings. To insert values to it,
you can place the values in a comma-separated list, inside curly braces:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
To create an array of integers, you could write:

int[] myNum = {10, 20, 30, 40};
     */

    public static void main(String[] args) {

        String[] cars;
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars1[0]); // Outputs Volvo
        System.out.println(cars1[3]); // Outputs Mazda

        cars1[0] = "Opel";

        System.out.println(cars1[0]); // Outputs OPel, so, it will replace the value of that index.
        System.out.println(cars1[3]); // Outputs Mazda
        System.out.println(cars1[1]); // Outputs BMW

        // for-each loop

        for(String s:cars1)
        {
            System.out.print(s+" ");
        }

        /*

        Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces:

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers is now an array with two arrays as its elements.

         */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7


        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7



        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }


    }


}
