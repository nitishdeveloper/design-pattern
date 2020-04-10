package com.tree.solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import binary.tree.depth.Node;

public class TreeDiameterImpl implements TreeDiameter {

	@Override
	public int diameter(Node root) {
				
		if(root==null) {
			return 0;
		}
		
		int leftHeight  =  height(root.left);
		int rightHeight =  height(root.right);
		
		int maxHeight =  (leftHeight + rightHeight + 1);
		
		int leftDiameter =   diameter(root.left);
		int rightDiameter =  diameter(root.right);
		
		int maxDiameter = Math.max(leftDiameter, rightDiameter);
		
		return Math.max(maxHeight, maxDiameter);
	}

	@Override
	public int height(Node root) {
		
		if(root==null) {
			return 0;
		}		
		return (1+Math.max(height(root.left), height(root.right)));
	}

	@Override
	public int maxLevelSum(Node root) {

		if (root == null) { 
	        return 0;
		}
		
		Queue<Node> queue = new  LinkedList<Node>();
		queue.add(root);
		int maxSum = 0;
		int currentSum = 0;
		int level = 0; 
		while(!queue.isEmpty()) {
			
			 int size = queue.size();
			 Node current = queue.poll();
			 while(size-->0) {
				 currentSum += current.data;
			 }
			 
			 if(currentSum>maxSum) {
				 maxSum=currentSum;
				 System.out.println("level : "+level+" currentSum : "+maxSum);
			 }
			
			 if(current.left!=null) {
				 queue.add(current.left);
			 }
			
			 if(current.right!=null) {
				 queue.add(current.right);
			 }
			 
			 
			 level++;
			 currentSum = 0;
		}
		
		return maxSum;
	}

	@Override
	public void printDataRootToLeaf(Node root) {
		Deque<Integer> path = new ArrayDeque<Integer>();
		printDataRootToLeaf(root,path);
	}
	public void printDataRootToLeaf(Node root,Deque<Integer> path) {
		
		if(root==null) {
			return;
		}
		
		path.addLast(root.data);
		
		if(root.left==null && root.right==null) {
			for(Integer data : path) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
		printDataRootToLeaf(root.left,path);
		
		printDataRootToLeaf(root.right,path);
		
		path.removeLast();
	}
	
	
	
}
