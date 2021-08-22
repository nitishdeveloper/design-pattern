package com.btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseElementLevelOrderTraversal {

	public static void main(String[] args) {
		reverseElement(Node.tree());
	}
	
	public static void reverseElement(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		System.out.println("Without Reverse Order");
		while(!queue.isEmpty()) {
			  Node cur = queue.poll();
			  System.out.print(cur.data+" ");
			  stack.add(cur);
			  
			  if(cur.right != null) {
				  queue.add(cur.right);
			  }
			  if(cur.left != null) {
				  queue.add(cur.left);
			  }
		}
		System.out.println();
		System.out.println("Reverse Order ");
		while(!stack.isEmpty()) {
			 Node cur = stack.pop();
			 System.out.print(cur.data+" ");
		}
		
	}

}
