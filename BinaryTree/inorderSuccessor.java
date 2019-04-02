import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderSuccessor {
	
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}

	public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> ls = new ArrayList<TreeNode>();
        ls = helper(root,ls);
        int resIndex = 0;
        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).val == p.val){
                resIndex = i;
            }
        }
        if((resIndex+1) == ls.size()) return null;
        return ls.get(resIndex+1);
    }
    
    public static List<TreeNode> helper(TreeNode root, List<TreeNode> ls){
        if(root!=null){
            helper(root.left,ls);
            ls.add(root);
            helper(root.right,ls);
        }
        return ls;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		root.left.left = null;
	}

}
