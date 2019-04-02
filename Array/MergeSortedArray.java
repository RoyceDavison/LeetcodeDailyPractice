public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        //如果没有>=0 则可能会丢掉nums[0]元素
        while(j>=0 && i>=0) {
        		if(nums1[i]>nums2[j]) {
        			nums1[k--] = nums1[i--];
        		}
        		else {
        			nums1[k--] = nums2[j--];
        		}
        }
        //[10,20,30] m =3
        //[2,5,6] n =3 会用到下面那行
        while (j>=0) nums1[k--] = nums2[j--];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {10,20,30,0,0,0};
		int[] nums2 = {2,5,6,4};
		int m = 3, n = 3;
		merge(nums1,m,nums2,n);
		for(int e: nums1)
			System.out.println(e);
	}
}
