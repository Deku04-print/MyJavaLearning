package StringOperations;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("String Is Empty ");
        }else {
            char first = str.charAt(0);

            String rest = str.substring(1).replace(first, '$');


            System.out.println("The Results :" + first+rest);
        }

    }
}
