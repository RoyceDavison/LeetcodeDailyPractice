//Aug 29 2018
public class CountPrimes {
	public static boolean isPrime(int n) {
        for(int j = 2; (j*j) <= n; j++) {
        		if(n%j == 0) return false;
        }
        return true;
    }
	
	public static int countPrimes(int n) {
		int count = 0;
		for(int i = 2; i<n;i++) {
			if(isPrime(i)) count ++;
		}
        return count;
    }
	
	//上面的版本是 O(n^1.5) 超时
	//下面的版本是可以通过的 O(n log log n)
	public static int Sieve_of_Eratosthenes(int n) {
		boolean[] isPrimes = new boolean[n];
		for(int i=2;i<isPrimes.length;i++) {
			isPrimes[i] = true;
		}
		for(int i=2; i*i<n;i++) {
			if(!isPrimes[i]) {
				continue;
			}
			//这里不需要else
			for(int j = i*i;j<n;j+=i) {
				isPrimes[j] = false;
			}
		}
		int count = 0;
		for(int index = 2; index<n;index++) {
			if(isPrimes[index]) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(2)); //0
		System.out.println(countPrimes(3)); //1
		System.out.println(countPrimes(10)); //4
	}

}
