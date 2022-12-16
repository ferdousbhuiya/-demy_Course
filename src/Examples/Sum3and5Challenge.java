package Examples;

public class Sum3and5Challenge {
    /*
    a. Create a loop using a range of numbers from 1 to 1000 inclusive.
    b. Sum all the numbers that can be divided by both 3 and 5.
    c. Print out the numbers that have met the above conditions.
    d. Break out of the loop once  you found 5 numbers that met the conditions above.
    e. After breaking out of the loop, Print the sum of the numbers
        that met the conditions above.
     f. Note: type all code in the main method.
     */

    public static void main(String[] args) {
        int sum = 0;
        int count =0;

        for(int i =1110; count <5 && i<=10000; i++){
            if(i%3==0 && i%5==0){
                System.out.println("The numbers satisfied the conditions : "+ i);
                sum = sum+i;
                count++;
            }
        }
        System.out.println("The summation of these numbers is : "+sum);

    }
}
