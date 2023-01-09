package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;

public class DMSLoginpage extends ActionEngine {
	
	@FindBy(id = "company")
	WebElement companyTxtBx;

	@FindBy(id = "username")
	WebElement userNameTxtBx;

	@FindBy(id = "password")
	WebElement passwordTxtBx;
	
	@FindBy(id = "txtUserIdVis")
	WebElement SSOuserNameTxtBx;

	@FindBy(id = "txtPasswordVis")
	WebElement SSOpasswordTxtBx;
	
	@FindBy(id = "LoginBtn")
	WebElement SSOloginBtn;

	@FindBy(id = "btnSubmit")
	WebElement loginBtn;
	
	@FindBy(id = "ddlSelectedPlant_238")
	WebElement Plant1;
	
	@FindBy(id = "ddlSelectedPlant_239")
	WebElement Plant2;
	
	
	@FindBy(id = "ddlSelectedPlant_254")
	WebElement CPLHYD;
	
	@FindBy(xpath= "MenuModule_DMS")
	WebElement DMSmodule;
	
	@FindBy(id = "DMS_System Manager")
	WebElement SystemManagerMenu;
	
	@FindBy(id = "DMS_System Manager_Admin & Security")
	WebElement AdminAndSecurity;
	
	@FindBy(xpath = "//*[@name='Initiate']")
	WebElement Initiate;
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0069")
	WebElement Registorrole;
	
	
	@FindBy(id = "logout")
	//@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;
	
	//This initElements method will create all WebElements
		public DMSLoginpage() {
			PageFactory.initElements(driver, this);
			
		}
	
	public void dmsLogin(String company,String userNme,String pwd)
	{
		waitForPageToLoad(3000);
     	sendText(companyTxtBx, company, "company Txtfield");
		sendText(userNameTxtBx, userNme, "userName");
		click(passwordTxtBx, "passwordTxtBx");
		sendText(passwordTxtBx, pwd, "pwd");
		click(loginBtn, "Login Button");
	}
	
	

}
