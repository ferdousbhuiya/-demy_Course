package FromChapter70;

public class SharedDigit {
    /*
    Shared Digit
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
     */
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int number1, int number2)
    {
        if((number1<=9 || number1>99) || (number2<=9 || number2>99))
        {
            return false;
        }
        else
        {
            int lastDigit1 = number1%10;
            int secondDigit1= number1/10;
            int lastDigit2 = number2%10;
            int secondDigit2=number2/10;

            if((lastDigit1==lastDigit2)||(lastDigit1==secondDigit2))
            {
                return true;
            }
            else if((secondDigit1==lastDigit2) || (secondDigit1==secondDigit2))
            {
                return true;
            }
            else {
                return false;
            }
        }

    }

}
