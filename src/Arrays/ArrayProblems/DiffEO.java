package Arrays.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class DiffEO {

public static void main(String[] args){
    int diff;
    int sume = 0;
    int sumo=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Desired Size for the Array :");
    int n =sc.nextInt();
    int[] arr1=new int[n];
    for (int i = 0; i <n ; i++) {
        System.out.println("Enter the Value for index ["+i+"]");
        arr1[i]=sc.nextInt();

    }
    System.out.println("Array formed :"+ Arrays.toString(arr1));

    for(int j = 0; j<n; j++){
        if(arr1[j]%2==0){
            sume+=arr1[j];

        }else{
            sumo+=arr1[j];
        }
    }
    System.out.println("Sum Of all Even Numbers:"+sume);
    System.out.println("Sum Of all odd Numbers:"+sumo);
    diff=sume-sumo;
    System.out.println("Difference Between Even & Odd Numbers :"+diff);


}
}
