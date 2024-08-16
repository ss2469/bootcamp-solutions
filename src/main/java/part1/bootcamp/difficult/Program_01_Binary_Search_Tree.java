package part1.bootcamp.difficult;

public class Program_01_Binary_Search_Tree {
	
	// Write a program to implement a binary search tree in Java.
	
	// Binary Search Tree (BST) is a tree data structure where each node has at most TWO children.
	// called Left Child and Right Child - left subtree has values LESS than node's value & right has GREATER values.
	// BST does not allow duplicate nodes.
	
	public static void main(String[] args) {
		
		Program_01_Binary_Search_Tree bt = new Program_01_Binary_Search_Tree();
		
		// Add nodes to the binary tree
		
		bt.insert(50);
		bt.insert(30);
		bt.insert(70);
		bt.insert(60);
		bt.insert(10);
		bt.insert(90);
	
		System.out.println("Binary Search Tree after insertion: ");
		// Displays the binary tree
		// INORDER traversal - Traverse from the left subtree to the root then to the right subtree.
		bt.inorderTraversal(bt.root);
		
	}
	
	
	// Represents a node of binary tree - Static NESTED CLASS
	public static class Node {
		
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			
			this.data = data;
			this.left = null;
			this.right = null;
		}	
	}
	
	// Declaration of a public instance variable 'root' of type 'Node'
	public Node root;
	
	
	public Program_01_Binary_Search_Tree() {
		
		root = null;
	}
	
	public void insert(int data) {
		
		// Create a new node
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
			return;
		} 
		else {
			Node current = root;
			Node parent = null;
			
			while(true) {
				
				parent = current;
				
				// If data is less than current's data, node will be inserted to the left of tree
				if(data < current.data) {
					current = current.left;
					if(current == null) {
						parent.left = newNode;
						return;
					}		
				}
				else { // If data is greater than current's data, node will be inserted to the right of tree
					
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return;
					}
				}
			} // while loop ends
			
		} //else block ends
		
	} //insert() method ends
	
	
	public void inorderTraversal(Node node) {
		
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		} 
		else {
			
			if(node.left != null)
				inorderTraversal(node.left);
			
			System.out.println(node.data + " ");
			
			if(node.right != null)
				inorderTraversal(node.right);
			
		} // else block ends
	}
	

}
