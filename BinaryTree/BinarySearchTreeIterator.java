import java.util.Stack;

public class BinarySearchTreeIterator {

	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}

	
    Stack<TreeNode> stack =  null ;          
    public BinarySearchTreeIterator(TreeNode root) {
        pushAllNodes(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode minNode = stack.pop();
        pushAllNodes(minNode.right);
        return minNode.val;
    }

    private void pushAllNodes(TreeNode node) {
        while(node != null)
        {
            stack.push(node);
            node = node.left;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		
		//root.left.right = new TreeNode(2);
		//root.left.left = null;
		BinarySearchTreeIterator test = new BinarySearchTreeIterator(root);
		System.out.println(test.next());
		System.out.println(test.next());

	}

}
