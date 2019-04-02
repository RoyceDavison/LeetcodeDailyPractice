import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class NaryTreePreorderPostOrder {
	
	private static class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	
	/** PreOrder 就是一个DFS
	 * Given an n-ary tree, return the preorder traversal of its nodes' values.
	 * @param root
	 * @return the preorder traversal of its nodes' values
	 */
	 public List<Integer> preorder(Node root) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(root == null) return res;
	        Stack<Node> stack = new Stack<Node>();
	        Node curr = root;
	        stack.push(curr);
	        
	        while(!stack.isEmpty()){
	            curr = stack.pop();
	            List<Node> childrens = curr.children;
	            for(int i  = childrens.size()-1; i >=0; i--) stack.push(childrens.get(i));
	            res.add(curr.val);
	        }
	        return res;
	 }
	 
	 static List<Integer> res = new ArrayList<Integer>();
	 public static List<Integer> preorder_recursively(Node root) {
		 if(root == null) return res;
		 res.add(root.val);
		 for(Node n: root.children)
			 preorder_recursively(n);
		 return res;
	 }
	 
	 public List<List<Integer>> levelOrder(Node root) {
	        List<List<Integer>> res = new LinkedList<List<Integer>>();
	        if(root == null) return res;
	        Queue<Node> q = new LinkedList<Node>();
	        q.offer(root);
	        
	        while(!q.isEmpty()){
	            //outputs: [[1],[3],[2],[4],[5],[6]] 
	            List<Integer> currLevel = new LinkedList<Integer>();
	            int len = q.size();
	            Node curr = q.poll();
	            currLevel.add(curr.val);
	            for(Node n: curr.children)
	                q.offer(n);
	            res.add(currLevel);
	        }
	        return res;
	    }
}
