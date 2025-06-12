package ArrayProblems;//This code find out the index of the Key value which you entered

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Enter the Element of the array of index  "+i+ " :");
            arr[i]=sc.nextInt();

        }
        System.out.println("Array is "+ Arrays.toString(arr));

        System.out.println("Enter the key value to find : ");
        int key=sc.nextInt();

        int ans =-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                ans=i;
                break;
            }

        }
        System.out.println("Value is at Index :"+ans);

    }
}
