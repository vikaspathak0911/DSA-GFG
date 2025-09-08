// User function Template for Java

class Solution {
// O(N) Time, O(N) Space - but passes "in-place" for some interpretations
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
    
        // Copy all positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[k++] = arr[i];
            }
        }
    
        // Copy all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[k++] = arr[i];
            }
        }
    
        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}