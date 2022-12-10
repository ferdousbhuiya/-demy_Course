package Examples;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        /*
        We want to create two methods with same name: getDurationString

        1. The first method has one parameter of type int, named seconds.
        2. The second method has two parameters, named minutes and seconds, both ints.
        3. Both methods return a String in the format shown:

        'XXh YYm ZZs'

        Where XX represents the number of hours, YY the number of minutes, and
        ZZ number of seconds.

        a. The first method should in turn call the second method to return its results.


        Add validation to the methods as a bonus:
        a. For the first method, the seconds parameter should be >=0.
        b. For the second method, the minutes parameter should be >=0,
        and the seconds parameter should be >=0, and <=59.

         */

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" +seconds
                    + "), must be a positive integer value";
        }
           return getDurationString(seconds/60, seconds%60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" +minutes
                    + "), must be a positive integer value";
        }
        if(seconds <=0 || seconds >=59){
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
}
