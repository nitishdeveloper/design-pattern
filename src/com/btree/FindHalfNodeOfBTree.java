package com.btree;

import java.util.LinkedList;
import java.util.Queue;

public class FindHalfNodeOfBTree {

	public static void main(String[] args) {
		System.out.println("Half Nodes : "+halfTree(Node.tree()));
		System.out.println("Half Nodes : "+halfNodeTree(Node.tree()));
	}
	
	public static int halfTree(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null ^ root.right == null) {
			System.out.println("data : "+root.data);
			return 1;
		}
		return halfTree(root.left)+halfTree(root.right);
	}
	
	public static int halfNodeTree(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int count =  0;
		while(!queue.isEmpty()) {
				Node current = queue.poll();
				if(current.left == null ^ current.right == null) {
					System.out.println("data : "+current.data);
					count++;
				}
				
				if(current.left != null) {
					queue.add(current.left);
				}
				if(current.right != null) {
					queue.add(current.right);
				}
			}
		 return count;
	}

}
