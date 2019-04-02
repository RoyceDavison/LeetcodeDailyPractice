import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
    public List<Integer> inorderTraversal_recursively(TreeNode root) {
    		List<Integer> res = new ArrayList<Integer>();
    		inorderTraversal_recursivelyHelper(root,res);
    		return res;
    }
    
    public void inorderTraversal_recursivelyHelper(TreeNode root,List<Integer> res) {
		if(root != null) {
			inorderTraversal_recursivelyHelper(root.left,res);
			res.add(root.val);
			inorderTraversal_recursivelyHelper(root.right,res);
		}
    }
    
    public List<Integer> inorderTraversal_iteratively(TreeNode root) {
    		List<Integer> res = new ArrayList<Integer>();
    		if(root == null) return res;
    		Stack<TreeNode> stack = new Stack<TreeNode>();
    		stack.push(root);
    		TreeNode curr = root;
    		
    		//只有当一种情况外圈while loop才会退出来--> 当curr == null & stack 空
    		// 	    2
    		// null   3
    		//为什么呢？试想一颗没有left node 的两层bst就会明白当curr = 3的时候 stack空了但是3没有被访问
    		while(curr!=null || !stack.isEmpty()) {
    			while(curr!= null) {
    				stack.push(curr);
    				curr = curr.left;
    			}
    			curr = stack.pop();
    			res.add(curr.left.val);
    			curr = curr.right;
    		}
    		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
