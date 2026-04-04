
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front, rear;

    Queue() {
        front = rear = null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        // if queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        // add at end
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = front.data;
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return result;
    }

    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Queue1 {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(45);
        q.enqueue(50);

        q.display();  // 10 -> 20 -> 30 -> null

        System.out.println("Removed: " + q.dequeue());

        q.display();  // 20 -> 30 -> null

        System.out.println("Front: " + q.peek());

    }
}
