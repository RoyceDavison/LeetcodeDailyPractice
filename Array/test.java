import java.util.HashMap;
import java.util.Map;

public class test {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");
	    public static int solution(int[] A) {
	        /* This problem is very similar to 0 1 Knapsack problem. 
	         * To solve this problem let split it into four steps:
	    			1. We find the mid of sum of array A = sum/2 (which is maximum sum processes of a server) 
	    			2. We keep each array to hold the closet numbers of processes to the mid
	    				a. which can be achieved by find the absolute different value b.w those mid and the number
	    			3. In order to achieve step 2 we just traverse the array A find each absolute different value b/w mid and its entry
	    				3a. If sum of array_l >= sum of array_r, we put the number into array_1
	    				3b. else we put it into array_r
	    			4. Remove the number from array A since it already put into array_1 or array_2
	    				(I do thing by let the removed entry equals to zero)
	    			5. Repeat the step 3&4
	    		*/
	        int[] array_l = new int[A.length/2 + 1];
	        int[] array_r = new int[A.length/2 + 1];
	        int l_index = 0;
	        int r_index = 0;
	        int sumr = 0;
	        int suml = 0;
	        int sum = 0;
	        
	        for(int w = 0; w<A.length;w++){
	            sum = 0;
	            for(int j=0; j<A.length; j++){
	                    sum += A[j];
	            }
	            
	            int mid = sum/2;
	            int smallest = Integer.MAX_VALUE; 
	            int smallest_index = 0;
	            
	            for(int i=0; i<A.length; i++){
	                int a =(Math.abs(A[i]-mid));
	            		if(a <=smallest){
	                    smallest = Math.abs(A[i]-mid);
	                    smallest_index = i;
	                }
	            }
	            
	            if(suml<=sumr){
	                array_l[l_index++] = A[smallest_index];
	                suml +=A[smallest_index];
	            }
	            else{
	                array_r[r_index++] = A[smallest_index];
	                sumr +=A[smallest_index];
	            }
	            A[smallest_index] = 0;
	   
	        }
	        return Math.abs(suml-sumr);
	    }
	    
	    public static void main(String[]args) {
	    		int[] A = {1,2,3,4};
	    		System.out.println(solution(A));
	    }
	
}
