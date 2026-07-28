class MaxHeap {
    ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(parent) < heap.get(index)) {
                //swap
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

        int max = heap.get(0);

        if (heap.size() == 1) {
            heap.remove(0);
            return max;
        }

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int i = 0;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                largest = left;
            }

            if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                largest = right;
            }

            if (largest == i) {
                break;
            }

            int temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);

            i = largest;
        }

        return max;
    }
    public int size() {
    return heap.size();
}

public int peek() {
    if (heap.isEmpty()) {
        throw new RuntimeException("Heap is Empty");
    }
    return heap.get(0);
}
}
class Solution {
    public int lastStoneWeight(int[] stones) {

        MaxHeap heap = new MaxHeap();

        for (int stone : stones) {
            heap.insert(stone);
        }

        while (heap.size() > 1) {
            int first = heap.delete();
            int second = heap.delete();

            if (first != second) {
                heap.insert(first - second);   // first >= second
            }
        }

        return heap.size() == 0 ? 0 : heap.peek();
    }
}