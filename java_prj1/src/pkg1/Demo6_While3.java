package pkg1;

public class Demo6_While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382;
		int rem = 0;
		int sum = 0;
		int n = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = rem % 2 == 0 ? sum+=rem:sum;
			num = num / 10;
		}
		System.out.println("Sum of even digits of "+ n +" = "+sum);

	}

}
