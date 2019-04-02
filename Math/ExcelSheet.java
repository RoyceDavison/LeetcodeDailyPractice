//Aug 31 2018
////10进制互换26进 两个版本 Q168 & Q171
public class ExcelSheet {
	
	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n>0) {
			n--;
			int digit = n % 26;
			sb.insert(0, (char)('A' + digit % 26));
			n /=26;
		}
        return sb.toString();
    }
	
	public static int titleToNumber(String s) {
		s = s.toUpperCase();
		int num = 0;
		int carry = s.length()-1;
		
		for(int i  = 0;i<s.length();i++) {
			int e = (s.charAt(i) - 'A')+1;
			num += e * (int)Math.pow((double)26, (double)carry);
			carry --;
		}
        return num;
    }
	
	//比如假设我们转换十进制的string s --> "121" to integer 121
	//从左到右 0*10+1=1 我们如何把2这个数字加进来以至于得到12呢? 
	// 1*10+2 = 12 同理 12*10+1 = 121
	// s[i] *10 + i
	public static int titleToNumber_(String s) {
		s = s.toUpperCase();
		int result = 0;
		for(int i=0;i<s.length();i++) {
			result = result * 26 +(s.charAt(i) - 'A' + 1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(titleToNumber("wcc"));
		System.out.println(convertToTitle(701));
		//System.out.println(convertToTitle(701));
	}

}
