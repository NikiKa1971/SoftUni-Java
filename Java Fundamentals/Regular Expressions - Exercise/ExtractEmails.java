import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        List<String> emails = new ArrayList<>();

        getUser(inputLine, emails);

        for (String email : emails) {
            System.out.printf("%s%n",email);
        }
    }

    private static List<String> getUser(String inputLine, List<String> emails) {
        String userRegex =
                "(?<user>[a-z0-9]+[\\-\\.\\_]?[a-z0-9]+@[a-z]+[-]?[a-z]+\\.[a-z]{2,}([.]?[a-z]+)?)";

        Pattern pattern = Pattern.compile(userRegex);
        Matcher text = pattern.matcher(inputLine);

        while (text.find()) {
            emails.add(text.group("user"));
        }
        return emails;
    }
}
