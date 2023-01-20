package BasicCoreJavaPrograms;

public class Prog3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        if (0 < N && N < 31) {
            getPowTable(N);
        } else {
            System.out.println("Enter a number less than 31");
        }
    }

    public static void getPowTable(int n){
        for (int i = 0; i <= n; i++) {
            System.out.println("2 raised to the power of " + i + " equals " + (int) (Math.pow(2, i)));
        }
    }
}
