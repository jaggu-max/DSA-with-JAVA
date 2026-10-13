import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;

        System.out.println(area);
        sc.close();
    }
}
