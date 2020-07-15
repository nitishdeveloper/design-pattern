package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumAndMinimumDepthBTree {

	public static void main(String[] args) {
//		System.out.println("Maximum Depth : " + MaxDepth(Node.tree2()));
		System.out.println("Maximum Depth : " + MinDepth(Node.tree2()));
	}

	public static int MaxDepth(Node root) {
		if (root == null)
			return 0;
		return Math.max(depth(root.left), depth(root.right)) + 1;
	}
	
	public static int MinDepth(Node root) {
		 if(root == null) return 0;
	      int min_depth = 0;
	      int left = depth(root.left);
	      int right = depth(root.right);
	        
	        System.out.println("left : "+left+" right: "+right);
	      
	       if(left > 0 && right > 0){
	          min_depth = Math.min(left,right);
	        }
	      else{
	            min_depth = Math.max(left, right);
	        }
	      
	      return  min_depth;
	}
	

	public static int depth(Node root) {
		if (root == null)
			return 0;
		int depth = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			depth++;
			while (size-- > 0) {
				Node cur = queue.poll();

				if (cur.left != null) {
					queue.add(cur.left);
				}
				if (cur.right != null) {
					queue.add(cur.right);
				}

			}
		}
		return depth;
	}

}
