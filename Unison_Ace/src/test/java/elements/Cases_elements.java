package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;

public class Cases_elements
{	
	//public WebDriver driver;

	public Cases_elements()
	{

	}

	By Click_Cases_TAB = By.xpath("//a[contains(text(),'Cases')]");
	By Click_Case_New = By.xpath("//button[@class='btnDefault btnBasic']");
	By Click_Case_New_close =  By.xpath("//i[@class='close icon']");



	public void Click_Cases_TAB() throws InterruptedException
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_TAB)).click();
	}

	public void Click_Case_New()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Case_New)).click();
	}
	
	public void Click_Case_New_close() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(Click_Case_New_close).click();
	}

}
