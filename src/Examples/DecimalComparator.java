package Examples;

public class DecimalComparator {
    public static void main(String[] args) {

        boolean flag = areEqualByThreeDecimalPlaces(1.567, 1.569);
        System.out.println(flag);
    }
    /*
    DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double
numbers are the same up to three decimal places. Otherwise, return false.


     */
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        if ((int)(number1*1000) == (int)(number2*1000)){
            return true;

        }else{
            return false;
        }
    }
}
