package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elements.Login_Logout_elements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Logout_Page 
{
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUpTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://unison1.avanzasolutions.com:3000/login");
	}

	@BeforeTest
	public static void Login() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","E:\\eclipse stuff\\chromedriver.exe"); 
		//WebDriverWait wait=new WebDriverWait(driver, 30);	
		Thread.sleep(3000);
		Login_Logout_elements ft = new Login_Logout_elements();

		ft.TextBox_username("Admin");
		ft.TextBox_password("");
		ft.Button_Login();
		System.out.println("login is done");

	}
	
	@Test
	public static void somethi()
	{
		System.out.println("bakwas");
	}
	@Test
	public static void somethi1()
	{
		System.out.println("bakwas1");
	}
	
	@AfterTest
	public static void Logout() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","E:\\eclipse stuff\\chromedriver.exe"); 
		//WebDriverWait wait=new WebDriverWait(driver, 30);	

		Login_Logout_elements ft = new Login_Logout_elements();
		System.out.println("In AfterTest Now");
		Thread.sleep(4000);
		ft.Click_My_Profile();
		System.out.println("clicking profile");
		ft.Click_Logout();
		System.out.println("clicking logout");

	}

	@AfterSuite
	public void tearDownTest()
	{
		driver.quit();
		System.out.println("Suite Complete Login");
	}
}
