package pkg1;

public class Demo7_While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382;
		int rem =0;
		int sum = 0;
		int n = num;
		int pos=1;
		while(num > 0)
		{
			rem = num % 10;
			sum = pos % 2 != 0 ? sum += rem:sum;
			num = num / 10;
			pos++;
		}
		System.out.println("Sum of Odd Positions of "+ n +" = "+ sum);

	}

}
