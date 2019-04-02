import java.util.LinkedList;
import java.util.List;

public class generateParenthesis {
	/* When rightParatheses count is equal to n that mean we have a valid solution.
	 * If leftPCount is smaller than n that is mean we need more "(", if rightPCount < LeftPCount
	 * that means we can have more right parenthesis.
	 * We pass "" then in the first recursion we have "(". We keep trying by add "(" or ")"
	 * until we have number of matching parenthesis equals to n.
	 */ 
	 public List<String> generateParenthesis(int n) {
	        List<String> res = new LinkedList<String>();
	        generateHelper(res,"",n,0,0);
	        return res;
	    }
	    
	    public void generateHelper(List<String> res, String curr, int n, int leftPCount, int rightPCount){
	        if(rightPCount == n){
	            res.add(curr);
	            return;
	        }
	        if(leftPCount < n) generateHelper(res, curr + "(", n, leftPCount + 1, rightPCount);
	        if(rightPCount <  leftPCount) generateHelper(res, curr + ")", n, leftPCount, rightPCount + 1);
	    }
}
