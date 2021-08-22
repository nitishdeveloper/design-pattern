package btree.question;

public class Application {

	public static void main(String[] args) {
		BinaryTreeOperation tree = new BinaryTreeOperation();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right= new Node(5);
		tree.root.right.left= new Node(6);
		tree.root.right.right= new Node(7);
		tree.levelorder();
//		tree.findMaximumNode();
//		tree.searchElementInBinaryTree();
		tree.reverseTraversing();
	}

}
