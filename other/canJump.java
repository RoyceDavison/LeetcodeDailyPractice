
public class canJump {

	public static boolean canJump(int[] nums) {
		if(nums.length < 2) return true; 
        int max = 0;
        for(int i = 0;i < nums.length && i <= max; i++){
            if(max >= nums.length -1) return true;
            max = Math.max(nums[i]+i,max);
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,3};
		System.out.println(canJump(arr));
	}

}
