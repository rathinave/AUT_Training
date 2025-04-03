package pkg1;

import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String pass = sc.next();
		
	     Log_class.ValidLogin(name, pass);
	     sc.close();
	}

}
// standard_user
// secret_sauce