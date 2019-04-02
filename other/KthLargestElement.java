import java.util.PriorityQueue;

public class KthLargestElement {
	//java priorityQueue是最小数做root 也就是说每当你加入queue里，它的头都是最小数，
    //全部走完for loop 比kth number 小的第一个数丢掉，比k-th number小的第二个数丢掉...
    //(注：比它小的第一个数并不代表是最小的那个数，仅仅知识比它小)
    //priorityQueue 里面永远存的是最大的k个数 例如k = 2， pq最后跳出for则会有最大的两个数
    //k = 1, pq最后跳出for则会有最大的一个数
	public static int findKthLargest(int[] nums,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int val:nums) {
			pq.offer(val);
			if(pq.size() > k)
				pq.poll();
		}
		return pq.peek();
	}
	
	//注：a.length - k + 1 是选取第k大数字的正确位置的做法 因为我们的quickSelect return的是 k-th smallest number
    // arrs = 1,2,3,4,5,6     k = 2 需要return第二大的数 --> 5
    //那 6 - 2 + 1 = 5 要找到第五小的数 --> 5
    //为什么k-m？因为当分出来小组进行考虑的时候，要选该当前小组的相应kth大的数
    public int findKthLargest_(int[] a, int k) {
		int n = a.length;
		int p = quickSelect(a, 0, n - 1, n - k + 1);
		return a[p];
    }
  
    //return the index of the kth smallest number
    public int quickSelect(int[] a, int lo, int hi, int k) {
    // use quick sort's idea
    // put nums that are <= pivot to the left
    // put nums that are  > pivot to the right
	    int i = lo, j = hi, pivot = a[hi];
	    while (i < j) {
	      if (a[i++] > pivot) swap(a, --i, --j);
	    }
	    swap(a, i, hi);
	    
	    // count the nums that are <= pivot from lo
	    int m = i - lo + 1;
	    
	    // pivot is the one!
	    if (m == k)     return i;
	    // pivot is too big, so it must be on the left
	    else if (m > k) return quickSelect(a, lo, i - 1, k);
	    // pivot is too small, so it must be on the right
	    else return quickSelect(a, i + 1, hi, k - m);
    }
  
	  void swap(int[] a, int i, int j) {
	    int tmp = a[i];
	    a[i] = a[j];
	    a[j] = tmp;
	  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {5,2,4,3,1,6};
		int res = findKthLargest(test,3);
		System.out.println(res);
	}

}
