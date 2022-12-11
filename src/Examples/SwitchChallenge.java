package Examples;

public class SwitchChallenge {
    public static void main(String[] args) {
        /*
        1. Create a method called printDayOfWeek, that takes an int parameter called day,
        but doesn't return any values.
            a. Use the enhanced switch statement, to return the name of the day, based
            on the parameter passed to the switch statement, so that 0 will return
            "Sunday", 1 will return "Monday", and so on. Any number not between 0 and 6,
            should return "Invalid Day".

            b. Use the enhanced switch statement as an expression, returning the result to
            a String named dayOfTheWeek.

            c. Print both the day variable and the dayOfTheWeek variable.

         2. In the main method, call this method for the values 0 through 7.
         3. Bonus: Create a second method called printWeekDay, that uses an if then
         else statement, instead of a switch, to produce the same output.
         */

        // Solution:
        System.out.println("Result of the first method:");
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        System.out.println("\nResult of the second method:\n");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day)
    {
        String dayOfWeek = switch (day) {
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day)
    {
        String dayOfWeek = "Invalid Day";
        if(day == 0)
        {
            dayOfWeek = "Sunday";
        }
        else if(day==1){
            dayOfWeek = "Monday";
        }
        else if(day==2){
            dayOfWeek = "Tuesday";
        }
        else if(day==3){
            dayOfWeek = "Wednesday";
        }
        else if(day==4){
            dayOfWeek="Thursday";
        }
        else if(day==5){
            dayOfWeek="Friday";
        }
        else if(day==6){
            dayOfWeek="Saturday";
        }
        System.out.println(day+" stands for "+ dayOfWeek);
    }
}
