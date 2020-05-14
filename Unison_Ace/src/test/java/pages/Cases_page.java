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
		System.out.println("on case page\n");

	}

	@Test(priority=2)
	public static void Case_Fill_Add_new() throws InterruptedException
	{
		cases.Click_Case_New();
		System.out.println("on case new");
		cases.Click_Case_New_CustSearch_Select_Type_CustomerType();
		cases.Click_Case_New_CustSearch_fullNameField("brandon");
		cases.Click_Case_New_CustSearch_SearchButton();
		System.out.println("clicked search button");

		cases.Click_Cases_New_CustCustSearch_Select_fromSearchGRID();
		cases.Click_Cases_New_CustCustSearch_NextButton();
		cases.Click_Cases_New_Cust_NextButton();
		System.out.println("tryna click low");
		cases.Click_Cases_NEW_priority_low();
		System.out.println("clicked pri low");
		cases.Click_Cases_New_Complaint_type_Amount_onhold();
		System.out.println("clicked Amount_onhold");
		cases.Click_Cases_New_Channel_Call_Center();
		System.out.println("clicked Call_Center");
		cases.Click_Cases_New_Acc_card_loan_nos();
		System.out.println("clicked card_loan_nos");
		cases.Click_Cus_Cases_New_Acc_Hit_SAVE();

		System.out.println("cases is done");

		//cases.Click_Case_New_close();
		//System.out.println("closes cases");
	}

	@Test(priority=3)
	public static void Cases_List_adding()
	{
		cases.Click_Cases_Setting_listButton();
		cases.Click_Cases_Setting_list_New();
		cases.Click_Cases_Setting_list_New_enterName("test1");
		cases.Click_Cases_Setting_list_New_enterName_SAVE();
		System.out.println("saved list");
	}

	@Test(priority=4)
	public static void Cases_List_Delete()
	{
		cases.Click_Cases_Setting_listButton();
		cases.Click_Cases_Setting_list_delete();
		cases.Click_Cases_Setting_list_delete_Sure();
		System.out.println("deleted list");
	}

	@Test(priority=5)
	public static void Cases_ColumnFunctions()
	{
		cases.Click_Cases_Setting_Columns();
		cases.Click_Cases_Setting_Columns_Status();
		cases.Click_Cases_Setting_Columns_Profile();
	}
	
	@Test(priority=6)
	public static void Cases_FilterFunctions() throws InterruptedException
	{		
		cases.Click_Cases_Setting_Filter();
		cases.Click_Cases_Setting_Filter_addFilter();
		Thread.sleep(1000);
		cases.Click_Cases_Setting_Filter_addFilter_Field();
		cases.Click_Cases_Setting_Filter_addFilter_Field_PRODUCT();
		Thread.sleep(1000);
		cases.Click_Cases_Setting_Filter_addFilter_Operator();
		cases.Click_Cases_Setting_Filter_addFilter_Operator_Equals();
		Thread.sleep(1000);
		cases.Click_Cases_Setting_Filter_addFilter_Value();
		cases.Click_Cases_Setting_Filter_addFilter_Value_ATMcards();
		cases.Click_Cases_Setting_Filter_addFilter_Save();
	}
	
	@Test(priority=7)
	public static void Cases_ClickComplaintNo()
	{
		cases.Click_Cases_CompaintTicketNo();
	}


}
