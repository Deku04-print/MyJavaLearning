package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdArray {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array 1 :");
            int n= sc.nextInt();
            System.out.println("Enter the length of Array 2 :");
            int x= sc.nextInt();

            int[] arr1=new int[n];
            int[] arr2=new int[x];

            for (int i = 0; i <n ; i++) {
                System.out.println("Enter the Value at index ["+i+"] :");
                arr1[i]=sc.nextInt();

            }
            System.out.println("Array 1 :"+Arrays.toString(arr1));
            for (int i = 0; i <x ; i++) {
                System.out.println("Enter the Value at index ["+i+"] :");
                arr2[i]=sc.nextInt();

            }
            System.out.println("Array 2 :"+Arrays.toString(arr2));
        int index=0;
            int[] arr3 = new int[Math.min(n, x)];

            for (int i = 0; i <n ; i++) {
                for(int j=0;j<x;j++){
                    if(arr1[i]==arr2[j]){
                        boolean alreadyExists=false;
                        for (int k = 0; k < index; k++) {

                            if (arr3[k]==arr1[i]) {
                                alreadyExists=true;
                                break;
                            }
                            if (!alreadyExists){
                                arr3[index++]=arr1[i];
                            }

                        }
                    }

                }

            }
            if (index==0){
                System.out.println("No common Element Found !!");
            }else{
                int[] result=Arrays.copyOf(arr3,index);
                System.out.println("Array Of Common Elements :"+Arrays.toString(arr3));
            }
        }


}

