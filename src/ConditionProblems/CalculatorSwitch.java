package ConditionProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double num1;
    double num2;
    double result=0;
    boolean validoperation = true;
    char operator;

    System.out.println("Enter the First Number :");
    num1=sc.nextDouble();

    System.out.println("Enter the Operator (+ , - , * , / , ^ ) :");
    operator=sc.next().charAt(0);

    System.out.println("Enter the Second Number :");
    num2=sc.nextDouble();
}}
