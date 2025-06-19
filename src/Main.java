import java.util.Scanner;

        public class Main{
    public static void main(String[] args){

        //This is a single line comment

        /* This is a multi-Line
         Comment
          This is ignored
          by Compiler */

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Number :");
        int n = sc.nextInt();

        for (int i=0;i<=10;i++){

            System.out.print(n+" * "+i+"="+(n*i));
            System.out.println();
        }

    }
        }