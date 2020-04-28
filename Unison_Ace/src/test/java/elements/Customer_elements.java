package elements;

import static pages.Login_Logout_Page.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customer_elements 
{
	public Customer_elements()
	{
		
	}

	By Click_Customer_TAB = By.xpath("//a[contains(text(),'Customers')]");
	By Click_Search_Entity = By.xpath("//div[@class='default text']");
	By Click_Select_RelationShip_Num = By.xpath("//span[contains(text(),'Relationship Number')]");
	By SearchBox = By.xpath("//input[@name='searchInput']");
	By Click_Search_Button = By.xpath("//button[@class='ui small primary button']");
	By Click_Wrong_radio4 = By.xpath("//tr[4]//td[4]//div[1]//label[1]");
	By Validate_button = By.xpath("//button[@class='ui small primary right floated button tbtnAgDesktop']");
	
	
	
	public void Click_Customer_TAB()
	{
		driver.findElement(Click_Customer_TAB).click();
	}
	
	public void Click_Search_Entity()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agentDesktopMainDiv div.agInputWidthS form.ui.form div.equal.width.fields div.field.agentDesktopSelect:nth-child(1) div.ui.selection.dropdown > i.dropdown.icon"))).click();
	}
}
