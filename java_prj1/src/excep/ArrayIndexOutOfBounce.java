package excep;

public class ArrayIndexOutOfBounce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 10;
		arr[10] = 100;
		System.out.println(arr[100]);

	}

}
