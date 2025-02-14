import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Qus1_SeriesSum {
    public static void main(String[] args) {
        try {
            // Read the input file
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            String inputLine = scanner.nextLine();
            scanner.close();

            // Split the input line by commas to get individual numbers
            String[] numberStrings = inputLine.split(",");
            int maxNumber = 0;

            // Find the highest number
            for (String numStr : numberStrings) {
                int num = Integer.parseInt(numStr.trim());
                if (num > maxNumber) {
                    maxNumber = num;
                }
            }

            // Calculate the sum of natural numbers up to the highest number
            int sum = maxNumber * (maxNumber + 1) / 2;

            // Write the result to the output file
            PrintWriter writer = new PrintWriter("output.txt");
            writer.println(maxNumber + ", " + sum);
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}