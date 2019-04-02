//Leo Cai的youtube讲解这道题非常棒！
public class ContainerWithMostWater {
	
	public static int maxArea(int[] height) {
	    int low = 0;
	    int high = height.length -1;
	    int max = 0;
	    
	    while(low<high) {
	    		int lowVal = height[low];
	    		int highVal = height[high];
	    		int volumn = 0;
	    		//最短的那块木块决定里这个水桶能装多少水
	    		if(lowVal > highVal) {
	    			volumn = highVal * (high-low);
	    			high--;
	    		}
	    		else {
	    			volumn = lowVal * (high-low);
	    			low++;
	    		}
    			max = Math.max(volumn, max);
	    }
		return max;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(test));
	}

}
