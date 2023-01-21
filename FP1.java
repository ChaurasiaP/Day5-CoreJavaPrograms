package BasicCoreJavaPrograms;

import java.util.Scanner;

public class FP1 {
    // FUNCTIONAL PROGRAMS PROBLEM 1: PRINT 2-D ARRAY
    // print 2d array with user inputs

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();                // get number of rows

        System.out.println("Enter columns: ");
        int cols = sc.nextInt();                // get number of columns

        int[][] a =new int[rows][cols];         // initialise an empty array with given rows and columns

        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]= sc.nextInt();          // getting the elements of array
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");          // printing the 2d array
            }
            System.out.println();
        }
    }
}
