package oops_poly;

public class poly_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b = new citie_bank();
		System.out.println("Citie_R.O.I = "+b.getRateOfIntrest()+"\n");
		
		b = new canara_bank();
		System.out.println("Canara_R.O.I = "+b.getRateOfIntrest()+"\n");
		
		b = new bob_bank();
		System.out.println("Bob_R.O.I = "+b.getRateOfIntrest());
		
	}

}
