package OOPs.ThisKeyword;

public class Xyz {


    Xyz()
    {
        this(56);
        System.out.println("No argument constructor");
    }
    Xyz(int a)
    {
        //this(); // we can call the other constructor through 'this'
        System.out.println(" Parameterized constructor");
    }
    void display()
    {
        System.out.println("hello");
    }
    void show()
    {
        display(); // here we did not use 'this' keyword but
                    // the compiler used it here, that is not visible.
                    // here 'this' is used to invoke the current class method.
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(10);
        t.show();

        Xyz xyz = new Xyz();
        xyz.show();
    }
}
