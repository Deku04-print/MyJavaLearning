package LoopLearningProblems;

import java.util.Scanner;

public class StarPattern {
    //Star pattern program solved
    public static void main(String[] args){
        System.out.println("Welcome to Star pattern Printer...");
        System.out.println("Please enter the value to print stars :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
