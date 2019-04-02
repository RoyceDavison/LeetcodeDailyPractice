public class MinimumAbsoluteDifferenceBST {
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 //这道530 和 783 是同一道题目
    //两种做法: 1. 我们知道inorder traverse 一颗bst tree会自动有排好序的数组，那我们把这些数存起来然后for loop两两相比较，用min记录最小的差
    //Time complexity: O(n), Space Complexity: O(n) --> 记录数的list
    // 2. 降低空间复杂度，我们其实只需要比较当前这个数和它之前的一个数，用min记录最小差值就可以了 
    //这样空间复杂度就是O(1)  (不考虑储存树的空间，不然就是O(logn)) 
    Integer res = Integer.MAX_VALUE, prev = null;
    public int getMinimumDifference(TreeNode root) {
        if(root.left!=null) getMinimumDifference(root.left);
        if(prev != null) res = Math.min(res, root.val - prev);
        prev = root.val;
        if(root.right!=null) getMinimumDifference(root.right);
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
