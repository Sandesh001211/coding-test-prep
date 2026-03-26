import java.util.*;

public class MaxProductSubset {
    public static int maxProductSubset(int arr[], int n) {
        
        if (n == 1)
            return arr[0];

        int max_neg = Integer.MIN_VALUE;
        int count_neg = 0, count_zero = 0;
        int prod = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                count_zero++;
                continue;
            }

            if (arr[i] < 0) {
                count_neg++;
                max_neg = Math.max(max_neg, arr[i]);
            }

            prod = prod * arr[i];
        }

        // if all zeros
        if (count_zero == n)
            return 0;

        // if odd negatives, remove largest negative
        if (count_neg % 2 == 1) {
            
            // special case: only one negative and rest zero
            if (count_neg == 1 && count_zero + count_neg == n)
                return 0;

            prod = prod / max_neg;
        }

        return prod;
    }

    public static void main(String[] args) {
        int arr[] = {-1, -1, -2, 4, 3};
        int n = arr.length;

        System.out.println(maxProductSubset(arr, n));
    }
}