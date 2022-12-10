package Examples;

public class Challaenge_1 {

    public static void main(String[] args) {
    /*
    Step:1 Create a double variable with a value of 20.00
    Step:2 Create a second variable of type double with a value 80.00
    Step:3 add both numbers together, then multiply by 100.00
    Step:4 use the remainder operator, to figure out what the remainder from the result of the operation in step
    three, and 40.00, will be.
    Step:5 create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false
    if its not zero.
    Step:6 output the boolean variable just to see what the result is.
    Step:7 write an if-then statement that displays a message, 'got some remainder', if the
    boolean in step five is not true.

    Solution:
     */

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double firstResult = (firstNumber + secondNumber) * 100.00d;
        double remainder = firstResult % 40.00d;
        System.out.println("The remainder is : "+remainder);
        boolean isRemainderZero = remainder == 0.00;

        System.out.println("IsNoRemainder = "+isRemainderZero);

        if (!isRemainderZero)
        {
            System.out.println("Got some Remainder");
        }

    }
}