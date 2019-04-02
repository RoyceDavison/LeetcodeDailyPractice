//Sep.01.2018
public class CountandSay {
	/*
	 1.     1
	 2.     11
	 3.     21
	 4.     1211
	 5.     111221 
	 */
	public static String countAndSay(int n) {
		StringBuilder curr=new StringBuilder("1");
		StringBuilder prev;
		int i =1;
	    while(i!=n) {
	    		prev=curr;
	        curr=new StringBuilder();       
	        int count=1;
	        char say=prev.charAt(0);
	        for (int j=1;j<prev.length();j++){
		        	if (prev.charAt(j)!=say){
		        		curr.append(count).append(say);
		        		count=1;
		        		say=prev.charAt(j);
		        	}
		        	else count++;
		        }
	        //这句话的作用可以通过n = 5 --> n=6 看出来
	        curr.append(count).append(say);
	        i++;
	    }	       	        
	    return curr.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(1));
	}

}
