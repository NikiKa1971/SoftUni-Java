import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        String regex = "([#|@])(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        boolean isPairWords = false;
        boolean isMirrorWords = false;
        int wordPairCount = 0;

        while (matcher.find()) {

            String first = matcher.group("firstWord");
            String second = matcher.group("secondWord");
            StringBuilder mirrored = new StringBuilder(second).reverse();
            String mirror = mirrored.toString();
            if (mirror.equals(first)) {
                result.put(first, second);
                isMirrorWords = true;
            }
            isPairWords = true;
            wordPairCount++;
        }

        if (isPairWords) {
            System.out.printf("%d word pairs found!%n", wordPairCount);
            if (isMirrorWords) {
                System.out.println("The mirror words are:");
                int count=0;
                for (String word : result.keySet()) {
                    String formatedString = String.format("%s <=> %s", word, result.get(word));
                    int last = result.size()-1;
                    if (count<last) formatedString += ", ";
                    System.out.print(formatedString);
                    count++;
                }
            } else {
                System.out.println("No mirror words!");
            }
        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
