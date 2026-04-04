class QueueArray {
    int[] arr;
    int front, rear, size, capacity;

    // Constructor
    QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (Insert)
    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    // Dequeue (Remove)
    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = arr[front];
        front++;
        size--;

        return value;
    }

    // Peek (Front element)
    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }


    // Display queue
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class QueueArr {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();  // 10 20 30

        System.out.println("Removed: " + q.dequeue());

        q.display();  // 20 30

        System.out.println("Front: " + q.peek());

        q.enqueue(40);
        q.enqueue(50);
       //X q.enqueue(60); // might fill queue

        q.display();
    }
}