package Arrays.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfn {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=i*i;

        }
        System.out.println("Array Is :"+ Arrays.toString(arr));
    }

}
