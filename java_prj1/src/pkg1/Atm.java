package pkg1;

import java.util.Scanner;

public class Atm {
      static int Balance = 5000; 
      
      static int balance()
      {
    	  return Balance;
      }
      
      static int withdraw(int W_amt)
      {

			if(W_amt <= Balance) {

				Balance = Balance - W_amt;
				return 1;
			}
			else
				return 0;
      }
      
      static int deposit(int D_amt)
      { 
			Balance = Balance + D_amt;
			return 1;
      }
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int Pin_num = 1717;
		System.out.println("Enter the PIN Number : ");
		int PIN = sc.nextInt();
		boolean flag = true;
		if(PIN == Pin_num)
			{
               do {
            	   System.out.println("!--------------------->> Choose the Menu <<------------------!");
            	   System.out.println("1 For Balance Check\n2 For Withdraw Money\n3 For Deposit Money\n4 For Exit");
                   int choose = sc.nextInt();
				   switch(choose)
				   {
				
				      case 1:
				    	  
					     System.out.println("Your Balance = "+balance());
					     
					  break;
					
				      case 2:
				    	  
		    	         System.out.println("Enter Amount = ");
		    	         int x = sc.nextInt();
		    	         if(withdraw(x)!=0)
				         System.out.println("***************Collect Your Money****************");
		    	         else
					     System.out.println("***************Insufficient Balance***************");
		    	         
					  break;
					
				      case 3:
				    	  
		    	         System.out.println("Enter Amount = ");
		    	         int y = sc.nextInt();
		    	         deposit(y);
		    	         System.out.println("***************Your Money Added Successfully************");
		    	         
					  break;
					
				      case 4:
				    	  
					     flag = false;
					     System.out.println("***************Thank you for Visiting us***************");
					     
					  break;
				}
				   
			}while(flag);    
		}
		else
			System.out.println("!------------------>> Sorry ! You Entered Wrong PIN Number <<------------------!");
		sc.close();
		
	
		}
}
