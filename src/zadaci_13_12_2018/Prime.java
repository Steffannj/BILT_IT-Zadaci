package zadaci_13_12_2018;

public class Prime {
	public static void printPrimes(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printPrimes(50, 100);
	}

}
