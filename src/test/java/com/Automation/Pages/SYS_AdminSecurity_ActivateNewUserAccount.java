package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;



public class SYS_AdminSecurity_ActivateNewUserAccount extends ActionEngine
{
	@FindBy(xpath = "//div[@class='menu-toggler sidebar-toggler']")
	WebElement Menu;
	@FindBy(xpath = "//span[contains(@class,'title')][contains(text(),'System Manager')]")
	WebElement SystemManager;
	@FindBy(xpath = "//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Admin & Security')]")
	WebElement AdminandSecurityMenu;
	@FindBy(xpath = "//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	@FindBy(xpath = "//a[@id='ADANUA']")
	WebElement ActivateNewUserAccount;
	@FindBy(xpath = "//table[@class='table dataTable']//tbody/tr/td[1]")
	WebElement UserName;
	@FindBy(xpath = "//table[@class='table dataTable']//tbody/tr/td[4]")
	WebElement Activate;
	@FindBy(id = "btnSubmit")
	WebElement Submit;
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	
	public SYS_AdminSecurity_ActivateNewUserAccount() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ActivateNewUser( String UserName, String EmployeeID,String eSign
			) {

		click(Menu, "Menu");
		click(SystemManager, "System Manager Menu");
		click(AdminandSecurityMenu, "Admin and SecurityMenu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		click(ActivateNewUserAccount, "ActivateNewUserAccount menu");
		TimeUtil.shortWait();
		SelectRadioBtnAndCheckbox(driver, Activate);
		sendText(Esign, eSign, "Esign");
		click(EsignProceed, "Proceedbtn");
		TimeUtil.shortWait();

}
}
