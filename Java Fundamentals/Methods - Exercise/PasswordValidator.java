import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        boolean isValidLength = passLength(inputLine);
        boolean isValidLetters = passLettersAndDigits(inputLine);
        boolean isValidTwoDigits = passLeastTwodigits(inputLine);


        if (isValidLetters && isValidLength && isValidTwoDigits) {
            System.out.println("Password is valid");
        } else {
            if (!isValidLength) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isValidLetters) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!isValidTwoDigits) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    private static boolean passLeastTwodigits(String inputLine) {
        boolean isValidTwoDigits=false;
        int cout = 0;

        for (int index = 0; index < inputLine.length(); index++) {
            char symbol = inputLine.charAt(index);
            if (Character.isDigit(symbol)) {
                cout++;
            }
        }

        if (cout > 1) isValidTwoDigits = true;
        return isValidTwoDigits;
    }

    private static boolean passLettersAndDigits(String inputLine) {
        boolean isValidLetters=false;

        for (int index = 0; index < inputLine.length(); index++) {
            char symbol = inputLine.charAt(index);
            if (Character.isLetterOrDigit(symbol)) {
                isValidLetters = true;
            } else {
                isValidLetters = false;
                break;
            }
        }
        return isValidLetters;
    }

    private static boolean passLength(String inputLine) {
        boolean isValidLength=false;
        if (inputLine.length() >= 6 && inputLine.length() <= 10) {
            isValidLength = true;

        }
        return isValidLength;
    }
}
