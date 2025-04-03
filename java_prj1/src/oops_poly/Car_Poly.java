package oops_poly;

public class Car_Poly extends Vechicle {
	public void start()
	{
		System.out.println("Car has self-starter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle v = new Vechicle();
		v.start();
		Car_Poly  cp = new Car_Poly();
		cp.start();
	}

}
