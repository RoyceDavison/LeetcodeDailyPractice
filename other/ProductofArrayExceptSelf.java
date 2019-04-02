public class ProductofArrayExceptSelf {
	/*i 0   1  2  3
	 * 
	 *  1 , 2, 3, 4
	 * 24, 12, 8, 6
	 * 
	 */
	
	/* Approach: walk through the array and multiple all number from the left 
	 * except the number itself, then in the second loop walk backaward 
	 * and multiple all the number from the right except the number itself.
	 * */
	public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        	res[0] = 1;
        for(int i = 1; i< res.length ;i++) {
        		res[i] = res[i-1] * nums[i-1];
        }
        
        int right = 1;
        for(int i = nums.length - 1; i>= 0; i--) {
        		res[i] = res[i] * right;
        		right = right * nums[i];
        }
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {1,2,3,4};
		int [] a = productExceptSelf(test);
	}

}
