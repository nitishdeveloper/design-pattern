package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorOrSymmetricBinaryTree {

	public static void main(String[] args) {
		Node.print(Node.tree2());
//		System.out.println("this tree is mirror or symmetric : " + InvertTree(Node.tree2()));
		System.out.println();
		Node.print(InvertTree(Node.tree2()));
	}

	public static boolean isSymmetric(Node root) {
		boolean isTrue = true;
		if (root == null) {
			return isTrue;
		}
		
		Queue<Node> queue1 = new LinkedList<Node>();
		queue1.add(root);
		queue1.add(root);
		
		while (!queue1.isEmpty()) {
			
			Node LEFT_SUB_TREE = queue1.poll();
			Node RIGHT_SUB_TREE = queue1.poll();

			if (LEFT_SUB_TREE == null && RIGHT_SUB_TREE == null) {
				continue;
			}
			
			if (LEFT_SUB_TREE == null || RIGHT_SUB_TREE == null) {
				isTrue = false;
				break;
			}
			
			if(LEFT_SUB_TREE.data != RIGHT_SUB_TREE.data) {
				isTrue = false;
				break;
			}
			queue1.add(LEFT_SUB_TREE.left);
			queue1.add(RIGHT_SUB_TREE.right);
			queue1.add(LEFT_SUB_TREE.right);
			queue1.add(RIGHT_SUB_TREE.left);

		}

		return isTrue;
	}
	
	
	public static boolean IsSymmetric(Node root) {
		return IsSymmetric(root , root);
	}
	public static boolean IsSymmetric(Node root1 , Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
	   return root1.data == root2.data && IsSymmetric(root1.left ,root2.right) && IsSymmetric(root1.right ,root2.left);
	}
	
	public static Node invertTree(Node root) {
     if(root == null) {
    	 return null;
     }
     Queue<Node> queue = new LinkedList<Node>();
     queue.add(root);
          
     while(!queue.isEmpty()) {
    	 Node current  = queue.poll();
    	 
    	 Node temp = current.left;
    	 current.left = current.right;
    	 current.right = temp;
    	 
    	 if(current.right != null) {
    		   queue.add(current.right);
    	 }
    	 if(current.left != null) {
  		   queue.add(current.left);
    	 }
      }
     return root;
    }
	public static Node InvertTree(Node root) {
		if(root == null) {
	    	 return null;
	     }
		Node right = InvertTree(root.right);
		Node left = InvertTree(root.left);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
}
