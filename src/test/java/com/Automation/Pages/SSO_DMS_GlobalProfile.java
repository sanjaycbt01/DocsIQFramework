package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class SSO_DMS_GlobalProfile extends ActionEngine {
	
	Properties prop;
	
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;
	
	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;
	
	@FindBy(xpath = "//a[@id='GPROF']")
	WebElement SetGlobalProfile;
	
	
	
	@FindBy(xpath = "//span[text()='Technical']")
	WebElement Category ;
	
	
	//@FindBy(xpath = "//ul[@id='select2-GlobalProfile_CategoryId-results']/li[1]")
//	WebElement CategorySearchoption;
	
	
	//@FindBy(xpath = "//input[@class='select2-search__field']")
	//WebElement CategorySearchField;
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']") //id="select2-RoleRegistration_CategoryId-result-qqyw-1"
	WebElement Technical;
	
	
	@FindBy(xpath = "//span[@id='select2-GlobalProfile_RoleId-container']")
	
	WebElement Role;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	
	WebElement RoleSearchField;
	
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_RoleId-results']/li[1]")
	
	WebElement RoleSearchoption;
	
	
	
/*
	@FindBy(xpath = "//span[text()='Technical']")
	WebElement Category ;
	
	//@FindBy(xpath = "//input[@class='select2-search__field']")
	//WebElement CategorySearchField;
	
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_CategoryId-results']/li[1]")
	WebElement CategorySearchoption;
	
	@FindBy(xpath = "//span[@id='select2-GlobalProfile_RoleId-container']")
	WebElement Role;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RoleSearchField;
	
	*/
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[0].CheckAll']")
	WebElement  IMManInitiateCheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[1].CheckAll']")
	WebElement  IMModifycheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[2].CheckAll']")
	WebElement IMAudittrailscheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[3].CheckAll']")
	WebElement IMReportscheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[0].CheckAll']")
	WebElement SMAdminandSecuritycheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[1].CheckAll']")
	
	WebElement  SMConfigurationcheckbox;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Submitbutton ;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;
	
	

	
	
	
	public SSO_DMS_GlobalProfile() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ssodmsglobalprofile( String Roleval, String eSign)
	{
		waitForPageToLoad(3000);
		
		String Rolevalue = DMS_Roleregistrationflow.getEMProle();
		
		
		
        click(Sysmantab, "System mmanager tab");
		
		click(Adminandsecurity, "Admin and security tab");
		
		click(Initiate, "Initiation tab");
		
		click(SetGlobalProfile, "SetGlobalProfile tab");
		
		switchToBodyFrame(driver);
		
		

		click(Category, "Empcategory TxtBx");
		
		click(Technical, "Empcategory TxtBx");
		
		
		click(Role, "Role Field");
		
		sendText(RoleSearchField, Rolevalue, "RoleSearchField txt");
		
		click(RoleSearchoption, "Role Searchoption");
		
		
		
        click(IMManInitiateCheckbox, "Identity Manager Initiate checkbox");
        
        click(IMModifycheckbox, "Identity Manager Modify checkbox");
        
        click(IMAudittrailscheckbox, "Identity Manager Audit trail checkbox");
        
        click(IMReportscheckbox, "Identity Manager Reports checkbox");
        
        click(SMAdminandSecuritycheckbox, "System Manager Admin and Security checkbox");
        
        click(SMConfigurationcheckbox, "System Manager Configuration Checkbox");
        
        click(Submitbutton, "Set Global profile submit button");
        
        
        
       
		
		E_sign.e_Sign(eSign);
		
		
		 TimeUtil.shortWait();
		
		
		click(nextbtn, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		
		
		
		click(Initiate, "Initiation tab");
		
		TimeUtil.shortWait();
		click(Signout, "Signout button");
		TimeUtil.shortWait();
		
		
		
   /*     
        
        E_sign.e_Sign(eSign);
        
        click(nextbtn, "Done button");
		
		click(Initiate, "Initiation tab");
		
		
		//E_sign.e_Sign(eSign);
		
		switchToDefaultContent(driver);
		
		TimeUtil.shortWait();
	/*	
		click(Category, "CategoryField");
		sendText(CategorySearchField, Categoryval, "CategorySearchField txt");
		click(CategorySearchoption, "Category Searchoption");
		click(Role, "Role Field");
		sendText(RoleSearchField, Roleval, "RoleSearchField txt");
		click(RoleSearchoption, "Role Searchoption");
		
		
		----------------------------------------
		
		click(Category, "EmpCategory Txtfield");
     	
     	
        click(CategorySearchoption, "EmpCategory searchoption Txtfield");
        
        click(Role, "Role tab");
        
        click(RoleSearchField, "Role search field tab");
        
		
		*/
	}
	


	

}
