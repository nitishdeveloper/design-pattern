package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SeacrhInBinaryTree {

	public static void main(String[] args) {
//		searchUsingRecurrsion(root, 17);
		searchNode(Node.tree(), 17);
	}
	
	public static void searchUsingRecurrsion(Node root, int key) {
		if(root == null) {
			return;
		}
		int search = root.data;
		if(key == search) {
			System.out.println("Key found : "+key);
		}
		searchUsingRecurrsion(root.left , key);
		searchUsingRecurrsion(root.right , key);
	}
	
	public static void searchNode(Node root, int key) {
		if(root == null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			 Node current = queue.poll();
			 
			 if(key == current.data) {
				 System.out.println("Key found : "+key);
				 break;
			 }
			 
			 if(current.left != null) {
				 queue.add(current.left);
			 }
			 
			 if(current.right != null) {
				 queue.add(current.right);
			 }
		}
		
	}
	
}
