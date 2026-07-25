
import java.util.ArrayList;

class MinHeap {

    ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    //Insert element into the heap
    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        // heapify up
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(parent) > heap.get(index)) {
                // swap
                int temp = heap.get(parent);
                heap.set(parent, heap.get(index));
                heap.set(index, temp);
                index = parent;
            } else {
                break;
            }
        }
    }

    // delete the minimum element from the heap
    public int delete() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
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
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }

            if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            i = smallest;
        }

        return min;
    }

    // print the heap
    public void printHeap() {
        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(50);
        minHeap.insert(80);
        minHeap.insert(45);
        minHeap.printHeap(); // Output: 2 3 15 50 80 45
        System.out.println(minHeap.delete()); // Output: 2
        minHeap.printHeap(); // Output: 3 15 45 50 80
    }
}
