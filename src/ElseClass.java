import java.util.Scanner;

public class ElseClass {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter a number :");
        long x=sc.nextInt();

        if(x<0){
            System.out.println("Given Number is Negative");
        } else if (x>0) {
            System.out.println("Given Number is Positive ");
        }else{
            System.out.println("Given Number is 0");
        }

    }
}
