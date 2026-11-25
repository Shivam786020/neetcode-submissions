
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (maxHeap.size() > 1) {
            int a = maxHeap.poll();   // heaviest
            int b = maxHeap.poll();   // second heaviest
            if (a != b) {
                maxHeap.offer(a - b); // leftover goes back
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}