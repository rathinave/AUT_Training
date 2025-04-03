package excep;

public class MultipleExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int c= 0;
		try {

			 arr[20] = 17;
			c = 10/0;
			System.out.println(c);
			
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.err.println("ArrayIndexOutOfBoundsException catch");
		}
		catch(Exception e)
		{
			System.err.println("In catch");
		}

	}

}
