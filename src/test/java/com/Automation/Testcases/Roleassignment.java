package com.Automation.Testcases;



import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class Roleassignment extends ActionEngine {
	/*Properties prop;
	@FindBy(xpath = "//ul[1]/li[4]/a[1]//span[contains(text(),'System Manager')]")
	WebElement SystemManager;
	@FindBy(xpath = "//ul[1]/li[4]/ul[@class='sub-menu']/li[1]/a[contains(text(),'Admin & Security')]")
	WebElement AdminSecurityMenu;
	@FindBy(xpath = "//ul[1]/li[1]/ul[@class='sub-menu']/li[1]/a[contains(text(),'Initiate')]")
	WebElement InitiateMenu;
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
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	public Roleassignment() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is for RoleAssignment
	 * 
	 */
	public void RoleAssign(String user, String Role, String eSign) {

	/*	String s = "";
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			s = TextUtils.randomvalue(3);
			System.out.println("Generated S Value is: " + s);
		}
		String username = UserRegistration.getName();
		click(SystemManager, "SystemManager Menu");
		click(AdminSecurityMenu, "AdminSecurity Menu");
		click(InitiateMenu, "Initiate Menu");
		click(RoleAssignment, "RoleAssignment Menu");
		switchToBodyFrame(driver);
		click(SearchFilterbtn, "SearchFilter button");
		TimeUtil.shortWait();
		click(SearchBy, "SearchBy button");
		sendText(SearchByUser, "User Name", "SearchBy User");
		click(UserOption, "User  Option");
		sendText(UserNameTxt, '%'+username+'%', "UserName Txtbox");
		click(Apply, "Apply  Button");
		click(RoleDd, "RoleDd  Button");
		sendText(Searchfield, Role, "Searchfield Role");
		click(Searchfieldoption, "Searchfield option");
		click(Submit, "Submit Button");
		E_sign.e_Sign(eSign);
		switchToDefaultContent(driver);
		click(InitiateMenu, "Initiate Menu");
		TimeUtil.shortWait();*/

	}
}
