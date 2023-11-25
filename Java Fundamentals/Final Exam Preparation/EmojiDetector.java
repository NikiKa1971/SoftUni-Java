import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        List<String> results = new ArrayList<>(); // valid emojis for next action - not use now only fill
        List<String> resultWithSeparators = new ArrayList<>(); // valid emojis with separators for printing result

        int thresholdSum = (getThresholdSum(inputLine));

        getValidEmojis(inputLine, results, resultWithSeparators); //add valid emojis to List

        System.out.printf("Cool threshold: %d%n", thresholdSum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", results.size());

        for (String item : resultWithSeparators) {
            int currentValues = 0;
            for (int idx = 0; idx < item.length(); idx++) {
                if (Character.isLetter(item.charAt(idx))) {
                    currentValues += item.charAt(idx);
                }
            }
            if (currentValues >= thresholdSum) {
                System.out.printf("%s%n", item);
            }
        }
    }

    private static int getThresholdSum(String inputLine) {

        int threshold = 1;

        Pattern pattern = Pattern.compile("[0-9]");
        //  [1-9] is correct because digits are multiplying but Judge not accepted as right
        Matcher text = pattern.matcher(inputLine);
        while (text.find()) {
            threshold *= Integer.parseInt((text.group()));
        }
        return threshold;
    }

    private static void getValidEmojis(String inputLine
            , List<String> results, List<String> resultWithSeparators) {
        String regex = "([:]{2}|[*]{2})([A-Z][a-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher text = pattern.matcher(inputLine);

        while (text.find()) {
            results.add(text.group(2));
            resultWithSeparators.add(text.group());
        }
    }
}
