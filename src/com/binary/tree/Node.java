package com.binary.tree;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Node() {}
	
	public static Node tree() {
		Node root = new Node(10);
		
		root.left = new Node(20);		
		root.right = new Node(30);

		root.left.left = new Node(40);	
		root.left.right = new Node(50);
		
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		root.left.left.left = new Node(80);
		root.left.left.right = new Node(90);
		
		root.right.right.left = new Node(100);
		root.right.right.right = new Node(110);
		
		return root;
	}
	
	public static Node tree2() {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = null;
        return root;
	}
	
	public static void print(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
}
