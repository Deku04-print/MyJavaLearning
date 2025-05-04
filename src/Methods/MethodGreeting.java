package Methods;

import java.util.Scanner;

public class MethodGreeting {
     static void Greetings(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A GREETING :");
        String str = sc.nextLine();

        System.out.println(str);

    }
    public static void main(String[] args){
        //calling a static method without creating a onject of the Greetings Class

        Greetings();
    }
}
