
public class wiggleSort {
	//https://leetcode.com/problems/wiggle-sort/discuss/71693/My-explanations-of-the-best-voted-Algo
	//奇数位必须要大于或者等于前面的一位数；偶数位必须要小于或者等于前面的一位数，如若不然则swap
    //假设我们走到偶数位置则说明 nums[i-2] <= nums[i-1] 假设此时的nums[i]大于nums[i-1],
    //swap之后就完美wiggle 因为 nums[i-2]<= nums[i] => nums[i-1]
    // e.g 3,5,6 --> 3,6,5
    //假设我们走到奇数位置则说明 nums[i-2] >= nums[i-1] 假设此时的 nums[i]小于nums[i-1], 
    //swap之后就得到 nums[i - 2] >= nums[i - 1] =< nums[i]
    // e.g 3 6 5 2 --> 3 6 2 5 
    public static void wiggleSort(int[] nums) {
        if(nums == null || nums.length < 2) return;
        for(int i = 1; i < nums.length; i++){
            if((i % 2 == 0 && nums[i] > nums[i-1]) || (i%2!=0 && nums[i] < nums[i-1])){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
