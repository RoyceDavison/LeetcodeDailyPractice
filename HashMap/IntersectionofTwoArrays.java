import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

//Aug.29.2018 I &II 版本
// I版本 --> https://leetcode.com/problems/intersection-of-two-arrays/description/
// II版本 --> https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class IntersectionofTwoArrays {
	//对于II版本,还有一种用HashMap来解答
	public static int[] IntersectionofTwoArrays_II_DoublePoints(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> arr = new ArrayList<Integer>(); //store all repeated numbers
		int i = 0;
		int j = 0;
		while(i< nums1.length && j< nums2.length) {
			if(nums1[i]>nums2[j]) {
				j++;
			}
			else if(nums1[i] < nums2[j]) {
				i++;
			}
			else {
				arr.add(nums1[i]);
				i++;
				j++;
			}
		}
	
		int[] result = new int[arr.size()];
		for(int index=0;index<result.length;index++) {
			result[index] = arr.get(index);
		}
		return result;
	}
	
	public static int[] intersect_II(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
    
       return r;
    }
	
	public static int[] IntersectionofTwoArrays_I_DoublePoints(int[] nums1, int[] nums2) {
		int i=0;
		int j=0;
		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]> nums2[j]){
				j++;
			}
			else if(nums1[i]<nums2[j]) {
				i++;
			}
			else{
                set.add(nums1[i]);
			    i++;
			    j++;
            }
		}
		int[] arr = new int[set.size()];
		int index = 0;
		for(int w:set) {
			arr[index] = w;
			index++;
		}
		return arr;
	}
	public static int[] IntersectionofTwoArrays_I_HashSet(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> intersect = new HashSet<Integer>();
		
		for(int i=0;i<nums1.length;i++) {
			set.add(nums1[i]);
		}
		for(int j=0;j<nums2.length;j++) {
			if(set.contains(nums2[j]))
				intersect.add(nums2[j]);
		}
		int index = 0;
		int[] arr = new int[intersect.size()];
		for(int e:intersect) {
			arr[index] = e;
			index ++;
		}
		return arr;
	}
	
	//但这种Set leetcode不能import
	public static int[] IntersectionofTwoArrays_I_HashMap(int[] nums1, int[] nums2) {
		int length = 0;
		if(nums1.length>= nums2.length) {
			length = nums2.length;
		}
		else {
			length = nums1.length;
		}
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<nums1.length;i++) {
			 if(map.get(nums1[i]) == null) {
				 map.put(nums1[i], 1);
			 }
			 else {
				 map.put(nums1[i],map.get(nums1[i])+1);
			 }
		 }
		 
		 for(int i=0;i<nums2.length;i++) {
			 if(map.get(nums2[i]) == null) {
				 map.put(nums2[i], 1);
			 }
			 else {
				 map.put(nums2[i],map.get(nums2[i])+1);
			 }
		 }
		 int [] arr = new int[length];
		 int index = 0;
		 
		 //get the key,value of the map
		 for(Entry<Integer,Integer> entry:map.entrySet()) {
			 if(entry.getValue()>1) {
				 arr[index] = entry.getKey();
				 index++;
			 }
		 }
		 return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3,2,2};
		int[] nums2 = {1,2,2};
		int[] t = intersect_II(nums1,nums2);
		int[] w = IntersectionofTwoArrays_II_DoublePoints(nums1,nums2);
		for(int a: t) {
			System.out.print(a);
		}
	}

}
