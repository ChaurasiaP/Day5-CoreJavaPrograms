package BasicCoreJavaPrograms;

public class Distance {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        getDistance(a,b);           // calling the method
    }

    // creating a method to get distance using calculation
    public static void getDistance(int x, int y){
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Distance from origin is: "+distance);
    }
}
