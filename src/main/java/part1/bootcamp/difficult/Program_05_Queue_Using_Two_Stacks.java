package part1.bootcamp.difficult;

import java.util.Stack;


public class Program_05_Queue_Using_Two_Stacks {

	// Write a program to implement a queue using two stacks in Java.

	// In Queue - elements are stored in First In, First Out (FIFO).
	// i.e, elements are added from the behind and removed from the front.
	// enQueue() and deQueue() methods are used to add (push) and remove (pop) elements from the queue.
	
	// Main method to test the queue implementation
    public static void main(String[] args) {
    	Program_05_Queue_Using_Two_Stacks queue = new Program_05_Queue_Using_Two_Stacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued item: " + queue.dequeue()); // Outputs: Dequeued item: 10
        System.out.println("Front item: " + queue.peek());       // Outputs: Front item: 20
        System.out.println("Is queue empty? " + queue.isEmpty()); // Outputs: Is queue empty? false
    }

    //Queue implemented using two stacks
    
    private Stack<Integer> stack1; // for enqueue
    private Stack<Integer> stack2; // for dequeue

    public Program_05_Queue_Using_Two_Stacks() { //constructor
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Method to add an item to the queue (enqueue)
    public void enqueue(int item) {
        stack1.push(item);
        System.out.println(item + " enqueued to the queue");
    }

    // Method to remove an item from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }

        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Method to peek the front item of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }

        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    
}

