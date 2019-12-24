import java.sql.SQLOutput;
import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private int die3;
    private int die4;
    private int die5;
    //private String message = "You rolled " + die1 + "pandas "; //+ die2 + "bamboo " + die3 + "droplets " + (die4 + die5) + " blanks";

    Random r = new Random();
    public Dice() {
        //roll();
    }

    public void roll() {
        // random 5 dice
       // Random r = new Random();
        die1 = r.nextInt(6);

       die2 = r.nextInt(6);
        die3 = r.nextInt(6);
        die4 = r.nextInt(6);
        die5 = r.nextInt(6);
        System.out.println("You rolled " + die1 + "pandas " + die2 + "bamboo " + die3 + "droplets " + (die4 / die5) + " blanks");}}


        // if sum of dice is even or odd print message
       /* int sum = die1; //+ die2 + die3 + die4 + die5;
        if (sum / 2 == 0) {
            System.out.println(sum);
        } else {
            System.out.println(message);
        }
    }
}

   /* public int getDie() {
        return die1;
    }
}

    /*
    public int getDie2() {
        return die2;
    }

    public int getDie3() {
        return die3;
    }

    public int getDie4() {
        return die4;
    }

    public int getDie5() {
        return die5;
    }

}
*/
