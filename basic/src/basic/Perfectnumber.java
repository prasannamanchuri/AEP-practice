package basic;

public class Perfectnumber {

	public static void main(String[] args) {
		int n = 28, sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		System.out.println("sum is"+sum);
		if (sum == n) {
			System.out.println(n + " is perfect number");
		}
		else
		{
			System.out.println(n + " is not perfect number");
		}

	}

}