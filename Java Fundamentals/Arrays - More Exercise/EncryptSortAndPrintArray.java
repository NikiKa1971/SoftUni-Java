import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());

        int[] sorted = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            String currentString = scanner.nextLine();
            int sum = getSum(currentString);
            sorted[i] = sum;
        }

        Arrays.sort(sorted);

        for (int number : sorted) {
            System.out.printf("%d%n", number);
        }
    }

    private static int getSum(String currentString) {
        char[] charList = currentString.toCharArray();

        int sum = 0;
        for (char symbol : charList) {
            switch (symbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    int vowelCode = symbol * currentString.length();
                    sum += vowelCode;
                    break;
                default:
                    int consonantCode = symbol / currentString.length();
                    sum += consonantCode;
            }
        }
        return sum;
    }
}
/*
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
    • The code of each vowel multiplied by the string length.  a, e, i, o, and u
    • The code of each consonant is divided by the string length.
Sort the number sequence in ascending order and print it on the console.
 */