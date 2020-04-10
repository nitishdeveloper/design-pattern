package binary.tree.depth;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLeaves {
	

	public int numberLeavesNode(Node root) {

		int totalleafnode = 0;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			if (current.left == null && current.right == null) {
				totalleafnode++;
			} else {
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}
		return totalleafnode;
	}
	
	// using recursion
	public int findLeavesNode(Node root) {
		
		if(root ==  null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		return findLeavesNode(root.left)+findLeavesNode(root.right);
	}
	
	//full node must have two children
	public int fullNode(Node root) {
		
		int fullnode = 0;
		
		if(root ==  null)
			return 0;
		
		if(root.left!=null && root.right!=null) {
			fullnode ++;
			System.out.print(root.data + " ");
		}
		fullnode += fullNode(root.left)+fullNode(root.right); 
	
		return fullnode;
		
	}
	
	public int halfNode(Node root) {
		int halfNode = 0;

		if (root == null)
			return 0;
		if (root.left != null && root.right == null || root.left == null && root.right != null) {
			halfNode++;
			System.out.print(root.data + " ");
		}
		halfNode += halfNode(root.left) + halfNode(root.right);

		return halfNode;
	}


	
}
