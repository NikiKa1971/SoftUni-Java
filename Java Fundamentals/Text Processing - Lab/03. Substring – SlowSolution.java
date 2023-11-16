import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String resultString = secondString;

        while (resultString.contains(firstString)) {
            int index=resultString.indexOf(firstString);
            //all before index
            String resultString1 = resultString.substring(0,index);

            String resultString2 = resultString.substring(index+firstString.length());
            //all after index+word length

            resultString = resultString1 + resultString2;

            // resultString = resultString.replace(firstString, "");
        }

        System.out.println(resultString);
    }
}
