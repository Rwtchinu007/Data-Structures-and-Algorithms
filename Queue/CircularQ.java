
class CircularQueue {

    int arr[], capacity, front, rear;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    void enqueue(int val) {
        if ((rear + 1) % capacity == front) {
            System.out.println("queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = val;
    }

    void printQueue() {
        if (front == -1) {
            System.out.println("Empty queue");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (rear == i) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println("");
    }

    int dequeue(){
        if(front==-1){
            System.out.println("Empty queue");
            return -1;
        }
        int elem = arr[front];
        if(front==rear) front = rear = -1;
        else{
            front = (front+1)%capacity;
        }
        return elem;
    }

}

public class CircularQ {

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.printQueue(); //print queue
        q.enqueue(60); // stack full
        q.dequeue(); //remove 10
        q.dequeue(); //remove 20
        q.dequeue(); //remove 30
        q.dequeue(); //remove 40
        q.dequeue(); //remove 50
        q.printQueue(); //print queue
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);
        q.printQueue();
        
    }
}
