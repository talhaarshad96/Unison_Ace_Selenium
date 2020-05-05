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

public class Agent_desk_element
{	
	//public WebDriver driver;

	public Agent_desk_element()
	{
		
	}

	By Click_Agent_Desktop_TAB = By.xpath("//a[contains(text(),'Agent Desktop')]");
	By Click_Search_Entity = By.xpath("//div[@class='ui selection dropdown']//i[@class='dropdown icon']");
	By Click_Select_RelationShip_Num = By.xpath("//span[contains(text(),'Relationship Number')]");
	By SearchBox = By.xpath("//input[@name='searchInput']");
	By Click_Search_Button = By.xpath("//button[@class='ui small primary button']");
	By Click_Correct_radio1 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[1]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[1]");////tbody[@class='tbodyAgDesktop']//tr[1]//td[3]//div[1]
	By Click_Correct_radio2 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[2]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[1]");
	By Click_Correct_radio3 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[3]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[1]");
	By Click_Correct_radio4 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[4]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[1]");
	By Click_Wrong_radio1 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[1]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[2]");
	By Click_Wrong_radio2 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[1]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[2]");
	By Click_Wrong_radio3 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[1]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[2]");
	By Click_Wrong_radio4 = By.xpath("(//tbody[@class='tbodyAgDesktop']//child::tr[1]//td[@class='single line']//div[@class='ui fitted radio checkbox'])[2]");
	By Validate_button = By.xpath("//button[@class='ui small primary right floated button tbtnAgDesktop']");
	By Click_Caution_Edit = By.xpath("//div[@class='cautionBoxLabelbtn cautionBoxLabelArea']//i[@class='pencil icon']");
	By Click_Caution_Save = By.xpath("//i[@class='save icon']");
	By Click_Caution_messageBox = By.xpath("//textarea[@id='message']");
	By Click_Session_box = By.xpath("//button[text()='Sessions']");
	By Click_Session_SHOW = By.xpath("//button[text()='Show']");
	By Click_Session_CLOSE = By.xpath("//i[@class='close icon']");
	By Click_Session_CustID= By.xpath("//span[@class='custIdSessionList']");
	By Click_Session_Level1_dropdown = By.xpath("//div[@name='activity1Value']//i[@class='dropdown icon']");
	By Click_Session_Level2_dropdown = By.xpath("//div[@name='activity2Value']//i[@class='dropdown icon']");
	By Click_Session_Level3_dropdown = By.xpath("//div[@name='activity3Value']//i[@class='dropdown icon']");
	By Select_From_Session_Level1_dropdown_INQUIRY = By.xpath("//span[contains(text(),'1 - Inquiry')]");
	By Select_From_Session_Level2_dropdown_LOANS = By.xpath("//span[contains(text(),'Loans')]");
	By Select_From_Session_Level3_dropdown_PERSONAL = By.xpath("//span[contains(text(),'Personal')]");
	By Click_From_Session_ADD = By.xpath("//button[contains(text(),'Add')]");
	By Enter_Session_Note = By.xpath("//textarea[@placeholder='Type note here']");
	By Click_From_Session_Action_Delete = By.xpath("//i[@class='red trash alternate outline icon trashIcon']");
	By Click_From_Session_End_session = By.xpath("//button[contains(text(),'End Session')]");
	By Click_From_Session_Rate_session = By.xpath("//i[4]");
	By Click_From_Session_Save_session = By.xpath("//button[@class='ui positive button']");


	
	public void Click_Agent_Desktop_TAB()
	{
		driver.findElement(Click_Agent_Desktop_TAB).click();
	}
	
