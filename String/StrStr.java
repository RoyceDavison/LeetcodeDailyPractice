public class StrStr {
    public static int strStr(String haystack, String needle) {
    		if(needle.length() > haystack.length()) {
    			return -1;
    		}
    		
    		else if(needle.length() == 0) {
    			return 0;
    		}
    		//从haystack拿掉needle的那一部分
    		for(int i = 0;i<=(haystack.length() - needle.length());i++) {
    			String c1 = haystack.substring(i, i+needle.length());
    			if(c1.equals(needle)) {
    				return i;
    			}
    		}
    		return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = "hello";
		String n = "ll";
		System.out.println(strStr(h,n));
	}

}
