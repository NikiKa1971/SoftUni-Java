import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String[] currentCourse = scanner.nextLine().split(" : ");
            String course = currentCourse[0];

            if (course.equals("end")) break;

            String studentName = currentCourse[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }

            courses.get(course).add(studentName);
        }

        courses.entrySet()
                .forEach((entry) -> {
                    // .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())) // sorted by size
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size()); // print key and count
                    entry.getValue()
                            .forEach(student ->
                                    System.out.printf("-- %s%n", student));
                });
    }
}

