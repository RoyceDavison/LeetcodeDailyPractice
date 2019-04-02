import java.util.ArrayList;
import java.util.List;

public class SummaryRange {

	public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if(nums == null || nums.length == 0) return res; 
        
        int start = 0;
        for(int i = 1; i < nums.length; i++){
            //说明有断层
            if(nums[i] - 1 != nums[i-1]){
                if(start == (i-1)){
                    //就是让int变成String
                    res.add(nums[start] + "");
                }
                else{
                    res.add(nums[start] + "->" + nums[i-1]);
                }
                start = i;
            }
        }
        //if --> 说明start指向最后一个孤苦伶仃的数 比如[7,9]
        if(start == nums.length - 1) res.add(nums[start] + "");
        //else --> 说明start之前还有同胞
        else res.add(nums[start] + "->" + nums[nums.length - 1]);
        return res;
    }
	
}
