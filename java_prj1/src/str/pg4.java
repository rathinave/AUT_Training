package str;

public class pg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi Surya, when your visiting us";
		int st = 0;
		int ed = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'S')
				st = i;
			if(s.charAt(i) == ',')
				ed = i;
		}
		s = s.substring(st,ed);
		System.out.println(s);

	}

}
