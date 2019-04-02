//Aug.28.2018
public class plusOne {
	public static int[] plusOne_simple(int[] digits) {
		int j = digits.length-1;
		for(int i=0;i<digits.length;i++) {
			if(digits[j] != 9) {
				digits[j] ++;
				return digits;
			}
			digits[j] = 0;
			j--;
		}
		int[] digits_allNine = new int[digits.length+1];
		digits_allNine[0] = 1;
		return digits_allNine;
	}

	public static int[] plusOne_ownVersion(int[] digits) {
		boolean flag = false;
		for(int i = 0; i<digits.length;i++) {
			if (digits[i] != 9) {
				flag = true;
			}
		}
		//There at least a number in the array that is not 9
		if(flag) {
			if(digits[digits.length-1] !=9) {
				digits[digits.length-1] ++;
			}
			else {
				digits[digits.length-1] = 0;
				for(int i=digits.length-1;i>0;i--) {
					if(digits[i-1] == 9) {
						digits[i-1] = 0;
					}
					else {
						digits[i-1] ++;
						return digits;
					}
				}
			}
		}
		//all numbers in the array are 9
		else {
			int[] arr = new int[digits.length+1];
			arr[0] = 1;
			return arr;
		}
		return digits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {8,9,9,9};
		test = plusOne_simple(test);
		for(int e:test)
			System.out.print(e);
	}

}
