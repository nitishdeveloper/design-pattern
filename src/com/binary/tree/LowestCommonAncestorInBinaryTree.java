package com.binary.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LowestCommonAncestorInBinaryTree {

	public static void main(String[] args) {
		System.out.println(lowestCommonAncestor(Node.tree2(), Node.tree2().left.left, Node.tree2().left.right).data);
	}

	// LCA(4 , 5)
	public static void LCA(Node root, Node nodeA, Node nodeB) {

		if (root == null || nodeA == null || nodeB == null) {
			return;
		}

		Deque<Node> stack = new ArrayDeque<Node>();
		stack.push(root);

		Map<Node, Node> map = new HashMap<Node, Node>();
		map.put(root, null);

		while (!stack.isEmpty()) {
			Node current = stack.pop();

			if (current.right != null) {
				map.put(current.right, current);
				stack.push(current.right);
			}

			if (current.left != null) {
				map.put(current.left, current);
				stack.push(current.left);
			}

		}

		Set<Node> set = new HashSet<Node>();
		while (nodeA != null) {
			set.add(nodeA);
			nodeA = map.get(nodeA);
		}
		while (nodeB != null) {
			if (set.contains(nodeB)) {
				System.out.println("Common Ancestor is : " + nodeB.data);
				return;
			}
			nodeB = map.get(nodeB);
		}
	}
	
	public static Node lowestCommonAncestor(Node root, Node nodeA, Node nodeB){
	       if(root == null) return null;
	       
	        if(root.data == nodeA.data || root.data == nodeB.data){
	          return root;
	        }
	        
	        Node leftTree  =  lowestCommonAncestor(root.left , nodeA, nodeB);
	        Node rightTree =  lowestCommonAncestor(root.right , nodeA, nodeB);
	     
	        if(leftTree != null && rightTree != null){
	          return root;
	        }
	  
	        return (leftTree == null) ? rightTree : leftTree;
	         
	   }

}
