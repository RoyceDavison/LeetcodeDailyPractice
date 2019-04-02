//Aug 30 2018
//https://leetcode.com/problems/power-of-three/solution/

public class isPowerOfThree {
	//此版本超时
	public static boolean isPowerOfThree_1(int n) {
        if(n==0 || n ==1) return false;
        int c = 1;
        while(c<n){
            c *= 3;
        }
        return (c==n?true:false);
    }
	
	//n is a power of three if and only if i is an integer. In Java, 
	//we check if a number is an integer by taking the decimal part (using % 1)
	//and checking if it is 0.
	public static boolean isPowerOfThree_2(int n) {
		return (int) (Math.log10(n)/Math.log10(3) %1) == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check = 10;
		System.out.println(isPowerOfThree_2(check));
	}

}
