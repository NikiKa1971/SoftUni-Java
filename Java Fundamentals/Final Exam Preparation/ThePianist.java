import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> piecesByComposer = new LinkedHashMap<>();
        LinkedHashMap<String, String> pieceByKey = new LinkedHashMap<>();
        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPieces; i++) {
            String[] currentInput = scanner.nextLine().split("\\|");
            String piece = currentInput[0];
            String composer = currentInput[1];
            String key = currentInput[2];

            piecesByComposer.put(piece, composer);
            pieceByKey.put(piece, key);
        }

        while (true) {
            String[] currentCommandString = scanner.nextLine().split("\\|");
            String currentCommand = currentCommandString[0];

            if (currentCommand.equals("Stop")) break;

            String currentPiece = currentCommandString[1];


            switch (currentCommand) {
                case "Add":
                    String currentComposer = currentCommandString[2];
                    String currentKey = currentCommandString[3];

                    if (piecesByComposer.containsKey(currentPiece)) {
                        System.out.printf("%s is already in the collection!%n", currentPiece);
                    } else {
                        piecesByComposer.put(currentPiece, currentComposer);
                        pieceByKey.put(currentPiece, currentKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposer, currentKey);
                    }
                    break;
                case "Remove":
                    if (piecesByComposer.containsKey(currentPiece)) {
                        piecesByComposer.remove(currentPiece);
                        pieceByKey.remove(currentPiece);
                        System.out.printf("Successfully removed %s!%n", currentPiece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }
                    break;
                case "ChangeKey":

                    String newKey = currentCommandString[2];

                    if (piecesByComposer.containsKey(currentPiece)) {
                        pieceByKey.replace(currentPiece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    }

                    break;
            }

        }
        piecesByComposer
                .forEach((piece, composer) -> {
                    String key = pieceByKey.get(piece);
                    System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
                });

    }
}