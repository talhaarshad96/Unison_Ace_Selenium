package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.Login_Logout_elements;
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
}
