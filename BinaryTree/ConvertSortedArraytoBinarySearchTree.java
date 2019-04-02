public class ConvertSortedArraytoBinarySearchTree {
	 private static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 
	 public static TreeNode getTreeNode(int[] nums,int low, int high) {
     		if(low>high) return null;
     		//to prevent overflow
     		int middle = low + (high-low)/2;
            TreeNode n = new TreeNode(nums[middle]);
     		n.left  = getTreeNode(nums,low,middle-1);
     		n.right = getTreeNode(nums,middle+1,high);
			return n;
		 }
	 
	public static TreeNode sortedArrayToBST(int[] nums) {
        	if(nums == null || nums.length == 0) return null;
        	TreeNode result = getTreeNode(nums,0,nums.length-1);
		return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {-10, -3, 0, 5, 9};
		TreeNode root = sortedArrayToBST(test);
		
 	}

}
