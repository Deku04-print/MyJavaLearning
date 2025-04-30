package ArrayProblems;

import java.util.Scanner;

public class ArraysConcept {

    public static void main(String[] args){
    int[] arr={10,20,30,40,50,60,70,80,90};

        int n = arr.length;
        System.out.println(n);

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){
            //It will print the Arrays elements one by one
            System.out.println(arr[i]);
            //the values are printed
        }

    }



}
