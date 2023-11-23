import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();

        switch (type) {
            case "int":
                int n = Integer.parseInt(input);
                dataTypes(n);
                break;
            case "real":
                double d = Double.parseDouble(input);
                dataTypes(d);
                break;
            case "string":
                dataTypes(input);
                break;
        }
    }

    private static void dataTypes(String input) {
        System.out.printf("$%s$", input);
    }

    private static void dataTypes(double d) {
        System.out.printf("%.2f", d * 1.5);
    }

    private static void dataTypes(int n) {
        System.out.println(n * 2);
    }
}
