public class QueueLL<T> {
    //Node class
    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public QueueLL() {
        front = null;
        rear = null;
    }

    //add at the end of the queue
    void enqueue(T element) {
        Node newNode = new Node(element);
        if (rear == null) {
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    //remove at the front of the queue: element = front.data ,new front = front.next
    T dequeue() {
        T element = (T)front.data;
        front = front.next;
        return element;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    boolean isEmpty() {
        return front == null;
    }

}
