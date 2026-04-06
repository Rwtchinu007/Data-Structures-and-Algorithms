class StackLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null; // top of stack

    // PUSH operation
    void push(int val) {
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;

        System.out.println(val + " pushed");
    }

    // POP operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;

        return removed;
    }

    // PEEK operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // DISPLAY (extra for understanding)
    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}