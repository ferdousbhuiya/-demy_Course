package SmallPrograms;

public class SeriesSum {

    /*
    Write    a    java    code    to    find    out    sum    of    10-99
     */

    public static void main(String[] args) {
        int sum= 0;
        for(int i = 10; i<=99; i++)
        {
            sum+=i;
        }
        System.out.println("Sum of the series is : "+ sum);
    }
}
