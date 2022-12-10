package Examples;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        /*
        Create two methods with the same name: convertToCentimeters
        1. The first method has one parameter of type int,
        which represents the entire height in inches. You will
        convert inches to centimeters, in this method, and pass
        back the number of centimeters, as a double.
        2. The second method has two parameters of type int, one to
        represent height in feet, and one to represent the
        remaining height in inches. So if a person is 5 feet, 8
        inches, the values 5 for feet and 8 for inches would be passes
        to this method. This method, to get the number of centimeters,
        also returning the value as a double.

        Both methods should return a real number of decimal
        value for total height in centimeters.

         */

        System.out.println("5 ft, 8 inch = " +
                convertToCentimeters(5,8)+"cm");
        System.out.println("68 inch = " +
                convertToCentimeters(68)+"cm");
    }


    public static double convertToCentimeters(int height){
        return height*2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch){
       // return (heightFeet*12+heightInch)*2.54; // or we can use this.

        return convertToCentimeters(heightFeet*12+heightInch);
    }
}
