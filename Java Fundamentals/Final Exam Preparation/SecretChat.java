import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputLine = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] currentCommands = scanner.nextLine().split("\\:\\|\\:");
            String command = currentCommands[0];

            if (command.equals("Reveal")) break;
            String substring = currentCommands[1];
            String tempString = String.valueOf(inputLine);

            switch (command) {
                case "InsertSpace":
                    int idx = Integer.parseInt(currentCommands[1]);
                    inputLine.insert(idx, ' ');
                    System.out.printf("%s%n", inputLine);
                    break;
                case "Reverse":

                    if (tempString.contains(substring)) {
                        int startIndex = inputLine.indexOf(substring);
                        int endIndex = startIndex + substring.length();
                        String tempSubstring = tempString.substring(startIndex, endIndex);
                        tempSubstring = String.valueOf(new StringBuilder(tempSubstring).reverse());
                        inputLine.delete(startIndex, endIndex);
                        inputLine.append(tempSubstring);
                        System.out.println(inputLine);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String replacement = currentCommands[2];
                    tempString = tempString.replaceAll(substring, replacement);
                    inputLine = new StringBuilder(tempString);
                    System.out.println(inputLine);
                    break;
            }
        }
        System.out.printf("You have a new text message: %s",inputLine);
    }
}
