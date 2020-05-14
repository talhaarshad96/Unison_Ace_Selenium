package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Login_Logout_Page.driver;

import java.util.concurrent.TimeUnit;

public class Service_Mngt_elements
{	
	//public WebDriver driver;

	public Service_Mngt_elements()
	{
		
	}

	By Click_Service_mng_TAB = By.xpath("//a[contains(text(),'Service Management')]");
	By Click_Service_mng_New = By.xpath("//button[@class='btnDefault btnBasic']");
	By Click_Service_mng_New_close = By.xpath("//div[@class='ui scrolling modal transition visible active']//i[@class='close icon']");
	////
	By Click_Service_mng_New_CustSearch_nonCust_dropDown = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[1]");
	By Click_Service_mng_New_Cust_fromDropdown = By.xpath("//div[contains(@class,'selected item')]//span[contains(@class,'text')][contains(text(),'Customer')]");
	By Click_Service_mng_New_CustCustSearch_FullName = By.xpath("//input[@id='FULL_NAME']");
	By Click_Service_mng_New_CustCustSearch_SearchButton = By.xpath("//button[contains(@class,'ui primary button')]");
	By Click_Service_mng_New_CustCustSearch_Select_brandon = By.xpath("//div[contains(text(),'Brandon')]");//for fullName brandon
	By Click_Service_mng_New_PressNEXT = By.xpath("//button[contains(@class,'ui icon positive right labeled button')]");
	By Click_Service_mng_New_priority_dropdown = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[1]");
	By Click_Service_mng_New_priority_dropdown_low = By.xpath("//span[contains(text(),'Low')]");
	By Click_Service_mng_New_serv_type = By.xpath("//a[contains(@id,'_trigger')]");//*[contains(@id,'_trigger')]
	By Click_Service_mng_New_curr_Acc = By.xpath("//*[contains(@id,'-0-0-0_li')]//i[@class='toggle collapsed']"); //finding partial ID
	By Click_Service_mng_New_Address_upd = By.xpath("//input[contains(@id,'-0-0-0-1')]");//finding partial ID
	By Click_Service_mng_New_channel_dropdown =  By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[3]");
	By Click_Service_mng_New_channel_call_center =  By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'Call Center')]");
	By Click_Service_mng_New_Acc_card_loan_nos = By.xpath("//div[contains(text(),'AC')]");
	By Click_Service_mng_New_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000306575')]");
	By Click_Service_mng_New_Acc_PO_BOX_nos = By.xpath("//input[@id='PO_BOX']");
	By Click_Service_mng_New_Acc_Mobile_nos = By.xpath("//input[@id='MOBILE_NUM']");
	By Click_Service_mng_New_Hit_SAVE = By.xpath("//button[contains(@class,'ui primary button')]");

	By Click_Service_mng_Setting_list = By.xpath("//i[@class='settings icon']");
	By Click_Service_mng_Setting_list_New = By.xpath("//div[contains(text(),'New')]");
	By Click_Service_mng_Setting_list_New_enterName = By.xpath("//input[@placeholder='List Name']");
	By Click_Service_mng_Setting_list_New_enterName_SAVE = By.xpath("//button[@class='ui primary button']");
	By Click_Service_mng_Setting_list_delete = By.xpath("//div[contains(text(),'Delete')]");
	By Click_Service_mng_Setting_list_delete_SURE = By.xpath("//button[@class='ui green button']");
	
	By Click_Service_mng_Setting_Columns = By.xpath("//span[contains(text(),'Columns')]");	
	By Click_Service_mng_Setting_Columns_Status = By.xpath("//span[@class='ag-column-tool-panel-column-label'][contains(text(),'Status')]");
	By Click_Service_mng_Setting_Columns_Profile = By.xpath("(//span[@class='ag-column-tool-panel-column-label'][contains(text(),'Product')])[1]");
	
	By Click_Service_mng_Setting_Filter = By.xpath("//span[contains(text(),'Filters')]");
	
	By Click_Service_mng_Setting_Filter_addFilter = By.xpath("//button[@class='ui mini button']");
	By Click_Service_mng_Setting_Filter_addFilter_Field = By.xpath("(//div[@class='ui centered divided three column grid']//i[@class='dropdown icon'])[1]");
	By Click_Service_mng_Setting_Filter_addFilter_Field_PRODUCT = By.xpath("(//div[@class='ui left center popup transition visible gridPopUp']//span[contains(text(),'Product')])[1]");
	By Click_Service_mng_Setting_Filter_addFilter_Operator = By.xpath("(//div[@class='ui centered divided three column grid']//i[@class='dropdown icon'])[2]");
	By Click_Service_mng_Setting_Filter_addFilter_Operator_Equals = By.xpath("(//div[@class='visible menu transition']//span[contains(text(),'Equals')])[1]");
	By Click_Service_mng_Setting_Filter_addFilter_Value = By.xpath("//div[@name='name']//i[@class='dropdown icon']");
	By Click_Service_mng_Setting_Filter_addFilter_Value_ATMcards = By.xpath("//span[contains(text(),'ATM Cards')]");
	By Click_Service_mng_Setting_Filter_addFilter_Save = By.xpath("//button[@class='ui primary button']");
	//
	By Click_Service_mng_RequestNo = By.xpath("//a[contains(text(),'SR000001576')]");
	
	
	public void Click_Service_mng_TAB()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_TAB)).click();
	}
	
	public void Click_Service_mng_New()
	{
		WebElement element = driver.findElement(Click_Service_mng_New);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New)).click();
	}
	
	public void Click_Service_mng_New_CustSearch_Select_Type_CustomerType()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_CustSearch_nonCust_dropDown)).click();
		driver.findElement(Click_Service_mng_New_Cust_fromDropdown).click();
	}
	
	public void Click_Service_mng_New_CustSearch_fullNameField(String text)
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_CustCustSearch_FullName)).sendKeys(text);
	}
	
	public void Click_Service_mng_New_CustSearch_SearchButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_CustCustSearch_SearchButton)).click();
	}
	
	public void Click_Service_mngs_New_CustCustSearch_Select_fromSearchGRID()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_CustCustSearch_Select_brandon)).click();
	}
	
	public void Click_Service_mngs_New_CustCustSearch_NextButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_PressNEXT)).click();
	}
	
	public void Click_Service_mngs_NEW_priority_low() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Service_mng_New_priority_dropdown);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_priority_dropdown_low)).click();
		//driver.findElement(Click_Service_mng_New_priority_dropdown_low).click();
	}
	
	public void Click_Service_mngs_New_Complaint_type_Address_Update() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_serv_type)).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_curr_Acc)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_Address_upd)).click();
	}
	
	public void Click_Service_mngs_New_Channel_Call_Center()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_channel_dropdown)).click();
		driver.findElement(Click_Service_mng_New_channel_call_center).click();
	}
	
	public void Click_Service_mngs_New_Acc_card_loan_nos()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_Acc_card_loan_nos)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_Acc_select_LOAN_nos)).click();
	}
	
	public void Click_Service_mngs_New_Acc_PO_BOX_nos(String text)
	{
		driver.findElement(Click_Service_mng_New_Acc_PO_BOX_nos).sendKeys(text);
	}

	public void Click_Service_mngs_New_Acc_Mobile_nos(String text)
	{
		driver.findElement(Click_Service_mng_New_Acc_Mobile_nos).sendKeys(text);
	}
	
	public void Click_Service_mng_New_Hit_SAVE()
	{
		driver.findElement(Click_Service_mng_New_Hit_SAVE).click();
	}
	
	
	public void Click_Service_mng_New_close() throws InterruptedException
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_New_close)).click();
	}
	
	/////////////
	public void Click_Service_mng_Setting_listButton()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Service_mng_Setting_list);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void Click_Service_mng_Setting_list_New()
	{
		driver.findElement(Click_Service_mng_Setting_list_New).click();
	}
	
	public void Click_Service_mng_Setting_list_New_enterName(String text)
	{
		driver.findElement(Click_Service_mng_Setting_list_New_enterName).sendKeys(text);
	}
	
	public void Click_Service_mng_Setting_list_New_enterName_SAVE()
	{
		driver.findElement(Click_Service_mng_Setting_list_New_enterName_SAVE).click();
	}
	
	public void Click_Service_mng_Setting_list_delete()
	{
		driver.findElement(Click_Service_mng_Setting_list_delete).click();
	}
	
	public void Click_Service_mng_Setting_list_delete_Sure()
	{
		driver.findElement(Click_Service_mng_Setting_list_delete_SURE).click();
	}
	
	public void Click_Service_mng_Setting_Columns()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Service_mng_Setting_Columns)).click();
		//driver.findElement(Click_Service_mng_Setting_Columns).click();
	}
	
	public void Click_Service_mng_Setting_Columns_Status()
	{
		driver.findElement(Click_Service_mng_Setting_Columns_Status).click();
	}
	
	public void Click_Service_mng_Setting_Columns_Profile()
	{
		driver.findElement(Click_Service_mng_Setting_Columns_Profile).click();
	}
	
	public void Click_Service_mng_Setting_Filter()
	{
		driver.findElement(Click_Service_mng_Setting_Filter).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Field()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Field).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Field_PRODUCT()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Field_PRODUCT).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Operator()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Operator).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Operator_Equals()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Operator_Equals).click();
	}

	public void Click_Service_mng_Setting_Filter_addFilter_Value()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Value).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Value_ATMcards()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Value_ATMcards).click();
	}
	
	public void Click_Service_mng_Setting_Filter_addFilter_Save()
	{
		driver.findElement(Click_Service_mng_Setting_Filter_addFilter_Save).click();
	}
	
	public void Click_Service_mng_RequestNo()
	{
		driver.findElement(Click_Service_mng_RequestNo).click();
	}
	
}
