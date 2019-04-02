// 08.26.2018 第一天
public class MoveZeroes {
	public static int[] moveZeroes(int[] nums) {
        //Move all non-zeros to the front == all zeros automatically on the back end of the array
		int[] result = nums;
		int lastIndex_nonZero = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[lastIndex_nonZero];
				nums[lastIndex_nonZero] = temp;
				lastIndex_nonZero++;
			}
		}
		return result;
    }
	public static void print(int [] nums) {
		for(int i=0; i< nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,3,0};
		a = moveZeroes(a);
		print(a);
	}

}
