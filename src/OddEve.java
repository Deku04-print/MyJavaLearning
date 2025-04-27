import java.util.Scanner;

public class OddEve {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        long num=sc.nextLong();

        if(num==0){
            System.out.println("0 is not even or Odd....");
        } else if (num%2==0){
            System.out.println("Given Number is Even....");
        }else{
            System.out.println("Given Number Is Odd....");
        }


    }
}
