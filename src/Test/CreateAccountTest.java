package Test;

import org.testng.annotations.Test;

import Pages.CreateAccountpage;

public class CreateAccountTest extends Baseclass {
	@Test
	public void testlogin()
	{
		CreateAccountpage ob=new CreateAccountpage(driver);
		ob.login();
		ob.createaccnt();
		ob.setvalues("Amritha", "R", "kizhakkidathuveedukv12@gmail.com@gmail.com","ASFG123");
		ob.submit();
		
		
}
}
