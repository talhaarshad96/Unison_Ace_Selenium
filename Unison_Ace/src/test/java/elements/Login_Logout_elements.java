package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;


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
	By Click_Profile = By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[1]/div/div/div[3]/div/div[2]/div/span/img");////div[@class='item profileStyle']//img
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
	
	public void Click_My_Profile()
	{
		//WebElement clickProf = wait.until(ExpectedConditions.visibilityOfElementLocated(Click_Profile));
		//clickProf.click();
		//driver.findElement(Click_Profile).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.ui.stackable.grid.menu.navigation-header div.stretched.row div.right.aligned.four.wide.column div.ui.quick-actions.quickActionsHead.menu div.item.profileStyle:nth-child(2) div.ui.floating.dropdown.pointing.dropdown.top.right span:nth-child(1) > img:nth-child(1)"))).click();
	}
	
	public void Click_Logout()
	{
		driver.findElement(Click_Logout).click();
	}


	
}
