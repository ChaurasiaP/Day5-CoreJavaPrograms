package BasicCoreJavaPrograms;

import java.util.Scanner;

public class FP2 {
    // FUNCTIONAL PROGRAMS PROBLEM 2: TRIPPLETS WITH SUM=0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();                    // take array size

        int[] arr = new int[size];                  // initialise array

        for (int i = 0; i < size; i++) {                  // take array input
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
