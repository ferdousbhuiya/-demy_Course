package Examples;

public class Challenge_4 {

    /*
    Speed Converter
1. Write a method called toMilesPerHour that has 1 parameter of type double
with the name kilometersPerHour.
This method needs to return the rounded value of the calculation of type long.

If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
needs to return -1 to indicate an invalid value.

Otherwise, if it is positive, calculate the value of miles per hour,
round it and return it. For conversion and rounding, check the notes in the
text below.
     */

    public static void main(String[] args) {

        long speed = toMilesPerHour(-5.6);
        System.out.println(speed);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{

            return Math.round(kilometersPerHour/1.609);
        }
    }
}
