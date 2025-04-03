package opps_pkg;

import java.util.Scanner;

public class mainarray_acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		Bank_acc[] list = new Bank_acc[3];
		for(int i=0; i<list.length; i++)
		{
			int a = sc.nextInt();
			String b = sc.next();
			int c = sc.nextInt();
			list[i] = new Bank_acc(a,b,c);
		}
		list[0].show_details();
		sc.close();
	}

}
