//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //****************STACKS****************
        StackDemo s = new StackDemo(5);

        System.out.println(s.isFull());

        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(6);
        System.out.println(s.size());
        s.display();



        s.push(7);
        System.out.println(s.size());
        s.display();

        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//        Scanner sc = new Scanner(System.in);
//        int choice = 0;
//
//        while (choice != 4) {
//            System.out.println("Enter the number of your choice: \t1.Push\t2.Pop\t3.Display\t4.Exit");
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter the value to add into the queue: ");
//                    int value = sc.nextInt();
//                    s.push(value);
//                    break;
//                case 2:
//                    s.pop();
//                    break;
//                case 3:
//                    s.display();
//                    break;
//                case 4:
//                    System.out.println("Exiting Program...");
//                    break;
//                default:
//                    System.out.println("Invalid Choice");
//            }
//        }
//        QueueDemo<Integer> integerQueueDemo = new QueueDemo<>(6);
//        System.out.println(integerQueueDemo.size());
//        integerQueueDemo.display();

    }
}