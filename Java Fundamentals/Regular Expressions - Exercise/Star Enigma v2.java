import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex =
                "([^-@!>:]*)@(?<planet>[A-Z][a-z]+)[^-@!>:]*:(?<population>\\d+)[^-@!>:]*!(?<attackType>[A||D])![^-@!>:]*->(?<soldiers>\\d+)";

        int messagesCount = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        int attackedCount = 0;
        int destroyedCount = 0;

        for (int i = 1; i <= messagesCount; i++) {

            String currentInput = scanner.nextLine();

            List<Character> currentPlanetList = getCharactersAndDecrypt(currentInput); // get number of  letters and decrypt the string

            String currentPlanet1 = getPlanet(currentPlanetList); // get current planet name as string

            Pattern pattern = Pattern.compile(regex);
            Matcher currentPlanet = pattern.matcher(currentPlanet1);

            while (currentPlanet.find()) {
                String planet = currentPlanet.group("planet");
                int population = Integer.parseInt(currentPlanet.group("population"));
                String attackType = currentPlanet.group("attackType");
                int soldiers = Integer.parseInt(currentPlanet.group("soldiers"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                    attackedCount++;
                } else {
                    destroyedPlanets.add(planet);
                    destroyedCount++;
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedCount);

        if (attackedCount > 0) {
            sortAndPrintResult(attackedPlanets);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedCount);

        if (destroyedCount > 0) {
            sortAndPrintResult(destroyedPlanets);
        }

    }

    private static List<Character> getCharactersAndDecrypt(String currentInput) { // get number of  letters and decrypt the string
        List<Character> currentPlanetList = new ArrayList<>();
        int count = 0;
        for (int symbol = 0; symbol < currentInput.length(); symbol++) {
            char currentChar = currentInput.toLowerCase().charAt(symbol);
            if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r') count++;
        }
        for (int symbol = 0; symbol < currentInput.length(); symbol++) {
            char currentChar = currentInput.charAt(symbol);
            currentChar -= count;
            currentPlanetList.add(currentChar);
        }
        return currentPlanetList;
    }

    private static String getPlanet(List<Character> currentPlanetList) {
        StringBuilder result = new StringBuilder();

        for (Character symbol : currentPlanetList) {
            result.append(symbol);
        }
        return result.toString();
    }
    
    private static void sortAndPrintResult(List<String> planets) {
        Collections.sort(planets);
        for (String planet : planets) {
            System.out.printf("-> %s%n", planet);
        }
    }
}
