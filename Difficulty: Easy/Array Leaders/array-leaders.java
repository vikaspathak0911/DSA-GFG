class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> rel = new ArrayList<>();
        
        int n = arr.length;
        if (n == 0) {
            rel.add(n);
        }
         
         int min = Integer.MIN_VALUE;
         for(int i= n-1; i>=0; i--) {
             if(arr[i] >= min) {
                 min = arr[i];
                 rel.add(min);
             }
         }
         Collections.reverse(rel);
        return rel;
    }
}