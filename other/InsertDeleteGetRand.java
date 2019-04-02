import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRand {
	List<Integer> list;
	HashMap<Integer,LinkedHashSet<Integer>> hashmap;
	/** Initialize your data structure here. */
    public InsertDeleteGetRand() {
        list = new ArrayList<Integer>();
        hashmap = new HashMap<Integer,LinkedHashSet<Integer>>();
    }
  
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
    		boolean contain = hashmap.containsKey(val);
	    if(!contain) {
	        hashmap.put(val, new LinkedHashSet<Integer>());
	    }
	    hashmap.get(val).add(list.size());
	    list.add(val);
	    return !contain;
    }
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!hashmap.containsKey(val)) return false;
        LinkedHashSet<Integer> valSet = hashmap.get(val);
        int removedIndex = valSet.iterator().next();
        
        int lastElement = list.get(list.size()-1);
        LinkedHashSet<Integer> replaceWith = hashmap.get(lastElement);
        
        list.set(removedIndex, lastElement);
        valSet.remove(removedIndex);
        
        //if the removed element is the same as the last element then we should not 
        //remove anything from the set.因为它俩是在同一个位置
        if(removedIndex != list.size() - 1) {
        		replaceWith.remove(list.size()-1);
        		replaceWith.add(removedIndex);
        }
        list.remove(list.size()-1);
        
        if(valSet.isEmpty()) {
        		hashmap.remove(val);
        }
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertDeleteGetRand test = new InsertDeleteGetRand();
		test.insert(1);
		test.insert(1);
		test.insert(1);
		test.remove(1);
	}

}
