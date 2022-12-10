package Examples;

public class DataValues {
    public static void main(String [] aba)
    {
        int minimumIntValue = Integer.MIN_VALUE;
        System.out.println("The minimum Interger value is : "+minimumIntValue); // output will be -2147483648


        int maximumIntValue = Integer.MAX_VALUE;
        System.out.println("The maximum Interger value is : "+maximumIntValue);  // output will be : 2147483647

        System.out.println("The range of the 'byte' value is ("+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE+")");
        System.out.println("The range of the 'Short' value is ("+Short.MIN_VALUE+" to "+Short.MAX_VALUE+")");

        System.out.println("The range of the 'integer' value is ("+minimumIntValue+" to "+maximumIntValue+")");
        // the output is : The range of the integer value is (-2147483648 to 2147483647)

    //int mynumber = 2147483648; this value will show an error. because the number is bigger than the maximum value.

        System.out.println("The range of the 'Long' value is ("+Long.MIN_VALUE+" to "+Long.MIN_VALUE+")");


        System.out.println("\n********************************************************\n");

        System.out.println("The range of the 'float' value is ("+Float.MIN_VALUE+" to "+Float.MAX_VALUE+")");
        System.out.println("The range of the 'Double' value is ("+Double.MIN_VALUE+" to "+Double.MAX_VALUE+")");

        System.out.println("The range of the 'float' value is ("+Float.MIN_VALUE+" to "+Float.MAX_VALUE+")");


        int weightinPounds = 456;
        double weightinKilogram = weightinPounds*0.45359237;
        System.out.println(weightinKilogram);


        char myunicode = '\u0044';
        System.out.println(myunicode); // it will print 'D'

        char myDecimalcode = 68;
        System.out.println(myDecimalcode); // this will also print 'D'


        //https://unicode-table.com/en/ this is the website from where we can get the unicode values.

        char myDecimalcode1 = 220;
        System.out.println(myDecimalcode1); // it will print 'Ü'


        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;

        System.out.println("My values are "+myDecimalChar+myUnicodeChar+mySimpleChar); // it will show '???'


    }


}
