package SmallPrograms;

public class ReplaceStringFirst {
    /*
    Replace    first  “sel” with  “UFT” in    below    string,  “I    have    learnt    sel    and  sel
is    super    useful,    using    sel    a    lot.”

     */

    public static void main(String[] args) {
        String text = "I    have    learnt    sel    and  sel " +
                "is    super    useful,    using    sel    a    lot.";

        System.out.println(text.replaceFirst("sel", "UFT"));
    }
}
