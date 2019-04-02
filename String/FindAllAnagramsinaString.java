import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {
	
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<Integer>();
		if(s.length()<p.length()) return res;
		
		for(int i =0;i<=(s.length()-p.length());i+=p.length()) {
			String check = s.substring(i, i+p.length()+1);
			char[] arr_p = new char[26]; 
			for(int j =0;j<p.length();j++) {
				arr_p[p.charAt(j)-'a']++;
			}
			
			for(int w=0;w<check.length();w++) {
				arr_p[check.charAt(w)-'a']--;
			}
			
			int sum = 0;
			
			for(int e:arr_p) {
				sum += e;
			}
			if(sum == 0) {
				res.add(i);
			}
		}
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String p = "abcd";
		List<Integer> res = findAnagrams(s,p);
		for(int e:res) {
			System.out.println(e);
		}
	}

}
