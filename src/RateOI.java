import java.util.Scanner;


public class RateOI {
    public static void main(String[] args){
        Scanner mon=new Scanner(System.in);

        System.out.println("Enter the Principle ");
        int p=mon.nextInt();
        System.out.println("Enter the Rate ");
        int r=mon.nextInt();
        System.out.println("Enter the Tenure  ");
        int t=mon.nextInt();
        double roi= ((p * r * t) / 100);

        System.out.println("Rate of Interest on given Value :"+roi);




    }
}
