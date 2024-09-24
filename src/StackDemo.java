import java.util.Arrays;

public class StackDemo {
    int top;
    int capacity;
    int[] stack;

    //Constructor to assign the top index
    StackDemo() {
        top = -1;// in order to push the first element, top indicates the first element of the stack which is at position 0
    }

    public StackDemo(int size) {
        top = -1;
        this.capacity = size;
        stack = new int[size];

    }

    //isEmpty() method
    boolean isEmpty() {
        return top == -1;//if it were 0, that means there would be one element in the stack
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    /* push(): This is to add an element to the stack */
    public void push(int x) {
        if (isFull()) {
            expand();
            //System.out.println("Stack is full");
        }
        stack[++top] = x;
    }

    public void expand() {
        int newCapacity = capacity + 10;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        stack = newStack;
        capacity = newCapacity;

    }


    /* pop(): This is to remove an element from the stack at top */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        for (int element : stack) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
