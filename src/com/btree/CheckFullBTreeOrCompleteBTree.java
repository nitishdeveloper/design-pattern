package com.btree;

public class CheckFullBTreeOrCompleteBTree {

	public static void main(String[] args) {
//		IsFullBinaryTree(Node.tree());
		System.out.println("Given Binary Tree is a Binary Tree: " + IsCompleteBinaryTree(Node.tree2()));
	}
	
	public static int nodeCount(Node root) {
		if(root == null) {
			return 0;
		}
		return (1+ nodeCount(root.left) + nodeCount(root.right));
	}
	
	public static void IsFullBinaryTree(Node root) {
		
		int count = nodeCount(root);
		boolean isTrue = false;
		if(count % 2 == 0) {
			isTrue = false;
		}else {
			isTrue = true;
		}
		
		if(isTrue) {
			System.out.println("This is full binary tree");
		}else {
			System.out.println("This is not a full binary tree");
		}
	}
	
	public static boolean IsCompleteBinaryTree(Node root) {
		int count = nodeCount(root);
		int index = 0;
		return IsCompleteBinaryTree(root , count , index);
		
	}
	
	public static boolean IsCompleteBinaryTree(Node root , int totalNode , int nodeIndex) {
		
		if(root  == null) {
			return true;
		}
		
		if(nodeIndex >= totalNode) {
			return false;
		}
		
	    int left_index = 2 * nodeIndex + 1;
	    int right_index = 2 * nodeIndex + 2;
		return IsCompleteBinaryTree(root.left ,totalNode, left_index) && IsCompleteBinaryTree(root.right ,totalNode, right_index);
		
	}
}
