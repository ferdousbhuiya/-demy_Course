package Examples;

public class NASA_Char {
    public static void main(String[] args) {

        char charvalue = 'E';
        switch (charvalue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charvalue + " was not found in the switch");
                break;

        }
    }
}
