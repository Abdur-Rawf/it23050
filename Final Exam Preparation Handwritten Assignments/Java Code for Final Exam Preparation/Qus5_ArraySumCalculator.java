class Qus5_ArraySumCalculator {
    // Method to calculate sum of array elements
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Call the method and store the result
        int sum = calculateSum(numbers);

        // Display the result
        System.out.println("Sum of array elements: " + sum);
    }
}
