import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String regex = "([=\\|\\/])(?<city>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);
        List<String> cities = new ArrayList<>();
        int totamPoints = 0;

        while (matcher.find()) {
            String city = matcher.group("city");
            int currentPoints = city.length();
            totamPoints += currentPoints;
            cities.add(city);
        }

        StringBuilder result = new StringBuilder();
        result.append(String.join(", ", cities));

        System.out.printf("Destinations: %s\n", result);
        System.out.printf("Travel Points: %d", totamPoints);
    }
}
