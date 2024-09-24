public class QueueDemo<T> {
    int front, rear;
    int capacity;
    int size;
    T[] queue;


    public QueueDemo(int size) {
        this.capacity = size;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.queue = (T[]) new Object[capacity];
    }

    //Add at the end of the queue
    public void enqueue(T item) {
        if (rear == capacity) {
            expand();
        }
        queue[rear] = item;
        rear++;
        return;
    }

    public void dequeue() {
        if (this.front == this.capacity - 1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear] = null;
            }
            rear--;
        }
        return;
    }

    // add +10 to the full capacity
    public void expand() {
        capacity += 10;
        T[] temp = (T[]) new Object[capacity];
        for (int i = 0; i < queue.length; i++) {
            temp[i] = queue[i];
        }
        queue = temp;
    }

    public int size() {
        return size;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
