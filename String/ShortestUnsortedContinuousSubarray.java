import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
	
	public static int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        arr = nums.clone();
        Arrays.sort(nums);
        int start = nums.length;
        int end = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != arr[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
                
        }
        return end-start>=0?end-start+1:0;
    }
	
	
	public static int findUnsortedSubarray_(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        System.out.println(max);
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,6,4,8,10,1,15};
		int[] t = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray_(t));
	}

}
