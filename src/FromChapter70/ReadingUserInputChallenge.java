package FromChapter70;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    /*
    In this challenge, you will read 5 valid numbers from the console,
    entered by the user, and print the sum of those five numbers.

    you will want to check that the numbers entered, are valid integers.
    If not, print out the message "Invalid number" to ehe consle, but
    continue looping, until you do have 5 valid numbers.

    Before the user enters each number, prompt them with the message,
    "Enter number #x:", where x represents the count, 1, 2, 3, etc.

    And as an example there, the first message would look something like,
    "Enter number #1:", and so on.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =1;
        double sum = 0;

        while (counter<=5)
        {
            System.out.println("Enter number #"+counter+":");
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum+=number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("The sum of the 5 numbers = "+sum);
    }
}
