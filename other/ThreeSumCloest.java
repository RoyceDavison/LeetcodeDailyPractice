import java.util.Arrays;

public class ThreeSumCloest {
	
	public static int threeSumClosest(int[] nums, int target) {
		//res 不能用Integer.MAX_VAL 会上溢
        int res = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        		int left = i + 1, right = nums.length-1;
        		
        		while(left < right) {
        			int b = nums[left];
        			int c = nums[right];
        			int sum = nums[i] + b + c;
        		
        			if(sum > target) {
        				right--;
        			}
        			else if(sum < target) {
        				left ++;
        			}
        			else {
        				return target;
        			}
        			if(Math.abs(sum - target) < Math.abs(res - target)) {
        				res = sum;
        			}
        		}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(test,-1));
	}

}
