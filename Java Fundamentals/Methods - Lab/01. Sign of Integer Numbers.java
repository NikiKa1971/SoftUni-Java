import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printSign(n);
    }

    private static void printSign(int n) {
        String sign = "";
        if (n > 0) {
            sign = "positive";
        } else if (n < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", n, sign);
    }
}

