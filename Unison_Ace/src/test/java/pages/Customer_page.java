package pages;

import elements.Agent_desk_element;
import elements.Customer_elements;

import static pages.Login_Logout_Page.driver;

import org.testng.annotations.Test;

public class Customer_page 
{
	static Customer_elements cust = new Customer_elements();
	
	@Test
	public static void Customer_tab()
	{
		cust.Click_Customer_TAB();
		System.out.println("clicked cust tab");
	}
}
