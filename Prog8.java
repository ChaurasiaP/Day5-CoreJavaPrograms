package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog8 {
    // CHECK FOR EVEN ODD

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Number "+a+ " is even");
        }else {
            System.out.println("Number "+a+ " is odd");
        }
    }
}
