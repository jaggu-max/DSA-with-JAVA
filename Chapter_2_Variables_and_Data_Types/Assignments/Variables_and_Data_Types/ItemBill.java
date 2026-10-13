import java.util.Scanner;
public class ItemBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat(), pen = sc.nextFloat(), eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gst = total * 0.18f;
        System.out.printf("Subtotal: %.2f%n", total);
        System.out.printf("GST (18%%): %.2f%n", gst);
        System.out.printf("Final bill: %.2f%n", total + gst);
        sc.close();
    }
}
