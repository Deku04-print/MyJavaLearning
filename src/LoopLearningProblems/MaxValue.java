package LoopLearningProblems;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the count of the numbers :");
    int n=sc.nextInt();
    int maxValue=Integer.MIN_VALUE;

        for (int i = 1; i <=n ; i++) {
            System.out.println("Enter the Number :");
            int current=sc.nextInt();
            maxValue=Math.max(maxValue,current);

        }
        System.out.println("The Largest Number is :"+maxValue);

    }
}
