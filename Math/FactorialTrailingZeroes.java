//Aug 31 2018
public class FactorialTrailingZeroes {
    //超时
	public static int trailingZeroes_1(int n) {
    		if(n<= 4) return 0;
    		int r = 1;
    		while(r!=n) {
    			r *= n;
    		}
    		int count = 1;
    		while(r%10 == 0) {
    			count ++;
    			r = r%10;
    		}
    		return count;
    }
    
    public static int trailingZeroes_2(int n) {
    		int result = 0;
    		while(n/5 >0) {
    			result += n/5;
    			n/=5;
    		}
    		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes_2(125));
	}

}
