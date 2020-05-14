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

public class Cases_elements
{	
	//public WebDriver driver;

	public Cases_elements()
	{

	}

	By Click_Cases_TAB = By.xpath("//a[contains(text(),'Cases')]");
	By Click_Case_New = By.xpath("//button[@class='btnDefault btnBasic']");
	By Click_Case_New_close =  By.xpath("//i[@class='close icon']");
	By Click_Case_New_CustSearch_nonCust_dropDown = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[1]");
	By Click_Case_New_Cust_fromDropdown = By.xpath("//div[contains(@class,'selected item')]//span[contains(@class,'text')][contains(text(),'Customer')]");
	By Click_Cases_New_CustCustSearch_FullName = By.xpath("//input[@id='FULL_NAME']");
	By Click_Cases_New_CustCustSearch_SearchButton = By.xpath("//button[contains(@class,'ui primary button')]");
	By Click_Cases_New_CustCustSearch_Select_brandon = By.xpath("//div[contains(text(),'Brandon')]");//for fullName brandon
	By Click_Cases_New_PressNEXT = By.xpath("//button[contains(@class,'ui icon positive right labeled button')]");
	By Click_Cases_New_priority_dropdown = By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[1]");
	By Click_Cases_New_priority_dropdown_low = By.xpath("//span[contains(text(),'Low')]");
	By Click_Cases_New_Complaint_type = By.xpath("//a[contains(@id,'_trigger')]"); ////*[contains(@id,'_trigger')]
	By Click_Cases_New_curr_Acc = By.xpath("//*[contains(@id,'-0-0-0_li')]//i[@class='toggle collapsed']"); //finding partial ID
	By Click_Cases_New_Amount_on_hold = By.xpath("//input[contains(@id,'-0-0-0-0')]");
	By Click_Cases_New_channel_dropdown =  By.xpath("(//div[@class='column']//div[@class='form-element ']//div[@class='form-control']//div[@class='ui search selection dropdown']//i[@class='dropdown icon'])[2]");
	By Click_Cases_New_channel_call_center =  By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'Call Center')]");
	By Click_Cases_New_Acc_card_loan_nos = By.xpath("//div[contains(text(),'AC')]");
	By Click_Cases_New_Acc_select_LOAN_nos = By.xpath("//span[contains(text(),'3000309579')]");
	By Click_Cases_New_Hit_SAVE = By.xpath("//button[contains(@class,'ui primary button')]");
	By Click_Cases_Setting_list = By.xpath("//i[@class='settings icon']");
	By Click_Cases_Setting_list_New = By.xpath("//div[contains(text(),'New')]");
	By Click_Cases_Setting_list_New_enterName = By.xpath("//input[@placeholder='List Name']");
	By Click_Cases_Setting_list_New_enterName_SAVE = By.xpath("//button[@class='ui primary button']");
	By Click_Cases_Setting_list_delete = By.xpath("//div[contains(text(),'Delete')]");
	By Click_Cases_Setting_list_delete_SURE = By.xpath("//button[@class='ui green button']");

	By Click_Cases_Setting_Columns = By.xpath("//span[contains(text(),'Columns')]");	
	By Click_Cases_Setting_Columns_Status = By.xpath("//span[@class='ag-column-tool-panel-column-label'][contains(text(),'Status')]");
	By Click_Cases_Setting_Columns_Profile = By.xpath("(//span[@class='ag-column-tool-panel-column-label'][contains(text(),'Product')])[1]");

	By Click_Cases_Setting_Filter = By.xpath("//span[contains(text(),'Filters')]");
	By Click_Cases_Setting_Filter_addFilter = By.xpath("//button[@class='ui mini button']");
	By Click_Cases_Setting_Filter_addFilter_Field = By.xpath("(//div[@class='ui centered divided three column grid']//i[@class='dropdown icon'])[1]");
	By Click_Cases_Setting_Filter_addFilter_Field_PRODUCT = By.xpath("(//div[@class='ui left center popup transition visible gridPopUp']//span[contains(text(),'Product')])[1]");
	By Click_Cases_Setting_Filter_addFilter_Operator = By.xpath("(//div[@class='ui centered divided three column grid']//i[@class='dropdown icon'])[2]");
	By Click_Cases_Setting_Filter_addFilter_Operator_Equals = By.xpath("(//div[@class='visible menu transition']//span[contains(text(),'Equals')])[1]");
	By Click_Cases_Setting_Filter_addFilter_Value = By.xpath("//div[@name='name']//i[@class='dropdown icon']");
	By Click_Cases_Setting_Filter_addFilter_Value_ATMcards = By.xpath("//span[contains(text(),'ATM Cards')]");
	By Click_Cases_Setting_Filter_addFilter_Save = By.xpath("//button[@class='ui primary button']");
	//
	By Click_Cases_CompaintTicketNo = By.xpath("//a[contains(text(),'C000001840')]");

	public void Click_Cases_TAB() throws InterruptedException
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_TAB)).click();
	}

	public void Click_Case_New()
	{
		WebElement element = driver.findElement(Click_Case_New);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Case_New)).click();
	}

	public void Click_Case_New_CustSearch_Select_Type_CustomerType()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Case_New_CustSearch_nonCust_dropDown)).click();
		driver.findElement(Click_Case_New_Cust_fromDropdown).click();
	}

	public void Click_Case_New_CustSearch_fullNameField(String text)
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_CustCustSearch_FullName)).sendKeys(text);
	}

	public void Click_Case_New_CustSearch_SearchButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_CustCustSearch_SearchButton)).click();
	}

	public void Click_Cases_New_CustCustSearch_Select_fromSearchGRID()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_CustCustSearch_Select_brandon)).click();
	}

	public void Click_Cases_New_CustCustSearch_NextButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_PressNEXT)).click();
	}

	public void Click_Cases_New_Cust_NextButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_PressNEXT)).click();
	}

	public void Click_Cases_NEW_priority_low()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Cases_New_priority_dropdown);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		WebElement element1 = driver.findElement(Click_Cases_New_priority_dropdown_low);
	//	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_priority_dropdown_low)).click();
	}

	public void Click_Cases_New_Complaint_type_Amount_onhold()
	{
	/*	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Cases_New_Complaint_type);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
		
		WebElement myelement1 = driver.findElement(Click_Cases_New_curr_Acc);
		wait.until(ExpectedConditions.elementToBeClickable(myelement1));
		myelement1.click();
		
		WebElement myelement2 = driver.findElement(Click_Cases_New_Amount_on_hold);
		wait.until(ExpectedConditions.elementToBeClickable(myelement2));
		myelement.click();*/
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Cases_New_Complaint_type);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		WebElement element2 = driver.findElement(Click_Cases_New_curr_Acc);
		executor.executeScript("arguments[0].click();", element2);
		
		WebElement element3 = driver.findElement(Click_Cases_New_Amount_on_hold);
		executor.executeScript("arguments[0].click();", element3);
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_Complaint_type)).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_curr_Acc)).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_Amount_on_hold)).click();
	}

	public void Click_Cases_New_Channel_Call_Center()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_channel_dropdown)).click();
		driver.findElement(Click_Cases_New_channel_call_center).click();
	}

	public void Click_Cases_New_Acc_card_loan_nos()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_Acc_card_loan_nos)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_New_Acc_select_LOAN_nos)).click();
	}

	public void Click_Cus_Cases_New_Acc_Hit_SAVE()
	{
		driver.findElement(Click_Cases_New_Hit_SAVE).click();
	}

	public void Click_Case_New_close() throws InterruptedException
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Case_New_close)).click();
	}
	////////////////////
	public void Click_Cases_Setting_listButton()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Cases_Setting_list);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void Click_Cases_Setting_list_New()
	{
		driver.findElement(Click_Cases_Setting_list_New).click();
	}

	public void Click_Cases_Setting_list_New_enterName(String text)
	{
		driver.findElement(Click_Cases_Setting_list_New_enterName).sendKeys(text);
	}

	public void Click_Cases_Setting_list_New_enterName_SAVE()
	{
		driver.findElement(Click_Cases_Setting_list_New_enterName_SAVE).click();
	}

	public void Click_Cases_Setting_list_delete()
	{
		driver.findElement(Click_Cases_Setting_list_delete).click();
	}

	public void Click_Cases_Setting_list_delete_Sure()
	{
		driver.findElement(Click_Cases_Setting_list_delete_SURE).click();
	}

	public void Click_Cases_Setting_Columns()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(Click_Cases_Setting_Columns);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void Click_Cases_Setting_Columns_Status()
	{
		//driver.findElement(Click_Cases_Setting_Columns_Status).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Cases_Setting_Columns_Status)).click();

	}

	public void Click_Cases_Setting_Columns_Profile()
	{
		driver.findElement(Click_Cases_Setting_Columns_Profile).click();
	}	


	public void Click_Cases_Setting_Filter()
	{
		driver.findElement(Click_Cases_Setting_Filter).click();
	}

	public void Click_Cases_Setting_Filter_addFilter()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Field()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Field).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Field_PRODUCT()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Field_PRODUCT).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Operator()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Operator).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Operator_Equals()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Operator_Equals).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Value()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Value).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Value_ATMcards()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Value_ATMcards).click();
	}

	public void Click_Cases_Setting_Filter_addFilter_Save()
	{
		driver.findElement(Click_Cases_Setting_Filter_addFilter_Save).click();
	}
	
	public void Click_Cases_CompaintTicketNo()
	{
		driver.findElement(Click_Cases_CompaintTicketNo).click();
	}
}
