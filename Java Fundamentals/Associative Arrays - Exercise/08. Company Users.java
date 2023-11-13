import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> users = new LinkedHashMap<>();

        while (true) {
            String[] currentInput = scanner.nextLine().split(" -> ");
            String companyName = currentInput[0];
            if (companyName.equals("End")) break;

            String userId = currentInput[1];

            if (!users.containsKey(companyName)) {
                users.put(companyName, new ArrayList<>());
            }
            List<String> currentUser = users.get(companyName);
            if (!currentUser.contains(userId)) {
                users.get(companyName).add(userId);
            }

        }
        users.entrySet()
                .forEach(entry -> {
                    System.out.printf("%s%n", entry.getKey());
                    entry.getValue()
                            .forEach(user -> System.out.printf("-- %s%n", user));
                });

    }
}
