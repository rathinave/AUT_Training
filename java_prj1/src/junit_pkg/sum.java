package junit_pkg;

public class sum {
	int s = 0;
	public int getsum(int[] a)
	{
		for(int i: a)
		{
			s+=i;
		}
		return s;
	}

}
