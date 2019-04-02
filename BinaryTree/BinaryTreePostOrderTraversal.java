import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {
	private static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	 // preorder: 中(root)--> 左 --> 右   postorder: 左 --> 右 --> 中
    // 那我们可以modify the preorder to print 中 --> 右 --> 左 然后reverse变成 left --> right --> root
    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            res.addFirst(curr.val);
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
        }
        return res;
    }

    public static void main(String[]args) {
    		TreeNode root = new TreeNode(10);
    		root.left = new TreeNode(6);
    		root.right = new TreeNode(20);
    		root.left.left = new TreeNode(3);
    		root.left.right = new TreeNode(8);
    }
}
