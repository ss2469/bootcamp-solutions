package part1.bootcamp.difficult;

public class Program_02_Doubly_Linked_List {
	
	// Write a program to implement a doubly-linked list in Java.
	
			/* Doubly linked list has nodes that keep information about its PREVIOUS 
			 * as well as NEXT nodes using the previous and next pointers.
			 * Also, First node's previous pointer AND Last node's next pointer is set to NULL.
			 * It can traverse in BOTH forward and backward directions.
			 */

	public static void main(String[] args) {
		
		Program_02_Doubly_Linked_List dll = new Program_02_Doubly_Linked_List();
		
		// Add nodes to the list
		
		dll.addNode(40);
		dll.addNode(15);
		dll.addNode(9);
		dll.addNode(68);
		dll.addNode(21);
		
		// Displays the nodes present in the list
		
		dll.display();

	}
	
	
	class Node {
		
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	
	Node head =null;
	Node tail = null;
	
	
	// Method to add a node o the list
	public void addNode(int data) {
		//Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
		
		
	}
	
	// Method to print the nodes of the list
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		System.out.println("Nodes of doubly linked list: ");
		
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

}
