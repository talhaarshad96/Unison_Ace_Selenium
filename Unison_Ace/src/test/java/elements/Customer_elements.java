package elements;

import static pages.Login_Logout_Page.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customer_elements 
{
	public Customer_elements()
	{

	}

	By Click_Customer_TAB = By.xpath("//a[contains(text(),'Customers')]");
	By Click_Cust_RelationShipNum = By.xpath("//a[contains(text(),'619')]");
	By Click_Cus_Service_req_NEW = By.xpath("//button[@class='btnDefault btnBasic']");
	By Click_Cus_Service_req_NEW_close =  By.xpath("//i[@class='close icon']");
	By Click_Cus_Service_req_NEW_serv_type = By.xpath("//a[@id='rdts1_trigger']");
	By Click_Cus_Service_req_NEW_curr_Acc = By.xpath("//*[contains(@id,'-0-0-0_li')]//i[@class='toggle collapsed']"); //finding partial ID
	By Click_Cus_Service_req_NEW_Address_upd = By.xpath(" //input[contains(@id,'-0-0-0-1')]");//finding partial ID
	By Click_Cus_Service_req_NEW_priority_low = By.xpath("//body[contains(@class,'dimmable dimmed blurring scrolling')]/div[contains(@class,'ui top aligned page modals dimmer transition visible active')]/div[contains(@class,'ui scrolling modal transition visible active')]/div[contains(@class,'scrolling content')]/div/div[contains(@class,'rsw_2Y')]/div[contains(@class,'rsw_3G')]/div/div[contains(@class,'widget')]/div[contains(@class,'container fullContainer')]/div[contains(@class,'widgetOuterDiv')]/div[contains(@class,'ui attached segment widget-body')]/div[contains(@class,'form-body')]/div[contains(@class,'accordion ui')]/div/div[contains(@class,'content active expand')]/div[contains(@class,'ui doubling stackable three column grid')]/div[contains(@class,'row')]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]");
	By Click_Cus_Service_req_NEW_set_Date = By.xpath("//input[@id='CREATED_ON']");
	By Click_Cus_Service_req_NEW_Acc_card_loan_nos = By.xpath("//div[@class='ui search selection upward dropdown']//i[@class='dropdown icon']");
	By Click_Cus_Service_req_NEW_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000240659')]");
	By Click_Cus_Service_req_NEW_Acc_PO_BOX_nos = By.xpath("//input[@id='PO_BOX']");
	By Click_Cus_Service_req_NEW_Acc_Mobile_nos = By.xpath("//input[@id='MOBILE_NUM']");
	By Click_Cus_Service_req_NEW_Acc_Hit_SAVE = By.xpath("//button[contains(text(),'Save')]");
	By Click_Cus_Service_req_NEW_Acc_Hit_Reset = By.xpath("//button[contains(text(),'Reset')]");

	//Cases elements
	
	By Click_Cases_tab = By.xpath("//a[@class='tabTitle']//span[contains(text(),'Cases')]");
	By Click_Cus_Cases_New_Acc_card_loan_nos = By.xpath("//div[contains(text(),'AC')]");
	By Click_Cus_Cases_New_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000309579')]");
	By Click_Cus_Cases_New_Acc_Hit_SAVE = By.xpath("//button[contains(text(),'Save')]");
	By Click_Cus_Cases_New_Acc_Hit_Reset = By.xpath("//button[contains(text(),'Reset')]");
	By Click_Cus_Cases_New_close =  By.xpath("//i[contains(@class,'close icon')]");
	
	
	public void Click_Customer_TAB()
	{
		driver.findElement(Click_Customer_TAB).click();
	}

	public void Click_Cust_RelationShipNum()
	{
		//driver.findElement(Click_Cust_RelationShipNum).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'619')]"))).click();

	}

	public void Click_Cus_Service_req_NEW()
	{
		//driver.findElement(Click_Cus_Service_req_NEW).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'New')]"))).click();

		/*WebElement element = driver.findElement(By.xpath("//button[@class='btnDefault btnBasic']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/

		WebElement myelement1 = driver.findElement(By.xpath("//button[contains(text(),'New')]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();

		//WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.body:nth-child(2) div.widget div.ui.stackable.vertically.divided.grid div.row div.ten.wide.column:nth-child(3) div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.tabCustomerHub div.ui.segment div.tabContainer div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body div.accordion.ui.accordionMain div.content.active.expand div.container.fullContainer.accordionWidget div.widgetOuterDiv div.ui.attached.segment.widget-body div.ui.segment div.tabContainer div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body div.ui.grid.ListViewHeader div.row div.right.aligned.right.floated.six.wide.column div.ui.mini.one.buttons div.actionBtnMainDiv > button.btnDefault.btnBasic")));

		/*WebElement element = driver.findElement(By.xpath("//button[contains(text(),'New')]")); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(element).click().perform();*/

	}

	public void Click_Cus_Service_req_NEW_serv_type_curr_Acc_address_upd()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_serv_type)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_curr_Acc)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_Address_upd)).click();
		//driver.findElement(Click_Cus_Service_req_NEW_serv_type).click();
		//	driver.findElement(Click_Cus_Service_req_NEW_curr_Acc).click();
		//	driver.findElement(Click_Cus_Service_req_NEW_Address_upd).click();
	}

	public void Click_Cus_Service_req_NEW_priority_low()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_priority_low)).click();
		driver.findElement(By.xpath("//div[contains(@class,'visible menu transition')]//div[2]")).click();
	}
	public void Click_Cus_Service_req_NEW_set_Date()
	{
		WebElement el = driver.findElement(Click_Cus_Service_req_NEW_set_Date);
		el.click();
		el.sendKeys(Keys.ENTER);
		el.sendKeys(Keys.ENTER);
		el.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'form-body')]")).click();
	}

	public void Enter_Cus_Service_req_NEW_Acc_card_loan_nos()
	{
		driver.findElement(Click_Cus_Service_req_NEW_Acc_card_loan_nos).click();
		driver.findElement(Click_Cus_Service_req_NEW_Acc_select_LOAN_nos).click();
	}

	public void Enter_Cus_Service_req_NEW_Acc_PO_BOX_nos(String text)
	{
		driver.findElement(Click_Cus_Service_req_NEW_Acc_PO_BOX_nos).sendKeys(text);
	}

	public void Enter_Cus_Service_req_NEW_Acc_PO_Mobile_nos(String text)
	{
		driver.findElement(Click_Cus_Service_req_NEW_Acc_Mobile_nos).sendKeys(text);
	}

	public void Click_Cus_Service_req_NEW_Acc_Hit_SAVE()
	{
		driver.findElement(Click_Cus_Service_req_NEW_Acc_Hit_SAVE).click();
	}

	public void Click_Cus_Service_req_NEW_Acc_Hit_Reset()
	{
		driver.findElement(Click_Cus_Service_req_NEW_Acc_Hit_Reset).click();
	}

	public void Click_Cus_Service_req_NEW_close()
	{
		driver.findElement(Click_Cus_Service_req_NEW_close).click();
	}
	
	//////////----------------------------CASES-----------------/////////////////////////
	
	public void Click_Cases_TAB() throws InterruptedException
	{
		Thread.sleep(4000);
		//driver.findElement(Click_Cases_tab).click();
		WebElement myelement1 = driver.findElement(Click_Cases_tab);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}
	
	public void Click_Cus_Cases_New_NEW()
	{
		WebElement myelement1 = driver.findElement(By.xpath("//button[contains(text(),'New')]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}
	
	public void Click_Cus_Cases_New_Acc_card_loan_nos()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_Acc_card_loan_nos)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_Acc_select_LOAN_nos)).click();

		//driver.findElement(Click_Cus_Cases_New_Acc_card_loan_nos).click();
		//driver.findElement(Click_Cus_Cases_New_Acc_select_LOAN_nos).click();
	}

	
	public void Click_Cus_Cases_New_Acc_Hit_SAVE()
	{
		driver.findElement(Click_Cus_Cases_New_Acc_Hit_SAVE).click();
	}

	public void Click_Cus_Cases_New_Acc_Hit_Reset()
	{
		driver.findElement(Click_Cus_Cases_New_Acc_Hit_Reset).click();
	}

	public void Click_Cus_Cases_New_close() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(Click_Cus_Cases_New_close).click();
	}

}
