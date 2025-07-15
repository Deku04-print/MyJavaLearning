package StringOperations;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");

        String s1=sc.nextLine();
        String arr="";
        int n=s1.length()-1;
        System.out.println(n);
        for (int i = n; i>=0 ; i--) {

            arr+=s1.charAt(i);

        }
        System.out.println("Reverse of the String :"+arr);
    }
}
