package DataStruct.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int choice;
        System.out.println("How much Inputs do you want to fill in the Arrraylist");
        choice =sc.nextInt();
        while(choice>array.size()){
            System.out.println("Enter number :");
            int input=sc.nextInt();
            array.add(input);

        }
        int max=array.get(0);
        int min=array.get(0);

        for(int num:array){
            if (num>max)max=num;
            if(num<min)min=num;
        }
        System.out.println(array);
        System.out.println("Minimum amount in the Array :"+ min);
        System.out.println("Maximum amount in the Array :"+ max);

    }
}
