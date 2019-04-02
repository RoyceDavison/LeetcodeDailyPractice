public class MaximizeDistancetoClosestPerson {
	
	public static int maxDistToClosest(int[] seats) {
        int left = -1, maxDis = 0;
        int len = seats.length;
        
        for (int i = 0; i < len; i++) {
            if (seats[i] == 0) continue;

            if (left == -1) {
                maxDis = Math.max(maxDis, i);
            } else {
            		//当进入这种情况则肯定是...1..x...1... 我们需要保证左边的1和右边1同时距离x最远
            		//左边有1 右边也有1 那在这种情况下只有在中间才能保证同时到两边最大
                maxDis = Math.max(maxDis, (i - left) / 2);
            }
            left = i;
        }
        
        if (seats[len - 1] == 0) {
            maxDis = Math.max(maxDis, len - 1 - left);
        }
        
        return maxDis;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,0,1,0,0,0,0,0,0,1};
		System.out.println(maxDistToClosest(arr));
	}

}
