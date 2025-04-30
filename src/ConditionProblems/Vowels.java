package ConditionProblems;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int i=sc.nextInt();

        String ans=i==2?"Even":"Odd";
        System.out.println(ans);
    }
}
