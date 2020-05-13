package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;

import java.util.concurrent.TimeUnit;


public class Login_Logout_elements
{
	//WebDriver driver;

	//WebDriverWait wait=new WebDriverWait(driver, 35);
	
	public Login_Logout_elements()
	{
		
	}

	By TextBox_username = By.xpath("//input[@placeholder='Login ID']");
	By TextBox_password = By.xpath("//input[@placeholder='Password']");
	By Click_Login = By.xpath("//button[@class='ui large fluid button loginBtn']");
	By Click_Profile = By.xpath("//div[@class='item profileStyle']//img");
	By Click_Logout = By.xpath("//span[contains(text(),'Logout')]");
	

	public void TextBox_username(String text)
	{
		driver.findElement(TextBox_username).sendKeys(text);
	}
	
	public void TextBox_password(String text)
	{
		driver.findElement(TextBox_password).sendKeys(text);
	}
	
	public void Button_Login()
	{
		driver.findElement(Click_Login).sendKeys(Keys.RETURN);
	}
	
	public void Click_My_Profile() throws InterruptedException
	{
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(Click_Profile));
		//new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(Click_Profile));

		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Profile)).click();
		
		/*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement1 = driver.findElement(Click_Profile);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();*/
		WebElement element = driver.findElement(Click_Profile);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void Click_Logout()
	{
		WebElement element = driver.findElement(Click_Logout);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
}
