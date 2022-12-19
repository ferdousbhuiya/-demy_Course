package OOPs.ThisKeyword;

public class ThisDemo {
    void m1 (ThisDemo td) // creating a reference constructor
    {
        System.out.println(" i am in m1 method");
    }
    void m2()
    {
        m1(this); // this is the example of 'this' keyword can be used to pass
                        // as an argument in the method call
    }

    public static void main(String[] args) {
        ThisDemo td  = new ThisDemo();
        td.m2();
    }
}
