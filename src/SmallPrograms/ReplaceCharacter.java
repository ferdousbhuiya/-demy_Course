package SmallPrograms;

public class ReplaceCharacter {
    /*
    Write    a    Java    program    to    replace    all    the    'd' characters    with
      'f'  characters.sample  string:  “i    likd    workd    deaf    loooddddd    ddoppppp    da    de!!!”
     */
    public static void main(String[] args) {
        String text = "i    likd    workd    deaf    loooddddd    ddoppppp    da    de!!!";
        System.out.println("The replaced string is : "+ text.replace('d', 'f'));
    }
}
