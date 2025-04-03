package pkg1;

public class Demo5_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382;
		int rem = 0;
		int sum = 0;
		int n = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of digits of "+ n +" = "+sum);
	}

}
