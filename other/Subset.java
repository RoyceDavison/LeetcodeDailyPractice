import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.youtube.com/watch?v=rtFHxiQAICA
public class Subset {
	/*	nums = [1,2,3]
	 *  "" --> 1  --> 1,2  --> 1,2,3
	 *  			  --> 1,3
	 * 	   --> 2  --> 2,3
	 * 	   --> 3	 
	 * Add all of them into res. 每一次选一个数　n!
	 */
	public static void backtrack(int[]nums, int currIndex,List<List<Integer>> res, List<Integer> curr){
		res.add(new ArrayList<Integer>(curr));
        for(int index = currIndex; index < nums.length; index ++) {
        		curr.add(nums[index]);
        		backtrack(nums,index+1,res,curr);
        		curr.remove(curr.size()-1);
        }
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
    		List<List<Integer>> res = new ArrayList<List<Integer>>();
    		if(nums == null || nums.length == 0) return res;
    		backtrack(nums,0,res,new ArrayList<Integer>());
    		return res;
    }
    
    public static void backtrack_helper(int[]nums,int currIndex, List<List<Integer>> res, List<Integer> curr){
        res.add(new ArrayList<Integer>(curr));
        for(int index = currIndex; index < nums.length; index++){
            if(index > currIndex && nums[index] == nums[index-1]){
                continue;
            }
            curr.add(nums[index]);
            backtrack(nums,index+1,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //在这里sort这个array是非常有必要的因为我们的backtrack_helper中if statement只能check相邻的两个数
        //如果没有sort比如(1,2,1) 最后会出现重复的 "",1,12,121,11,21,12 其中12出现了两次
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return res;
        backtrack(nums,0,res,new ArrayList<Integer>());
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,2};
		subsets(test);
	}

}
