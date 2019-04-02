public class SameTree {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
        		return true;
        }
        else if (p==null || q==null) {
        		return false;
        }
        else if(p.val != q.val) {
        		return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		System.out.println(isSameTree(p,q));
	}

}
