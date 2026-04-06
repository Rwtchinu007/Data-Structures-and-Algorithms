class StackArray {

    int arr[];
    int top;

    StackArray(int size) {
        arr = new int[size];
        top = -1;
    }

    // PUSH
    void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    // POP
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // PEEK
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // DISPLAY
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

    // MAIN
    public class StackArr{
          public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display(); // 30 20 10

        System.out.println("Peek: " + s.peek());

        System.out.println("Pop: " + s.pop());

        s.display();
    }

    }
  
