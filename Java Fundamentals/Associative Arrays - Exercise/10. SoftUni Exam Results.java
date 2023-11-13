import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> examPoints = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (true) {
            String[] inputData = scanner.nextLine().split("-");
            String currentUser = inputData[0];
            if (currentUser.equals("exam finished")) break;

            String language = inputData[1];

            if (language.equals("banned")) {
                examPoints.remove(currentUser);
                // languageCount.remove(currentUser);
            } else {
                int points = Integer.parseInt(inputData[2]);

                // check for points -> get bigger
                if (examPoints.containsKey(currentUser)) {
                    int currentPoints = examPoints.get(currentUser);
                    examPoints.put(currentUser, Math.max(currentPoints, points));
                } else {
                    examPoints.put(currentUser, points);
                }
                // check for language & count
                if (submissions.containsKey(language)) {
                    int count = submissions.get(language) + 1;
                    submissions.put(language, count);
                } else {
                    submissions.put(language, 1);
                }
            }
        }
        System.out.printf("Results:%n");
        examPoints.forEach((k, v) -> System.out.printf("%s | %s%n", k, v));

        System.out.println("Submissions:");
        submissions.forEach((k, v) -> System.out.printf("%s - %d%n", k, v));
    }
}
