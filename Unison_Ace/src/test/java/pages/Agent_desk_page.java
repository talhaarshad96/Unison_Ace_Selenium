package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import elements.Agent_desk_element;
import elements.Login_Logout_elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;

import static pages.Login_Logout_Page.driver;

public class Agent_desk_page
{
//	static WebDriver driver;
	static Agent_desk_element agent = new Agent_desk_element();

	//@Test
	public static void forUnitTest_Agent_Module()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://unison1.avanzasolutions.com:3000/login");
		
		By TextBox_username = By.xpath("//input[@placeholder='Login ID']");
		driver.findElement(TextBox_username).sendKeys("Admin");
		
		By Click_Login = By.xpath("//button[@class='ui large fluid button loginBtn']");
		driver.findElement(Click_Login).sendKeys(Keys.RETURN);
	}
	
	@Test(priority=1)
	public static void Agent_Desktop() throws InterruptedException
	{
		System.out.println("now in agent1");
		agent.Click_Select_Entity();
		System.out.println("clicked entity");
		agent.Click_Select_RelationShip_Num();
		System.out.println("selected relationship num");
		agent.SearchBox("619");
		agent.Click_Search_Button();
	}
	
	@Test(priority=2)
	public static void Enter_Caution_Message()
	{
		System.out.println("in the caution box");
		agent.Click_Caution_Edit();
		agent.Click_Caution_messageBox("I was here");
		agent.Click_Caution_Save();
	}
	
	@Test(priority=3)
	public static void Agent_Desk_tick_Correct_Qs() throws InterruptedException
	{
		System.out.println("\nnow in Agent_Desk_tick_Correct_Qs");
		agent.Click_Correct_radio1();
		System.out.println("clicked radio1");
		agent.Click_Correct_radio2();
		System.out.println("clicked radio2");
		agent.Click_Correct_radio3();
		System.out.println("clicked radio3");
		agent.Click_Correct_radio4();
		System.out.println("clicked radio4");
		agent.Validate_button();
		System.out.println("clicked validate\n");
	}
	
	@Test(priority=4)
	public static void Agent_Desk_Session_box() throws InterruptedException
	{
		System.out.println("\nnow in Agent_Desk_Session_box");
		agent.Click_Session_button();
		System.out.println("Click_Session_button");
		agent.Click_Session_SHOW();
		System.out.println("Click_Session_SHOW");
		agent.Select_Session_level1_inqury();
		System.out.println("Select_Session_level1_inqury()");
		agent.Select_Session_level2_loan();
		System.out.println("Select_Session_level2_loan");
		agent.Select_Session_level3_Personal();
		System.out.println("Select_Session_level3_Personal");
		agent.Select_Session_press_ADD();
		System.out.println("Select_Session_press_ADD");
		agent.Select_Session_Enter_Note("Avanza");
		System.out.println("Select_Session_Enter_Note");
		agent.Click_From_Session_Rate_session();
		System.out.println("Click_From_Session_Rate_session");
		agent.Click_From_Session_Save_session();
		System.out.println("Click_From_Session_Save_session");
		agent.Click_Session_CLOSE();
		System.out.println("closed session ");
	}
	
	
	
	//@Test(priority=2)
	public static void Agent_Desk_tick_Wrong_Qs() throws InterruptedException
	{
		System.out.println("now in Agent_Desk_tick_Wrong_Qs");
		agent.Click_Wrong_radio1();
		System.out.println("clicked radio1");
		agent.Click_Wrong_radio2();
		System.out.println("clicked radio2");
		agent.Click_Wrong_radio3();
		System.out.println("clicked radio3");
		agent.Click_Wrong_radio4();
		System.out.println("clicked radio4");
		agent.Validate_button();
	}
}
