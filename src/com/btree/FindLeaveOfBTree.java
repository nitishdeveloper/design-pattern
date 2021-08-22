package com.btree;

import java.util.LinkedList;
import java.util.Queue;

public class FindLeaveOfBTree {

	public static void main(String[] args) {
		leaveOfBTree(Node.tree());
		System.out.println("Number of Leaves are : "+leave(Node.tree()));
	}
	
	public static void leaveOfBTree(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int count =  0;
		while(!queue.isEmpty()) {
				Node current = queue.poll();
				if(current.left == null && current.right == null) {
					count++;
				}
				
				if(current.left != null) {
					queue.add(current.left);
				}
				if(current.right != null) {
					queue.add(current.right);
				}
			}
		 System.out.println("Number of Leaves are : "+count);
	}
	
	public static int leave(Node root) {
		if(root == null) return 0;
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		return leave(root.left)+leave(root.right);
	}
}
