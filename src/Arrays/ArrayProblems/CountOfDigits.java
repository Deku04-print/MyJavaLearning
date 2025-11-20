package Arrays.ArrayProblems;

import java.util.Scanner;

public class CountOfDigits {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

        int counter=0;

        while(n>0){

            n/=10;
            counter++;
        }
        System.out.println("Count of the digits :"+counter);

    }
}
