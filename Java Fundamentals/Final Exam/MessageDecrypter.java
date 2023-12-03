import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputCount; i++) {
            String currentInput = scanner.nextLine();
            String regex =
                    "^([$%])(?<tag>[A-Z][a-z]{2,})\\1([:\\s]{2})(\\[\\d+])\\|(\\[\\d+])\\|(\\[\\d+])\\|$";

            String temp = "";
            String decryptedM = "";
            String tag = "";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(currentInput);

            while (matcher.find()) {
                temp = matcher.group();
                tag = matcher.group("tag");

                Pattern pattern1 = Pattern.compile("(\\d+)");
                Matcher matcher1 = pattern1.matcher(temp);

                while (matcher1.find()) {
                    int symbol = Integer.parseInt(matcher1.group());
                    char charValue = (char) symbol;
                    decryptedM += charValue;
                }
            }

            if (temp.isEmpty()) {
                System.out.println("Valid message not found!");
            } else {
                System.out.printf("%s: %s\n", tag, decryptedM);
            }
        }
    }
}

