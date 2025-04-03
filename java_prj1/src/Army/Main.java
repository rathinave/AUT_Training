package Army;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("andaman and nicobar"); 
		al.add("mumbai");
		al.add("jammu and kashmir"); 
		al.add("chandigarh"); 
		al.add("puducherry"); 
		al.add("goa"); 
		al.add("pune"); 
		al.add("tamil nadu");
		
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
	            
			    System.out.println("Enter Your Name : ");
				String name = sc.next();
				
			    System.out.println("Enter Your Age : ");
				int age =  sc.nextInt();
				
				System.out.println("Enter Your Location : ");
				String location = sc.next();
				
				System.out.println("Are you Specially abled : yes or no");
				String s = sc.next();
				
				if(s.equals("no")) 
				{
					Armed_Force.test(name, age, location, al);
				}
				else 
				{
					System.out.println("Your Not Eligible for Armed Force !");
					
				}
		}

	}
    
}
