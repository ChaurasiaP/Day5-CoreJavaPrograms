package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {

        //  Flip Coin and print percentage of Heads and Tails

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of times to flip the coin: ");
        int flipTimes = sc.nextInt();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < flipTimes; i++) {

            if (Math.random() < 0.5 ) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        float headsPercent = (float)(headsCount * 100)/ flipTimes;
        float tailsPercent = (float)(tailsCount * 100) / flipTimes;

        System.out.println("No. of times heads appeared: " + headsCount);
        System.out.println("Heads Percent: " + headsPercent);

        System.out.println("No. of times tails appeared: " + tailsCount);
        System.out.println("Tails Percent: " + tailsPercent);
    }
}
