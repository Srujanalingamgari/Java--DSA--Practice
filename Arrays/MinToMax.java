/*
 Min to Max: Count elements not equal to minimum
 Time Complexity: O(n)
*/
public class MinToMax {
    public static int countNonMinimum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) min = Math.min(min, num);

        int count = 0;
        for (int num : nums) {
            if (num != min) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        System.out.println(countNonMinimum(nums));
    }
}
