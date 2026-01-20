/*
 Problem: Min to Max
 Given an array, count the number of elements that are NOT equal
 to the minimum element in the array.

 Example:
 Input: [1, 2, 1, 3]
 Minimum = 1
 Output = 2

 Time Complexity: O(n)
*/

public class MinToMax {

    public static int countNonMinimum(int[] nums) {

        int min = Integer.MAX_VALUE;

        // Find minimum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int count = 0;

        // Count elements not equal to minimum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min) {
                count++;
            }
        }

        return count;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        System.out.println(countNonMinimum(nums));
    }
}
