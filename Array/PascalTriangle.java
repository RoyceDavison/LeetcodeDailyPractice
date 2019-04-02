import java.util.ArrayList;
import java.util.List;

//August 30 2018
public class PascalTriangle {
	//PasCal Triangle II
	// 关于reference --> https://stackoverflow.com/questions/25147799/java-arraylist-of-arraylist
	// [1,1][1,1] --> [1] [1,1]
	public static List<List<Integer>> generate(int numRows) {
		List<Integer> curr = new ArrayList<Integer>();
		List<Integer> prev = new ArrayList<Integer>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	
		if(numRows == 0) return res;
		
		if(numRows ==1) {
			prev.add(1);
			res.add(new ArrayList<Integer>(prev));
			return res;
		}
		
		if(numRows>1) {
			prev.add(1);
			res.add(new ArrayList<Integer>(prev));
			prev.add(1);
			res.add(new ArrayList<Integer>(prev));
		}
		//因为上面已经加过1层 所以从第二层开始
		int count = 2;
		while(count != numRows) {
			curr.clear();
			curr.add(1);
			for(int i=0;i<prev.size()-1;i++) {
				int sum = prev.get(i)+prev.get(i+1);
				curr.add(sum);
			}
			curr.add(1);
			res.add(new ArrayList<Integer>(curr));
			prev.clear();
			for(int e:curr) {
				prev.add(e);
			}
			count ++;
		}
		return res;
	}

	public static List<Integer> getRow_I(int rowIndex) {
		 //arr.size = rowIndex + 1;
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<Integer>();
        int count  = 1;
        if(rowIndex == 0) {
        		arr.add(1);
        		return arr;
        }
        if(rowIndex == 1) {
        		arr.add(1);
        		arr.add(1);
        		return arr;
        }
        if(rowIndex > 1) {
        		pre.add(1);
        		pre.add(1);
        }
        while(count!=rowIndex) {
        		arr.clear();
        		arr.add(1);
        		for(int i=0;i<pre.size()-1;i++) {
        			arr.add(pre.get(i) + pre.get(i+1));
        		}
        		arr.add(1);
        		pre.clear();
        		for(int e:arr)
        			pre.add(e);
        		count++;
        }
		return arr;
    }
	
	public static List<List<Integer>> generate_II(int numRows)
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			for(int j=1;j<row.size()-1;j++)
				row.set(j, row.get(j)+row.get(j+1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		List<Integer> r = getRow_I(a);
		List<List<Integer>> result = generate(3);
		for(List<Integer> e:result)
			System.out.println(e);
	}

}
