package Arrays.arraylist_prob;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNum {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arraylist: ");
        int size = sc.nextInt();

        // Input
        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index " + i + ": ");
            int element = sc.nextInt();
            list.add(element);
        }

        // Even numbers with correct index
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if(num % 2 == 0){
                System.out.println("Even number at index " + i + " : " + num);
            }
        }

        // Sum
        int sumEl = 0;
        for(int num : list){
            sumEl += num;
        }
        System.out.println("Sum of elements: " + sumEl);

        // Max
        int max = list.get(0); // better than Integer.MIN_VALUE
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}