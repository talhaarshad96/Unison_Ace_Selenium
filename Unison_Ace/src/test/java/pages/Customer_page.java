package pages;

import elements.Agent_desk_element;
import elements.Customer_elements;

import static pages.Login_Logout_Page.driver;

import org.testng.annotations.Test;

public class Customer_page 
{
	static Customer_elements cust = new Customer_elements();
	
	@Test(priority=1)
	public static void Customer_tab() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("prep to click cust tab");
		cust.Click_Customer_TAB();
		System.out.println("clicked cust tab");
		cust.Click_Cust_RelationShipNum();
		System.out.println("clicked rel num\n");
	}
	
	@Test(priority=2)
	public static void Cust_Service_Req() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("trying to click NEW1 ");
		cust.Click_Cus_Service_req_NEW();
		System.out.println("Clicked new");
		cust.Click_Cus_Service_req_NEW_priority_low();
		System.out.println("Clicked priority");
		Thread.sleep(3000);
		cust.Click_Cus_Service_req_NEW_serv_type_curr_Acc_address_upd();
		System.out.println("Clicked service type_address_upd");
		Thread.sleep(3000);
		cust.Click_Cus_Service_req_NEW_set_Date();
		Thread.sleep(3000);
		cust.Enter_Cus_Service_req_NEW_Acc_PO_BOX_nos("1234");
		cust.Enter_Cus_Service_req_NEW_Acc_PO_Mobile_nos("12345");
		Thread.sleep(3000);
		cust.Click_Cus_Service_req_NEW_Acc_Hit_SAVE();
		System.out.println("Clicked SAVE1\n");
		cust.Click_Cus_Service_req_NEW_close();
		System.out.println("Clicked close1\n");
	}
	
	@Test(priority=3)
	public static void Cust_Cases() throws InterruptedException //work remain in this
	{
		System.out.println("entered cust_case");
		cust.Click_Cases_TAB();
		System.out.println("clicked Customer tab");
		Thread.sleep(5000);
		System.out.println("trying to click NEW2 ");
		cust.Click_Cus_Cases_New_NEW();
		System.out.println("Clicked new2");
		Thread.sleep(3000);
		cust.Click_Cus_Cases_New_Acc_card_loan_nos();
		Thread.sleep(3000);
		cust.Click_Cus_Cases_New_Acc_Hit_SAVE();
		System.out.println("Clicked SAVE2");
		cust.Click_Cus_Cases_New_close();
		System.out.println("Clicked close2\n");
	}
}
