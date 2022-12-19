package OOPs.Interface;

public class Test implements I1{
    @Override
    public void show() {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String[] arg)
    {
        Test t = new Test();
        t.show();
        t.display();
    }
}
