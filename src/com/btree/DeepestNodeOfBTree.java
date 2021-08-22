package com.btree;

public class DeepestNodeOfBTree {
	private static int deepestVal = 0;

	public static void main(String[] args) {
		int level = height(Node.tree());
		DeepestNode(Node.tree(), level);
		System.out.println("deepest node : " + deepestVal);
	}

	public static int height(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static void DeepestNode(Node root, int level) {

		if (root == null) {
			return;
		}
		if (level == 1) {
			deepestVal = root.data;
		} else if (level > 1) {
			DeepestNode(root.left, level-1);
			DeepestNode(root.right, level-1);
		}
	}

}
