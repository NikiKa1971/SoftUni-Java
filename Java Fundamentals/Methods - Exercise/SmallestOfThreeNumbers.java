import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int inputLine = Integer.parseInt(scanner.nextLine());
            smallestNumber = getSmallestNumber(inputLine, smallestNumber);
        }
        printSmallestNumber(smallestNumber);
    }

    private static int getSmallestNumber(int inputLine, int smallestNumber) {

        smallestNumber = Math.min(inputLine, smallestNumber);

        return smallestNumber;
    }

    private static void printSmallestNumber(int smallestNumber) {

        System.out.println(smallestNumber);
    }
}
