//Aug.28.2018
public class MaximumSubarray {
	//further think --> how to solve with DP
	/* Keep sum of previous numbers seen so far, and compare with the new number;
	 * 	Two possible cases: 1. the new number is bigger or eqaul than the sum(max_sofar+nums[i])
	 * 						2. smaller than it
	 * 简而言之就是遍历array 存当前所有最大的max_subarray, 
	 * 只有当array里有负数的话才会需要返回上一个最大max_subarray,
	 * 因为array全是正数只要从头加到尾就好了.
	 * */
	public static int maxSubArray(int[] nums) {
        int max_sofar = nums[0];
        int max_prev = nums[0];
        
        for(int i=1;i<nums.length;i++) {
        		max_sofar = Math.max(max_sofar+nums[i], nums[i]);
        		max_prev = Math.max(max_sofar, max_prev);
        		}
		return max_prev;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1};
		System.out.println(maxSubArray(a));
	}

}
