import java.util.Random;
import java.util.Scanner;

public class DiceProg {
    public static void main(String[] args){

        //variable declaration
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int total=0;


        //User input
        System.out.println("Enter the # of times you want to Roll the Dice :");
        int Dr=sc.nextInt();
        //rolling dice
    if (Dr>0){

        for (int i = 0; i <Dr ; i++) {

            int roll=random.nextInt(1,7);
            printDie(roll);
            System.out.println("Dice Rolled :"+roll);
            total+=roll;

        }
        System.out.println("Total Of the Numbers :"+total);
    }else {
        System.out.println("invalid Choice...!!");
    }


    }



        static void printDie(int roll){

            String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

            String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

            String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

            String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

            String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

            String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

            switch(roll){
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.print("Invalid roll");
            }
        }
    }


