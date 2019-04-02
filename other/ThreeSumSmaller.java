import java.util.Arrays;

public class ThreeSumSmaller {
	//这道题是不需要考虑重复的。比如[-1,-1,-1,-1] target = 3
	// return 4 而不是 1 因为有四种可能 算的是 3C4 --> 4
	public static int threeSumSmaller(int[] nums, int target) {
		int count = 0;
		Arrays.sort(nums);	
		for(int i = 0; i<= nums.length -3;i++) {
			int left = i + 1, right = nums.length - 1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum < target) {
					//因为array是sorted的既然最右边(最右边说明最大)的都比它小
					//那说明最右边的数的左边的数都可以满足小于target
					count += right-left;
                    left++;
				}
				else{
                    right --;
				}
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,1,1,1,1,1,1};
		System.out.println(threeSumSmaller(test,5));
	}

}
