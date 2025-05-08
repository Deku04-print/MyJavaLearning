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

        do {
            System.out.println("Enter a choice :");
            PlayerChoice=sc.next().toLowerCase();

            if (!PlayerChoice.equals("rock") &&
                    !PlayerChoice.equals("paper") &&
                    !PlayerChoice.equals("scissor")){
                System.out.println("Invalid choice....!!");

            }

            ComputerChoice=Choice[random.nextInt(3)];
            System.out.println("Computer CHoice :"+ComputerChoice.toUpperCase());

            if (ComputerChoice.equals(PlayerChoice)){
                System.out.println("It's A TIE ");
            } else if (PlayerChoice.equals("rock") && ComputerChoice.equals("scissor") ||
                    PlayerChoice.equals("scissor") && ComputerChoice.equals("paper") ||
                    PlayerChoice.equals("paper") && ComputerChoice.equals("rock")){

                System.out.println("Stand Proud....!! it's a WIN ");

            }else {
                System.out.println("Youu Lose Bastard......>..<");
            }

            System.out.println("Do you want to Play again....??");
            System.out.println("Input -- >  Yes / No");
            PlayAgain=sc.next().toLowerCase();
        }while (PlayAgain.equals("yes"));

        System.out.println("Thanks For playing budd...!! Seee yaa.....");


    }
}
