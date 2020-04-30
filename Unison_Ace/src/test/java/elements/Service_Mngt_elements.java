package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;

public class Service_Mngt_elements
{	
	//public WebDriver driver;

	public Service_Mngt_elements()
	{
		
	}

	By Click_Service_mng_TAB = By.xpath("//a[contains(text(),'Service Management')]");
	By Click_Service_mng_New = By.xpath("//button[@class='btnDefault btnBasic']");
	By Click_Service_mng_New_close = By.xpath("//div[@class='ui scrolling modal transition visible active']//i[@class='close icon']");

	
	public void Click_Service_mng_TAB()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_TAB)).click();
	}
	
	public void Click_Service_mng_New()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New)).click();
	}
	
	public void Click_Service_mng_New_close() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(Click_Service_mng_New_close).click();
	}
	
}
