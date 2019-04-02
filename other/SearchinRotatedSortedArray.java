
public class SearchinRotatedSortedArray {
    // https://leetcode.windliang.cc/leetCode-33-Search-in-Rotated-Sorted-Array.html
	
	public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        return binarySearch(0,nums.length-1,target,nums);
        
    }
	//1.先找到pivot 分开有序数组：左边 vs 右边
	//2.然后分别在左边的有序数组和右边的有序数组进行target查找
	public static int binarySearch(int low,int high,int target,int nums[]){
		
        if(low <= high){
            int middle = low + (high - low)/2;
            if(nums[middle] == target){
                return middle;
            }
            
            //左边是有序的
            if(nums[low]<=nums[middle]) {
            	if(target >= nums[low] && target <= nums[middle]) {
            		high = middle - 1;
            	}
            	else {
            		low = middle + 1;
            	}
            }
            //右边是有序的
            else {
            	if(target > nums[middle] && target <= nums[high]) {
            		low = middle + 1;
            	}
            	else {
            		high = middle - 1;
            	}
            }
            return binarySearch(low,high,target,nums);
        }
        
        else
            return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3,4,5,6,7};
		System.out.println(search(test,5));
	}

}
