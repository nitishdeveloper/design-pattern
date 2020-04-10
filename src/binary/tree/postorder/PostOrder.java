package binary.tree.postorder;

import java.util.Stack;

class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
	}
}

class Tree{
	Node root;;
	public void  postorder(){
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack12= new Stack<>();
		Node current;
		stack1.push(root);
		while(!stack1.isEmpty()){
			current = stack1.pop();
			stack12.push(current);
			if(current.left!=null){
				stack1.push(current.left);
			}
			if(current.right!=null){
				stack1.push(current.right);
			}
		}
		while(!stack12.isEmpty()){
			current=stack12.pop();
			System.out.print(current.data+" ");
		}

	}
}



public class PostOrder {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right= new Node(5);
		tree.root.right.left= new Node(6);
		tree.root.right.right= new Node(7);
		tree.postorder();
	}

}
