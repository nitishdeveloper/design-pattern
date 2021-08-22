package com.other.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCodingAlgo {

	public static void main(String[] args) {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
        huffmanCoding(charArray , charfreq , charArray.length);
	}
	
	public static void huffmanCoding(char[] cha , int[] frequency ,int n) {
		 PriorityQueue<Huffman> queue = new PriorityQueue<Huffman>(n , new Huffman());
		
		 
		 for (int i = 0; i < n; i++) {
			 Huffman huffman = new Huffman();
			 
			 huffman.data = frequency[i];
			 huffman.character = cha[i];
			 
			 huffman.left = null;
			 huffman.right = null;
			 
			 queue.add(huffman);
		}
		 
		 Huffman root = null;
		 
		 while(queue.size() > 1){
			  
			 Huffman huffA = queue.peek();
			 queue.poll();
			 
			 Huffman huffB = queue.peek();
			 queue.poll();
			 
			 
			 Huffman huffSum  = new Huffman();
			 
			 huffSum.data = huffA.data + huffB.data;
			 huffSum.character = '-';
			 
			 huffSum.left  =  huffA;
			 huffSum.right =  huffB;
			 
			 root = huffSum;
			 queue.add(huffSum);
		 }
		
		 print(root ,"");
	}
	
	public static void print(Huffman root , String s) {
		
		if(root.left == null && root.right == null && Character.isLetter(root.character)) {
			System.out.println(root.character+" : "+s);
			return;
		}
		
		print(root.left ,s + "0");
		print(root.right ,s + "1");
		
	}
	
	static class Huffman implements Comparator<Huffman>{
		int  data;
		char character;
		
		Huffman  left;
		Huffman  right;
		
		@Override
		public int compare(Huffman o1 , Huffman o2) {
			return o1.data - o2.data;
		}
	}

}
