package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st Array:");
        int n = sc.nextInt();
        System.out.println("Enter the size of 2nd Array:");
        int x = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[x];

        // Input for array 1
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element for array1[" + i + "]: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

        // Input for array 2
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the element for array2[" + i + "]: ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));

        // Find common elements and store in arr3
        int[] arr3 = new int[Math.min(n, x)];  // max common elements = size of smaller array
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if (arr1[i] == arr2[j]) {
                    // check for duplicates before storing
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (arr3[k] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        arr3[index++] = arr1[i];
                    }
                    break; // found, no need to check further
                }
            }
        }

        // Print common elements
        if (index == 0) {
            System.out.println("No common elements found.");
        } else {
            int[] result = Arrays.copyOf(arr3, index);
            System.out.println("Common elements: " + Arrays.toString(result));
        }
    }
}
