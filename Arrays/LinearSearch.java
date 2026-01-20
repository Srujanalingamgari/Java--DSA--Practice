import java.util.Scanner;

/**
 * Linear Search example
 * Checks whether a target element exists in an array
 */
public class LinearSearch {

    // Method to check if target exists
    public static boolean isElementPresent(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Input target element
        int target = sc.nextInt();

        // Input array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check and print result
        if (isElementPresent(numbers, target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
