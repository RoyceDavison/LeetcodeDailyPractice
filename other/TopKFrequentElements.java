import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TopKFrequentElements {  
	public static List<Integer> topKFrequent_treeMap(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i< nums.length ; i++) {
        		hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0)+1);
        }
        
        TreeMap<Integer,List<Integer>> treeMap = new TreeMap<Integer,List<Integer>>();
        for(Integer val: hashmap.keySet()) {
        		int freq = hashmap.get(val);
        		if(!treeMap.containsKey(freq)) {
        			treeMap.put(freq,new LinkedList<Integer>());
        		}
        		treeMap.get(freq).add(val);
        }
       
        while(res.size()<k){
            Entry<Integer, List<Integer>> entry = treeMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
		return res;
    }
	
	public static List<Integer> topKFrequent_bucketSort(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer>[] buckets = new List[nums.length + 1];
		
		for(int num:nums)
			map.put(num, map.getOrDefault(num,0)+1);
				
		for(Integer key: map.keySet()) {
			int freq = map.get(key);
			if(buckets[freq] == null) {
				buckets[freq] = new ArrayList<Integer>();
			}
			buckets[freq].add(key);
		}
		
		List<Integer> res = new ArrayList<Integer>();
		
		for(int pos = buckets.length-1; pos >= 0 && res.size() < k; pos--) {
			if(buckets[pos]!=null)
				res.addAll(buckets[pos]);
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		List<Integer> res = topKFrequent_bucketSort(nums,2);
		for(int e:res)
			System.out.println(e);
	}

}
