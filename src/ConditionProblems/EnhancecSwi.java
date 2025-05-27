package ConditionProblems;

import java.util.Scanner;

public class EnhancecSwi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toUpperCase();

        switch(day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                    System.out.println("It is a weekday 😩");
            case "SATURDAY", "SUNDAY" ->
                    System.out.println("It is the weekend 😀");
            default -> System.out.println(day + " is not a day");
        }
    }
}
