package Examples;

public class Challenge_3 {
    public static void main(String[] args) {

        /*
        In this challenge we are going to create two methods:
        ********

       A).  The first method should be named displayhighScorePosition.

        1. This method should have two parameters, one for a player's name, and one for a player's
        position in a high score list.
        2. This method should print a message like "Tim managed to get into position 2 on the high score list"'


        ************

       B).  The method should be named calculateHighScorePosition.
        a. This method should have only one parameter, the player's score.
        b. This method should return a number between 1 and 4, based on the score on the score values
        shown in this table.

        --------------------------------------------------------------------------------------------
        Score                                                                               Result
        ----------------------------------------------------------------------------------------------
        Score greater than or equal to 1000                                                     1
        Score greater than or equal to 500 but less than 1000                                   2
        Score greater than or equal to 100 but less than 5oo                                    3
        All other scores                                                                        4
        -----------------------------------------------------------------------------------------------


        ****************
        Finally, we will call both methods and display the results for the following
        scores: 1500, 1000, 500, 100 and 25
        ************************
         */

        // Solution:

        int position = calculateHighScorePosition(1500);
        displayhighScorePosition("Ferdous", position);

        position = calculateHighScorePosition(1000);
        displayhighScorePosition("Taslima", position);

        position = calculateHighScorePosition(500);
        displayhighScorePosition("Tanjina", position);

        position = calculateHighScorePosition(100);
        displayhighScorePosition("Mainu", position);

        position = calculateHighScorePosition(25);
        displayhighScorePosition("Aqsa", position);


    }

    public static int calculateHighScorePosition(int score)
    {


        int position =4;
        if (score >=1000)
        {
            position= 1;
        }
        else if(score >= 500)
        {
            position= 2;
        }
        else if(score >= 100)
        {
            position= 3;
        }
        return position;
    }

    public static void displayhighScorePosition(String name, int position)
    {
        System.out.println(name+" managed to get into position "+position+" on the high score list");
    }



}
