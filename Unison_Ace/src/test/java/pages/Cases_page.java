package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import elements.Agent_desk_element;
import elements.Cases_elements;
import elements.Login_Logout_elements;
import io.github.bonigarcia.wdm.WebDriverManager;

import static pages.Login_Logout_Page.driver;

public class Cases_page
{
//	static WebDriver driver;
	static Cases_elements cases = new Cases_elements();
	
	@Test(priority=1)
	public static void Case_Desktop_tab() throws InterruptedException
	{
		System.out.println("now case desktop");
		cases.Click_Cases_TAB();
		System.out.println("on case page");

	}
	
	@Test(priority=2)
	public static void Case_Add_new() throws InterruptedException
	{
		Thread.sleep(3000);
		cases.Click_Case_New();
		System.out.println("on case new");
		cases.Click_Case_New_close();
		System.out.println("closes cases");
	}
	
	
}
