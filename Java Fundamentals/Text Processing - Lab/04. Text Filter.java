import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();


        for (int i = 0; i < bannedWords.length; i++) {

           char[]replaceChar=new char[bannedWords[i].length()];
            Arrays.fill(replaceChar,'*');
           String pegel=new String(replaceChar);

            inputText=inputText.replace(bannedWords[i], pegel);
        }
        System.out.println(inputText);
    }
}
