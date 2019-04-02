import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class permutation {
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0) return res;
		backtrack(res,new ArrayList<Integer>(),nums);
		return res;
	}
	
	public static void backtrack(List<List<Integer>> res, List<Integer> currList, int [] nums){
		if(currList.size() == nums.length) {
			res.add(new ArrayList<Integer>(currList));
		}
		for(int i = 0; i < nums.length; i++) {
			if(currList.contains(nums[i])) continue;
			currList.add(nums[i]);
			backtrack(res, currList, nums);
			currList.remove(currList.size() - 1);
		}
	}
	
	public static List<List<Integer>> permute_II(int[] nums){
		List<List<Integer>> res  = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0) return res;
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		backtrack(res,new ArrayList<Integer>(), nums,used);
		return res;
	}
	
	public static void backtrack(List<List<Integer>> res, List<Integer> currList, int[]nums, boolean[] used) {
		if(currList.size() == nums.length) {
			res.add(new ArrayList<Integer>(currList));
		}
		for(int i = 0; i< nums.length; i++) {
			if(used[i]) continue;
			if(i>0 && nums[i] == nums[i-1] && used[i-1]) continue;
				used[i] = true;
				currList.add(nums[i]);
				backtrack(res,currList,nums,used);
				used[i] = false;
				currList.remove(currList.size()-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,2};
		System.out.println(permute_II(test));
	}

}
