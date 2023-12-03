import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        while (true) {
            String[] currentInput = scanner.nextLine().split(" ");
            String command = currentInput[0];
            if (command.equals("End")) break;

            switch (command) {

                case "Translate":
                    char symbol = currentInput[1].charAt(0);
                    char replacement = currentInput[2].charAt(0);
                    inputString = inputString.replace(symbol, replacement);
                    System.out.println(inputString);
                    break;
                case "Includes":
                    String substring = currentInput[1];

                    if (inputString.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    substring = currentInput[1];
                    int index = inputString.indexOf(substring);
                    if (index == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    inputString = inputString.toLowerCase();
                    System.out.println(inputString);
                    break;
                case "FindIndex":
                    symbol = currentInput[1].charAt(0);
                    System.out.println(inputString.lastIndexOf(symbol));
                    break;
                case "Remove":
                    int startIdx = Integer.parseInt(currentInput[1]);
                    int count = Integer.parseInt(currentInput[2]);
                    StringBuilder temp = new StringBuilder(inputString);
                    temp = temp.replace(startIdx, startIdx + count, "");
                    inputString = String.join("", temp);
                    System.out.println(inputString);
                    break;
            }
        }
    }
}
