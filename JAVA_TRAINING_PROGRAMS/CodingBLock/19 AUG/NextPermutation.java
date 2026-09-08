import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        // Example array: we want the next lexicographically larger permutation.
        // For [5, 3, 4, 2, 1], the next one is [5, 4, 1, 2, 3].
        int[] arr = {5, 3, 4, 2, 1};

        // -------------------------------------------------------------
        // STEP 1: Find the "pivot" (dip from the right).
        // Scan backwards to find the first number that is smaller than 
        // the number immediately after it (arr[i - 1] < arr[i]).
        // -------------------------------------------------------------
        int p = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                p = i - 1; // 'p' is the index of the number we need to replace
                break;
            }
        }

        // -------------------------------------------------------------
        // STEP 2: Find the "successor".
        // Scan backwards to find the first number from the right that 
        // is strictly bigger than our pivot (arr[p]).
        // -------------------------------------------------------------
        int q = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[p]) {
                q = i; // 'q' is the index of the smallest larger element
                break;
            }
        }

        // -------------------------------------------------------------
        // EDGE CASE: If p == q (e.g. array was fully descending like [5, 4, 3, 2, 1]),
        // no larger permutation exists. We simply reverse the whole array 
        // to reset back to the smallest permutation [1, 2, 3, 4, 5].
        // -------------------------------------------------------------
        if (p == q) {
            reverse(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
            return;
        }

        // -------------------------------------------------------------
        // STEP 3: Swap the pivot and successor.
        // Swap arr[p] and arr[q] so that the prefix becomes slightly larger.
        // -------------------------------------------------------------
        if (p < q) {
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
        }

        // -------------------------------------------------------------
        // STEP 4: Reverse the right tail.
        // The numbers after index 'p' are currently in descending order.
        // Reversing them turns them into ascending order (smallest possible),
        // giving us the exact NEXT permutation.
        // -------------------------------------------------------------
        reverse(arr, p + 1, arr.length - 1);

        // Print final result
        System.out.println(Arrays.toString(arr));
    }

    // Helper method to reverse a portion of an array in-place using two pointers
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; // Move left pointer right
            end--;   // Move right pointer left
        }
    }
}