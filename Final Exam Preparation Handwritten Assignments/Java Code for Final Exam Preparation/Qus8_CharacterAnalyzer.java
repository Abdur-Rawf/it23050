import java.util.Scanner;

public class Qus8_CharacterAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int letters = 0;
        int whitespaces = 0;
        int digits = 0;

        // Analyze each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isWhitespace(ch)) {
                whitespaces++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }

        // Output the results
        System.out.println("Letters: " + letters);
        System.out.println("Whitespaces: " + whitespaces);
        System.out.println("Digits: " + digits);

        scanner.close();
    }
}