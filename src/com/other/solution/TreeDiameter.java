package com.other.solution;

import btree.depth.Node;

public interface TreeDiameter {
	public int diameter(Node root);
	public int height(Node root);
	public int maxLevelSum(Node root);
	public void printDataRootToLeaf(Node root);
}
