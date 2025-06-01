package LoopLearningProblems;

import java.util.Scanner;

public class Star2 {
    //Reverse Star Pattern
    public static void main(String[] args){
        System.out.println("Welcome to Star pattern Printer...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines value :");
        int n = sc.nextInt();
        for (int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
