import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> union = new ArrayList<>();
        int i = 0; // Pointer for array 'a'
        int j = 0; // Pointer for array 'b'

        while (i < a.length && j < b.length) {
            // Skip duplicates in array 'a'
            while (i > 0 && i < a.length && a[i] == a[i - 1]) {
                i++;
            }
            // Skip duplicates in array 'b'
            while (j > 0 && j < b.length && b[j] == b[j - 1]) {
                j++;
            }

            // After skipping duplicates, check if pointers are still valid
            if (i >= a.length || j >= b.length) {
                break; // One of the arrays is exhausted
            }

            if (a[i] < b[j]) {
                union.add(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                union.add(b[j]);
                j++;
            } else { // a[i] == b[j]
                union.add(a[i]); // Add element from either array (they are equal)
                i++;
                j++;
            }
        }

        // Add remaining elements from array 'a' (if any)
        while (i < a.length) {
            // Skip duplicates
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            union.add(a[i]);
            i++;
        }

        // Add remaining elements from array 'b' (if any)
        while (j < b.length) {
            // Skip duplicates
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            union.add(b[j]);
            j++;
        }

        return union;
    }
}