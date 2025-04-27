
import java.util.Scanner;

public class TriTheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        // Optional: Check if it's a valid triangle
        if ((A + B > C) && (A + C > B) && (B + C > A)) {

            if (A == B && B == C) {
                System.out.println("equilateral");
            } else if (A == B || B == C || C == A) {
                System.out.println("isosceles");
            } else {
                System.out.println("scalene");
            }

        } else {
            System.out.println("Invalid triangle");
        }
    }
}

