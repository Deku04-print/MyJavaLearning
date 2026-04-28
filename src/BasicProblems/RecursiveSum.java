package BasicProblems;

import Generic.Pair;

import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args){

//        2. Recursive Sum from 1 to N
//
//Write a Java recursive method to calculate the sum of all numbers from 1 to n.
//        int n =10;
//        int sum=0;
//        for (int i =1;i<=n;i++){
//            sum +=i;
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number untill which you want the Sum :");
        int num1=sc.nextInt();
        System.out.println(sum(1,num1));


    }

    public static int sum(int current,int n){

        if(current >n){
            return 0;
        }
        return current+sum(current+1,n);
    }
}
