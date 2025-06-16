package PracticeUntilSuccess;

import java.util.Scanner;

public class StudentDetails {
        /*Create a class Student with fields name, rollNumber, and grade.
        Use a constructor to initialize values and
          a method to display the data.*/
    public static void main(String[] args){


    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the Name Of the Student :");
    String Sname=sc.nextLine();
    System.out.println("Enter the Age Of the Student :");
    int Sage=sc.nextInt();
    System.out.println("Enter the Roll Of the Student :");
    int Sroll=sc.nextInt();
    System.out.println("Enter the Grade Of the Student :");
    float Sgrade=sc.nextFloat();

    Student student1=new Student(Sname,Sage,Sroll,Sgrade);



    student1.displayStudent();


    sc.close();
    }
}

class Student{

    String name;
    int age;
    int roll;
    float grade;

    Student(String name,int age,int roll,float grade){
        this.name=name;
        this.age=age;
        this.roll=roll;
        this.grade=grade;

    }
    void displayStudent(){
        System.out.println(" Name of the Student Is :"+this.name+"\n Age of the Student :"+this.age+"\n Roll Number :"+this.roll
        +"\n Grade Achieved By Student :"+this.grade);
    }

}