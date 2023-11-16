import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");
        List<String> repeatedString = new ArrayList<>();

        for (String word : inputString) {
            for (int i = 0; i < word.length(); i++) {
                repeatedString.add(word);
            }
        }
        System.out.println(String.join("", repeatedString));
    }
}
