import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	/*  Time comlexity: O(n^2) 
		The firt for loop traverse the array to find the right number and the second
		loop is to choose the two possible candidates such that they all add up to 0
		so the time complexity is O(n^2).
	*/ 
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(i >= 1 && nums[i] == nums[i-1]) continue;
			int left = i + 1;
			int right = nums.length - 1;
			//removed duplicate when we choose the first number
			
			while(left < right) {
				int b = nums[left];
				int c = nums[right];
				int sum = nums[i] + b + c ;
				
				if(sum > 0) {
					right--;
				}
				else if(sum < 0) {
					left++;
				}
				else {
					res.add(Arrays.asList(nums[i],b,c));
					//remove duplicated when choose the rest two numbers
					while(left < right && nums[left] == nums[left+1]) {
						left ++;
					}
					while(left < right && nums[right] == nums[right-1]) {
						right --;
					}
					left++;
					right--;
				}
			}
			
		}
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,0,0,0};
		List<List<Integer>> arr = threeSum(test);
		for(List<Integer> e: arr)
			System.out.println(e);
	}

}
