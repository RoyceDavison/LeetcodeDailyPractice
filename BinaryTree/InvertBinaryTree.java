public class InvertBinaryTree {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	public static TreeNode invertTree(TreeNode root) {
		    if (root == null) {
		        return null;
		    }
		    TreeNode right = invertTree(root.right);
		    TreeNode left = invertTree(root.left);
		    root.left = right;
		    root.right = left;
		    return root;
		}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root = invertTree(root);
		System.out.println("  "+root.val);
		System.out.print(root.left.val+"    ");
		System.out.print(root.right.val);

	}

}
