import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
	public static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		for(int i = 0; i < intervals.size(); i++) {
			int first_end = intervals.get(i).end;
			int second_start = intervals.get(i+1).start;
			
			int first = intervals.get(i).start;
			int end = intervals.get(i+1).end;
			if(first_end >= second_start) {
				res.add(new Interval(first,end));
			}
			res.add(intervals.get(i));
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//该变量名字啊你
	}

}
