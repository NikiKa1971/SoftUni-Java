import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> cityByPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cityByGold = new LinkedHashMap<>();

        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("Sail")) break;

            String regex = "(?<cities>[A-Za-z\\s]+)([||]{2})(?<population>\\d+)\\2(?<gold>\\d+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputLine);
            while (matcher.find()) {
                String city = matcher.group("cities");
                int population = Integer.parseInt(matcher.group("population"));
                int gold = Integer.parseInt(matcher.group("gold"));
                if (cityByPopulation.containsKey(city)) {      // check if town exist
                    population += cityByPopulation.get(city); // if yes add people
                    gold += cityByGold.get(city);            // and gold
                }
                cityByPopulation.put(city, population);
                cityByGold.put(city, gold);
            }
        }

        while (true) {
            String[] inputLine = scanner.nextLine().split("=>");
            String command = inputLine[0];
            if (command.equals("End")) break;

            String town = inputLine[1];

            switch (command) {
                case "Plunder":
                    int currentPeople = Integer.parseInt(inputLine[2]);
                    int currentGold = Integer.parseInt(inputLine[3]);
                    int population = cityByPopulation.get(town);
                    int gold = cityByGold.get(town);
                    population -= currentPeople;
                    gold -= currentGold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n"
                            , town, currentGold, currentPeople);
                    cityByPopulation.put(town, population);
                    cityByGold.put(town, gold);

                    if (population <= 0 || gold <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        cityByPopulation.remove(town);
                        cityByGold.remove(town);
                    }
                    break;
                case "Prosper":
                    int gold1 = Integer.parseInt(inputLine[2]);
                    if (gold1 >= 0) {
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                                , gold1, town, gold1 += cityByGold.get(town));
                        cityByGold.put(town,gold1);
                    } else {
                        System.out.printf("Gold added cannot be a negative number!%n");
                    }
                    break;
            }
        }

        int townNumber = cityByPopulation.size();

        if (townNumber > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n"
                    , townNumber);
            for (String town : cityByPopulation.keySet()) {
                int people = cityByPopulation.get(town);
                int gold = cityByGold.get(town);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                        , town, people, gold);
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        System.out.println(cityByGold);
    }
}
