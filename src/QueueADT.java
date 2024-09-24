public interface QueueADT <T>{
    public boolean isEmpty();
    public int size();
    public void enqueue(T item);
    public T dequeue();
    public T peek();
    public void display();
}
