package StringOperations;

import java.util.Scanner;

public class UserDomFind {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String email;
        String domain;
        String username;
        System.out.print("Enter your Email :");
        email=sc.nextLine();
        if(email.contains("@")){

            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);

            System.out.println("Username Is :"+username);
            System.out.println("Domain is :"+domain);
        }else{
            System.out.println("You have entered a invalid email...!");
        }


        sc.close();

    }
}
