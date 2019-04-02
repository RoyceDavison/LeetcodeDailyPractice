public class CountingBits {
	/* i & (i-1) --> check whether it is a power of 2
	i		bit		i & (i-1)			count
	-----------------------------------------
	0		0000
	-----------------------------------------
	1		0001		0					1
	
	2		0010		0000		-->相当于 0	1
	3		0011		0010		-->相当于 2	2
	4		0100		0000		-->相当于 0 	1
	5		0101		0100		-->相当于 4
	6		0110		0100		-->相当于 4
	7		0111		0110		-->相当于 6
	8		1000		0000		-->相当于 0
	9		1001		1000		-->相当于 8
	10		1010		1000		-->相当于 8
	*/
	//如果是2的power则只需要1个bit就可以表示
	//如果不是2的power则需要它前面一个是2的power的数的bit + 1
	public static int[] countBits(int num) {
		int[] res = new int[num+1];
		for(int i = 1; i<= num; i++){
			res[i] = res[i & (i - 1)] + 1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
