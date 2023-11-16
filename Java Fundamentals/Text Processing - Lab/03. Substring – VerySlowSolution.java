import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String resultString = secondString;
        
        while (resultString.contains(firstString)) {
            //all before index
            String resultString1 = "";
            for (int i = 0; i < resultString.indexOf(firstString); i++) {
                resultString1 += resultString.charAt(i) + "";
            }

            String resultString2 = "";
            //all after index+word length
            for (int i = resultString.indexOf(firstString) + firstString.length(); i < resultString.length(); i++) {
                resultString2 += resultString.charAt(i) + "";
            }
            resultString = resultString1 + resultString2;
            
            // resultString = resultString.replace(firstString, "");
        }

        System.out.println(resultString);
    }
}
