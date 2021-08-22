package btree.inorder;

import java.util.Stack;


class Node {
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left = right=null;
	}
}

class Tree{
	Node root;
	public void inorder() {
		if(root==null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		while(current!=null || !stack.isEmpty()) {
				while(current!=null) {
					stack.push(current);
					current = current.left;
				}
				current = stack.pop();
				System.out.print(current.data+" ");
				current = current.right;
		}
	}
}

public class InOrder {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.right.left= new Node(4);
		tree.root.right.left.left= new Node(5);
		tree.inorder();
	}

}
