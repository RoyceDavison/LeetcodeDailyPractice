import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> arr = new ArrayList<String>();
		for(int i=1;i<=n;i++) {
			if(i%5 == 0 && i%3==0) {
				arr.add("FizzBuzz");
			}
			else if(i%5 == 0) {
				arr.add("Buzz");
			}
			else if(i%3==0) {
				arr.add("Fizz");
			}
			else {
				arr.add(String.valueOf(i));
			}
		}
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = fizzBuzz(2);
		for(String s:ls)
			System.out.println(s);
	}

}
