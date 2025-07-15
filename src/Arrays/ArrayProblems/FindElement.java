package Arrays.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {

        static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the Desired Size of the Array :");
        int n=sc.nextInt();

        int[] arr1=new int[n];
        sc.nextLine();

        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter the Element :");
            arr1[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println(" The array you Maked is :"+ Arrays.toString(arr1));

         FindEl(arr1);
         sc.close();
        }

        static void FindEl(int arr[]){
        boolean found = false;
        System.out.print("Enter the Desired Element to be Found :");
        int key=sc.nextInt();
        int i;
        for (i=0;i<arr.length;i++){

            if (arr[i]==key){
                found=true;
                break;
            }else {
                found=false;
            }

        }
        if (found){
                System.out.println("Element Fount At index { "+i+" } !!");


        }else {

                System.out.println("Not Found.....");
        }
            System.out.println("Operation donee...");

    }
}
