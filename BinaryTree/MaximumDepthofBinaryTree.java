public class MaximumDepthofBinaryTree {
	 private class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		}
	 
	 public static int maxDepth(TreeNode root) {
		 	if(root == null) return 1;
		 	else {
		 		return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
		 	}
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
