package opps_pkg;

public class Bank_acc {
	int acc_no ;
	String acc_name;
	int balance;
	
	public Bank_acc(int a, String b, int c)
	{
		acc_no = a;
		acc_name = b;
		balance = c;
	}
	public void show_details()
	{
		System.out.println("Account_No : "+acc_no);
		System.out.println("Account_Name : "+acc_name);
		System.out.println("Balance = "+balance);
		System.out.println("-------------------------------------------------------------------------------------------------------");

	}
	public void deposit(int d)
	{
		balance = balance + d;
		System.out.println("Money Added Successfully !!!");
		System.out.println("-------------------------------------------------------------------------------------------------------");

	}
	public void withdraw(int w)
	{
		if(w <= balance)
		{
			balance = balance - w;
			System.out.println("Collect Your Money !!!");

		}
		else
			System.out.println("Insufficient Balance !!!");
		System.out.println("-------------------------------------------------------------------------------------------------------");

	}

}
