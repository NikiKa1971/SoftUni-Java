import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputLine = scanner.nextLine();

            if (inputLine.equals("END")) break;

            boolean isTrue = findPalindrome(inputLine);
            System.out.printf("%b%n", isTrue);
        }
    }

    private static boolean findPalindrome(String inputLine) {
        boolean isTrue = false;
        StringBuilder reversed = new StringBuilder(inputLine).reverse();
        String temp = reversed.toString();

        if (inputLine.equals(temp)) {
            isTrue = true;
        }

        return isTrue;
    }
}
