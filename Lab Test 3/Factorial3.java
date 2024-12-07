import java.math.BigInteger;
import java.util.Scanner;

public class Factorial3 {

    // Method to calculate factorial
    public static BigInteger fact(int f) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= f; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        // Input range
        System.out.print("Enter two numbers (n and nh): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nh = sc.nextInt();

        // Loop through the range
        for (int r = n; r <= nh; r++) {
            int temp = r; // Use temp to preserve the original number
            BigInteger totalSum = BigInteger.ZERO;

            // Sum the factorials of digits
            while (temp > 0) {
                int fn = temp % 10;
                totalSum = totalSum.add(fact(fn));
                temp = temp / 10;
            }

            // Check if the sum of factorials equals the number
            if (totalSum.equals(BigInteger.valueOf(r))) {
                System.out.println(r + " is a Factorian.");
            }
        }
    }
}
