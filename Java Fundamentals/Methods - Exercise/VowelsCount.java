import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        vowelsCountAndPrint(inputLine);
    }

    private static void vowelsCountAndPrint(String inputLine) {
        int count = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.toLowerCase().charAt(i);
            switch (symbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
//a, e, i, o, u