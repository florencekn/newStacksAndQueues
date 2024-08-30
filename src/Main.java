//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //****************STACKS****************
        StackDemo s = new StackDemo();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
        System.out.println("Enter the number of your choice: 1.Push\t2.Pop\t3.Display\t4.Exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                s.push(sc);
                break;
            case 2:
                s.pop(sc);
                break;
            case 3:
                s.display();
                break;
            case 4:
                System.out.println("Exit Program");
            }
        }
    }
}