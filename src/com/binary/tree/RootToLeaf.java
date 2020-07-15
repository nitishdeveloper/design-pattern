package com.binary.tree;

public class RootToLeaf {

	public static void main(String[] args) {
		rootToleaf(Node.tree2());
		sumRootToLeaves(Node.tree2());
	}
	
	public static void rootToleaf(Node root) {
		int i = 0;
		int[] A = new int[100];
		printRootToLeaf(root , A ,i);
	}
	
	public static void leafToRoot(Node root) {
		int i = 0;
		int[] A = new int[100];
		printLeafToRoot(root , A ,i);
	}
	
	public static void printRootToLeaf(Node root, int[] A , int index) {
		if(root == null)
			return;
		A[index++] = root.data;
		if(root.left == null && root.right == null) {
			for (int i = 0; i < index; i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
		}
		printRootToLeaf(root.left , A ,index);
		printRootToLeaf(root.right , A ,index);
		
	}
	
	public static void printLeafToRoot(Node root, int[] A , int index) {
		if(root == null)
			return;
		A[index++] = root.data;
		if(root.left == null && root.right == null) {
			for (int i = index-1; i >= 0; i--) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
		}
		printLeafToRoot(root.left , A ,index);
		printLeafToRoot(root.right , A ,index);
		
	}
	
	static int sum = 0;
	public static void sumRootToLeaf(Node root) {
		
		if(root == null) return ;

		sum += root.data;
				
		if(root.left == null && root.right == null) {
			System.out.println("sum : "+sum);
			sum = sum - root.data; 
		}
		
		sumRootToLeaf(root.left);
		sumRootToLeaf(root.right);
	}
	
	public static int sumRootToLeafBinaryNode(Node root, int sum) {
		if(root == null) return 0;
		
		sum = (sum * 2) + root.data;
		
		if(root.left == null && root.right == null) {
			System.out.println("sum : "+sum);
			return sum;
		}
		
		return sumRootToLeafBinaryNode(root.left,sum)+sumRootToLeafBinaryNode(root.right,sum);
	}
	
	
	static StringBuilder build = new StringBuilder();
	static int binarySum = 0;
	
		public static void sumRootToLeaves(Node root) {
			if(root == null) return;
			int[] A = new int[100];
			recurseBinaryTree(root , A ,0 );
			System.out.print(binarySum+" ");
		}
		public static void recurseBinaryTree(Node root, int[] backet, int length) {
			if(root == null) return;
			
			backet[length++] = root.data;
			
			if(root.left == null && root.right == null) {
				for (int i = 0; i < length; i++) {
					 build.append(backet[i]);
				}
				binarySum += Integer.parseInt(build.toString(),2);
				build.setLength(0);
			}
			recurseBinaryTree(root.left , backet , length);
			recurseBinaryTree(root.right , backet , length);
			
		}
	
}
