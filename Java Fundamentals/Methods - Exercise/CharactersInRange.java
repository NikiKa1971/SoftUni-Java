import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);

        printCharactersInRange(firstInput, secondInput);
    }

    private static void printCharactersInRange(Character firstInput, Character secondInput) {
        int firstIndex = (int) firstInput ;
        int secondIndex = (int) secondInput;
        int min = Math.min(firstIndex, secondIndex);
        int max=Math.max(firstIndex,secondIndex);

        for (int index = min+1; index < max; index++) {
            System.out.printf("%s ", (char) index);
        }
    }
}
