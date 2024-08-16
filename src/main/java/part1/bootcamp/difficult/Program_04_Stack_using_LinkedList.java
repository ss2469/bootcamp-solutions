package part1.bootcamp.difficult;

public class Program_04_Stack_using_LinkedList {
	
	// Write a program to implement a stack using a linked list in Java.

	/* Stack works on the principle of Last In, First Out (LIFO).
	 * Stack can be implemented using arrays or linked lists.
	 */

	public static void main(String[] args) {
		
		// Stack implemented using a singly linked list
		Program_04_Stack_using_LinkedList stack = new Program_04_Stack_using_LinkedList();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.display(); // Display stack: 30 20 10

		System.out.println("Popped element: " + stack.pop()); // Popped element: 30
		System.out.println("Top element: " + stack.peek()); // Top element: 20

		stack.display(); // Display stack after operations: 20 10

	}

	// Node class represents a single node in the linked list
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node top; // top of the stack

	public Program_04_Stack_using_LinkedList() {
		this.top = null;
	}

	// Method to check if the stack is empty
	public boolean isEmpty() {
		return top == null;
	}

	// Method to push a new element onto the stack
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top; // Point new node to the current top
		top = newNode; // Update top to the new node
		System.out.println(data + " pushed to stack");
	}

	// Method to pop an element from the stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // or throw an exception
		}
		int popped = top.data; // Retrieve data from the top node
		top = top.next; // Move top to the next node
		return popped;
	}

	// Method to peek the top element of the stack
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // or throw an exception
		}
		return top.data; // Return data from the top node
	}

	// Method to display the stack
	public void display() {
		Node current = top;
		System.out.print("Stack: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
