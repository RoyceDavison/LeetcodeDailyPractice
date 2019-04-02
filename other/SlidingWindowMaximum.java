public class SlidingWindowMaximum {
		
	public static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        //[1,2,3,4,5,6,7,8] k = 3, 从3到8每一个数字都可以当作末尾，这样有8-3+1个末尾
        int [] res = new int[nums.length - k +1];
        int index = 0;
        while(i<=(nums.length-k)){
            int max = Integer.MIN_VALUE;
            int w = i;
            for(int j = w; j<(w+k);j++){
                if(nums[j]>max)
                    max = nums[j];
                }
            res[index] = max;
            i++;
            index++;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		nums = maxSlidingWindow(nums,k);
		//for(int e: nums)
			//System.out.println(e);
		
		for(int i=0;i<5;++i) {
			System.out.println(i);
		}
		System.out.println();
		for(int i=0;i<5;++i) {
			System.out.println(i);
		}
	}
	
	//  1 0 1 
	//  1 1 0
	//1 0 1 1
}
