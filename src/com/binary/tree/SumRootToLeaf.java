package com.binary.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class SumRootToLeaf {
	public static void main(String[] args) {

	}

	public static void pintRootToLeaf(Node root) {
		if(root == null) return;
		
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		HashMap<Node,Node> map = new HashMap<>(); 
		
		map.put(root,null);  
		
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			
			if(current.left == null && current.right == null) {
				print(current,current , map);
			}
			
			if(current.right != null) {
				map.put(current.right,current);
				stack.push(current.right);
			}
			
			if(current.left != null) {
				map.put(current.left,current);  
				stack.push(current.left);
			}
		
		}
	}
	
	public static void print(Node rooToleaf , Node leafToRoot ,HashMap<Node,Node> map) {
		 Stack<Node> stack=new Stack<>();
		 List<Integer> list = new ArrayList<Integer>();
		 List<Integer> list2 = new ArrayList<Integer>();
	
		 while(rooToleaf != null) {
			 stack.add(rooToleaf);
			 rooToleaf = map.get(rooToleaf);
		 }
		 while(map.get(leafToRoot) != null) {
			   list2.add(leafToRoot.data);
			   leafToRoot = map.get(leafToRoot);
		 }
		 list2.add(leafToRoot.data);
		 
		 while(!stack.isEmpty()) {
			 list.add(stack.pop().data);
		 }
		 
		 
		 System.out.println(list + " | "+list2);
	}
	
}
