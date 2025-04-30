package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOpp {

    public static void main(String[] args){

        int[] arr=new int[5];

        int n=arr.length;

        Scanner sc=new Scanner(System.in);
         for (int i=0;i<n;i++){
             System.out.print("Enter the Element :");
             arr[i]=sc.nextInt();
         }
             System.out.println("Element of the Array :");
         for(int i=0;i<n;i++){
             System.out.println(arr[i]);
         }
        System.out.println("Array is :"+ Arrays.toString(arr));
    }

}
