package Examples;

public class CastingValue {

    public static void main(String[] aba) {


        byte byteValue = 10;
        long longValue = 10L;
        int intValue = 50;
        short shortValue = 20;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longTotal);


        //short shortTotal = (1000+10*(byteValue+shortValue+intValue)); //if we put like this it will show the error
        // and it needs to cast.

        short shortTotal = (short) (1000000000+10*(byteValue+shortValue+intValue));

        System.out.println("The casting value is :"+shortTotal);

        float myFloatValue = 5.25F;
        System.out.println(myFloatValue);









    }
}