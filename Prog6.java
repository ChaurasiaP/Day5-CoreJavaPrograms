package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {

        // GET QUOTIENT AND REMAINDER

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend");
        int dividend = sc.nextInt();

        System.out.println("Enter Divisor");
        int divisor = sc.nextInt();

        System.out.println("Remainder is: "+(dividend%divisor));
        System.out.println("Quotient is: "+(dividend/divisor));
    }
}
