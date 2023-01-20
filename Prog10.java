package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog10 {

    // FIND THE MAXIMUM FROM THE THREE NUMBERS

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        getMax(num1, num2, num3);
    }

    public static void getMax(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is max");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is max");
        } else {
            System.out.println(num3 + " is max");
        }
    }
}
