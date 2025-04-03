package oops_encap;

public class bank_account {
	private String name;
	private int acc_no,balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank_Account [Name=" + name + ", Acc_no=" + acc_no + ", Balance=" + balance + "]";
	}

}
