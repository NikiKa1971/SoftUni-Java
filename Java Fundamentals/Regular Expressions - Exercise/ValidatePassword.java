import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "_[.]+([A-Z][A-Za-z0-9]{4,}[A-Z])_[.]+";

        int numbersOfInput = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersOfInput; i++) {
            String currentInput = scanner.nextLine();

            boolean isValid = isValidPass(currentInput, regex);

            Pattern pattern = Pattern.compile(regex);
            Matcher text = pattern.matcher(currentInput);
            String group = "";

            while (text.find()) {
                group = text.group(1);

                String currentGroup = "";
                for (char ch : group.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        currentGroup += ch;
                    }
                }
                if (!currentGroup.isEmpty()) {
                    System.out.printf("Group: %s%n", currentGroup);
                } else {
                    System.out.println("Group: default");
                    currentGroup = "";
                }
            }
        }
    }

    private static boolean isValidPass(String currentInput, String regex) {

        Pattern pattern = Pattern.compile(regex);
        Matcher text = pattern.matcher(currentInput);
        boolean isValid=text.find();;
        if (!isValid) {
            System.out.println("Invalid pass!");
        }
        return isValid = text.find();
    }
}
