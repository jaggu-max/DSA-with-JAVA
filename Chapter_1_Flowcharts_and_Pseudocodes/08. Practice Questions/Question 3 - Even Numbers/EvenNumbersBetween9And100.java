public class EvenNumbersBetween9And100 {
    public static void main(String[] args) {
        int i = 10;

        // Matches the course flowchart: prints 10, 12, ..., 98.
        while (i <= 98) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
}
