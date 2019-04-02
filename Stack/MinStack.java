import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
	//这道题的pop有两次因为它存了previous min,当前的min pop出去之后会找到它之前的min
	//examples to understand: [5,6,3]
	//https://leetcode.com/problems/min-stack/discuss/49014/Java-accepted-solution-using-one-stack?page=2
	//第二页 见@JimboTheGreat 的解释
	
	Stack<Integer> stack = new Stack<Integer>();
	int min = Integer.MAX_VALUE;
    public void push(int x) {
    		if(x<=min) {
    			stack.push(min);
    			min = x;
    		}
    		stack.push(x);
    }
    
    public void pop() {
    		if(stack.pop() == min) min = stack.pop();
    }
    
    public int top() {
    		return stack.peek();
    }
    
    public int getMin() {
    		return min;
    }

}
