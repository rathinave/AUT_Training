package str;


public class pg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ')
				count++;
		}
		System.out.println(count+1);

	}

}
