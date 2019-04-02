//Sep 01 2018
public class HouseRobber {
	public static int rob(int[] nums) {
	    if(nums.length == 1) return nums[0];
	    if(nums.length == 2) return Math.max(nums[0], nums[1]);
		int max = 0;
		for(int i = 0; i< nums.length;i++) {
			int sum = nums[i];
			max = Math.max(max, sum);
			int index = 1;
			int j = i+2;
			while(j<nums.length) {
				max = Math.max(max, sum);
				sum +=nums[j];
				j += index;
				index ++;
			}
			max = Math.max(max, sum);
		}
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {2,1,1,2};
		System.out.println(rob(test));
	}

}
