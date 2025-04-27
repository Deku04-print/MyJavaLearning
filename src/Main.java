import java.util.Scanner;

        public class Main{
    public static void main(String[] args){

        //This is a single line comment

        /* This is a multi-Line
         Comment
          This is ignored
          by Compiler */

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        System.out.println("This is the Integer"+x);
        String str=sc.next();
        System.out.println("This is the String"+str);
        sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("This is the String"+str2);


    }
        }