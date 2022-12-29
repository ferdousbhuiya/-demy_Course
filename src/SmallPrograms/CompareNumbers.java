package SmallPrograms;

public class CompareNumbers {


    /*

      Give    int    a=10,    b=25,    c=35,    d=-10,    compare    these four    int
and    print  out    minimum    one    and    maximum    one.


     */


    public static void main(String[] args) {
        int a = 10, b=-250, c=500, d=45;
        int min;
        int max;

        if (a<b && a<c && a<d)
        {
            min =a;
            System.out.println("Minimum number is : "+min);
        }
        else if(b<a && b<c && b<d)
        {
            min = b;
            System.out.println("Minimum number is : "+min);
        }
        else if(c<a && c<b && c<d)
        {
            min = c;
            System.out.println("Minimum number is : "+min);
        }
        else {
            System.out.println("Minimum number is : "+d);
        }

        if (a>b && a>c && a>d)
        {
            max =a;
            System.out.println("Maximum number is : "+max);
        }
        else if(b>a && b>c && b>d)
        {
            max = b;
            System.out.println("Maximum number is : "+max);
        }
        else if(c>a && c>b && c>d)
        {
            max = c;
            System.out.println("Maximum number is : "+max);
        }
        else {
            System.out.println("Maximum number is : "+d);
        }

    }
}
