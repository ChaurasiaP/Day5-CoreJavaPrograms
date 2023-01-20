package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n'th value to calculate the harmonic mean: ");
        int n = sc.nextInt();

        double hm =0;

        if(n>0){
            for(double i=1; i<=n; i++){
                hm += 1/i;
                System.out.println(hm);
            }
        }
    }
}
