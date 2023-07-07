package Test;

import org.testng.annotations.Test;

import Pages.ShopPage;

public class ShopTest extends Baseclass {

	@Test
	public void testshop() 
	{
		ShopPage ob=new ShopPage(driver);
		
		ob.search();
		ob.setvalues("sunscreen");
		ob.sunscreen();
		ob.addtocart();
	    ob.checkout();
	   
	}
}
