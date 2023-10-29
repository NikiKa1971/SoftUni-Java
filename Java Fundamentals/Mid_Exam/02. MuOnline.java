import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            String[] roomArg = room.split(" ");

            String command = roomArg[0];
            int commandValue = Integer.parseInt(roomArg[1]);

            switch (command) {
                case "potion":
                    int currentHealth =health;
                    health += commandValue;
                    if (health > 100) {
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", health-currentHealth);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", commandValue);
                    bitcoins += commandValue;
                    break;
                default:
                    health -= commandValue;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i+1);
                        i= rooms.length;
                        break;
                    }
                    break;
            }

        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
