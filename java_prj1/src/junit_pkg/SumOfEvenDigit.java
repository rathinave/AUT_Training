package junit_pkg;

public class SumOfEvenDigit {
	int rem = 0;
	int sum = 0;

	 public int sumofDigits(int num) {
		while(num > 0)
		{
			rem = num % 10;
			sum = rem % 2 == 0 ? sum+=rem:sum;
			num = num / 10;
		}
		System.out.println("The Actual Value is : "+sum);
		return sum;
	}
}
