
public class ReverseBits {
	public static int reverseBits(int n) {
        //简而言之 1101 --> （左到右读） 1011
		// 0001 --> 1000 把n的最右边的一位取出来，接到result的最后面，再分别更新它俩
        //int --> 32 bits in java
		int result = 0;
        for(int i=0;i<32;i++) {
        		result <<= 1;
        		if((n&1) == 1) result ++;
        		n >>= 1;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
