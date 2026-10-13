import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int val = 1;
        int sum = 0;

        while (val <= n) {
            sum = sum + val;
            val = val + 1;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
