package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;

public class Agent_desk_element
{	
	//public WebDriver driver;

	public Agent_desk_element()
	{
		
	}

	By Click_Agent_Desktop_TAB = By.xpath("//a[contains(text(),'Agent Desktop')]");
	By Click_Search_Entity = By.xpath("//div[@class='default text']");
	By Click_Select_RelationShip_Num = By.xpath("//span[contains(text(),'Relationship Number')]");
	By SearchBox = By.xpath("//input[@name='searchInput']");
	By Click_Search_Button = By.xpath("//button[@class='ui small primary button']");
	By Click_Correct_radio1 = By.xpath("//tr[1]//td[3]//div[1]//label[1]");
	By Click_Correct_radio2 = By.xpath("//tr[2]//td[3]//div[1]//label[1]");
	By Click_Correct_radio3 = By.xpath("//tr[3]//td[3]//div[1]//label[1]");
	By Click_Correct_radio4 = By.xpath("//tr[4]//td[3]//div[1]//label[1]");
	By Click_Wrong_radio1 = By.xpath("//tr[1]//td[4]//div[1]//label[1]");
	By Click_Wrong_radio2 = By.xpath("//tr[2]//td[4]//div[1]//label[1]");
	By Click_Wrong_radio3 = By.xpath("//tr[3]//td[4]//div[1]//label[1]");
	By Click_Wrong_radio4 = By.xpath("//tr[4]//td[4]//div[1]//label[1]");
	By Validate_button = By.xpath("//button[@class='ui small primary right floated button tbtnAgDesktop']");
	
	
	
	public void Click_Agent_Desktop_TAB()
	{
		driver.findElement(Click_Agent_Desktop_TAB).click();
	}
	
	public void Click_Search_Entity()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agentDesktopMainDiv div.agInputWidthS form.ui.form div.equal.width.fields div.field.agentDesktopSelect:nth-child(1) div.ui.selection.dropdown > i.dropdown.icon"))).click();
	}
	
	public void Click_Select_RelationShip_Num()
	{
		driver.findElement(Click_Select_RelationShip_Num).click();
	}
	
	public void SearchBox(String text)
	{
		driver.findElement(SearchBox).sendKeys(text);
	}

	public void Click_Search_Button()
	{
		driver.findElement(Click_Search_Button).click();
	}
	
	public void Click_Correct_radio1()
	{
		//new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(Click_Correct_radio1)).click();
		//driver.findElement(Click_Correct_radio1).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
		//js.executeScript("arguments[0].click();", Click_Correct_radio1);
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//td[3]//div[1]//label[1]"))).click();
	}
	
	public void Click_Correct_radio2()
	{
		driver.findElement(Click_Correct_radio2).click();
	}

	public void Click_Correct_radio3()
	{
		driver.findElement(Click_Correct_radio3).click();
	}

	public void Click_Correct_radio4()
	{
		driver.findElement(Click_Correct_radio4).click();
	}

	public void Click_Wrong_radio1()
	{
		driver.findElement(Click_Wrong_radio1).click();
	}

	public void Click_Wrong_radio2()
	{
		driver.findElement(Click_Wrong_radio2).click();
	}

	public void Click_Wrong_radio3()
	{
		driver.findElement(Click_Wrong_radio3).click();
	}

	public void Click_Wrong_radio4()
	{
		driver.findElement(Click_Wrong_radio4).click();
	}

	public void Validate_button()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui small primary right floated button tbtnAgDesktop']"))).click();
	}

}
