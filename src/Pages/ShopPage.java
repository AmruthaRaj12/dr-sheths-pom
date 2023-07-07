package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage {
	WebDriver driver;
	By search=By.name("s");
	By sunscreen=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div/div[2]/a");
	By addtocart=By.name("add");
	By checkout=By.name("checkout2");
	

		public ShopPage(WebDriver driver2)
		{
			this.driver=driver2;
		}

	public void search() {
			
			driver.findElement(search).click();
		}
	public void setvalues(String keyword) {
		
			driver.findElement(search).sendKeys(keyword);
		}
		
	
		public void sunscreen() {
		driver.findElement(sunscreen).click();
		
		}
		
		public void addtocart() {
			
			driver.findElement(addtocart).click();
		}
		
		

		public void checkout()  {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();

		}
	
}


