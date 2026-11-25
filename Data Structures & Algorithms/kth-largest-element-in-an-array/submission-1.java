
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // min-heap

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();   // remove smallest → keep k largest
            }
        }
        return minHeap.peek();    // top = k-th largest
    }
}