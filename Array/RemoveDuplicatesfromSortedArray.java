
//Aug.28.2018
public class RemoveDuplicatesfromSortedArray {
	//需要remove所有repeated elements 所以别考虑HashMap
	public static int[] removeDuplicates(int[] nums) {
		int slow = 0;
		for(int fast = 1;fast<nums.length;fast++) {
			if(nums[fast]!=nums[slow]) {
				slow++;
				nums[slow] = nums[fast]; 
			}
		}
		//return slow+1;
		return nums;
    }
	
	public static void printArray(int[] nums) {
		for(int i = 0; i< nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_1 = {1,2,2,2,3};
		int[] arr_2 = {0,0,1,1,1,2,2,3,3,4};
		//int length_2 = removeDuplicates(arr_2);
		printArray(removeDuplicates(arr_1));
		//System.out.println(length_2);
	}

}
