package binary.tree.preorder;
import java.util.Stack;


class Node{
	Integer data;
	Node left,right;
	
	public Node(Integer data){
		this.data=data;
		left = right = null;
	}
}
class Tree{
	Node root;
	public void preorder() {
		if(root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		while(!stack.isEmpty()) {
			Node current = stack.pop();
			System.out.print(current.data+" ");
			
			if(current.right!=null) {
				stack.push(current.right);
			}
			if(current.left!=null) {
				stack.push(current.left);
			}
		}
	}
}

public class PreOrder {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.right.left= new Node(4);
		tree.root.right.left.left= new Node(5);
		tree.preorder();
	}

}
