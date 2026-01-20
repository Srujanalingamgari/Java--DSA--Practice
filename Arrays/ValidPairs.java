/*
 Problem: Valid Pairs
 Given two arrays a and b of size n,
 count how many indices i satisfy:
 2 * a[i] >= b[i] AND a[i] <= 2 * b[i]

 Time Complexity: O(n)
*/

import java.util.Scanner;

public class ValidPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (2 * a[i] >= b[i] && a[i] <= 2 * b[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
