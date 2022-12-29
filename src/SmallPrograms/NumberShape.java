package SmallPrograms;

/*
 29.  Write    a    java    code    to    display    below,    need    to    use    two    for    loop.
1
2    3
4    5    6
7    8    9    10


 */

public class NumberShape {
    public static void main(String[] args) {
        int k=1;
        for (int i=0; i<5; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(k+++" ");

            }
            System.out.println();
        }
    }
}
