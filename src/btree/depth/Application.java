package btree.depth;

public class Application {
	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		BinaryTreeLeaves treeLeaves = new BinaryTreeLeaves();
		PrintPathRootToLeaf rootToLeaf = new PrintPathRootToLeaf();
		Node root = new Node(1);		
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		root.left.left.left = new Node(40);
		root.left.left.right = new Node(45);
	
		
		/*
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.right.left = new Node(8);
		root.right.left.right = new Node(7);
		root.left.left = new Node(50);
		root.left.left.left = new Node(50);
		root.left.left.left.left = new Node(60);
		root.left.left.left.left.left = new Node(70);
		*/
		
//		System.out.println("max depth : "+tree.max(root));
//		System.out.println("min depth : "+tree.min(root));
//		System.out.println("level : "+tree.findDeepestNode(root));
//		System.out.println("deepeast node : "+tree.findDeepestNodeWithRecursion(root,0));
//		tree.zizZagOrderlevelTraversing(root);
//		System.out.println("leaves node : "+treeLeaves.numberLeavesNode(root));
//		System.out.println("leaves node : "+treeLeaves.findLeavesNode(root));
//		System.out.println("full node : "+treeLeaves.fullNode(root));
//		System.out.println("half node : "+treeLeaves.halfNode(root));
		rootToLeaf.rootToLeafPath(root);
	}
	
	
	
}
