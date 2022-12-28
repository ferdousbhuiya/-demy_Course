package OOPs.StaticKeyword;

public class Statickwrd {

    static int a=10;
    void m1()
    {
        //static int b=20; // if we use 'static' here for this variable it
                            // will show error.
        int b= 20;
    }
}

class Demo
{
    public static void main(String[] args) {
        //System.out.println(a); // here if we use only 'a' then it will not
                                // call from the previous class. But if we
                                // call through the class name, then it will
                                // the static variable. Example in below.
        System.out.println(Statickwrd.a); // it will not call this variable 'a'
                                        //if it is not static. Non-static
                                    // variable cannot call like this.
                // a non-static variable through object.
    }
}

// example of memory management.

class Employee
{
    int empid;
    String name;
    static String company = "ACBVFG";

    // make a constructor to initialize value.
    Employee(int empid, String name)
    {
        this.empid = empid;
        this.name = name;
    }
    void display()
    {
        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ferdous");
        e1.display();
        Employee e2 = new Employee(102, "Taslima");
        e2.display();

        // for the same company we can use company name one time. In this case we can use static.
    }
}

// By using a 'static' keyword we can make a counter.
// It is used due to its certain properties.

class CounterDemo
{
    static int count = 0;
    CounterDemo()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        CounterDemo counterDemo1 = new CounterDemo();
        CounterDemo counterDemo2 = new CounterDemo();
        CounterDemo counterDemo3 = new CounterDemo();
    }

}
// 'static' method, static method belongs to class not object.

class Test1
{
     static void display()
    {
        System.out.println("1");
    }

    public static void main(String[] args) {

        // if we don't use 'static' before void, then if we want to
        // call this display method, we have to create
        // one object, otherwise it will show error.

        // Test1 t = new Test1();
        // t.display(); // without static keyword

        // when we use static keyword, then we can call directly.

        display();  //or
        Test1.display();
    }
}


        class StaticBlock
        {
            static
            {
                System.out.println("Hello how are you?");
            }

            public static void main(String[] args) {
                System.out.println("This is main method");
            }

            // from here we can see that only static method can run with
            // the main method run. No need to call this static method.
            // it is loaded automatically. But version 1.6 or older version
            //no need the main method. It can run without main method.
            static
            {
                System.out.println("I am second static block");
            }
                // First it will execute all static blocks then it will execute main method.
        }





