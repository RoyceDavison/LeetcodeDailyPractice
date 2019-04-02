import java.util.Arrays;
import java.util.HashMap;

// 08.26.2018 第一天
public class MajorityElement {
	//Brute_force Implementation: check frequency of every number and choose the one with the largest frequency
	public static int majorityElement_BF(int[] nums) {
		int largest = 0;
		int result = -1;
		
		for(int i=0;i<nums.length;i++) {
			int count = 0;
			for(int j = 0; j< nums.length ; j++) {
				if(nums[i] == nums[j])
					count ++;
			}
			if(count > largest) {
                largest = count;
				result = nums[i];
			}
		}
		return result;
    }
	
	public static int majorityElement_HM(int[] nums) {
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		int largest_freq = 0;
		int largest_index = 0;
		for(int i = 0;i<nums.length;i++) {
			if(hashmap.get(nums[i]) == null) {
				hashmap.put(nums[i], 1);
			}
			else {
				hashmap.put(nums[i],hashmap.get(nums[i])+1);
			}
		}
		
		for(int i = 0;i<nums.length;i++) {
			int freq = hashmap.get(nums[i]);
			if(freq > largest_freq) {
				largest_freq = freq;
				largest_index = i;
			}
		}
		return nums[largest_index];
	}
	
	//sorting the array and the majorityElement is guranteed to be 下线 n/2 (n=length of nums)
	//其实就是求中位数
	// e.g 2,5,6,6,7 --> 6 index = 2 or 3
	// e.g 2,3,6,7 --> 6	   index = 2
	public static int majorityElement_Sort(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {6,5,5};
		int r = majorityElement_HM(test);
		System.out.println(r);
	}

}
