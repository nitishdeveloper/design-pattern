package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSum {

	public static void main(String[] args) {
		System.out.println(maximumLevelSum(Node.tree2()));
	}

	public static int maximumLevelSum(Node root) {
		if (root == null)
			return 0;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		int level = 0;
		int max_sum = 0;
		int sum = 0;
		int max_level = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			level++;
			while (size > 0) {
				Node current = queue.poll();
				sum += current.data;
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
				size--;
			}
			if (max_sum < sum) {
				max_sum = sum;
				max_level = level;
			}
			sum = 0;
		}
		System.out.println("max_sum : "+max_sum);
		return max_level;
	}

}
