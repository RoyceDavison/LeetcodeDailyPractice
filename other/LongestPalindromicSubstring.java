
public class LongestPalindromicSubstring {
    
	public static String longestPalindrome(String s) {
		String res = "";
		boolean dp[][] = new boolean[s.length()][s.length()];
		
		for(int i = s.length() - 1; i >= 0; i--) {
			for(int j = i; j < s.length(); j++) {
				dp[i][j]= (s.charAt(i) == s.charAt(j)) && (j - i < 3 ||dp[i+1][j-1]);
				if(dp[i][j] && (j-i+1) > res.length()) {
					res = s.substring(i, j+1);
				}
			}
		}
		return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = longestPalindrome("babad");
		System.out.println(res);
	}

}
