package oops_abst;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new Canara();
		System.out.println("Canara Bank Rate Of Interest is: "+b.getRateOfInterest()+"%");
		System.out.println();
		b = new ICIC();
		System.out.println("ICIC Bank Rate Of Interest is: "+b.getRateOfInterest()+"%");

	}

}
