import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	private static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	public static void inorderTraversalHeler(TreeNode root, List<Integer> ls) {
		if(root!=null) {
			inorderTraversalHeler(root.left,ls);
			ls.add(root.val);
			inorderTraversalHeler(root.right,ls);
		}
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		inorderTraversalHeler(root,list);
        return list;
    }
	
	public static List<Integer> inorderTraversal_iterative(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;

		while(curr!=null || !stack.isEmpty()) {
			while(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			list.add(curr.val);
			curr = curr.right;
		}
		return list;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> ls = new ArrayList<Integer>();
		ls = inorderTraversal_iterative(root);
		for(int e: ls)
			System.out.println(e);
	}

}
