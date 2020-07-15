package com.binary.tree;

public class LowestCommonAncestorBST{

	public static void main(String[] args) {
		Node.print(lowestCommonAncestorForBST(Node.tree2(), Node.tree2().left.left, Node.tree2().right.left.right));
	}

	public static Node lowestCommonAncestorForBST(Node root, Node p, Node q) {

		if (root == null || p == null || q == null)
			return null;

		if (root.data < p.data && root.data < q.data) {
			return lowestCommonAncestorForBST(root.left, p, q);
		}
		if (root.data > p.data && root.data > q.data) {
			return lowestCommonAncestorForBST(root.right, p, q);
		} else {
			return root;
		}
	}

	public static Node LowestCommonAncestorBSTIterative(Node root, Node p, Node q) {

		if (root == null || p == null || q == null)
			return null;

		Node current = root;
		while (current != null) {

			if (root.data > p.data && root.data > q.data) {
				current = current.left;
			} else if (root.data < p.data && root.data < q.data) {
				current = current.right;
			} else {
				return root;
			}
		}
		return null;
	}
}
