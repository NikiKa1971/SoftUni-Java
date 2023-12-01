import java.util.LinkedHashMap;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> plants = new LinkedHashMap<>();
        LinkedHashMap<String, Double> plantsRating = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] inputLine = scanner.nextLine().split("<->");
            String plant = inputLine[0];
            int rarity = Integer.parseInt(inputLine[1]);
            plants.put(plant, rarity);
            plantsRating.put(plant, 0.0);
        }

        while (true) {
            String[] currentCommand = scanner.nextLine().split(":\\s|\\s-\\s");
            String command = currentCommand[0];
            if (command.equals("Exhibition")) break;

            String plant = currentCommand[1];
            if (plants.containsKey(plant)) {
                switch (command) {
                    case "Rate":

                        int newRating = Integer.parseInt(currentCommand[2]);
                        double currentRating = plantsRating.get(plant);
                        if (currentRating == 0) {
                            plantsRating.put(plant, newRating + currentRating);

                        } else {
                            double averageRating = (newRating + currentRating) / 2;
                            plantsRating.put(plant, averageRating);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(currentCommand[2]);
                        plants.put(plant, rarity);
                        break;
                    case "Reset":
                        plantsRating.put(plant, 0.0);
                        break;
                }

            } else {
                System.out.println("error");
            }
        }
        System.out.println("Plants for the exhibition:");
        for (String plant : plants.keySet()) {

            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n"
                    , plant, plants.get(plant), plantsRating.get(plant));
        }
    }
}
