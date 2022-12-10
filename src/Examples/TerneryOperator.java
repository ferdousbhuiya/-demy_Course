package Examples;

public class TerneryOperator {

    public static void main(String [] args)
    {
        boolean isCar= false;
        if(!isCar)
        {
            System.out.println("This is not supposed to happen");


            //Example of TerneryOperator
            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar != "Volkswagen";

            System.out.println(isDomestic);


            int ageOfClient  = 16;
            String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
            System.out.println("Our client is " + ageText);

            // This Ternery Operator works as when the first condition (before the ? mark) is true, it will take the
            // result of first option.
        }
    }
}
