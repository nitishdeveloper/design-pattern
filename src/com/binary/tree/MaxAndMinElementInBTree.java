package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAndMinElementInBTree {
	public static void main(String[] args) {
		System.out.println("MAX : " + findMaximumElementUsingRecursion(Node.tree())+" | MIN : " + findMinimumElementUsingRecursion(Node.tree()));
	}

	// find maximum and minimum element in binary tree
	public static void findMaximumAndMinimumElement(Node root) {
		if (root == null) {
			return;
		}
		int MAX = 0;
		int MIN = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		MIN = root.data;

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			MAX = Math.max(MAX, current.data);
			MIN = Math.min(MIN, current.data);

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

		System.out.println("MAX : " + MAX + " | MIN : " + MIN);
	}

	public static int findMaximumElementUsingRecursion(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int MAX = root.data;
		int LEFT_VAL = findMaximumElementUsingRecursion(root.left);
		int RIGHT_VAL = findMaximumElementUsingRecursion(root.right);

		MAX = Math.max(MAX, LEFT_VAL);
		MAX = Math.max(MAX, RIGHT_VAL);

		return MAX;
	}

	public static int findMinimumElementUsingRecursion(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		int MIN = root.data;
		int LEFT_VAL = findMinimumElementUsingRecursion(root.left);
		int RIGHT_VAL = findMinimumElementUsingRecursion(root.right);

		MIN = Math.min(MIN , LEFT_VAL);
		MIN = Math.min(MIN , RIGHT_VAL);

		return MIN;
	}

}
