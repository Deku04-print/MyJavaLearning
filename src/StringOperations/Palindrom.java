package StringOperations;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1=sc.next();

        StringBuilder str2=new StringBuilder(str1);
        String rev= str2.reverse().toString();

        if (str1.equals(rev)){
            System.out.println("Given String Is palindrom...!!");
        }else{
            System.out.println("No it is not what it looks like.....!!");
        }
    }
}
