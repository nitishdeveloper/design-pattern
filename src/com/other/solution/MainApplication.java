package com.other.solution;

import btree.depth.Node;

public class MainApplication {

	public static void main(String[] args) {
	
		IdenticalTreeImpl identicalTree = new IdenticalTreeImpl();
		TreeDiameterImpl tree = new TreeDiameterImpl();
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.left = new Node(8);
		root.right.right.right = new Node(9);

		
//		 System.out.println(identicalTree.isTreeIdentical(root1, root2) ? "Identical" : "not Identical");
//		 System.out.println("Sum : "+tree.maxLevelSum(root));
//		 tree.printDataRootToLeaf(root);
/*		int sum = 18;
		if (identicalTree.rootToLeafPathSumEqual(root, sum)) 
            System.out.println("There is a root to leaf path with sum " + sum); 
        else
            System.out.println("There is no root to leaf path with sum " + sum); 
*/	    Node mirror = identicalTree.mirrorTree(root);
        System.out.println("\n");
		identicalTree.mirror(mirror);
		
	}

}
