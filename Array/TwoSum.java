import java.util.HashMap;
import java.util.Map;

//August.28.2018
public class TwoSum {
	public static int[] twoSum_BF(int[] nums, int target) {
		int index_1 = 0;
		int index_2 = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j= i+1;j<nums.length;j++) {
				if((nums[i]+nums[j]) == target) {
					index_1 = i;
					index_2 = j;
					break;
				}
			}
		}
		int [] result = {index_1,index_2};
		return result;
	}
	
	//hashMap
	public static int[] twoSum_HM(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] arr = new int[2];
		for(int i=0; i< nums.length; i++) {
			if(map.get(target-nums[i]) == null) {
				map.put(nums[i],i);
			}
			else {
				arr[0] = map.get(target-nums[i]);
				arr[1] = i;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,3,3};
		int[] r = twoSum_BF(a,6);
		for(int w:r)
			System.out.println(w);
	}

}
