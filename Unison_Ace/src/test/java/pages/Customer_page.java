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
		//Thread.sleep(3000);
		System.out.println("prep to click cust tab");
		cust.Click_Customer_TAB();
		System.out.println("clicked cust tab");
		cust.Click_Cust_RelationShipNum();
		System.out.println("clicked rel num\n");
		cust.Click_Customer_FinancialAccounts();
		Thread.sleep(1000);
		cust.Click_Customer_CustomerLogs();
		Thread.sleep(1000);
		cust.Click_Customer_Activity();
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public static void Cust_Service_Req() throws InterruptedException
	{
		cust.Click_Customer_CustInteractions();
		
		System.out.println("trying to click NEW1 ");
		cust.Click_Cus_Service_req_NEW();
		System.out.println("Clicked new");
		cust.Click_Cus_Service_req_NEW_priority_low();
		System.out.println("Clicked priority");
		cust.Click_Cus_Service_req_NEW_serv_type_curr_Acc_address_upd();
		System.out.println("Clicked service type_address_upd");
		cust.Enter_Cus_Service_req_NEW_Acc_card_loan_nos();
		cust.Click_Cus_Service_req_NEW_Channel_field_Call_Center();
		System.out.println("entered channel");
		cust.Enter_Cus_Service_req_NEW_Acc_PO_BOX_nos("123456");
		cust.Enter_Cus_Service_req_NEW_Acc_Mobile_nos("12345678910");
		cust.Click_Cus_Service_req_NEW_Acc_Hit_SAVE();
		System.out.println("Clicked SAVE1");
		cust.Click_Cus_Service_req_NEW_close();
		System.out.println("Clicked close1\n");
	}
	
	@Test(priority=3)
	public static void Cust_Cases() throws InterruptedException
	{
		System.out.println("entered cust_case");
		cust.Click_Cases_TAB();
		System.out.println("clicked Customer tab");
		cust.Click_Cus_Cases_NEW();
		System.out.println("Clicked new2");
		cust.Click_Cus_Cases_NEW_priority_low();
		System.out.println("Click_Cus_Cases_NEW_priority_low");
		cust.Click_Cus_Cases_NEW_Complaint_type_Amount_onhold();
		System.out.println("Click_Cus_Cases_NEW_Complaint_type_Amount_onhold");	

		
		cust.Click_Cus_Cases_NEW_Channel_field_Call_Center();
		System.out.println("entered channel");
		cust.Click_Cus_Cases_New_Acc_card_loan_nos();
		cust.Click_Cus_Cases_New_Acc_Hit_SAVE();
		System.out.println("Clicked SAVE2\n");
	}
	
	@Test(priority=4)
	public static void Cust_GridFilters() throws InterruptedException
	{
		System.out.println("prep to click cust tab");
		cust.Click_Customer_TAB();
		System.out.println("entered cust_gridFilter");
		cust.Click_Cus_grid_Filter_FullName_HoverOver();
		cust.Click_Cus_grid_Filter_FullName_dropdown();
		Thread.sleep(1000);
		cust.Click_Cus_grid_Filter_secondTabFilter();
		Thread.sleep(1000);
		cust.Click_Cus_grid_Filter_secondTabFilter_enternNAme("ahmad");
		Thread.sleep(1000);
		cust.Click_Cus_grid_Filter_thirdTabFilter();
		Thread.sleep(1000);
		cust.Click_Cus_grid_Filter_thirdTabFilter_clickLoginID();
		Thread.sleep(1000);
	}
	
	
}
