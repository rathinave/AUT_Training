package pkg1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] num = {5,3,8,2,17};
        for(int i:num)
        {
        	System.out.print(i+" ");
        }
        Arrays.sort(num);
        for(int i:num)
        {
        	System.out.print(i+" ");
        }
        
	}

}
