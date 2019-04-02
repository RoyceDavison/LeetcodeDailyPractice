import java.util.Arrays;
import java.util.HashMap;

// 08.26.2018
public class ContainsDuplicate {
	//Brute Force: check frequency of every element
	public static boolean containsDuplicate_BF(int[] nums) {
		for(int i=0; i< nums.length;i++) {
			int count = 0;
			for(int j = 0; j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					count ++;
				}
				if(count >= 2) {
					return true;
				}
			}
		}
		return false;
    }
	
	//Sorting
	//If there are any duplicate integers, they will be consecutive after sorting.
	public static boolean containsDuplicate_sort(int[] nums) {
			Arrays.sort(nums);
			for(int i=0; i<nums.length-1;i++) {
				if(nums[i] == nums[i+1]) return true;
			}
			return false;
	}
	
	//Hash Map
	public static boolean containsDuplicate_HM(int[] nums) {
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i = 0; i<nums.length;i++) {
			if(hashMap.get(nums[i]) == null) {
				hashMap.put(nums[i], 1);
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
