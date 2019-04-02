//Aug 31 2019 第三种方法two pointers 不需要正则表达式. 用isLetterOrDigit
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		//所有非字母字符都被""取代
		s = s.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
        		if(s.charAt(i) != s.charAt(j)) return false;
        		i++;
        		j--;
        }
        return true;
    }
	
	public static boolean isPalindrome_sb(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return s.equals(sb.toString());
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "\"Marge, let's \\\"went.\\\" I await news telegram.\"";
		String a = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
		isPalindrome(str);
	}

}
