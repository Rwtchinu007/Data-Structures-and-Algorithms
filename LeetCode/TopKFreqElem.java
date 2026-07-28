class Pair {
    int num;
    int freq;

    Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

class MinHeap {
    ArrayList<Pair> heap;

    public MinHeap() {
        heap = new ArrayList<>();

    }

    public void insert(Pair val) {
        heap.add(val);
        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent).freq > heap.get(index).freq) {
                Pair temp = heap.get(parent);
                heap.set(parent, heap.get(index));
                heap.set(index, temp);
                index = parent;
            } else {
                break;
            }
        }
    }

    public Pair delete() {
        if (heap.isEmpty())
            throw new RuntimeException("Heap is Empty");

        Pair min = heap.get(0);

        if (heap.size() == 1) {
            heap.remove(0);
            return min;
        }

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int i = 0;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < heap.size() &&
                    heap.get(left).freq < heap.get(smallest).freq) {
                smallest = left;
            }

            if (right < heap.size() &&
                    heap.get(right).freq < heap.get(smallest).freq) {
                smallest = right;
            }

            if (smallest == i)
                break;

            Pair temp = heap.get(i);
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
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        MinHeap heap = new MinHeap();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.insert(new Pair(entry.getKey(), entry.getValue()));

            if (heap.size() > k) {
                heap.delete();
            }
        }
        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.delete().num;
        }

        return ans;

    }
}
