import java.util.LinkedHashMap;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsNumber = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> carByMileage = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carByFuel = new LinkedHashMap<>();

        fillCars(carsNumber, scanner, carByMileage, carByFuel);

        while (true) {
            String[] currentCar = scanner.nextLine().split(" : ");
            String command = currentCar[0];

            if (command.equals("Stop")) break;

            String car = currentCar[1];
            int fuel = 0;
            switch (command) {
                case "Drive":
                    int distance = carByMileage.get(car) + Integer.parseInt(currentCar[2]);
                    fuel = carByFuel.get(car) - Integer.parseInt(currentCar[3]);
                    if (fuel < 0) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        System.out.
                                printf("%s driven for %d kilometers. %d liters of fuel consumed.\n"
                                        , car, Integer.parseInt(currentCar[2]), Integer.parseInt(currentCar[3]));
                        carByMileage.put(car, distance);
                        carByFuel.put(car, fuel);
                    }
                    if (distance > 100000) {
                        carByMileage.remove(car);
                        carByFuel.remove(car);
                        System.out.printf("Time to sell the %s!\n", car);
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(currentCar[2]);
                    int currentFuel = carByFuel.get(car);
                    int emptySpace = Math.abs(75 - currentFuel);
                    if (emptySpace >= fuel) {
                        System.out.printf("%s refueled with %d liters\n", car, fuel);
                        carByFuel.put(car, fuel + currentFuel);
                    } else {
                        System.out.printf("%s refueled with %d liters\n", car, emptySpace);
                        carByFuel.put(car, currentFuel+emptySpace);
                    }
                    break;
                case "Revert":
                    int km = Integer.parseInt(currentCar[2]);
                    int currentKm = carByMileage.get(car);
                    if (currentKm - km < 10000) {
                        carByMileage.put(car, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, km);
                        carByMileage.put(car, currentKm - km);
                    }
                    break;
            }
        }

        for (String car : carByMileage.keySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
                    , car, carByMileage.get(car), carByFuel.get(car));
        }
    }

    private static void fillCars(int carsNumber, Scanner scanner, LinkedHashMap<String, Integer> carByMileage, LinkedHashMap<String, Integer> carByFuel) {
        for (int i = 0; i < carsNumber; i++) {
            String[] currentCar = scanner.nextLine().split("\\|");
            String car = currentCar[0];
            int mileage = Integer.parseInt(currentCar[1]);
            int fuel = Integer.parseInt(currentCar[2]);

            carByMileage.put(car, mileage);
            carByFuel.put(car, fuel);
        }
    }
}
