package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class RoleAssignment extends ActionEngine{
	
	Properties prop;
	
	
	
	
	//@FindBy(xpath = "//input[@class="nav-link nav-toggle"']")
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;
	
	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;
	
	@FindBy(id = "ROLASS")
	WebElement RoleAssignment;
	
	@FindBy(xpath = "//span[@id='btnAdvSearch']/i")
	WebElement SearchFilterbtn;
	
	@FindBy(xpath = "//table[@class='table-bordered search-control']/tbody[1]/tr[1]/td[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]")
	WebElement SearchBy;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchByUser;
	
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li")
	WebElement UserOption;
	
	@FindBy(id = "SrhUserName")
	WebElement UserNameTxt;
	
	@FindBy(id = "displayBtn")
	WebElement Apply;
	
	@FindBy(xpath = "//table[@id='RoleAsgListTab']/tbody[1]/tr[1]/td[3]/span[1]/span[1]/span[1]/span[1]")
	WebElement RoleDd;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Searchfield;
	
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[1]")
	WebElement Searchfieldoption;
	
	@FindBy(id = "btnSubmit")
	WebElement Submit;
	
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement EsignProceed;
	
	@FindBy(id = "listFetchMore")
	WebElement Morebtn;
	
	//listFetchMore
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	
	
	//@FindBy(xpath = "//a[@id='logoutBtn']")
	//WebElement Signout;
	
	

	
	//This initElements method will create all WebElements
	
			public RoleAssignment() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void ssodmsroleassignment(String userna, String Role, String eSign)
		{
			
               //  String EMPfistname = username;
			
		String	userregfirstna = DMS_UserRegistration.getEMPfistname();
		
		String	las = DMS_UserRegistration.getEMPLastname();
		
		String tolna = userregfirstna+las;
		
		String Rolevalue = DMS_Roleregistrationflow.getEMProle();
		
		
			
			
			
			
			//String Rolevalue1 = Role;
			
			//Role = DMS_Roleregistrationflow.getEMProle();
			waitForPageToLoad(3000);
			
            click(Sysmantab, "System mmanager tab");
			
			click(Adminandsecurity, "Admin and security tab");
			
			click(Initiate, "Initiation tab");
			
			click(RoleAssignment, "RoleAssignment Menu");
			switchToBodyFrame(driver);
			
			TimeUtil.shortWait();
			
			click(SearchFilterbtn, "SearchFilter button");
			
		//	TimeUtil.shortWait();
			
			click(SearchBy, "SearchBy button");
			
			sendText(SearchByUser, "User Name", "SearchBy User");
			
		//	sendText(SearchByUser, "Use", "SearchBy User");
			
			TimeUtil.shortWait();
			
			
			
			click(UserOption, "User  Option");
		//	String usernameval = UserRegistration.getName();
			
              TimeUtil.shortWait();
			
		
			
			sendText(UserNameTxt,userna, "UserName Txtbox");
			
			//sendText(UserNameTxt,username , "UserName Txtbox");
			
			//jsClick(Morebtn, "more button");
			
			
			click(Apply, "Apply  Button");
			
			//jsClick(Morebtn, "more button");
			
			
			click(RoleDd, "RoleDd  Button");
			
			sendText(Searchfield, Rolevalue, "Searchfield Role");
			
			click(Searchfieldoption, "Searchfield option");
			
			click(Submit, "Submit Button");
			
			E_sign.e_Sign(eSign);
			
			
			
			
			
			
			
			 TimeUtil.shortWait();
			
			
			click(EsignProceed, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			
			click(Initiate, "Initiation tab");
			
			TimeUtil.shortWait();
			
			click(Signout, "signout btn");
			
			
		
			
		/*	
			
			switchToDefaultContent(driver);
			
			click(Initiate, "Initiation tab");
			
			
			
			//click(Signout, "SignOut Button");
			
			
			
			TimeUtil.shortWait();

*/
			
			

		}
	}
