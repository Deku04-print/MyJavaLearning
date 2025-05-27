package ConditionProblems;

import java.util.Scanner;

public class TerenaryCtoF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.println("Enter the Temperature :");
        temp=sc.nextDouble();

        System.out.println("Convert to Celsius or fahrenheit ? (C or F) :");
        unit=sc.next().toUpperCase();

        newtemp=(unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f°%s", newtemp, unit);

        sc.close();

    }
}
