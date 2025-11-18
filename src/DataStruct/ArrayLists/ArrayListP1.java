package DataStruct.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListP1 {
        static int ave;

    public static void main(String args[]){


        System.out.println("Welcome to the Students marks problem..");
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> students=new ArrayList<>();
       // System.out.println("Enter the  # of strings you want to add  .");

        while(true){


                System.out.println("Enter the Marks :");
                int marks=sc.nextInt();
                students.add(marks);
                sc.nextLine();


                System.out.println("If you want to stop then please choose ::");
                System.out.println("Yes //  No");
                String userCh=sc.nextLine();
                if (userCh.equalsIgnoreCase("yes")){
                    break;
                }

        }
        System.out.println(students);
        int sum=0;
        for (int marks:students){
            sum+=marks;

        }
        ave=sum/students.size();
        System.out.println("The average is :"+ave);
    }
}
