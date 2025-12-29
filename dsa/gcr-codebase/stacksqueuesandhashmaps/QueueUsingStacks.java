// Implement a Queue Using Stacks
// Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
// Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.


package stacksqueuesandhashmaps;

import java.util.*;

public class QueueUsingStacks {
      Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int x) {
        stack1.push(x);
        System.out.println(x + " enqueued");
    }

    void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Dequeued: " + stack2.pop());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks q = new QueueUsingStacks();

        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                q.enqueue(sc.nextInt());
            } else if (choice == 2) {
                q.dequeue();
            } else {
                break;
            }
        }
        
    }
    
}
