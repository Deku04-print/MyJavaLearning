import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String PlayerChoice;
        String ComputerChoice;
        String PlayAgain = "Yes";

        String[] Choice= {"rock","paper","scissor"};

        PlayerChoice=sc.next().toLowerCase();

        if (!PlayerChoice.equals("rock") &&
                (!PlayerChoice.equals("paper") &&
                    (!PlayerChoice.equals("scissor")


    }
}
