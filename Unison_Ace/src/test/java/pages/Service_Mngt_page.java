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
		service.Click_Service_mng_TAB();
		System.out.println("clicked Click_Agent_Desktop_TAB");
	}
	
	@Test(priority=2)
	public static void Service_Mng_Add_new() throws InterruptedException
	{
		//Thread.sleep(3000);
		service.Click_Service_mng_New();
		System.out.println("on service new");
		
		service.Click_Service_mng_New_CustSearch_Select_Type_CustomerType();
		service.Click_Service_mng_New_CustSearch_fullNameField("brandon");
		service.Click_Service_mng_New_CustSearch_SearchButton();
		System.out.println("clicked search button");
		
		service.Click_Service_mngs_New_CustCustSearch_Select_fromSearchGRID();
		service.Click_Service_mngs_New_CustCustSearch_NextButton();
		System.out.println("tryna click pri low");
		service.Click_Service_mngs_NEW_priority_low();
		System.out.println("clicked low");
		service.Click_Service_mngs_New_Complaint_type_Address_Update();
		service.Click_Service_mngs_New_Channel_Call_Center();
		service.Click_Service_mngs_New_Acc_card_loan_nos();
		service.Click_Service_mngs_New_Acc_PO_BOX_nos("123554");
		service.Click_Service_mngs_New_Acc_Mobile_nos("1235541231");
		service.Click_Service_mng_New_Hit_SAVE();
		

		System.out.println("service SR is done");
		//service.Click_Service_mng_New_close();
		//System.out.println("closes service");
	}
	
	@Test(priority=3)
	public static void Service_Mng_List_adding()
	{
		service.Click_Service_mng_Setting_listButton();
		service.Click_Service_mng_Setting_list_New();
		service.Click_Service_mng_Setting_list_New_enterName("test2");
		service.Click_Service_mng_Setting_list_New_enterName_SAVE();
		System.out.println("saved list");
	}

	@Test(priority=4)
	public static void Service_Mng_List_Delete()
	{
		service.Click_Service_mng_Setting_listButton();
		service.Click_Service_mng_Setting_list_delete();
		service.Click_Service_mng_Setting_list_delete_Sure();
		System.out.println("deleted list");
	}

	@Test(priority=5)
	public static void service_ColumnFunctions()
	{
		service.Click_Service_mng_Setting_Columns();
		service.Click_Service_mng_Setting_Columns_Status();
		service.Click_Service_mng_Setting_Columns_Profile();
	}
	
	@Test(priority=6)
	public static void service_FilterFunctions() throws InterruptedException
	{		
		service.Click_Service_mng_Setting_Filter();
		service.Click_Service_mng_Setting_Filter_addFilter();
		Thread.sleep(1000);
		service.Click_Service_mng_Setting_Filter_addFilter_Field();
		service.Click_Service_mng_Setting_Filter_addFilter_Field_PRODUCT();
		Thread.sleep(1000);
		service.Click_Service_mng_Setting_Filter_addFilter_Operator();
		service.Click_Service_mng_Setting_Filter_addFilter_Operator_Equals();
		Thread.sleep(1000);
		service.Click_Service_mng_Setting_Filter_addFilter_Value();
		service.Click_Service_mng_Setting_Filter_addFilter_Value_ATMcards();
		service.Click_Service_mng_Setting_Filter_addFilter_Save();
	}
}
