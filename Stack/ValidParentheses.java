import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
    		Stack<Character> stack = new Stack<Character>();
    		for(int i =0;i<s.length();i++) {
    			char c = s.charAt(i);
    			if(c=='(') {
    				stack.push(')');
    			}
    			else if (c=='[') {
    				stack.push(']');
    			}
    			else if(c=='{') {
    				stack.push('}');
    			}
    			else if (stack.isEmpty() || stack.pop()!=c) {
    				return false;
    			}
    		}
    		return stack.isEmpty();
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack test = new MinStack();
		test.push(5);
		test.push(1);
		test.push(3);
		System.out.println(test.getMin());
		
		test.pop();
		System.out.println(test.top());
		System.out.println(test.getMin());
		
		test.pop();
		System.out.println(test.top());
		System.out.println(test.getMin());


	}

}
