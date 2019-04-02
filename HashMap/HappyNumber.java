import java.util.HashSet;
import java.util.Set;

//Aug.29.2018
//Linked List Cycled detection - Floyd Cycle Detection Algorithm
//https://leetcode.com/problems/happy-number/discuss/117136/c++-using-Floyd-Cycle-Detection-Algorithm
//https://leetcode.com/problems/happy-number/discuss/56976/O(1)-space-Java-solution
//https://leetcode.com/problems/happy-number/discuss/56917/My-solution-in-C(-O(1)-space-and-no-magic-math-property-involved-)

/*
 * ONE: it loops endlessly in a cycle which does not include 
 * 1. so there must be repeated numbers in the loop,just like 16: 37 58 89 145 42 20 4 16 37 58....
   TWO: repeat the process until the number equals 1.
 * */
public class HappyNumber {
	 public static boolean isHappy(int n) {
		 Set<Integer> set = new HashSet<Integer>();
		 int sum = 0;
		 int digit = 0;
		 while(set.add(n)) {
			 sum = 0;
			 while(n>0) {
				digit = n % 10;
				sum += (digit*digit);
				n /= 10;
			 }
			 if(sum == 1) return true;
			 else {
				 n = sum;
			 }
		 }
		 return false;
	 }
	 
	 public static boolean isHappy_Floyd_Algorithm(int n) {
		 
		 return false;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 19;
		System.out.println(isHappy(i));
	}

}
