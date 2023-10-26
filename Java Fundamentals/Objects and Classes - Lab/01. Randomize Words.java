import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream((scanner.nextLine()
                .split(" ")))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        int count = input.size();
        Random rdm = new Random();
        for (int i = 0; i < count; i++) {
            int index = rdm.nextInt(input.size());
            result.add(input.get(index));
            input.remove(index);

        }
        for (String word : result) {
            System.out.printf("%s%n", word);
        }
    }
}
