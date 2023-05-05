import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        int a = askSide("A");
        int b = askSide("B");
        showResult(a,b);
        area(a,b);
    }
    // Alloleva read selleks, et ei oleks topelt ridu ??
    private static int askSide(String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side " + side + " (integer): ");
        return scanner.nextInt();
    }
    private static void showResult(int a, int b) {
        System.out.println("Side A is " + a + ", side B is " + b + " and perimeter is " + (2 * (a + b)) + ".");
    }
    private static void area(int a, int b) {
        System.out.println("Side A is " + a + ", side B is " + b + " and area is " + (a * b) + ".");
    }
}

