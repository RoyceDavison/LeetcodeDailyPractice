

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int index = 0;
		for(int j = 0; j<nums.length;j++) {
			if(nums[j] != val) {
				nums[index] = nums[j];
				index ++;
			}
		}
		return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}
