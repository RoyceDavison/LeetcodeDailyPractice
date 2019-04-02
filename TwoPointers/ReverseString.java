//Aug 31 2018
public class ReverseString {
	public static String reverseString_I_SB(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = s.length()-1; i>=0;i--) {
        		result.append(s.charAt(i));
        }
        	return result.toString();
    }
	public static String reverseString_I_charArray(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while(i<j) {
			char temp = s.charAt(i);
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mnb";
		System.out.println(reverseString_I_charArray(a));
	}

}
