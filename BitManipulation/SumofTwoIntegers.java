//Sep.01.2018
//https://leetcode.com/problems/sum-of-two-integers/discuss/84290/Java-simple-easy-understand-solution-with-explanation
//该video 必看！https://www.youtube.com/watch?v=7jkIUgLC29I

// 2 + 3 是一个很好illustrate的example
// 2 --> 0010  3 --> 0011 5--> 0101
public class SumofTwoIntegers {
	public static int getSum(int a, int b) {
		if(a == 0) return b;
        if(b == 0) return a;
        while(b > 0){
            int carry = a & b;
            a = a ^ b; 
            b = carry << 1;
        }
        return a;
    }
	
	public int getSubtract(int a, int b) {
		while (b != 0) {
			int borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		
		return a;
	}
	
	// Get negative number
	public int negate(int x) {
		return ~x + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(-4,-6));
	}	
	

}
