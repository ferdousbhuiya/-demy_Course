package OOPs.SuperKeyword;

public class SprB extends Spr{
    int a = 20;

    void m1()
    {
        System.out.println("I am in child class");
    }
    void show(int a)
    {
        System.out.println(a); // this will print 30, this will indicate the local variable
        System.out.println(this.a); // this will print 20, this will indicate the current class instance variable.
        System.out.println(super.a); // this will print 10, this will indicate the parent class instance variable.

        m1(); // It will call from child class.
        this.m1(); // both are same. in previous method, this was hidden.
        super.m1(); // this will call Parent class method.
    }

    public static void main(String[] args) {
        SprB sprB = new SprB();
        sprB.show(30);


    }
}
