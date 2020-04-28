package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import elements.Agent_desk_element;
import io.github.bonigarcia.wdm.WebDriverManager;
import elements.Login_Logout_elements;

import static pages.Login_Logout_Page.driver;

public class Agent_desk_page
{
	//static WebDriver driver;

	@Test
	public static void Agent_Desktop() throws InterruptedException
	{
		
		//driver.f;
		//pages.Login_Logout_Page.driver.equals(null);
		
		/*WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://unison1.avanzasolutions.com:3000/login");
		
		By TextBox_username = By.xpath("//input[@placeholder='Login ID']");
		driver.findElement(TextBox_username).sendKeys("Admin");
		
		By Click_Login = By.xpath("//button[@class='ui large fluid button loginBtn']");
		driver.findElement(Click_Login).sendKeys(Keys.RETURN);*/
		/////////
		System.out.println("now in agent1");
		Agent_desk_element ft = new Agent_desk_element();
		System.out.println("now in agent2");
		//ft.Click_Agent_Desktop_TAB();
		ft.Click_Search_Entity();
		System.out.println("clicked entity");
		ft.Click_Select_RelationShip_Num();
		System.out.println("selected relationship num");
		ft.SearchBox("619");
		ft.Click_Search_Button();

	}
	
	@Test
	public void anotherMethodTest()
	{
		System.out.println("checking1");
	}

}
