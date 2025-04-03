package opps_pkg;


public class Main_acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_acc ba = new Bank_acc(1234,"Rathinavel",0);
		
		ba.show_details();
		
		ba.deposit(15000);

		ba.show_details();

		ba.withdraw(5000);

		ba.show_details();

	}

}
