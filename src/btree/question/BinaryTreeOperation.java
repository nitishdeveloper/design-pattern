package btree.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeOperation {
	Node root;
	int maximum=0;
	int count=0;
	int flag =0;
	
	Queue<Node> queue = new LinkedList<Node>();
	//search particular node in the binary tree
	@SuppressWarnings("resource")
	public void searchElementInBinaryTree() {
		System.out.println();
		System.out.print("Enter the node you want to seach : ");
		Scanner scanner = new Scanner(System.in);
		int search = scanner.nextInt();	
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			
			if(search == current.data) {
				count++;
				search = current.data;
				flag=1;
			}
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
		}
		if(flag==1) {
			System.out.println(search+" element found "+count+" times");
		}else {
			System.out.println(search +" element not found.!!!");
		}
		
	}
	
	
	//find maximum node value in the binary tree
	public void findMaximumNode() {
		Queue<Node>  queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			if(maximum<current.data) {
				maximum=current.data;
			}
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
		}
		System.out.print("Maximum Node : "+maximum);
	}
	
	//level order traversing
	public void levelorder() {
		if (root == null) {
			return;
		}
		queue.add(root);
		System.out.print("Tree : ");
		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data + " ");
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		System.out.println();

	}
	
	// print element in reverse order in binary tree
	public void reverseTraversing() {
		queue.add(root);
		Stack<Node> stack = new Stack<Node>();
		Node current;
		System.out.print("Rerverse : ");
		while(!queue.isEmpty()) {
			current = queue.poll();
			stack.push(current);
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
			count++;
		}
		if(queue.isEmpty() && !stack.isEmpty()) {
			while(!stack.isEmpty()) {
			current = stack.pop();
			System.out.print(current.data+" ");
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
			}
		}
		System.out.println();
		System.out.print("size of the binary tree : "+count);
	}
	
	
	
}
