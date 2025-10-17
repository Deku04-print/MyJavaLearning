package LoopLearningProblems;

import java.util.Scanner;

public class StarPattern{
    public static void main(String[] args){
        System.out.println("Welcome to start pattern printer");
        System.out.println("Enter the Rows for printing star pattern...");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}