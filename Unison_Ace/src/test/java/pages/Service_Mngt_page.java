package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import elements.Agent_desk_element;
import elements.Login_Logout_elements;
import elements.Service_Mngt_elements;
import io.github.bonigarcia.wdm.WebDriverManager;

import static pages.Login_Logout_Page.driver;

public class Service_Mngt_page
{
//	static WebDriver driver;
	static Service_Mngt_elements service = new Service_Mngt_elements();

	
	@Test(priority=1)
	public static void Service_management_Desktop() throws InterruptedException
	{
		System.out.println("now in Service_management_Desktop");
		service.Click_Agent_Desktop_TAB();
		System.out.println("clicked Click_Agent_Desktop_TAB");
	}
}
