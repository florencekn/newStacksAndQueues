import java.util.LinkedList;

public class StackLL<T> {

    Node top;
    //LinkedList stack;
    //int size;

    public StackLL() {
        top = null;
//        stack = new LinkedList();
//        size = 0;
    }

    //Node class
    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;

        }
    }

    //add element at the top
    void push(T element) {
        Node newNode = new Node(element);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    boolean isFull() {
        return top.next == null;
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        }
        T popped = (T) top.data;
        top = top.next;
        return popped;
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        }
        return (T) top.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size(){
        return top == null ? 0 : top.data == null ? 0 : 1;
    }
}
