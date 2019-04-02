//Sep.01.2018
public class Numberof1Bits {
	public static int hammingWeight_myOwn(int n) {
        int count = 0;
        while(n!=0){
            int check = n & 1;
            if(check == 1){
                count ++;
            }
            n = n>>>1;
        }
        return count;
    }
	
	public static int hammingWeight_I(int n) {
		int ones = 0;
		while(n!=0) {
			ones = ones + (n & 1); 
			//n & 1 is either be 0 or 1
			// e.g  101011 & 000001 ---> .....1
			// 101010 & 000001 --> ....0
			n = n >>> 1;
		}
		return ones;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
