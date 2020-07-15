package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightAndDepthOfBinaryTree {

	public static void main(String[] args) {
		System.out.println("Height/Depth Of Binary tree is : "+HeightAndDepthOfTree(Node.tree()));
	}
	
	public static int HeightAndDepth(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(HeightAndDepth(root.left),HeightAndDepth(root.right));
	}
	
	public static int HeightAndDepthOfTree(Node root) {
		int heightAndDepth = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			  int nodeCount = queue.size();
			  heightAndDepth++;
			  while(nodeCount > 0) {
				      Node cur = queue.poll();
					  if(cur.left != null) {
						  queue.add(cur.left);
					  }
					  if(cur.right != null) {
						  queue.add(cur.right);
					  }
				  nodeCount--;
			  }
		}
		return heightAndDepth;
	}
	

}
