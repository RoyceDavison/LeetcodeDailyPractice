import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinArray {
	
	//暴力搜索: 对于每一个nums的元素进行expectNum([1,n]) 查找，如果能找到则found = true
	//接下来跳出循环，如果(!found)，则把该元素加入list
	public static List<Integer> findDisappearedNumbers_BF(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int expectNum  = i+1;
			boolean found = false;
			
			for(int j=0;j<nums.length;j++) {
				if(nums[j] == expectNum) {
					found = true;
				}
			}
			
			if(!found) list.add(expectNum);
			}
		return list;
	}
	/*
	 * 首先来看第一种解法，这种解法的思路路是，对于每个数字nums[i]，如果其对应的nums[nums[i] - 1]是正数，
	 * 我们就赋值为其相反数，如果已经是负数了，就不变了，
	 * 那么最后我们只要把留下的整数对应的位置加入结果res中即可.
	 * 到最后假设nums = {2,2,3} --> {2,-2,-3}
	 * index1,2的元素为负数说明我们已经看到过 1+1 =2 , 2+1 = 3
	 * 若nums的元素是正数则说明是我们所缺失的元素
	 */
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++) {
        		int index = Math.abs(nums[i]) - 1;
        		if(nums[index]>0) {
        			nums[index] = -nums[index];
        		}
        }
        
        for(int i = 0; i<nums.length;i++) {
        		if(nums[i]>0)
        			list.add(i+1);
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,2,3};
		List<Integer> list = new ArrayList<Integer>();
		list = findDisappearedNumbers(test);
		for(Integer e: list) {
			System.out.println(e);
		}
	}
}
