public class ArrayReverse {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};
        reverse(arr);

        // Print reversed array
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
