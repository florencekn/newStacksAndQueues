import java.util.Scanner;

public class StackDemo {
    int top;
    int size = 10;
    int[] arr = new int[size];

    //isEmpty() method
    boolean isEmpty() {
        return top == -1;//if it were 0, that means there would be one element in the stack
    }

    //Constructor to assign the top index
    StackDemo() {
        top = -1;// in order to push the first element, top indicates the first element of the stack which is at position 0
    }

    /* push(): This is to add an element to the stack */
    boolean push(Scanner sc){
        if(top == size - 1){//if the most recent element (the top element) is same as the size = full, can't add anymore
            System.out.println("Stack is full!");
            return false;
        } else {
            System.out.println("Enter value to be pushed in stack: ");
            int value = sc.nextInt();
            top++;// the new value will take its place in the stack, meaning it'll take its place at the top of the stack
            arr[top] = value;
            return true;
        }
    }

    /* pop(): This is to remove an element from the stack */
    boolean pop(Scanner sc){
        if(top == -1){
            System.out.println("Stack is empty!");// can't pop an element from a stack if this is empty!
            return false;
        } else {
            top--;
            System.out.println("data popped!");
            return true;
        }
    }

    void display() {
        System.out.println("The stored elements are: ");
        for(int i = top; i >= 0; i--) {// you start from the latest element to the oldest element
            System.out.print(arr[i] + " ");
        }
    }
}
