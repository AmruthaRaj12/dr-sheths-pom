package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountpage {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By createaccnt=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[1]/button/span/span");
	By fstname=By.id("FirstName");
	By lstname=By.id("LastName");
	By mail=By.name("customer[email]");
	By pass=By.name("customer[password]");
	By submit=By.xpath("//*[@id=\"create_customer\"]/div/div/div[2]/ul/li[3]/div/input");
	
	public CreateAccountpage(WebDriver driver2) {

	this.driver=driver2;
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	public void createaccnt()
	{
		driver.findElement(createaccnt).click();
	}
	public void setvalues(String firstname,String lastname,String email,String password)
	{
		driver.findElement(fstname).sendKeys(firstname);
		driver.findElement(lstname).sendKeys(lastname);
		driver.findElement(mail).sendKeys(email);
		driver.findElement(pass).sendKeys(password);

	}
	public void submit()
	{
		driver.findElement(submit).click();
		driver.findElement(login).click();
	}
	
	}
	



