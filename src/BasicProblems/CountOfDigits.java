package BasicProblems;

import java.util.Scanner;

//public class CountOfDigits {
//    public static void main(String args[]) {
//        // to store the number of digits
//        int count = 0;
//        // given integer
//        int num = 1254566;
//        System.out.println("given number:: " + num);
//        // loop to count number of digits
//        while(num != 0){
//            num = num / 10;
//            count++;
//        }
//        System.out.println("Number of digits in the given integer are:: " + count);
//    }
//}

public class CountOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n1=sc.nextInt();
        int counter = 0;
        while(n1!=0){
            n1 =n1/10;
            counter++;
        }
        System.out.printf("Total digits : %d",counter);
        sc.close();
    }
}
