public class DiameterofBinaryTree {
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	//diameter of BST --> the longest length b.w any two pairs of TreeNodes
	//--> max depth of leftSubtree + max length of rightSubtree + 1(treeNode)
	private int max = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		MaxDepth(root);
		return max;
    }
	
	public int MaxDepth(TreeNode root) {
		if(root == null) return 0;
		int left = MaxDepth(root.left);
		int right = MaxDepth(root.right);
		max = Math.max(max, left+right);
		return Math.max(left,right) + 1;
	}

}
