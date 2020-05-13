package elements;

import static pages.Login_Logout_Page.driver;
import static pages.Login_Logout_Page.actions;

import java.util.concurrent.TimeUnit;

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
	///
	By Click_Customer_FinancialAccounts = By.xpath("//span[contains(text(),'Financial Accounts')]");
	By Click_Customer_CustomerLogs = By.xpath("//span[contains(text(),'Customer Logs')]");
	By Click_Customer_Activity = By.xpath("//span[contains(text(),'Activity')]");
	By Click_Customer_CustInteractions= By.xpath("//span[contains(text(),'Customer Interactions')]");
	///
	By Click_Cus_Service_req_NEW = By.xpath("//button[contains(text(),'New')]");
	By Click_Cus_Service_req_NEW_close =  By.xpath("//i[@class='close icon']");
	By Click_Cus_Service_req_NEW_serv_type = By.xpath("//a[@id='rdts1_trigger']");
	By Click_Cus_Service_req_NEW_curr_Acc = By.xpath("//*[contains(@id,'-0-0-0_li')]//i[@class='toggle collapsed']"); //finding partial ID
	By Click_Cus_Service_req_NEW_Address_upd = By.xpath(" //input[contains(@id,'-0-0-0-1')]");//finding partial ID
	By Click_Cus_Service_req_NEW_priority_low = By.xpath("//body[contains(@class,'dimmable dimmed blurring scrolling')]/div[contains(@class,'ui top aligned page modals dimmer transition visible active')]/div[contains(@class,'ui scrolling modal transition visible active')]/div[contains(@class,'scrolling content')]/div/div[contains(@class,'rsw_2Y')]/div[contains(@class,'rsw_3G')]/div/div[contains(@class,'widget')]/div[contains(@class,'container fullContainer')]/div[contains(@class,'widgetOuterDiv')]/div[contains(@class,'ui attached segment widget-body')]/div[contains(@class,'form-body')]/div[contains(@class,'accordion ui')]/div/div[contains(@class,'content active expand')]/div[contains(@class,'ui doubling stackable three column grid')]/div[contains(@class,'row')]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]");
	By Click_Cus_Service_req_NEW_Acc_card_loan_nos = By.xpath("//div[contains(text(),'AC')]");
	By Click_Cus_Service_req_NEW_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000240659')]");
	By Click_Cus_Service_req_NEW_Acc_PO_BOX_nos = By.xpath("//input[@id='PO_BOX']");
	By Click_Cus_Service_req_NEW_Acc_Mobile_nos = By.xpath("//input[@id='MOBILE_NUM']");
	By Click_Cus_Service_req_NEW_Acc_Hit_SAVE = By.xpath("//button[contains(text(),'Save')]");
	By Click_Cus_Service_req_NEW_Acc_Hit_Reset = By.xpath("//button[contains(text(),'Reset')]");
	By Click_Cus_Service_req_NEW_Channel_field = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[3]");
	By Click_Cus_Service_req_NEW_Channel_call_center = By.xpath("//span[contains(text(),'Call Center')]");

	//Cases elements

	By Click_Cases_tab = By.xpath("//a[@class='tabTitle']//span[contains(text(),'Cases')]");
	By Click_Cus_Cases_New_Acc_card_loan_nos = By.xpath("//div[contains(text(),'AC')]");
	By Click_Cus_Cases_New_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000309579')]");
	By Click_Cus_Cases_New_Acc_Hit_SAVE = By.xpath("//button[contains(text(),'Save')]");
	By Click_Cus_Cases_New_Acc_Hit_Reset = By.xpath("//button[contains(text(),'Reset')]");
	By Click_Cus_Cases_New_close =  By.xpath("//i[contains(@class,'close icon')]");
	By Click_Cus_Cases_New_channel_dropdown =  By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[2]");
	By Click_Cus_Cases_New_channel_call_center =  By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'Call Center')]");

	By Click_Cus_Cases__NEW_Complaint_type = By.xpath("//*[contains(@id,'_trigger')]");
	By Click_Cus_Cases__NEW_curr_Acc = By.xpath("//*[contains(@id,'-0-0-0_li')]//i[@class='toggle collapsed']"); //finding partial ID
	By Click_Cus_Cases__NEW_Amount_on_hold = By.xpath("//input[contains(@id,'-0-0-0-0')]");//finding partial ID
	By Click_Cus_Cases_New_priority_dropdown = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[1]");
	By Click_Cus_Cases_New_priority_dropdown_low = By.xpath("//span[contains(text(),'Low')]");

	/////Customer-Grid_filters////////
	By Click_Cus_grid_Filter_FullName_HoverOver = By.xpath("//span[contains(text(),'Full Name')]");
	By Click_Cus_grid_Filter_FullName_dropdown = By.xpath("//div[@class='ag-header-cell ag-header-cell-sortable ag-column-hover']//span[@class='ag-icon ag-icon-menu']");
	By Click_Cus_grid_Filter_secondTabFilter = By.xpath("//span[@class='ag-tab']//span[@class='ag-icon ag-icon-filter']");
	By Click_Cus_grid_Filter_secondTabFilter_enternNAme = By.xpath("//div[@class='ag-filter-body']//input[@placeholder='Filter...']");
	By Click_Cus_grid_Filter_thirdTabFilter = By.xpath("//span[@class='ag-icon ag-icon-columns']");
	By Click_Cus_grid_Filter_thirdTabFilter_clickLoginID = By.xpath("//span[@class='ag-column-tool-panel-column-label'][contains(text(),'Login Id')]");
	//By Click_Cus_grid_Filter_ = By.xpath("//span[contains(text(),'Full Name')]");


	public void Click_Customer_TAB()
	{
		driver.findElement(Click_Customer_TAB).click();
	}

	public void Click_Cust_RelationShipNum()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cust_RelationShipNum)).click();
	}
	////////
	public void Click_Customer_FinancialAccounts()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement1 = driver.findElement(Click_Customer_FinancialAccounts);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}
	
	public void Click_Customer_CustomerLogs()
	{
		driver.findElement(Click_Customer_CustomerLogs).click();
	}
	
	public void Click_Customer_Activity()
	{
		driver.findElement(Click_Customer_Activity).click();
	}
	
	public void Click_Customer_CustInteractions()
	{
		driver.findElement(Click_Customer_CustInteractions).click();
	}
	/////

	public void Click_Cus_Service_req_NEW() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement1 = driver.findElement(Click_Cus_Service_req_NEW);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}

	public void Click_Cus_Service_req_NEW_serv_type_curr_Acc_address_upd()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_serv_type)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_curr_Acc)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_Address_upd)).click();
	}

	public void Click_Cus_Service_req_NEW_priority_low()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_priority_low)).click();
		driver.findElement(By.xpath("//div[contains(@class,'visible menu transition')]//div[2]")).click();
	}

	public void Click_Cus_Service_req_NEW_Channel_field_Call_Center()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Service_req_NEW_Channel_field)).click();
		driver.findElement(Click_Cus_Service_req_NEW_Channel_call_center).click();
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

	public void Enter_Cus_Service_req_NEW_Acc_Mobile_nos(String text)
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
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(Click_Cases_tab).click();
		WebElement myelement1 = driver.findElement(Click_Cases_tab);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}

	public void Click_Cus_Cases_NEW()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement1 = driver.findElement(By.xpath("//button[contains(text(),'New')]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement1);
		myelement1.click();
	}

	public void Click_Cus_Cases_NEW_Complaint_type_Amount_onhold()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases__NEW_Complaint_type)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases__NEW_curr_Acc)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases__NEW_Amount_on_hold)).click();
	}

	public void Click_Cus_Cases_NEW_priority_low()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_priority_dropdown)).click();
		driver.findElement(Click_Cus_Cases_New_priority_dropdown_low).click();
	}

	public void Click_Cus_Cases_NEW_Channel_field_Call_Center()
	{
		/*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Cus_Cases_New_channel_dropdown);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
		
		WebElement myelement1 = driver.findElement(Click_Cus_Cases_New_channel_call_center);
		wait.until(ExpectedConditions.elementToBeClickable(myelement1));
		myelement.click();*/
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_channel_dropdown)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_channel_call_center)).click();
	}

	public void Click_Cus_Cases_New_Acc_card_loan_nos()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_Acc_card_loan_nos)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cus_Cases_New_Acc_select_LOAN_nos)).click();
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
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_Cases_New_close).click();
	}

	////////////------Grid Filters--------/////////////////

	public void Click_Cus_grid_Filter_FullName_HoverOver()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		actions = new Actions(driver);
		WebElement hoverFullname = driver.findElement(Click_Cus_grid_Filter_FullName_HoverOver);
		actions.moveToElement(hoverFullname).perform();
		System.out.println("Done Mouse hover on 'Rock' from Menu");
	}

	public void Click_Cus_grid_Filter_FullName_dropdown()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_grid_Filter_FullName_dropdown).click();
	}

	public void Click_Cus_grid_Filter_secondTabFilter()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_grid_Filter_secondTabFilter).click();
	}

	public void Click_Cus_grid_Filter_secondTabFilter_enternNAme(String text)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_grid_Filter_secondTabFilter_enternNAme).sendKeys(text);
	}

	public void Click_Cus_grid_Filter_thirdTabFilter()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_grid_Filter_thirdTabFilter).click();
	}

	public void Click_Cus_grid_Filter_thirdTabFilter_clickLoginID()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Cus_grid_Filter_thirdTabFilter_clickLoginID).click();
	}

}
