public class FindFirstandLastPositionofElementinSortedArray {
	
	public static int[] searchRange(int[] nums, int target) {
        //use a boolean variable to find the start and the end indexes
        int start = binarySearch(nums,0,nums.length-1,target,false);
        int end = binarySearch(nums,0,nums.length-1,target,true);
        return new int[]{start,end};
    }
    
    public static int binarySearch(int nums[],int low, int high, int target, boolean isLast){
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isLast){ //find the last occurance
                if (nums[mid] <= target) low = mid + 1;
			    else high = mid-1;
            }
            else{
                if(nums[mid] < target) low = mid + 1;
                else high = mid - 1;
            }
            if(nums[mid] == target) res = mid;
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(searchRange(nums,target));
	}

}
