import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        System.out.println("Area = " + (side * side));
        sc.close();
    }
}
