public class ConvertBSTtoGreaterTree {
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	//https://leetcode.com/problems/convert-bst-to-greater-tree/solution/
	//Reverse in-order traversal
	//从最大的node开始visit,每走一个node都保证比它大的node都走过了。
	//The basic idea of such a traversal is that before visiting any node 
	//in the tree, we must first visit all nodes with greater value.
	
	//Time:O(n) + Space: O(n)
	//>>>>> ???Follow Up: How to do a O(1) space?
	private int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		if(root != null) {
			convertBST(root.right);
			sum += root.val;
			root.val = sum;
			convertBST(root.left);
		}
		return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
