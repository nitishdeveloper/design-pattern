package binary.tree.depth;

public class PrintPathRootToLeaf {
	public void rootToLeafPath(Node root) {
		int pathValue[] = new int[100];
		logicOfRootToLeafPath(root,0,pathValue);
	}
	
	public void logicOfRootToLeafPath(Node root,int pathlength,int pathValue[]) {
		
	
		if(root == null)
			return;
	
		pathValue[pathlength] =  root.data;
		pathlength++;
		
		 if(root.left==null && root.right==null) {
			 printPathRoottoLeaf(pathValue, pathlength);
		 }
		 
		 logicOfRootToLeafPath(root.left,pathlength,pathValue);
		 logicOfRootToLeafPath(root.right,pathlength,pathValue);
	}
	
	
	
	public void printPathRoottoLeaf(int pathValue[] , int pathLength) {

		for (int i = 0; i < pathLength; i++) {
			System.out.print(pathValue[i]+" ");
		}
		System.out.println();
	
	}
	
}
