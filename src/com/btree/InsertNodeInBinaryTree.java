package com.btree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeInBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(5);
		insert(root,10);
		insert(root,20);
		insert(root,30);
		insert(root,40);
		insert(root,50);
		insert(root,60);
		traverse(root);
	}
	
	public static void insert(Node newNode,int data) {
		if(newNode == null) {
			System.out.println("Tree is empty");
			newNode = new Node(data);
		}
		Queue<Node> queue  = new LinkedList<Node>();
		queue.add(newNode);
		
		while(!queue.isEmpty()) {
			   newNode = queue.poll();
			  if(newNode.left == null) {
				  newNode.left = new Node(data);
				  break;
			  }else {
				  queue.add(newNode.left);
			  }
			  if(newNode.right == null) {
				  newNode.right = new Node(data);;
				  break;
			  }
			  else {
				  queue.add(newNode.right);
			  }
		}
	}
	
	public static void traverse(Node node) {
		
		if(node == null) {
			return;
		}
		System.out.print(node.data+" ");
		traverse(node.left);
		traverse(node.right);
	}
}
