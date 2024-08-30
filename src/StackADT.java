public interface StackADT<T> {
    //Adds element to the top of the stack
    public void push(T element);

    //Removes element to the top of the stack
    public void pop(T element);

    //Returns element at the top of the stack without removing that element
    public void peek(T element);

    //Returns true if stack empty
    public boolean isEmpty();

    //Returns the size of the stack
    public int size();

    //Returns string representation of the stack
    public String toString();
}
