class MinHeap {
    ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(parent) > heap.get(index)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(index));
                heap.set(index, temp);
                index = parent;
            } else
                break;
        }
    }

    public int delete() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is Empty");
        }
        int min = heap.get(0);
        if (heap.size() == 1) {
            heap.remove(0);
            return min;
        }
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int i = 0;
        while (true) {
            int smallest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            if (smallest == i)
                break;
            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            i = smallest;
        }
        return min;

    }

    public int size() {
        return heap.size();
    }

}

class Solution {
    MinHeap heap = new MinHeap();

    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
            if (heap.size() > k)
                heap.delete();
        }
        return heap.delete();
    }
}