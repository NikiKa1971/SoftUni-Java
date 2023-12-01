import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder temp = new StringBuilder(String.valueOf(inputLine));

        while (true) {
            String[] currentText = scanner.nextLine().split("\\|");
            String currentCommand = currentText[0];
            if (currentCommand.equals("Decode")) break;

            switch (currentCommand) {
                case "Move":
                    int index = Integer.parseInt(currentText[1]);

                    for (int i = 1; i <= index; i++) {
                        String firstChar = temp.charAt(0) + "";
                        temp.deleteCharAt(0);
                        temp.append(firstChar);
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(currentText[1]);
                    String value = currentText[2];
                    temp.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = currentText[1];
                    String replacement = currentText[2];

                    for (int i = 0; i < temp.length(); i++) {
                        String symbol = temp.charAt(i) + "";

                        if (symbol.equals(substring)) {
                            temp.deleteCharAt(i);
                            temp.insert(i, replacement);
                        }
                    }
                    break;
            }
        }

        String decryptedM = String.join("", temp);
        System.out.printf("The decrypted message is: %s", decryptedM);
    }


}
