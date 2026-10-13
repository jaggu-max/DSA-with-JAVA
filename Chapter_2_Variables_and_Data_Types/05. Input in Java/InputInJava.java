import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        float price = sc.nextFloat();

        System.out.println("Integer = " + number);
        System.out.println("Decimal = " + price);

        sc.close();
    }
}
