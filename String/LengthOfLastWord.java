public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		int tail = s.length() - 1;
		int count = 0;
		while(tail >= 0 && s.charAt(tail) == ' ') {
			tail--;
		}
		while(tail >= 0 && Character.isAlphabetic(s.charAt(tail))) {
			count++;
			tail--;
		}
		return count;
	}
	
	//注意这道题需要return的是最后一个word的长度
	// "aa bb c" -> 需要return 1 因为 'c'
	public static int lengthOfLastWord_(String s) {
			String[] arr = s.split(" ");
			if(arr.length == 1) return 1; 
			return arr[s.length()-1].length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a bb  c"; //6
		System.out.println(lengthOfLastWord(s));
	}

}
