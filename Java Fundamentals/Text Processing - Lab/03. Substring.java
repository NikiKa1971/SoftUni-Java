import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String resultString = secondString.replace(firstString, "");

        while (resultString.contains(firstString)) {
             resultString = resultString.replace(firstString, "");
        }
        
        System.out.println(resultString);
    }
}
