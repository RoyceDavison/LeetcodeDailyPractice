import java.util.HashMap;

//Aug.29.2018
//https://leetcode.com/problems/single-number/solution/
//有其他很秒的方法 - Math, Bit Manipulation
public class SingleNumber {
	public static int singleNumber(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null) 
                map.put(nums[i],1);
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j]) == 1){
                return nums[j];
            }
        }
        return -1;
    }
	
	public static int singleNumber_2(int[] nums) {
		int a = 0;
		for(int i=0; i< nums.length ;i++) {
			a = a ^ nums[i];
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {2,2,1};
			System.out.println(singleNumber(a));
	}

}
