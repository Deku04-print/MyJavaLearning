package StringOperations;

import java.util.Scanner;

public class RevString {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String :");
//
//        String s1=sc.nextLine();
//        String arr="";
//        int n=s1.length()-1;
//        for (int i = n; i>=0 ; i--) {
//
//            arr+=s1.charAt(i);
//
//        }
//        System.out.println("Reverse of the String :"+arr);
//    }

















    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string ::");
        String str=sc.nextLine();
        int n=str.length()-1;
        String str2="";

<<<<<<< HEAD
        String s1=sc.nextLine();
        String arr="";
        int n=s1.length()-1;
        System.out.println(n);
        for (int i = n; i>=0 ; i--) {
=======
        for (int i=n;i>=0;i--){
>>>>>>> 5fab54e5eb7591e07b55c0678036f6547336db2a

            str2+=str.charAt(i);

        }
        System.out.println("REVERSE OF THE STRING :"+str2);
    }
}
