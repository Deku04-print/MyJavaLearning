package StringOperations;

import java.util.Scanner;

public class StringOp1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1= sc.nextLine();
        System.out.println("Enter the String :");
        String s2= sc.nextLine();


        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.contains("hars"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(0,8));
        System.out.println(s1.subSequence(3,9));
        System.out.println("Replacing h with S :"+s1.replace("h","S"));
        System.out.println(s1.trim());
        System.out.println("Is String 1 is equals string 2"+s1.equals(s2));
        System.out.println("Length Of the String 2 :"+s2.length());


    }
}
