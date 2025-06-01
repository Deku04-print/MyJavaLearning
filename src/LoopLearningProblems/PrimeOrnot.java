package LoopLearningProblems;

import java.util.Scanner;

public class PrimeOrnot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime=true;
        System.out.println("::: Welcome to prime checker Program :::");
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if (n==2){
            System.out.println(n+" is a Prime number");
        } else if (n<0) {
            System.out.println("Please enter a positive integer..!!");

        }else{
            for (int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(n+" Is a Prime Number..!!");
            }else {
                System.out.println(n+" Is not a Prime Number..!!");
            }
        }

    }
}
