package Examples;

public class WhileLoopChallenge_1 {
    /*
    a. Step 1, is to create a method called isEvenNumber, that
        takes a parameter of type int.
        Its purpose is to determine if the argument passed to the
        method is an even number of not.
        Return true from the method, if it's an even number, otherwise return false.

     b. Next, use a while loop to test a range of numbers, from 5 , up to
        and including 20, but printing out only the even numbers, determined by
        the call to the isEvenNumber method.

     */

    public static void main(String[] args) {
        int number =4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount =0;

        while (number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                oddCount++;
                continue;
            }
            System.out.println("Even number "+number);
            evenCount++;
            if(evenCount >=5)
            {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int number)
    {
        if(number>0){
            if(number%2==0)
            {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}
