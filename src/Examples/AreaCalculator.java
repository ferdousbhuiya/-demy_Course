package Examples;

public class AreaCalculator {
    /*
    Area Calculator
Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.


     */

    public static void main(String[] args) {
        System.out.println(area(8.5));
        System.out.println(area(34, 25));
        System.out.println(area(-7.1));
        System.out.println(area(-23, 12));
    }

    public static double area(double radius)
    {
        if(radius <0 ){
            return -1;
        }
        return radius*radius*Math.PI;
    }

    public static double area(double x, double y)
    {
        if(x <0 || y<0){
            return -1;
        }
        return x*y;
    }

}
