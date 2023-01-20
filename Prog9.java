package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Prog9 {
    // CHECK FOR VOWEL AND CONSONANT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        String c = sc.next().toLowerCase();

        checkVowel(c);
    }
    public static void checkVowel(String c){
        if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") ){
            System.out.println(c+" is a vowel");
        }
        else {
            System.out.println(c+ " is a consonant");
        }
    }
}
