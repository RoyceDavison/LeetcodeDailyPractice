public class FindPeakElement {
	
	//这道题非常精妙。注意num[i] 和 num[i+1] 不能相等-->即相邻的数是不允许的 e.g 121 ok, 112 not ok
    //用binarysearch 从中间开始搜索假设当前的数是peak 如果它大于左边的数，我们知道肯定会有peak在右边，如果继续搜索没能找到说明它在第一位
    //同理nums[mid1] < num[mid1+1]的话说明我们肯定能在左边找到一个peak 
    //只有这四种可能性: 121,(212,123),321
    //再详细一些-->  a1,a2,a3,a4....an assume a2<a3 --> we look for from [a3,an] 
    // if a4 < a3 we find it
    // if a4 > a3 ---> we look for [a4,an] we keep doing this 如果一直是下一位都比前一位大我们就return最后一位
    public int BinarySearch(int[]nums,int low, int high){
        if(low == high) return low;
        int mid1 = low + (high - low) /2;
        int mid2 = mid1+1;
        if(nums[mid1] > nums[mid2]){
            return BinarySearch(nums,low,mid1);
        }
        else{
            return BinarySearch(nums,mid2,high);
        }
    }
    
    public int findPeakElement(int[] nums) {
        return BinarySearch(nums,0,nums.length - 1);
    }
    
    //O(N) --> https://leetcode.com/problems/find-peak-element/solution/
    public int findPeakElement_(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
