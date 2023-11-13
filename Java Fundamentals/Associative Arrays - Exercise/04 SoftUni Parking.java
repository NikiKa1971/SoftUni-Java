import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> users = new LinkedHashMap<>();

        for (int i = 1; i <= commandsCount; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            String command = currentCommand[0];
            String currentUser = currentCommand[1];

            switch (command) {
                case "register":
                    String plateNumber = currentCommand[2];
                    if (users.containsKey(currentUser)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    } else {
                        users.put(currentUser, plateNumber);
                        System.out.printf("%s registered %s successfully%n", currentUser, plateNumber);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(currentUser)) {
                        System.out.printf("%s unregistered successfully%n", currentUser);
                        users.remove(currentUser);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", currentUser);
                    }
                    break;
            }
        }
        users
                .forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}

