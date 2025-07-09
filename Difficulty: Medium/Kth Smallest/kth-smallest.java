class Solution {
    public static int kthSmallest(int[] arr, int k) {
        
          PriorityQueue<Integer> kNumbersMinHeap = new PriorityQueue<Integer>((n1, n2) -> n2-n1);
          
          for(int i=0;i<k;i++)
          {
            kNumbersMinHeap.add(arr[i]);
          }

          for(int i=k;i<arr.length;i++)
          {
            if(arr[i]< kNumbersMinHeap.peek() && !kNumbersMinHeap.isEmpty() )
            {
                kNumbersMinHeap.poll();

                kNumbersMinHeap.add(arr[i]);
            }
          }

         return kNumbersMinHeap.peek();
    }
}