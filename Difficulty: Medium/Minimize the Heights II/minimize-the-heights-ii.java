class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if(n == 1) return 0;

        Arrays.sort(arr);

        int diff = arr[n-1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        for(int i = 1; i < n; i++){
            int min = Math.min(smallest, arr[i] - k);
            int max = Math.max(largest, arr[i-1] + k);

            if(min < 0) continue;

            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
