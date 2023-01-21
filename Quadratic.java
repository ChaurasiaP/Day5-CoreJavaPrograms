package BasicCoreJavaPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter co-efficient of x^2: ");
        int a = sc.nextInt();      //getting x sq coeff.

        System.out.print("Enter co-efficient of x: ");
        int b = sc.nextInt();      //getting x coeff.

        System.out.print("Enter the constant: ");
        int c = sc.nextInt();      //getting constant c

        System.out.println("Quadratic eqn is: "+a+"x^2"+b+"x"+"+"+c);   // printing the quad eqn

        getRoots(a,b,c);            // calling the function to get roots
    }

    public static void getRoots(int a, int b, int c){
        int dtrmnnt = b*b-4*a*c;  // determinant formula

        double root1 = (-b-(Math.sqrt(dtrmnnt)))/(2*a);  // formulae to get roots
        double root2 = (-b+(Math.sqrt(dtrmnnt)))/(2*a);

        // checking nature of roots

        if(dtrmnnt>0){
            System.out.println("Two Real and different roots are: "+root1 +" "+ root2);
        } else if (dtrmnnt<0) {
            System.out.println("Imaginary roots");
        }else{
            System.out.println("Roots are equal: "+root1 +" "+root2);
        }
    }
}
