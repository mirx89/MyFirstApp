import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainAsk {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        askScannerString();
        askScannerNumber(true);
        askScannerNumber(false);
        for(int x = 0; x< 3; x++) {
            String result = askReader();
            checkInput(result);
        }
    }
    // Scanner String
    private static void askScannerString() {
        System.out.print("Inpute text: ");
        String text = scanner.nextLine();
        System.out.println("You wrote: " + text);
    }
    private static void askScannerNumber(boolean bool) {
        if(bool) { //true
            System.out.print("Input integral: ");
            int x = scanner.nextInt();
            System.out.println("You wrote: " + x);
        } else {
            System.out.print("Input double: ");
            double x = scanner.nextDouble();
            System.out.println("You wrote: " + x);
        }
    }
    private static String askReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter something: ");
            String text = reader.readLine();
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void checkInput(String input) {
        try {
            Integer.parseInt(input); // Try to convert String to integer
            System.out.println(input + " is integer.");
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(input);
                System.out.println(input + " is double.");
            } catch (NumberFormatException ex) {
                System.out.println(input + " is string.");
            }
        }
    }
}
