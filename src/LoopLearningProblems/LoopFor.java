package LoopLearningProblems;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Table Printer...!!!");
        System.out.println("Enter the Number to print the table :");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "*"+ i + "= " + (n*i));
        }

    }
}
