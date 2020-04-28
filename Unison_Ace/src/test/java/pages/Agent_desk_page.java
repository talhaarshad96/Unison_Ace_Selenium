package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import elements.Agent_desk_element;
import elements.Login_Logout_elements;
import io.github.bonigarcia.wdm.WebDriverManager;

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
		//agent.Click_Agent_Desktop_TAB();
		agent.Click_Search_Entity();
		System.out.println("clicked entity");
		agent.Click_Select_RelationShip_Num();
		System.out.println("selected relationship num");
		agent.SearchBox("619");
		agent.Click_Search_Button();
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(size);
	

	}
	
	@Test(priority=2)
	public static void Agent_Desk_tick_Correct_Qs() throws InterruptedException
	{
		System.out.println("now in Agent_Desk_tick_Correct_Qs");
		System.out.println("\nfinding radio1");
		agent.Click_Correct_radio1();
		System.out.println("clicked radio1");
		//agent.Click_Correct_radio2();
		//agent.Click_Correct_radio3();
		//agent.Click_Correct_radio4();
		agent.Validate_button();
		System.out.println("clicked validate");
	}
	
	//@Test
	public static void Agent_Desk_tick_Wrong_Qs() throws InterruptedException
	{
		System.out.println("now in Agent_Desk_tick_Wrong_Qs");
		agent.Click_Wrong_radio1();
		agent.Click_Wrong_radio2();
		agent.Click_Wrong_radio3();
		agent.Click_Wrong_radio4();
		agent.Validate_button();
	}
}
