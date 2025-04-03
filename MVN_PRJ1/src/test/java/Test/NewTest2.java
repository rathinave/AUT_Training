package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	
	
				 
	      @BeforeClass
		  public void bc()
		  {
			   System.out.println("In BeforeClass");
		   }
	      
		   @BeforeMethod
		   public void bm()
		   {
			   System.out.println("In BeforeMethod");
		   }
		  
		  @Test
		  public void test1() 
		  {
			  System.out.println("In test1");
		  }
		  
		  @Test
		  public void test2() 
		  {
			  System.out.println("In test2");
		  }
		  
		  @Test
		  public void test3() 
		  {
			  System.out.println("In test3");
		  }
		  
		  @AfterMethod
		  public void am()
		  {
			   System.out.println("In AfterMethod");
		  }
		  
		  @AfterClass
		  public void ac()
		  {
			  System.out.println("In AfterClass");
		  }

  
}
