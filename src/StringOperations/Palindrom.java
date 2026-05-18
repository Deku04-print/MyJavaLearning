package StringOperations;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=sc.next().toLowerCase();

        StringBuilder s2=new StringBuilder(s1);
        String rev=s2.reverse().toString();

        if(rev.equals(s1)){
            System.out.println("Given String Is a Palindrome...!!");
        }else{
            System.out.println("Given String Is Not a Palindrome...!!");
        }

    }
}
