package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if (1000 < year && year <= 9999) {
            if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {
                System.out.println("Its a leap year");
            } else {
                System.out.println("Its not a leap year");
            }
        }
    }
}
