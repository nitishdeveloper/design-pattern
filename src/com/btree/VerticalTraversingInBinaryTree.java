package com.btree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class VerticalTraversingInBinaryTree {
	static TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
	public static void main(String[] args) {
//		verticalLevelTraversing(Node.tree2());
		veticalLevelRecursion(Node.tree2() , 0);
		printResult(map);
	}

	public static void verticalLevelTraversing(Node root) {

		if (root == null) {
			return;
		}

		List<List<Integer>> levels = new ArrayList<List<Integer>>();
		
		Deque<Pair> queue = new ArrayDeque<Pair>();
		queue.add(new Pair(root, 0, 0));

		TreeMap<Integer, ArrayList<Pair>> map = new TreeMap<Integer, ArrayList<Pair>>();

		while (!queue.isEmpty()) {
			Pair current = queue.poll();

			ArrayList<Pair> list = map.getOrDefault(current.verticalLevel, new ArrayList<Pair>());
			list.add(current);
			map.put(current.verticalLevel, list);

			if (current.node.left != null) {
				queue.add(new Pair(current.node.left, current.verticalLevel - 1, current.horizontelDistance + 1));
			}
			if (current.node.right != null) {
				queue.add(new Pair(current.node.right, current.verticalLevel + 1, current.horizontelDistance + 1));
			}
		}
		
		map.forEach((level , list) -> {
            Collections.sort(list,new PairComprator());
            List<Integer> currLevel = new ArrayList<Integer>(list.size());
            for(Pair n: list){
                currLevel.add(n.node.data);
            }
            levels.add(currLevel);
		});
		System.out.println(levels);
		verticalLevelSum(levels);
	}
	
	static class Pair {
		Node node;
		int verticalLevel;
		int horizontelDistance;

		private Pair(Node node, int verticalLevel, int horizontelDistance) {
			this.node = node;
			this.verticalLevel = verticalLevel;
			this.horizontelDistance = horizontelDistance;
		}
	}
	
	static class PairComprator implements Comparator<Pair>{
		@Override
		public int compare(Pair o1, Pair o2) {
			if(o1.horizontelDistance < o2.horizontelDistance) return -1;
			if(o1.horizontelDistance > o2.horizontelDistance) return 1;
			return o1.node.data - o2.node.data;
		}
	}
	
	public static void verticalLevelSum(List<List<Integer>> verticalLevel) {
		if(verticalLevel.size() <= 0) {
			return;
		}
		int maxSize = verticalLevel.size();
	
		List<Integer> result = new ArrayList<Integer>();
		int sum = 0;
		
		
		for (int i = 0; i < maxSize; i++) {
			 for (int j = 0; j < verticalLevel.get(i).size(); j++) {
				sum += verticalLevel.get(i).get(j);
			}
			result.add(sum);
			sum = 0;
		}
		System.out.println("vertical sum : "+result);
		return;
	}
	
	public static void veticalLevelRecursion(Node root , int hd) {
		if(root == null) return;
		
		ArrayList<Integer> list;
		
		if(map.containsKey(hd)) {
			list = map.get(hd);
			list.add(root.data);
			map.put(hd , list);
		}else {
			list = new ArrayList<Integer>();
			list.add(root.data);
			map.put(hd , list);
		}
		veticalLevelRecursion(root.left , hd-1);
		veticalLevelRecursion(root.right , hd+1);
		
	}
	public static void printResult(TreeMap<Integer, ArrayList<Integer>> map) {
        Set<Integer> i = map.keySet();
        for (int keys : i) {
            System.out.print(map.get(keys)+" ");
        }
	}   
}
