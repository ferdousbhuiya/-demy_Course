package Examples;

public class Challenge_2 {
    public static void main(String[] args) {
        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if(gameOver)
        {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }*/

    /*
    insert a code segment after the code we have just reviewed:
    1. set the existing score variable to 10,000.
    2. set the existing levelCompleted variable to 8
    3. set the existing bonus variable to 200
    4. use the same if condition (meaning if gameOver is true) you want to perform the same calculation,
        and print out the value of the finalScore variable.
     */

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }


    // Create a method to make easy the process

    public static void calculateScore(boolean gameOver,int score, int levelCompleted,int bonus  )
    {

        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
