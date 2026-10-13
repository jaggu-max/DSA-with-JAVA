import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            int div = 2;
            boolean isPrime = true;

            while (div < n) {
                if (n % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }

            System.out.println(isPrime ? "Prime" : "Not Prime");
        }

        sc.close();
    }
}
