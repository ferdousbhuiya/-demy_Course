package Arrays;

import java.util.Scanner;

public class PackageAndAPI {
    /*

    Packages are divided into two categories:

        1. Built-in Packages (packages from the Java API)
        2. User-defined Packages (create your own packages)

        The Java API is a library of prewritten classes, that are free to use,
        included in the Java Development Environment.

        The library contains components for managing input, database programming, and much much more.

        The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

        To use a class or a package from the library, you need to use the import keyword:

        Syntax
        import package.name.Class;   // Import a single class
        import package.name.*;   // Import the whole package

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // In the example above, java.util is a package, while Scanner is a class of the java.util package.

        System.out.println("Please enter your name");

        String name = scanner.next();

        System.out.println("Your name is :"+ name);
    }

}
