import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
	HashMap<Integer,Integer> map;
	List<Integer> list;

	/** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
    		map = new HashMap<Integer,Integer>();
    		list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    		if(map.containsKey(val)) {
    			int LastElement = list.get(list.size()-1);
    			int val_index = map.get(val);
    			map.put(LastElement, val_index);
    			list.set(val_index, LastElement);
    			map.remove(val);
    			list.remove(list.size() - 1);
    			return true;
    		}
    		return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    		Random rand = new Random();
    		return list.get(rand.nextInt(list.size()));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertDeleteGetRandom test = new InsertDeleteGetRandom();
		test.insert(1);
		test.insert(2);
		test.insert(2);
		test.insert(4);
		test.remove(2);
			}

}
