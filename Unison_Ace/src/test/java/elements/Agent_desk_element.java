package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public void Click_Correct_radio1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[1]//td[3]//div[1]"));
		
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
		
		WebDriverWait wait2 = new WebDriverWait(driver, 100);
		
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
		Thread.sleep(3000);
		
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[2]//td[3]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
	}

	public void Click_Correct_radio3() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[3]//td[3]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
		
	}

	public void Click_Correct_radio4() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[4]//td[3]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
		
	}

	public void Click_Wrong_radio1() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[1]//td[4]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
	}

	public void Click_Wrong_radio2() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[2]//td[4]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
	}

	public void Click_Wrong_radio3() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[3]//td[4]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
	}

	public void Click_Wrong_radio4() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement myelement = driver.findElement(By.xpath("//tbody[@class='tbodyAgDesktop']//tr[4]//td[4]//div[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myelement));
		
		myelement.click();
	}

	public void Validate_button()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui small primary right floated button tbtnAgDesktop']"))).click();
	}

}
