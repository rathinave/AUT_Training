package pkg1;

import java.util.Scanner;

public class Demo9_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] fact_array = new int[5][2];
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			int fact = 1;
			for(int j=1; j<=num; j++)
			{
				fact = fact*j;
			}
			fact_array[i][0] = num;
			fact_array[i][1] = fact;
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(fact_array[i][0]+" --> "+fact_array[i][1]);
		}
		
		sc.close();
	}

}
