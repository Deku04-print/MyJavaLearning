import java.util.Scanner;

public class WeightCon {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int choice;
        double weight;
        double NewWeight;

        System.out.println("Weight Conversion Program...");

        System.out.println("1>> Convert lbs to kgs");
        System.out.println("2>> Convert kgs to lbs");

        System.out.println("Choose an option..");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("Enter the Weight in lbs :");
            weight=sc.nextDouble();
            NewWeight=weight*0.453592;
            System.out.printf("The Weight in kgs is :%.2f",NewWeight);

        }else if(choice==2){
            System.out.println("Enter the Weight in kgs :");
            weight=sc.nextDouble();
            NewWeight=weight*2.20462;
            System.out.printf("The Weight in kgs is :%.2f",NewWeight);
        }else {
            System.out.println("Please enter a Valid Choice !!");
        }

    }
}
