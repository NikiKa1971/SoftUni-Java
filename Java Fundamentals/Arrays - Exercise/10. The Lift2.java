import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
      
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] < 4 && waitingPeople > 0) {
                wagons[i]++;
                waitingPeople--;
            }
        }

        boolean liftIsFull = true;
        for (int wagon : wagons) {
            if (wagon < 4) {
                liftIsFull = false;
                break;
            }
        }

        if (waitingPeople == 0 && !liftIsFull) {
            System.out.println("The lift has empty spots!");
            for (int wagon : wagons
            ) {
                System.out.printf("%d ", wagon);
            }
        } else if (waitingPeople > 0 && liftIsFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            for (int wagon : wagons
            ) {
                System.out.printf("%d ", wagon);
            }
        } else if (liftIsFull && waitingPeople == 0) {
            for (int wagon : wagons
            ) {
                System.out.printf("%d ", wagon);
            }
        }
    }
}
