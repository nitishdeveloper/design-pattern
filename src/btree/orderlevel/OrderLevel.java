package btree.orderlevel;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
	}
}

class BinaryTree {
	
	Node root;
	public void levelorder() {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data + " ");
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

	}

}

public class OrderLevel {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right= new Node(5);
		tree.root.right.left= new Node(6);
		tree.root.right.right= new Node(7);
		tree.levelorder();
	}
}
