package com.other.solution;

import btree.depth.Node;

public interface IdenticalTree {

	public boolean isTreeIdentical(Node root1 ,  Node root2);
	public boolean rootToLeafPathSumEqual(final Node root, final int sum);
	public Node mirrorTree(final Node root);
}
