package BasicProblems;

import java.util.Scanner;

public class sumOfNat {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Welcome to Natural Number calculators....");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("sum of the numbers upto %d = %d",n,sum);

    }
}
