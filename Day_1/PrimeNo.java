import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;  // assume number is prime

        if (n <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            // check divisibility from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;  // found a divisor
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime number.");
        else
            System.out.println(n + " is NOT a Prime number.");

        sc.close();
    }
}
