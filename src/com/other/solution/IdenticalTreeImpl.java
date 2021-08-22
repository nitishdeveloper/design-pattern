package com.other.solution;

import btree.depth.Node;

public class IdenticalTreeImpl implements IdenticalTree {

	@Override
	public boolean isTreeIdentical(Node root1,Node root2) {
		
		if(root1==null && root2==null) {
			return true;
		}
		if(root1!=null && root2!=null) {
			return ( root1.data == root2.data && isTreeIdentical(root1.left,root2.left) && isTreeIdentical(root1.right,root2.right));
		}
		return false;
	}

	@Override
	public boolean rootToLeafPathSumEqual(final Node root, final int sum) {
		
		//base condition
		if(root == null) {
			return false;
		}
		boolean status = false;
		int subSum =sum-root.data;
		//System.out.print(root.data+" ");
		
		if(subSum==0 && root.left==null && root.right==null) {
			return true;
		}
		if(root.left!=null) {
			status = status || rootToLeafPathSumEqual(root.left,subSum);
		}
		if(root.right!=null) {
			status = status || rootToLeafPathSumEqual(root.right,subSum);	
		}
		
		return status;
		
	}

	@Override
	public Node mirrorTree(Node root) {
		
		
		if(root == null) {
			return root;
		}
			
		Node left = mirrorTree(root.left);
		System.out.print(root.data+" ");
		Node right = mirrorTree(root.right);
		
	
		root.left = right;
		root.right =  left;
		return root;
	}
	
 
	public void mirror(Node root) {
		if(root == null) {
			return;
		}
		mirror(root.left);
		System.out.print(root.data+" ");
		mirror(root.right);
	}
}
