import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();
        String result = inputText;

        for (int i = 0; i < bannedWords.length; i++) {
            String pegel = "";
            for (int j = 0; j < bannedWords[i].length(); j++) {
                pegel += "*";
            }

            result=result.replace(bannedWords[i], pegel);
        }
        System.out.println(result);

    }
}
