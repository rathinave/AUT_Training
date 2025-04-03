package oops_poly;

public class MathOpp_Poly {
	public int add(int a,int b)
	{
		return  a+b;
	} 
	public int add(int a,int b,int c)
	{
		return  a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOpp_Poly mp = new MathOpp_Poly();
		System.out.println("Add : "+mp.add(7,10));
		System.out.println("Add : "+mp.add(7,10,10));

	}

}
