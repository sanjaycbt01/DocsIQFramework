package com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class SetGlobalProfile extends ActionEngine {
	@FindBy(xpath = "//a[@class='caliber-product-tms product-icon1']")
	WebElement Menu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager']/preceding-sibling::a")
	WebElement SystemManagerMenu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager_Admin & Security']/child::li/a[contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager_Admin & Security']/preceding-sibling::a")
	WebElement AdminandSecurityMenu;
	@FindBy(xpath = "//a[@id='TMS_System Manager_Admin & Security_MEN66_MEN122']")
	WebElement SetGlobalProfile;
	@FindBy(xpath = "//span[@id='select2-GlobalProfile_CategoryId-container']")
	WebElement Category;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement CategorySearchField;
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_CategoryId-results']/li[1]")
	WebElement CategorySearchoption;
	@FindBy(xpath = "//span[@id='select2-GlobalProfile_RoleId-container']")
	WebElement Role;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement RoleSearchField;
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_RoleId-results']/li[1]")
	WebElement RoleSearchoption;
	@FindBy(id = "SMDChk_1")
	WebElement Initiate;
	@FindBy(id = "SMDChk_2")
	WebElement propose;
	@FindBy(id = "SMDChk_3")
	WebElement Approve;
	@FindBy(id = "SMDChk_4")
	WebElement Prepare;
	@FindBy(id = "SMDChk_5")
	WebElement Record;
	@FindBy(id = "SMDChk_6")
	WebElement Respond;
	@FindBy(id = "SMDChk_7")
	WebElement Evaluate;
	@FindBy(id = "SMDChk_8")
	WebElement ReInitiation;
	@FindBy(id = "SMDChk_9")
	WebElement Modify;
	@FindBy(id = "SMDChk_10")
	WebElement Edit;
	@FindBy(id = "SMDChk_11")
	WebElement StatusChange;
	@FindBy(id = "SMDChk_12")
	WebElement Configure;
	@FindBy(id = "SMDChk_13")
	WebElement AuditTrails;
	@FindBy(id = "SMDChk_18")
	WebElement RITransfer;
	@FindBy(id = "SMDChk_16")
	WebElement Reports;
	@FindBy(id = "SMDChk_25")
	WebElement DMInitiate;
	@FindBy(id = "SMDChk_26")
	WebElement DMModify;
	@FindBy(id = "SMDChk_27")
	WebElement DMStatusChange;
	@FindBy(id = "SMDChk_28")
	WebElement DMApprove;
	@FindBy(id = "SMDChk_29")
	WebElement DMReinitiation;
	@FindBy(id = "SMDChk_30")
	WebElement DMRITransfer;
	@FindBy(id = "SMDChk_32")
	WebElement DMAuditTrails;
	@FindBy(id = "SMDChk_17")
	WebElement AdminSecurity;
	@FindBy(id = "SMDChk_21")
	WebElement MailSettings;
	@FindBy(id = "SMDChk_22")
	WebElement Biometrics;
	@FindBy(id = "SMDChk_15")
	WebElement UserGroups;
	@FindBy(id = "btnSubmit")
	WebElement Submit;

	public SetGlobalProfile() {
		PageFactory.initElements(driver, this);
	}

	public void GlobalProfile(String Categoryval, String Roleval, String eSign) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager Menu");
		click(AdminandSecurityMenu, "Admin and SecurityMenu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		click(SetGlobalProfile, "SetGlobalProfile Menu");
		switchToBodyFrame(driver);
		click(Category, "CategoryField");
		sendText(CategorySearchField, Categoryval, "CategorySearchField txt");
		click(CategorySearchoption, "Category Searchoption");
		click(Role, "Role Field");
		sendText(RoleSearchField, Roleval, "RoleSearchField txt");
		click(RoleSearchoption, "Role Searchoption");
		SelectRadioBtnAndCheckbox(driver, Initiate);
		SelectRadioBtnAndCheckbox(driver, propose);
		SelectRadioBtnAndCheckbox(driver, Approve);
		SelectRadioBtnAndCheckbox(driver, Prepare);
		SelectRadioBtnAndCheckbox(driver, Record);
		SelectRadioBtnAndCheckbox(driver, Respond);
		SelectRadioBtnAndCheckbox(driver, Evaluate);
		SelectRadioBtnAndCheckbox(driver, ReInitiation);
		SelectRadioBtnAndCheckbox(driver, Modify);
		TimeUtil.shortWait();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		SelectRadioBtnAndCheckbox(driver, Edit);
		SelectRadioBtnAndCheckbox(driver, StatusChange);
		SelectRadioBtnAndCheckbox(driver, Configure);
		SelectRadioBtnAndCheckbox(driver, AuditTrails);
		SelectRadioBtnAndCheckbox(driver, RITransfer);
		SelectRadioBtnAndCheckbox(driver, Reports);
		SelectRadioBtnAndCheckbox(driver, DMInitiate);
		SelectRadioBtnAndCheckbox(driver, DMModify);
		SelectRadioBtnAndCheckbox(driver, DMStatusChange);
		SelectRadioBtnAndCheckbox(driver, DMApprove);
		SelectRadioBtnAndCheckbox(driver, DMReinitiation);
		SelectRadioBtnAndCheckbox(driver, DMRITransfer);
		SelectRadioBtnAndCheckbox(driver, DMAuditTrails);
		SelectRadioBtnAndCheckbox(driver, AdminSecurity);
		SelectRadioBtnAndCheckbox(driver, MailSettings);
		SelectRadioBtnAndCheckbox(driver, Biometrics);
		SelectRadioBtnAndCheckbox(driver, UserGroups);
		click(Submit, "Submit Button");
		E_sign.e_Sign(eSign);
		switchToDefaultContent(driver);
		TimeUtil.shortWait();

	}
}
