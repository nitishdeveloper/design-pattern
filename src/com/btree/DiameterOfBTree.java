package com.btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DiameterOfBTree {

	public static void main(String[] args) {
		System.out.println("diameter : "+diameter(Node.tree2()));
		System.out.println("diameter : "+Diameter(Node.tree2()));
	}

	public static int diameter(Node root) {
		if (root == null)
			return 0;
        int L = height(root.left);
        int R = height(root.right);
		int withRoot =  L + R;
 
		int Ldia = diameter(root.left);
		int Rdia = diameter(root.right);
		
		int withoutRoot = Math.max(Ldia , Rdia);

		return Math.max(withRoot, withoutRoot);
	}

	public static int height(Node root) {
		if (root == null)
			return 0;
		return (1 + Math.max(height(root.left), height(root.right)));
	}
	
	public static int Diameter(Node root) {
		if(root == null) return 0;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		int number_of_edges = 0;
		
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			int left_subtree_height = Height(root.left);
			int right_subtree_height = Height(root.right);
			
			int height = left_subtree_height + right_subtree_height;
			
			number_of_edges = Math.max(number_of_edges, height);
			
			if(current.left != null) {
				stack.push(current.left);
			}
			if(current.right != null) {
				stack.push(current.right);
			}
		}
		return number_of_edges;
	}
	
	public static int Height(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int height = 0;
		while(!queue.isEmpty()) {
			int SIZE = queue.size();
			height++;
			while(SIZE-- > 0) {
				Node current = queue.poll();
				
				if(current.left != null) {
					queue.add(current.left);
				}
				if(current.right != null) {
					queue.add(current.right);
				}
			}
		}
		return height;
	}

}
