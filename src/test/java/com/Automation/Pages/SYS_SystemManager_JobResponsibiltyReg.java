package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TimeUtil;
/*
public class SYS_SystemManager_JobResponsibiltyReg extends ActionEngine 
{
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
	@FindBy(xpath = "//ul[@id='TMS_System Manager_User Groups']/child::li/a[contains(text(),'Approve')]")
	WebElement ApproveMenu;
	@FindBy(id = "TMS_System Manager_User Groups_MEN18_SUBMEN10")
	WebElement JobResponsibiltyConfig;
	@FindBy(id = "TMS_System Manager_User Groups_MEN66_SUBMEN10")
	WebElement JobResponsbilityMenu;
	@FindBy(id = "TMS_System Manager_User Groups_MEN07_SUBMEN10")
	WebElement jobResponsibiltyAprvMenu;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]")
	WebElement Searchbtn;
	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	WebElement SearchField;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchTxt;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	WebElement SearchFieldOption;
	@FindBy(xpath = "//table[@id='CrsListTab']/tbody/tr[1]/td[1]")
	WebElement DisplayCourse;
	@FindBy(xpath = "//div[1]/span[2]/span[1]/span[1]/span[1]")
	WebElement Department;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchFieldtxt;
	@FindBy(xpath = "//ul[@id='select2-JobResponsibility_DeptCode-results']/li[1]")
	WebElement DepartmentFieldoption;
	@FindBy(id = "JobResponsibility_DOJ_btn")
	WebElement DateofJoining;
	@FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]/select[1]")
	WebElement MElement;
	@FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]/select[2]")
	WebElement YElement;
	@FindBy(xpath = "//input[@id='JobResponsibility_Employee_FindTxt']")
	WebElement Find_New;
	@FindBy(xpath = "//input[@id='JobResponsibility_Employee_DisplayBtn']")
	WebElement EMPApply_New;
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement EmployeeRB;
	@FindBy(xpath = "//button[@id='JobResponsibility_Employee_selectBtn']")
	WebElement Add_New;
	@FindBy(xpath = "//textarea[@id='JobResponsibility_JobDescription']")
	WebElement JobResponsibilty;
	@FindBy(xpath = "//button[@id='btnModal_JobResponsibility_AdptPopUpVc']")
	WebElement AuthorizedDeputy;
	@FindBy(xpath = "//input[@id='JobResponsibility_AdptPopUpVc_FindTxt']")
	WebElement AuthorizedDeputyFind_New;
	@FindBy(xpath = "//input[@id='JobResponsibility_AdptPopUpVc_DisplayBtn']")
	WebElement AuthorizedDeputyApply_New;
	@FindBy(xpath = "//table[@id='ListTab']//tbody/tr[1]/td[1]/input[1]")
	WebElement AuthorizedDeputyEmployeeRB;
	@FindBy(xpath = "//button[@id='JobResponsibility_AdptPopUpVc_selectBtn']")
	WebElement AuthorizedDeputyAdd_New;
	@FindBy(xpath = "//button[@id='btnModal_JobResponsibility_DmsDoc']")
	WebElement Externalcerificates;
	@FindBy(xpath = "//button[@id='JobResponsibility_DmsDocUploadFileTabBtn']")
	WebElement UploadFiles;
	@FindBy(xpath = "//input[@id='DocumentCode']")
	WebElement DocumentCode;
	@FindBy(xpath = "//input[@id='DocumentDesc']")
	WebElement DocumentDescription;
	@FindBy(xpath = "//input[@id='DocumentDesc']")
	WebElement Keywords_New;
	@FindBy(xpath = "//button[@id='JobResponsibility_DmsDoc_submitBtn']")
	WebElement Upload_New;
	@FindBy(xpath = "//button[@id='JobResponsibility_DmsDocSearchFileTabBtn']")
	WebElement SearchFiles;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
	WebElement DocumentCodeAdd_New;
	@FindBy(xpath = "//button[@id='JobResponsibility_DmsDoc_selectBtn']")
	WebElement Documentuploader_New;
	@FindBy(xpath = "//span[@id='select2-JobResponsibility_AppSubGrpsApp_Select-container']")
	WebElement ApproverNew;
	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	WebElement ApproverSearchNew;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	WebElement ApproverNewoption;
	@FindBy(id = "JobResponsibility_Qualification")
	WebElement Qualification;
	@FindBy(id = "JobResponsibility_PreviousExperience")
	WebElement PreviousExperience;
	@FindBy(xpath = "//input[@id='SelectedDecision_2']")
	WebElement ApproveRadioBtn;
	@FindBy(id = "Remarks")
	WebElement RemarksReason;
	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement Submit;
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	@FindBy(xpath = "//span[contains(@class,'confirmation_text')]")
	WebElement ConfirmationMsg;
	@FindBy(id = "cfnMsg_Next")
	WebElement NextButton;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement AuditTrails;
	@FindBy(xpath = "//span[@id='JOBAT']")
	WebElement AduitjobResponsibilty;
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
	WebElement Aud_UniqueCodeField;
	@FindBy(id = "displayBtn")
	WebElement Display;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]")
	WebElement SearchByEmployeeNameOption;
	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	WebElement SearchByEmployeeID;
	@FindBy(xpath = "//input[@id='UniqueCode']")
	WebElement EmployeeIDTxt;
	@FindBy(xpath = "//input[@id='EmployeeId']")
	WebElement EmpID;
	@FindBy(xpath = "//input[@id='EmployeeName']")
	WebElement EmployeeName;
	@FindBy(xpath = "//input[@id='Description']")
	WebElement EmployeeNameAprv;
	@FindBy(xpath = "//button[@id='displayBtn']")
	WebElement Apply_New;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchBy_NewField;
	@FindBy(xpath = "//div[@class='table-responsive']//td[1]")
	WebElement DisplayedRecord;
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement ActionValue;
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement ActionByValue;
	@FindBy(xpath = "//tbody/tr[1]/td[3]")
	WebElement DateTimeValue;
	@FindBy(xpath = "//div[@class='approve-status']/span[1]/span[1]")
	WebElement ApprovalRequiredValue;
	@FindBy(xpath = "//div[@class='approve-status']/span[2]/span[1]")
	WebElement ApprovalCompletedValue;
	@FindBy(xpath = "//span[@class='popup-close-button']")
	WebElement close;
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
	@FindBy(xpath = "//ul[@id='select2-Config_NarAtCreate-results']/li[1]")
	WebElement SearchSel1;
	@FindBy(xpath = "//ul[@id='select2-Config_NarAtModify-results']/li[1]")
	WebElement SearchSel2;
	@FindBy(xpath = "//ul[@id='select2-Config_NarAtStatusChange-results']/li[1]")
	WebElement SearchSel3;
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	@FindBy(xpath = "//a[@href='#']//i[@class='icon-power']")
	WebElement SignoutBtn;

	public SYS_SystemManager_JobResponsibiltyReg() {
		PageFactory.initElements(driver, this);
	}

	public void JobResponsibiltyConfiguration(String noOfAprReqForInitDrpdwn, String noOfAprReqForModDrpdwn,
			String noOfAprReqForSTCDrpdwn) {
	/*
	 * 
	 * 
	 * 	click(Menu, "Menu");
	 */
	/*	click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(ConfigurationMenu, "Configuration Menu");
		click(JobResponsibiltyConfig, "JobResponsibiltyConfig Menu");
		TimeUtil.shortWait();
		switchToBodyFrame(driver);
		unCheckRadioBtnCheckbox(driver, EsignAtInitCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtModInitCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtSTCInitCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtInitAprCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtModAprCheckBox);
		unCheckRadioBtnCheckbox(driver, EsignAtSTCAprCheckBox);
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
		click(NoOfAprReqForSTCDrpdwn, "NoOfAprReqForSTCDrpdwn");
		WebElement Element2 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Element2.sendKeys(noOfAprReqForModDrpdwn);
		TimeUtil.shortWait();
		click(SearchSel3, "SearchSel");
		sendText(Remarks, "Configured", "RemarksVal");
		click(SubmitBtn, "Submit Button");
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
	}

	public void jobResponsibiltyRegistration(String EmpName, String Docpath, String JobRes, String Departmentval,
			String AuthorizeEmpName, String SubGroupNameValue, String Qualificationval, String PreviousExperienceval) {
		click(Menu, "Menu");
		click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(InitiateMenu, "Initatemenu");
		click(JobResponsbilityMenu, "jobResponsibilty Menu");
		switchToBodyFrame(driver);
		click(SearchFilter, "SearchFilter");
		click(SearchByNew, "SearchByNew");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Ele1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		jse.executeScript("arguments[0].value='Employee Name';", Ele1);
		TimeUtil.mediumWait();
		click(SearchByEmployeeNameOption, "SearchByNewDropdown");
		TimeUtil.shortWait();
		String username = IM_UserRegistration.getName();
		sendText(EmployeeName,EmpName, "EmployeeID Txt");
		TimeUtil.shortWait();
		click(Apply_New, "Display");
		TimeUtil.shortWait();
		click(DisplayedRecord, "Displayed Record");
		sendText(JobResponsibilty, JobRes, "JobRes textbox");
		click(Department, "Department Button");
		SearchFieldtxt.sendKeys(Departmentval);
		TimeUtil.shortWait();
		click(DepartmentFieldoption, "DepartmentField option");
		click(DateofJoining, "DateofJoining");
		selectCurrentdate();
//		selectDateonNextReviewCalender(MElement, YElement, ConfigsReader.getPropValue("Month"),
//				ConfigsReader.getPropValue("Day"), ConfigsReader.getPropValue("Year"));
		click(AuthorizedDeputy, "AuthorizedDeputy Textarea");
		sendText(AuthorizedDeputyFind_New, AuthorizeEmpName, "Find textbox");
		click(AuthorizedDeputyApply_New, "Apply_New Button");
		TimeUtil.shortWait();
		SelectRadioBtnAndCheckbox(driver, AuthorizedDeputyEmployeeRB);
		click(AuthorizedDeputyAdd_New, "Add_New Button");
		TimeUtil.shortWait();
		click(Externalcerificates, "Externalcerificates Button");
		click(DocumentCodeAdd_New, "DocumentCodeAdd_New Button");
		click(Documentuploader_New, "Documentuploader_New Button");
		sendText(Qualification, Qualificationval, "Qualification textbox");
		sendText(PreviousExperience, PreviousExperienceval, "Find textbox");
		click(ApproverNew, "ApproverNew Button");
		TimeUtil.shortWait();
		ApproverSearchNew.sendKeys(SubGroupNameValue);
		click(ApproverNewoption, "ApproverNewoption");
		click(Submit, "Submitbutton");
		switchToDefaultContent(driver);
		TimeUtil.shortWait();

	}

	public void jobResponsibiltyAprv(String EmpName) 
	{
		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager Menu");
		click(UserGroups, "UserGroups menu");
		click(ApproveMenu, "Approve Menu");
		click(jobResponsibiltyAprvMenu, "JobResponsbility menu");
		switchToBodyFrame(driver);
		click(SearchFilter, "SearchFilter");
		click(SearchByNew, "SearchByNew");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Ele1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		jse.executeScript("arguments[0].value='Employee Name';", Ele1);
		TimeUtil.mediumWait();
		click(SearchByEmployeeNameOption, "SearchByNewDropdown");
		TimeUtil.shortWait();
		String username = IM_UserRegistration.getName();
		sendText(EmployeeNameAprv,EmpName, "EmployeeID Txt");
		TimeUtil.shortWait();
		click(Apply_New, "Display");
		TimeUtil.shortWait();
		click(DisplayedRecord, "Displayed Record");
		click(ApproveRadioBtn, "Approve Radio Button");
		clearField(RemarksReason, "Remarks / Reason");
		sendText(RemarksReason, "Approved", "Remarks Reason");
		click(Submit, "Submit Button");
		TimeUtil.shortWait();

	}
}*/
