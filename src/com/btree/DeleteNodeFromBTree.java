package com.btree;

import java.util.LinkedList;
import java.util.Queue;

// node deletion by postorder traversal
public class DeleteNodeFromBTree {
	public static Node node = Node.tree();

	public static void main(String[] args) {
//		deleteTree(node);
		System.out.println("Before");
		Node.print(node);
//		deleteKthNodeFromTree(node , 40);
//		Node result = deleteKthLeafNode(node, 50);
		
		Node result = deleteSumNode(node, 210 , 0);
//		Node result = deleteLeafNode(node);
		System.out.println();
		System.out.println("After");
		Node.print(result);
	}

	// delete node using using order level traversal
	public static Node deleteLeafNode(Node root) {
		
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left =  deleteLeafNode(root.left);
		root.right = deleteLeafNode(root.right);
		
		
		return root;
	}
	
	public static Node deleteKthLeafNode(Node root , int k) {
		
		if(root == null) {
			return null;
		}

		if(root.left == null && root.right == null && root.data == k) {
			return null;
		}
		
		root.left =  deleteKthLeafNode(root.left , k);
		root.right = deleteKthLeafNode(root.right , k);
		
		
		return root;
	}

	// delete tree using recursion
	public static void deleteTree(Node root) {
		if (root == null) {
			return;
		}
		deleteTree(root.left);
		deleteTree(root.right);
		System.out.println("Deleting Node:" + root.data);
		root  = null;
	}

	// delete kth node from the binary tree
	public static Node deleteKthNodeFromTree(Node root, int k) {

		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			if (root.data == k) {
				return null;
			} else {
				return root;
			}
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		Node deletedNode = null;
		Node current = null;
		while (!queue.isEmpty()) {
			current = queue.poll();
			if (current.data == k) {
				deletedNode = current;
			}

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

		int value = current.data;
		deepestNode(root, current);
		deletedNode.data = value;
		
		return root;
	}

	public static void deepestNode(Node root, Node current) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (temp.right == current) {
				temp.right = null;
				current = null;
				break;
			} else {
				queue.add(temp.right);
			}

			if (temp.left == current) {
				temp.left = null;
				current = null;
			} else {
				queue.add(temp.left);
			}
		}
	}
	
	public static Node deleteSumNode(Node root , int k , int sum) {
		if(root == null) {
			return null;
		}
		
		sum += root.data;
		
		root.left = deleteSumNode(root.left, k , sum);
		root.left = deleteSumNode(root.right ,k , sum);
		
		if(sum < k && root.left == null && root.right == null) {
			return null;
		}
		
		return root;
	}
	

}
