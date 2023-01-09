package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;
/*

public class SYS_UserGroups_SubGroupAssignment extends ActionEngine {
	Properties prop;
	@FindBy(xpath = "//a[@class='caliber-product-tms product-icon1']")
	WebElement Menu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager']/preceding-sibling::a")
	WebElement SystemManagerMenu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager_User Groups']/child::li/a[contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	@FindBy(xpath = "//ul[@id='TMS_System Manager_User Groups']/preceding-sibling::a")
	WebElement UserGroups;
	@FindBy(xpath = "//ul[@id='TMS_System Manager_User Groups']/child::li/a[contains(text(),'Configure')]")
	WebElement ConfigurationMenu;
	@FindBy(id = "TMS_System Manager_User Groups_MEN18_SUBMEN17")
	WebElement SubGroupAssignmentConfig;
	@FindBy(id = "TMS_System Manager_User Groups_MEN66_SUBMEN17")
	WebElement SubGroupAssignment;
	@FindBy(xpath = "//div[@class='conrol-column col-sm-12 p-2 border rounded']/input[1]")
	WebElement UserName;
	@FindBy(xpath = "//ul[@id='SgpAsn_Users_ul']/li[1]")
	WebElement Useroption;
	@FindBy(xpath = "//div[@class='conrol-column col-sm-12 p-2 border rounded']/input[2]")
	WebElement SubgroupNameRB;
	@FindBy(xpath = "//ul[@id='SgpAsn_Subgrps_ul']/li[1]")
	WebElement SubgroupNameNew;
	@FindBy(id = "SgpAsn_TreeVC_SearchTxt")
	WebElement EmpSearchTxt;
	@FindBy(xpath = "//a[contains(text(),'Fetch Records')]")
	WebElement FetchRecords;
	@FindBy(xpath = "//div[@class='conrol-column col-sm-12 p-2 border rounded']/a[3]")
	WebElement ClearAllUsers;
	@FindBy(xpath = "//input[@id='SearchTxt']")
	WebElement SearchTxt;
	@FindBy(xpath = "//ul[@id='SgpAsn_Users_ul']/li[1]")
	WebElement SelectEmployeeNameNew;
	@FindBy(xpath = "//div[@class='conrol-column col-sm-12 p-2 border rounded']/a[2]")
	WebElement AddEmpname;
	@FindBy(xpath = "//div[@class='conrol-column col-sm-12 p-2 border rounded']/a[4]")
	WebElement AddSubGroupname;
	@FindBy(id = "btnSubmit")
	WebElement Submit;
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	@FindBy(xpath = "//span[contains(@class,'confirmation_text')]")
	WebElement ConfirmationMsg;
	@FindBy(id = "cfnMsg_Next")
	WebElement NextButton;
	@FindBy(xpath = "//body//div[@id='MainTRN']//div//div//div//div//div[1]//div[1]//div[1]//div[1]//span[2]")
	WebElement Alert;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement AuditTrails;
	@FindBy(xpath = "//a[@id='SGPASNAT']")
	WebElement AduitSubgroupAssignment;
	@FindBy(id = "SearchTypeDD")
	WebElement SearchBy;
	@FindBy(id = "//input[@value='Display']")
	WebElement DisplayBtn;
	@FindBy(xpath = "//i[@class='ft-filter']")
	WebElement SearchFilter;
	@FindBy(xpath = "//span[@id='select2-SearchType-container']")
	WebElement SearchByNew;
	@FindBy(xpath = "//span[@class='select2-results']/ul[1]/li[contains(text(),'Unique Code')]")
	WebElement SearchByNewDropdown;
	@FindBy(xpath = "//input[@id='UniqueCode']")
	WebElement UnicodeLike_New;
	@FindBy(xpath = "//input[@id='Description']")
	WebElement EmpNameLike_New;
	@FindBy(id = "displayBtn")
	WebElement Apply_New;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchBy_NewField;
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[2]")
	WebElement SearchByEmpName;
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[3]")
	WebElement SearchByUniquecode;
	@FindBy(xpath = "//input[@id='UniqueCode']")
	WebElement Aud_UniqueCodeField;
	@FindBy(id = "displayBtn")
	WebElement ApplyNew;
	@FindBy(xpath = "//div[@class='table-responsive']//td[1]")
	WebElement DisplayedRecord;
	@FindBy(id = "AuditEventModal_View")
	WebElement ProceedBtn;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[1]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATEmployeeName;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[2]//div[1]//div[1]//div[1]//span[1]")
	WebElement AssignedSubGroup;
	@FindBy(xpath = "//body//td[1]")
	WebElement ActionValue;
	@FindBy(xpath = "//body//td[2]")
	WebElement ActionByValue;
	@FindBy(xpath = "//body//td[3]")
	WebElement DateTimeValue;
	@FindBy(xpath = "//tr[2]//td[4]//span[1]")
	WebElement RemarksValue;
	@FindBy(xpath = "//body//span[1]//span[1]")
	WebElement ApprovalRequiredValue;
	@FindBy(xpath = "//span[2]//span[1]")
	WebElement ApprovalCompletedValue;
	@FindBy(xpath = "//span[@class='popup-close-button']")
	WebElement CloseBtn;
	@FindBy(id = "Config_IsEsignAtCreatInit")
	WebElement EsignAtInitCheckBox;	
	@FindBy(id = "Config_IsEsignAtModifyInit")
	WebElement EsignAtModInitCheckBox;
	@FindBy(id = "Config_IsEsignAtStatusChangeInit")
	WebElement EsignAtSTCInitCheckBox;	
	@FindBy(id = "Config_IsEsignAtCreatAppr")
	WebElement EsignAtInitAprCheckBox;
	@FindBy(id = "Config_IsEsignAtModifyAppr")
	WebElement EsignAtModAprCheckBox;
	@FindBy(id = "Config_IsEsignAtStatusChangeAppr")
	WebElement EsignAtSTCAprCheckBox;
	@FindBy(id = "select2-Config_NarAtCreate-container")
	WebElement NoOfAprReqForRegDrpdwn;	
	@FindBy(id = "select2-Config_NarAtModify-container")
	WebElement NoOfAprReqForModDrpdwn;
	@FindBy(id = "select2-Config_NarAtStatusChange-container")
	WebElement NoOfAprReqForSTCDrpdwn;	
	@FindBy(id = "Config_Remarks")
	WebElement Remarks;	
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtCreate-results']/li[1]")
	WebElement SearchSel1;	
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtModify-results']/li[1]")
	WebElement SearchSel2;
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtStatusChange-results']/li[1]")
	WebElement SearchSel3;
	@FindBy(xpath= "//iframe[@id='bodyFrame']")
	WebElement iframe;
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	@FindBy(xpath = "//i[@class='icon-power']")
	WebElement SignoutButn;

	public SYS_UserGroups_SubGroupAssignment() {
		PageFactory.initElements(driver, this);
	}

	public void SubGroupAssignGroupConfiguration(String noOfAprReqForInitDrpdwn, String noOfAprReqForModDrpdwn
			) {
	/*
		click(Menu, "Menu");
	 /*
		click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(ConfigurationMenu, "Configuration Menu");
		click(SubGroupAssignmentConfig, "SubGroupAssignmentConfig Menu");
		TimeUtil.shortWait();
		switchToBodyFrame(driver);
		unCheckRadioBtnCheckbox(driver, EsignAtInitCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtModInitCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtInitAprCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtModAprCheckBox);
		click(NoOfAprReqForRegDrpdwn, "NoOfAprReqForRegDrpdwn");
		WebElement Element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Element.sendKeys(noOfAprReqForInitDrpdwn);
		TimeUtil.shortWait();
		click(SearchSel1, "SearchSel");
		click(NoOfAprReqForModDrpdwn, "NoOfAprReqForModDrpdwn");	
		WebElement Element1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Element1.sendKeys(noOfAprReqForModDrpdwn);
		TimeUtil.shortWait();
		click(SearchSel2, "SearchSel");
		sendText(Remarks, "Configured", "RemarksVal");
		click(SubmitBtn, "Submit Button");
//		switchToDefaultContent(driver);
//		click(ConfigurationMenu, "Configuration Menu");
		TimeUtil.shortWait();
	}

	public void SubgroupRegistration(String Menuname, String EmpName, String Subgroupvalue, String eSign,
			String initActionVal, String initActionByVal, String ApprovalRequiredVal, String ApprovalCompletedVal) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		click(SubGroupAssignment, "SubGroupAssign menu");
		switchToBodyFrame(driver);
		SelectRadioBtnAndCheckbox(driver, UserName);
		sendText(EmpSearchTxt, EmpName, "Findtextbox");
		click(FetchRecords, "FetchRecords button");
		TimeUtil.shortWait();
		click(AddEmpname, "AddEmpname button");
		TimeUtil.shortWait();
		clearField(EmpSearchTxt, "SearchTxt Field");
		SelectRadioBtnAndCheckbox(driver, SubgroupNameRB);
		String SubgroupNamevalue = SYS_UserGroups_SubGroup.getSubGroupval();
		sendText(EmpSearchTxt, SubgroupNamevalue, "Findtextbox");
		click(FetchRecords, "FetchRecords button");
		click(AddSubGroupname, "SubGroup Name");
		click(Submit, "Submitbutton");
		if (prop.getProperty("ApprovalRequired").equalsIgnoreCase("NO")) {

			switchToDefaultContent(driver);
			jsClick(SignoutButn, "SignOut Button");
			TimeUtil.shortWait();
		} else {
			TimeUtil.shortWait();

			EsignCnfrm(eSign, ConfirmationMsg, Menuname + " " + prop.getProperty("RegInitiation"), NextButton);

			// AudiTrails

			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(InitiateMenu, "Initiate Menu");
			TimeUtil.shortWait();
			click(AuditTrails, "Audit Trails Menu");
			click(AduitSubgroupAssignment, "SubGroupAssignment under AuditTrails");
			switchToBodyFrame(driver);
			SearchRecord(SearchFilter, SearchByNew, SearchByNewDropdown, DisplayedRecord, Aud_UniqueCodeField,
					DisplayBtn);
			driver.switchTo().frame(0);
			TimeUtil.shortWait();
			verifyExactCaption(ATEmployeeName, EmpName);
			verifyExactCaption(AssignedSubGroup, Subgroupvalue);
			verifyExactCaption(ActionValue, initActionVal);
			verifyExactCaption(ActionByValue, initActionByVal);
			String Currentdate = getCurrentDate("dd MMM yyyy");
			verifyCaptionContains(DateTimeValue, Currentdate);
			verifyCaptionContains(ApprovalRequiredValue, ApprovalRequiredVal);
			verifyCaptionContains(ApprovalCompletedValue, ApprovalCompletedVal);
			click(CloseBtn, "Close");

		}

	}

	public void SubgroupAssignReg(String EmpName, String Subgroupvalue) {
		click(Menu, "Menu");
		click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		click(SubGroupAssignment, "SubGroupAssign menu");
		switchToBodyFrame(driver);
		SelectRadioBtnAndCheckbox(driver, UserName);
		TimeUtil.shortWait();
		String username = IM_UserRegistration.getName();
		sendText(EmpSearchTxt,EmpName, "Findtextbox");
		click(FetchRecords, "FetchRecords button");
		TimeUtil.shortWait();
		click(Useroption, "AddEmpname button");
		TimeUtil.shortWait();
		clearField(EmpSearchTxt, "SearchTxt Field");
		SelectRadioBtnAndCheckbox(driver, SubgroupNameRB);
		String SubgroupNamevalue = SYS_UserGroups_SubGroup.getSubGroupval();
		sendText(EmpSearchTxt, SubgroupNamevalue, "Findtextbox");
		click(FetchRecords, "FetchRecords button");
		click(AddSubGroupname, "SubGroup Name");
		click(Submit, "Submitbutton");
		TimeUtil.shortWait();
		switchToDefaultContent(driver);
//		click(InitiateMenu, "Initatemenu");
//		click(UserGroups, "UserGroups menu");
//		click(SystemManagerMenu, "SystemManagermenu");
//		switchToDefaultContent(driver);
		TimeUtil.mediumWait();

	}*/

