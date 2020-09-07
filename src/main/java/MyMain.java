import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if ((b < a && a < c) || (c < a && a < b)){
            return a;
        }
        else if ((a < b && b < c) || (c < b && b < a)){
            return b;
        }
        else {
            return c;
        }
    }
    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)){
            return a;
        }
        else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt((a*a)+(b*b));
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a method to run ");
        String method = scan.next();
        if (method.equals("median")){
            System.out.println("Enter 3 values ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(median(a,b,c));
        }
        else if (method.equals("magnitude")){
            System.out.println("Enter 2 values");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(magnitude(a,b));
        }
        else if (method.equals("pythagoras")){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(pythagoras(a,b));
        }
        else {
            System.out.println("Invalid method name");
        }
        scan.close();
    }
}

