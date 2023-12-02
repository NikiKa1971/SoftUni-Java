import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        while (true) {
            String[] currentInput = scanner.nextLine().split(" ");
            String currentCommand = currentInput[0];

            if (currentCommand.equals("Done")) break;

            switch (currentCommand) {
                case "TakeOdd":
                    password = getOddIndexes(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(currentInput[1]);
                    int length = Integer.parseInt(currentInput[2]);
                    int endIndex = startIndex + length;
                    String stringToCut = password.substring(startIndex, endIndex);
                    password = password.replaceFirst(stringToCut, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substringToReplace = currentInput[1];
                    String substituteString = currentInput[2];
                    if (password.contains(substringToReplace)) {
                        password = password.replaceAll(substringToReplace, substituteString);
                        System.out.println(password);

                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
        System.out.printf("Your password is: %s", password);
    }

    private static String getOddIndexes(String password) {
        StringBuilder newPassword = new StringBuilder(password);
        String temp = "";
        for (int i = 1; i < newPassword.length(); i += 2) {
            temp += newPassword.charAt(i);
        }
        return temp;
    }
}
