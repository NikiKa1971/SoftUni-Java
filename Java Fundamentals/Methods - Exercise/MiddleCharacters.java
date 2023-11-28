import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);
    }

    private static void printMiddleChar(String text) {
        int middleLength = text.length();

        if (middleLength % 2 == 0) {
            middleLength /= 2;
            System.out.printf("%s%s", text.charAt(middleLength-1), text.charAt(middleLength));
        } else {
            middleLength/=2;
            System.out.printf("%s", text.charAt(middleLength));
        }
    }
}
