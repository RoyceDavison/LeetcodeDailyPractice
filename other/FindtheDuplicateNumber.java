public class FindtheDuplicateNumber {

	/*
	 * 这道题就是detect cycle 并且找到它的entrance。从这里开始循环找到重复目标。
	 * 
	 * index   0  1  2  3  4  5  6
	 * nums[i] 1  4  6  6  6  2  2
	 * 乌龟走的 1,4,6
	 * 兔子走的 1,6,6
	 * 假设我们按照 nums[i]为index来遍历这个array 我们将会得到: 1,4,6,3,6,3,6,3.....
	 * 然后我们让乌龟ptr和兔子ptr在同一个起跑线，乌龟先走走一步，兔子走两步，只要它俩指的数字相等就说明
	 * 当下的乌龟ptr指向的是entrance
	 */
	
	public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
        		tortoise = nums[tortoise];
        		int firstStep = nums[hare];
        		hare = nums[firstStep];
        } while(tortoise!=hare);
        
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        
        while(ptr1 != ptr2) {
        		ptr1 = nums[ptr1];
        		ptr2 = nums[ptr2];
        }
		return ptr1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,3,4,2,2};
		System.out.println(findDuplicate(test));
	}

}
