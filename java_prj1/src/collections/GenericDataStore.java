package collections;

public class GenericDataStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStore<Integer> intstore = new DataStore<>();
		intstore.setdata(200);
		System.out.println(intstore.getdata());
		
		DataStore<String> stringstore = new DataStore<>();
		stringstore.setdata("Hello..!");
		System.out.println(stringstore.getdata());

	}

}
