import java.util.HashMap;

public class lengthOfLongestSubstring {
//https://www.youtube.com/watch?v=9VcYiqTqzUY	
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 0 || s ==null) return 0;
        int left = 0, right = 0, max = 0;
        boolean[] used = new boolean[128];
        
        while(right<s.length()) {
        		char c = s.charAt(right);
        		if(used[c] == false) {
        			used[c] = true;
		    		right ++;
        		}
        		else {
        			max = Math.max(max, right-left);
        			while(left<right && s.charAt(left)!= s.charAt(right)) {
        				//在这里设置左指针扫过的为false考虑这个case: abcdbea
        				used[s.charAt(left)] = false;
        				left++;
        			}
        			left++;
        			right++;
        		}
        }
        //考虑在string偏尾部的地方
        max = Math.max(max, right - left);
		return max;
    }
	
	public static int lengthOfLongestSubstring_HashMap(String s) {
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int right=0, left=0; right<s.length(); right++){
            if (map.containsKey(s.charAt(right))){
            		//为什么这里要取max-->因为要剔除没有被left扫过的重复的字母，如果被left扫过的则不管
            		//e.g abcdbeab 在看到第二个a的时候left是2没有改变但是看到第二个b的时候是变了，第三个b的时候也是变了。
            		//当看到第二个a的时候left是指在c 我们知道第一个a被left扫过了
            		//当看到最后一个b的时候left要更新为5因为位置5的b还没有被left扫过
            		//简而言之我们希望left和right只会往前不会往后走
            		left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            max = Math.max(max,right-left+1);
        }
        return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(lengthOfLongestSubstring_HashMap("abcdbeab"));
		System.out.println(lengthOfLongestSubstring("abcdbew"));
	}

}
