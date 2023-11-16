import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        char[] inputCharArr = inputLine.toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < inputCharArr.length; i++) {
            char ch = inputCharArr[i];
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            } else {
                symbols.append(ch);
            }
        }
        System.out.printf("%s%n%s%n%s%n",digits,letters,symbols);
    }
}
