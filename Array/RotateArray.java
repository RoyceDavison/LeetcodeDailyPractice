//Aug.28.2018
public class RotateArray {
	public static int[] rotate(int[] nums, int k) {
		int [] a = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int new_location = (i+k) % nums.length;
			a[new_location] = nums[i];
		}
		for(int i=0; i< nums.length;i++) {
			nums[i] = a[i];
		}
		return nums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test_1 = {1,2,3,4,5,6,7};
		test_1 = rotate(test_1,3);
		int[] test_2 = {-1,-100,3,99};
		test_2 = rotate(test_2,2);
		for(int a: test_1) {
			System.out.print(a);
		}
		System.out.println();
		for(int b: test_2) {
			System.out.print(b);
		}
	}

}
