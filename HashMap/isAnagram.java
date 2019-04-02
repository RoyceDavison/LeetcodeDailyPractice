import java.util.Arrays;
import java.util.HashMap;

//Aug.29.2018
public class isAnagram {
	//用HashMap这个有一点不好 如果string特别长会overflow
	public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map_s = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map_t = new HashMap<Character,Integer>();

        if(s.length() != t.length()) return false;  
        
        for(int i=0;i<s.length();i++) {
        		if(map_s.get(s.charAt(i)) == null) {
        			map_s.put(s.charAt(i),1);
        		}
        		else {
        			map_s.put(s.charAt(i),map_s.get(s.charAt(i))+1);
        		}
        		if(map_t.get(t.charAt(i)) == null) {
        			map_t.put(t.charAt(i),1);
        		}
        		else {
        			map_t.put(t.charAt(i),map_t.get(t.charAt(i))+1);
        		}
        }
        
        for(int i=0;i< s.length();i++) {
        		if(map_s.get(s.charAt(i)) != map_t.get(s.charAt(i)) ) {
        			return false;
        		}
        }
		return true;
    }
	
	public static boolean isAnagram_sort(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
	}
	
	public static boolean isAnagram_array(String s, String t) {
        if(s.length()!= t.length()) return false;
		int [] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		for(int e:arr) {
			if(e!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram_array(s,t));
	}

}