	public void Click_Select_Entity()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Search_Entity)).click();
	}
	
	public void Click_Select_RelationShip_Num()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Select_RelationShip_Num)).click();
	}
	
	public void SearchBox(String text)
	{
		driver.findElement(SearchBox).sendKeys(text);
	}

	public void Click_Search_Button()
	{
		driver.findElement(Click_Search_Button).click();
	}
	
	public void Click_Caution_Edit()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Click_Caution_Edit)).click();
	}
	
	public void Click_Caution_Save()
	{
		driver.findElement(Click_Caution_Save).click();
	}
	
	public void Click_Caution_messageBox(String text)
	{
		driver.findElement(Click_Caution_messageBox).clear();
		driver.findElement(Click_Caution_messageBox).sendKeys(text);
	}
	
	public void Click_Session_button()
	{
		driver.findElement(Click_Session_box).click();
	}
	
	public void Click_Session_SHOW()
	{
		driver.findElement(Click_Session_SHOW).click();
	}
	
	public void Click_Session_CLOSE()
	{
		driver.findElement(Click_Session_CLOSE).click();
	}
	
	public void Click_Session_CustID()
	{
		driver.findElement(Click_Session_CustID).click();
	}
	
	public void Select_Session_level1_inqury()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Session_Level1_dropdown).click();
		driver.findElement(Select_From_Session_Level1_dropdown_INQUIRY).click();
	}
	
	public void Select_Session_level2_loan()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Session_Level2_dropdown).click();
		driver.findElement(Select_From_Session_Level2_dropdown_LOANS).click();	
	}
	
	public void Select_Session_level3_Personal()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_Session_Level3_dropdown).click();
		driver.findElement(Select_From_Session_Level3_dropdown_PERSONAL).click();	
	}
	
	public void Select_Session_press_ADD()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_From_Session_ADD).click();	
	}
	
	public void Select_Session_Enter_Note(String text)
	{
		driver.findElement(Enter_Session_Note).sendKeys(text);	
	}
	
	public void Click_From_Session_Action_Delete()
	{
		driver.findElement(Click_From_Session_Action_Delete).click();	
	}
	
	public void Click_From_Session_End_session()
	{
		driver.findElement(Click_From_Session_End_session).click();	
	}
	
	public void Click_From_Session_Rate_session()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(Click_From_Session_Rate_session).click();	
	}
	
	public void Click_From_Session_Save_session()
	{
		driver.findElement(Click_From_Session_Save_session).click();	
	}
	
	public void Click_Correct_radio1() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Correct_radio1);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
		
		//new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(Click_Correct_radio1)).click();
		//driver.findElement(Click_Correct_radio1).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
		//js.executeScript("arguments[0].click();", Click_Correct_radio1);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[3]/div/div/table/tbody/tr[1]/td[3]/div/label"))).click();
		/*WebElement element = driver.findElement(By.xpath("//tr[1]//td[3]//div[1]//label[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		element.click();*/
		
		
		/*WebElement myelement = driver.findElement(By.xpath("//tr[1]//td[3]//div[1]//label[1]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement); */
		
		//WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agContentDiv div.ui.doubling.stackable.grid div.two.column.row div.eight.wide.column:nth-child(3) div.ui.segment.summary-field.questionsTable div.agQuestionTable table.ui.celled.padded.table tbody.tbodyAgDesktop:nth-child(2) tr:nth-child(1) td.single.line:nth-child(3) div.ui.fitted.radio.checkbox > label:nth-child(2)")));
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agContentDiv div.ui.doubling.stackable.grid div.two.column.row div.eight.wide.column:nth-child(3) div.ui.segment.summary-field.questionsTable div.agQuestionTable table.ui.celled.padded.table tbody.tbodyAgDesktop:nth-child(2) tr:nth-child(1) td.single.line:nth-child(3) div.ui.fitted.radio.checkbox > label:nth-child(2)"))).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agContentDiv div.ui.doubling.stackable.grid div.two.column.row div.eight.wide.column:nth-child(3) div.ui.segment.summary-field.questionsTable div.agQuestionTable table.ui.celled.padded.table tbody.tbodyAgDesktop:nth-child(2) tr:nth-child(1) td.single.line:nth-child(3) div.ui.fitted.radio.checkbox > label:nth-child(2)")));
		
		///////////////===============================///////////////////////////////////
	//	WebDriverWait wait = new WebDriverWait(driver, 20);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[1]//td[3]//div[1]//label[1]")));
		//ye element to present hay. Tabhi error nahe aaraha. Bas clickable nahe horaha.
	
		
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[1]//td[3]//div[1]//label[1]")));
		//element clickable nahe horaha hay
		// wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//td[3]//div[1]//label[1]")));
		 //element is not visible
		// wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//tr[1]//td[3]//div[1]//label[1]")));
		 
		//WebElement element1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//td[3]//div[1]//label[1]")));
		
		//driver.findElement(By.xpath("//tr[1]//td[3]//div[1]//label[1]")).click();
		
		/*if(driver.findElements(By.xpath("//tr[1]//td[3]//div[1]//label[1]")).size() != 0)
		{
			System.out.println("Element is Present");
		}else
		{
			System.out.println("absent hay dhakkan");
		}*/
		
		/*WebElement elem = driver.findElement(By.xpath("//tr[1]//td[3]//div[1]//label[1]"));
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

		((JavascriptExecutor) driver).executeScript(js, elem);*/
	}
	
	public void Click_Correct_radio2() throws InterruptedException
	{
		//WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.body:nth-child(2) div.widget div.container.fullContainer div.widgetOuterDiv div.ui.attached.segment.widget-body:nth-child(2) div.agContentDiv div.ui.doubling.stackable.grid div.two.column.row div.eight.wide.column:nth-child(3) div.ui.segment.summary-field.questionsTable div.agQuestionTable table.ui.celled.padded.table tbody.tbodyAgDesktop:nth-child(2) tr:nth-child(2) td.single.line:nth-child(3) div.ui.fitted.radio.checkbox > label:nth-child(2)")));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Correct_radio2);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Correct_radio3() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Correct_radio3);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Correct_radio4() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Correct_radio4);	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Wrong_radio1() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Wrong_radio1);	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Wrong_radio2() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Wrong_radio2);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Wrong_radio3() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Wrong_radio3);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Click_Wrong_radio4() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement myelement = driver.findElement(Click_Wrong_radio4);	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		myelement.click();
	}

	public void Validate_button()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(Validate_button)).click();
	}

}
