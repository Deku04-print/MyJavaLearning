package MultiDimenArr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIn2d {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number Of rows you want :");
        int row= sc.nextInt();
        System.out.println("Enter the Number Of rows you want :");
        int col= sc.nextInt();

        int[][] arr= new int[row][col];

        for (int i =0;i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print("Enter the Elements");
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i =0;i<row;i++){
            for (int j = 0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }


    }
}
