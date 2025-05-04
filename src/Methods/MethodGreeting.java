package Methods;

import java.util.Scanner;

public class MethodGreeting {
     static void Greetings(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A GREETING :");
        String str = sc.nextLine();
        System.out.println("Enter a Repeatable value :");
        int n=sc.nextInt();
         for (int i = 0; i < n; i++) {

            System.out.println(str);


         }
        //Here I am adding a change in this code
         //I added this For loop to print the greetings for N number of times
    }
    public static void main(String[] args){
        //calling a static method without creating a object of the Greetings Class

        Greetings();
    }
}
