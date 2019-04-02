import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
    public List<Integer> preorderTraversal(TreeNode root) {
    		List<Integer> res = new ArrayList<Integer>();
    		if(root == null) return res;
    		Stack<TreeNode> stack = new Stack<TreeNode>();
    		stack.push(root);
    		while(!stack.isEmpty()) {
    			TreeNode curr = stack.pop();
    			res.add(curr.val);
    			if(curr.right!=null) stack.push(curr.right);
    			if(curr.left != null) stack.push(curr.left);
    		}
    		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
