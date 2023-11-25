import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        StringBuilder result = new StringBuilder(inputLine);

        while (true) {
            String[] commandLine = scanner.nextLine().split(":");
            String command = commandLine[0];

            if (command.equals("Travel")) break;

            switch (command) {
                case "Add Stop":
                    int idx = Integer.parseInt(commandLine[1]);
                    String string = commandLine[2];
                    if (idx >= 0 && idx < result.length()) {
                        result.insert(idx, string);
                    }
                    System.out.println(result);
                    break;
                case "Remove Stop":
                    int startIdx = Integer.parseInt(commandLine[1]);
                    int endIdx = Integer.parseInt(commandLine[2]);
                    if (startIdx >= 0 && endIdx >= 0 && startIdx < result.length()
                            && endIdx < result.length()) {
                        result.delete(startIdx, endIdx + 1);
                    }
                    System.out.println(result);
                    break;
                case "Switch":
                    String oldString = commandLine[1];
                    String newString = commandLine[2];

                    String tempString = result.toString();

                    if (tempString.contains(oldString)) {
                        int firstIdx = result.indexOf(oldString);
                        result.delete(firstIdx, firstIdx + oldString.length());

                        result.insert(firstIdx, newString);
                    } else {
                        break;
                    }

                    System.out.println(result);
                    break;
            }
        }

        System.out.printf("Ready for world tour! Planned stops: %s", result);
    }
}
