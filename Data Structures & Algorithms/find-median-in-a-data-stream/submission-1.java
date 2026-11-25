
class MedianFinder {
    private PriorityQueue<Integer> small;   // max-heap: smaller half
    private PriorityQueue<Integer> large;   // min-heap: larger half

    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        large = new PriorityQueue<>();                            // min-heap
    }

    public void addNum(int num) {
        // Step 1: always push into small first
        small.offer(num);

        // Step 2: move the largest of small into large to keep ordering
        large.offer(small.poll());

        // Step 3: rebalance sizes — small may have at most one extra
        if (large.size() > small.size()) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();                        // odd count
        }
        return (small.peek() + large.peek()) / 2.0;     // even count
    }
}