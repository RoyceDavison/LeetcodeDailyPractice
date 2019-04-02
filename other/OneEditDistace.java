
public class OneEditDistace {
	
	public static boolean isOneEditDistance(String s, String t) {
		/*
	    Three possibilities: 1. s.length == t.length --> replace one character in s
	    2. s.length < t.length --> insert one character into s
	    3. s.length > t.length --> delete one character from s
		 */
	for(int i =0; i < Math.min(s.length(),t.length());i++){
	    if(s.charAt(i) != t.charAt(i)){
	        //说明在i位置之前的字母都是相等的
	        if(s.length() == t.length()){ 
	        	// s has the same length as t, so the only possibility is replacing one char in s and t
	            return s.substring(i+1).equals(t.substring(i+1));
	        }
	        else if(s.length() < t.length()){
	        	// t is longer than s, so the only possibility is insert one char into s
	            return s.substring(i).equals(t.substring(i+1));
	        }
	        else{
	        	// s is longer than t, so the only possibility is deleting one char from s
	            return s.substring(i+1).equals(t.substring(i));
	        }
	    }
	}
	//在这里了说明短字符串的字母都和长字符串的字母都对上了，
	//那如果现在这里如果长字符串的长度比短字符串的多1那么insert or delete都works
	//比如 s = "abc", t = "ab" ==> delete 'c' 或者 s = "ab", t = "abc" ==> insert 'c'
	return Math.abs(s.length() - t.length()) == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcc";
		String t = "abwcc";
		System.out.println(isOneEditDistance(s,t));
	}

}
