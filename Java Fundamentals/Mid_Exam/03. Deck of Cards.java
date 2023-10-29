import java.awt.desktop.AboutEvent;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int count = Integer.parseInt(scanner.nextLine());
        if (count > 50 || count < 0) {
            return;
        }

        for (int i = 0; i < count; i++) {

            String[] commands = scanner.nextLine().split(", ");
            String command = commands[0];
            
            switch (command) {
                case "Add":
                    String cardName  = commands[1];
                    if (!cards.contains(cardName)) {
                        cards.add(cardName);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;
                case "Remove":
                    String cardName2 = commands[1];
                    if (cards.contains(cardName2)) {
                        cards.remove(cardName2);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int cardIdx = Integer.parseInt(commands[1]);
                    if (cardIdx >= 0 && cardIdx < cards.size()) {
                        cards.remove(cardIdx);
                        System.out.println("Card successfully removed");

                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int cardInsertIdx = Integer.parseInt(commands[1]);
                    String cardName3 = commands[2];

                    if (cardInsertIdx >= 0 && cardInsertIdx < cards.size()) {
                        if (!cards.contains(cardName3)) {
                            cards.add(cardInsertIdx, cardName3);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }

                    break;
            }

        }
        if (cards.size() > 1) {
            String result = String.join(", ", cards);
            System.out.println(result);
        } else {
            System.out.println(String.join("", cards));
        }
    }
}
