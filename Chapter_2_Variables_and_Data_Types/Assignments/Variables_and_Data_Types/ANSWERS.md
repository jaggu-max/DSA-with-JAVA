# Variables & Data Types — Assignment Answers

## Answer 1: Average of three numbers

```java
import java.util.Scanner;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = (a + b + c) / 3.0;
        System.out.println("Average = " + average);
        sc.close();
    }
}
```
Example input: `10 20 30` → Output: `Average = 20.0`

## Answer 2: Area of a square

```java
import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        System.out.println("Area = " + (side * side));
        sc.close();
    }
}
```
Example input: `5` → Output: `Area = 25.0`

## Answer 3: Bill for three items, with 18% GST

```java
import java.util.Scanner;
public class ItemBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float gst = total * 0.18f;
        System.out.printf("Subtotal: %.2f%n", total);
        System.out.printf("GST (18%%): %.2f%n", gst);
        System.out.printf("Final bill: %.2f%n", total + gst);
        sc.close();
    }
}
```
Example input: `10 20 5` → subtotal `35.00`, GST `6.30`, final bill `41.30`.
If GST is not required, print only `total`.

## Answer 4: Type of the expression

**Answer: `double`.** `f * b` is promoted to `float`; `i % c` is evaluated as `int`; `d * s` is `double`. Combining these expressions makes the full result `double`.

```java
public class ExpressionType {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println("Type of result: double");
        System.out.println("Value = " + result);
    }
}
```
Note: `var` requires Java 10 or later. An explicit `double` declaration is used here for clarity.

## Answer 5: Is `int $ = 24;` valid?

**No compilation error is expected.** Java permits `$` in identifiers, although descriptive variable names are recommended.

```java
public class DollarIdentifier {
    public static void main(String[] args) {
        int $ = 24;
        System.out.println($);
    }
}
```
Output: `24`
