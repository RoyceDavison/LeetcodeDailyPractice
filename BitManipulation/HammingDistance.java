
public class HammingDistance {
	public static int hammingDistance(int x, int y) {
        int result = x ^ y;
        int count = 0;
        while(result != 0){
            int last = result & 1;
            if(last == 1) count++;
            result >>>= 1;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(3,1));
	}

}
