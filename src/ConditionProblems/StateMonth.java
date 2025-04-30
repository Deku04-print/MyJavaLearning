package ConditionProblems;

import java.util.Scanner;

public class StateMonth {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Month :");
        int month=sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("January \n 31 days");
            case 2 -> System.out.println("February \n 28 days");
            case 3 -> System.out.println("March \n 31 days");
            case 4 -> System.out.println("April \n 30 days");
            case 5 -> System.out.println("May \n 31 days");
            case 6 -> System.out.println("June \n 30 days");
            case 7 -> System.out.println("July \n 31 days");
            case 8 -> System.out.println("August \n 31 days");
            case 9 -> System.out.println("September \n 30 days");
            case 10 -> System.out.println("October \n 31 days");
            case 11 -> System.out.println("November \n 30 days");
            case 12 -> System.out.println("December \n 31 days");
            default -> System.out.println("Please Enter a Valid Month number!!");
        }
    }
}
