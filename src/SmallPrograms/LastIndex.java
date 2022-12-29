package SmallPrograms;

public class LastIndex {
    /*
    Write    a    Java    program    to    get    the    last    index   of    a    string ,   sample  string:
    “The    quick    brown    fox    jumps    over    the    lazy    dog.”

The Java String class lastIndexOf() method returns the last index of the given character value or substring.
If it is not found, it returns -1. The index counter starts from zero.


     */
    public static void main(String[] args) {
        String text = "The    quick    brown    fox    jumps    over    the    lazy    dog.";
        System.out.println("The index number of '.' is : "+ text.lastIndexOf('i'));

    }
}
