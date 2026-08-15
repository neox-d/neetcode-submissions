class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.queue = new PriorityQueue<>();
        for (int i=0; i<nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }
    }
    
    public int add(int val) {
        queue.add(val);
        if (queue.size() > k) {
            queue.poll();
        }

        return queue.peek();
    }
}
