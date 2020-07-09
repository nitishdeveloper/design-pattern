package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {

	public static void main(String[] args) {
//		System.out.println("Size of Binary tree is : "+getSizeOfBTree(Node.tree()));
		System.out.println("Size of Binary tree is : "+getSize(Node.tree()));
	}

	public static int getSizeOfBTree(Node root) {
		int count = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			count++;
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

		return count;
	}
	public static int getSize(Node root) {
		if(root == null) {
			return 0;
		}
		return (1+getSize(root.left)+getSize(root.right));
	}

}
