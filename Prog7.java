package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {

        // SWAPPING TWO NUMBERS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1=sc.nextInt();

        System.out.println("Enter num2: ");
        int num2=sc.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping: num1: "+num1+" num2: "+num2);
    }
}
