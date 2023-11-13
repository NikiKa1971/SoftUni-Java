import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }

        LinkedHashMap<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> studentGrades = entry.getValue();
            double averageGrade = getAverageGrade(studentGrades);

            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade
                .forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));


    }

    private static double getAverageGrade(List<Double> studentGrades) {
        double sum = 0;
        for (double grade : studentGrades
        ) {
            sum += grade;
        }

        return sum / studentGrades.size();
    }
}

