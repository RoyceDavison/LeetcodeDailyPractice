//Aug.28.2018 Best Time to Buy and Sell Stock I
//Aug.29.2018 Best Time to Buy and Sell Stock II
public class BestTimetoBuyandSellStock {
	//Brute Force: try every possible pair
	/* We need to find the maximum difference b.w two numbers in the given array.
	 * Also the second number should be larger than the first one.
	 * */
	public static int maxProfit_BF(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
		for(int i=0;i<prices.length;i++) {
        		for(int j = i+1;j<prices.length ; j++) {
        			int profit = prices[j] - prices[i];
        			if(profit>max_profit) {
        				max_profit = profit;
        			}
        		}
        }
		if(max_profit < 0) return 0;
		else return max_profit;
    }
	
	public static int maxProfit_OnePass(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
        		//标记最小的数
        		if(prices[i]<smallest) {
        			smallest = prices[i];
        		}
        		else if((prices[i]-smallest)>max_profit) {
        			max_profit = prices[i]-smallest;
        		}
        }
		if(max_profit < 0) return 0;
		else return max_profit;
    }
	
	//这道题归结起来的解法:只要有钱赚就卖！
	public static int maxProfit_II(int[] prices) {
		int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                maxProfit += (prices[i+1]-prices[i]);
            }
        }
        return maxProfit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test_1 = {7,1,5,3,6,4};
		int [] test_2 = {7,6,4,3,1};
		System.out.println(maxProfit_OnePass(test_1));
		System.out.println(maxProfit_OnePass(test_2));
	}

}
