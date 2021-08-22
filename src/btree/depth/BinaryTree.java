package btree.depth;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	// maximum depth using recursion
	public int max(Node root) {

		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		}

		else {

			int leftDepth = max(root.left);
			int rightDepth = max(root.right);

			if (leftDepth > rightDepth)
				return (leftDepth + 1);
			else
				return (rightDepth + 1);

		}
		// return (1 + Math.max(max(root.left), max(root.right)));
	}

	//minimum depth using recursion
	public int min(Node root) {
		if (root == null) {
			return 0;
		}
		
		if (root.left == null && root.right == null) {
			return 1;
		}
		
		if (root.left == null) {
			return min(root.right) + 1;
		}
		
		if (root.right == null) {
			return min(root.left) + 1;
		} else {
			int leftDepth = min(root.left);
			int rightDepth = min(root.right);
			if (leftDepth < rightDepth)
				return (leftDepth + 1);
			else
				return (rightDepth + 1);
		}

	}
	
	public int findMaximumDepthWithoutRecursion(Node root) {
		int level = 0;
		
		if (root == null) {
			return 0;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
				Node current = queue.poll();
				//System.out.print(current.data+" ");
				
				if(current==null) {
					 if(!queue.isEmpty()) {
						 queue.add(null);
					 }
					level++;
					//break;
				}
				else {
				if(current.left!=null) {
					queue.add(current.left);
				}
				if(current.right!=null) {
					queue.add(current.right);
				}
			}
		}
		return level;
	}
	public int findMaxDepthWithoutRecursion(Node root) {
		int level = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size --> 0) {
				Node current = queue.poll();
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
				//size--;
			}

			level++;
		}
		return level;
	}
	
	public int findDeepestNode(Node root) {
		int lastNode = 0;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			lastNode = current.data;
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		return lastNode;
	}
	
	int deepLevel = 0;
	int deepeastValue = 0;
	
	public int findDeepestNodeWithRecursion(Node root,int level) {

		if (root != null) {
			findDeepestNodeWithRecursion(root.left,level++);
			if (level > deepLevel) {
				deepeastValue = root.data;
				deepLevel = level;
			}
			findDeepestNodeWithRecursion(root.right, level);

		}
		return deepeastValue;
	}
	
	public void zizZagOrderlevelTraversing(Node root) {
		    int level = 0;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			
			if(root==null) {
				return;
			}
			
			while(!queue.isEmpty()) {
				level = queue.size();
				 while(level>0) {
					 Node current = queue.poll();
					 System.out.print(current.data+" ");
					 if (current.left != null) {
							queue.add(current.left);
						}
						if (current.right != null) {
							queue.add(current.right);
						}
						level--;
				 }
				 System.out.println();
			}
	}
	
	
	
}

