package com.binary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		AncestorIterative(Node.tree2() , 7);
	}
	
	public static void findAncestor(Node root, Node ancestor) {
		
		if(root == null || ancestor == null) {
			return;
		}
		
		int[] backet = new int[100];
		int index = 0;
		int ancestors = ancestor.data;
		printAncetor( root, ancestors , backet ,  index);
	}
	
	//DFS
	public static void printAncetor(Node root, int ancestor , int[] Backet , int index) {
		if(root == null || ancestor == 0) {
			return;
		}
		Backet[index++] = root.data;
		
		if(root.data == ancestor) {
			for (int i = 0; i < index; i++) {
				System.out.print(Backet[i]+" ");
			}
			System.out.println();
			return;
		}
		printAncetor(root.left, ancestor , Backet ,  index);
		printAncetor(root.right, ancestor , Backet ,  index);	
	}
	
	public static void AncestorIterative(Node root , int ancestor) {
		if(root == null || ancestor == 0) {
			return;
		}
		
		Deque<Node> stack = new ArrayDeque<Node>();
		stack.add(root);
		
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		map.put(root, null);
		
		while(!stack.isEmpty()) {
		       Node current = stack.pop();
		       
		       if(current.data == ancestor) {
		    	   print(current , map);
		    	   return;
		       }
		       
		       if(current.right != null) {
		    	   map.put(current.right , current);
		    	   stack.push(current.right);
		       }
		       
		       if(current.left != null) {
		    	   map.put(current.left , current);
		    	   stack.push(current.left);
		       }
		}
	}	
	
	public static void print(Node rooToleaf ,HashMap<Node,Node> map) {
		 Stack<Node> stack=new Stack<>();
		 List<Integer> list = new ArrayList<Integer>();
	
		 while(rooToleaf != null) {
			 	stack.add(rooToleaf);
			 	rooToleaf = map.get(rooToleaf);
		 }
		 
		 while(!stack.isEmpty()) {
			 list.add(stack.pop().data);
		 }
		 
		 
		 System.out.println(list);
	}
	

}
