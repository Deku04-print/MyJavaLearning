package ConditionProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double num1,num2,result=0;
    boolean validoperation = true;
    char operator;
    String choice="yes";




    while (choice.equals("yes")) {
        validoperation=true;
        result=0;
        System.out.println("Enter the First Number :");
        num1=sc.nextDouble();

        System.out.println("Enter the Operator (+ , - , * , / , ^ ) :");
        operator=sc.next().charAt(0);

        System.out.println("Enter the Second Number :");
        num2=sc.nextDouble();
        sc.nextLine();


        switch (operator) {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0 !");
                    validoperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Invalid Operation...!! please try again...");
                validoperation = false;
            }

        }

        if(validoperation){

            System.out.println("Result is :"+result);

        }


            System.out.println("Do you want to do more Math ?? (YES or NO) ");
            choice=sc.nextLine().toLowerCase();

    }
        System.out.println("Thank you for using Calculator !!!");
}
}
