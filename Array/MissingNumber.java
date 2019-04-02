public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int total_array = 0;
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total_array += nums[i];
		}
		for(int j= 0; j<nums.length;j++) {
			total += j;
		}
		total += nums.length;
		return total-total_array;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,0,1};
		int a = missingNumber(arr);
		System.out.println(a);
	}

}
