package com.btree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {

	public static void main(String[] args) {

		Node.print(Node.tree2());
		System.out.println();
		List<List<Integer>> list = zigzagLevelOrder(Node.tree2());
		System.out.println(list);

	}

	public static List<List<Integer>> zigzagLevelOrder(Node root) {
		List<Integer> list1 = null;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		boolean isZigZag = false;
		
		while (!queue.isEmpty()) {
			
			int size = queue.size();
			list1 = new ArrayList<Integer>();
			
			while (size --> 0) {
				Node cur = queue.poll();
				
				if (isZigZag) {
					list1.add(0, cur.data);
				} else {
					list1.add(cur.data);
				}

				if (cur.left != null) {
					queue.add(cur.left);
				}
				if (cur.right != null) {
					queue.add(cur.right);
				}
			}
			
			result.add(list1);
			isZigZag = !isZigZag;
		}
		return result;
	}
}
