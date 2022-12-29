package SmallPrograms;

public class CharaterIndex {
    /*
    Write    a    Java    program    to    get    the    index    of    all    the    characters
    of  the    alphabet.        Sample    string: “peoplentech” Print    out    index    of    each
    character    plus    character    itself.
     */

    public static void main(String[] args) {
        String text= "peoplentech";
        for(int i=0; i<text.length(); i++)
        {
            System.out.println("The index of "+i+ " has the character of "+text.charAt(i));
        }
    }
}
