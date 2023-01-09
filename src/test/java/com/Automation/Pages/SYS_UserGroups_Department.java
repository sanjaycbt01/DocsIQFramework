package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;


public class SYS_UserGroups_Department extends ActionEngine {
	Properties prop;
	public static String Department = "";
	public static String Uniquecode = "";
	

	public static String getDepartment() {
		return Department;
	}

	public static void setDepartment(String department) {
		Department = department;
	}

	
	@FindBy(xpath = "//div[@class='menu-toggler sidebar-toggler']")
	WebElement Menu;
	@FindBy(xpath = "//span[@class='title'][contains(text(),'System Manager')]")
	WebElement SystemManager;
	@FindBy(xpath = "//a[contains(text(),'User Groups')]")
	WebElement UserGroups;
	@FindBy(xpath = "//li[@class='nav-item open']//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Initiate')]")
	WebElement Initate;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Configure')]")
	WebElement ConfigurationMenu;
	@FindBy(xpath = "//a[@id='DPTCFG']")
	WebElement ConfigDepMenu;
	@FindBy(id = "DPTINI")
	WebElement DepartmentMenu;
	@FindBy(id = "Department_DeptName")
	WebElement DepartmentName;
	@FindBy(id = "Department_DeptCode")
	WebElement uniquecode;
	@FindBy(id = "Department_Description")
	WebElement Description;
	@FindBy(id = "btnSubmit")
	WebElement Submit;
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	@FindBy(xpath = "//span[@class='confirmation_text']")
	WebElement ConfirmMsg;
	@FindBy(id = "cfnMsg_Next")
	WebElement NextButton;
	@FindBy(xpath = "//li[@class='nav-item open']//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement Audittrails;
	@FindBy(xpath = "//a[@id='DPTAT']")
	WebElement AduitDepartment;
	@FindBy(id = "btnAdvSearch")
	WebElement SearchFilter;
	@FindBy(id = "select2-SearchType-container")
	WebElement SearchByNew;
	@FindBy(xpath = "//span[@class='select2-results']/ul[1]/li[contains(text(),'Unique Code')]")
	WebElement SearchByNewDropdown;
	@FindBy(xpath = "//table[@id='ListTab']/tbody/tr[1]/td[1]")
	WebElement DisplayedRecord;
	@FindBy(xpath = "//input[@id='UniqueCode']")
	WebElement Aud_UniqueCodeField;
	@FindBy(id = "UniqueCode")
	WebElement UniqueCodeText;
	@FindBy(id = "displayBtn")
	WebElement DisplayBtn;
	@FindBy(xpath = "//body//div//td[1]")
	WebElement DepartmentNameHlink;
	@FindBy(id = "MessageDisplay1_lblMessage")
	WebElement Confirmationmsg;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[1]//div[1]//div[1]//div[1]//span[1]")
	WebElement AuditDepartmentName;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div[2]//div[1]//div[1]//div[1]//span[1]")
	WebElement AuditUniquecode;
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//span[1]")
	WebElement AuditDescription;
	@FindBy(xpath = "//body//td[1]")
	WebElement ActionValue;
	@FindBy(xpath = "//body//td[2]")
	WebElement ActionByValue;
	@FindBy(xpath = "//body//td[3]")
	WebElement DateTimeValue;
	@FindBy(xpath = "//div[@id='CompareTRN']//div//div//table//tbody//tr//td//span")
	WebElement RemarksValue;
	@FindBy(xpath = "//body//span[1]//span[1]")
	WebElement ApprovalRequiredValue;
	@FindBy(xpath = "//span[2]//span[1]")
	WebElement ApprovalCompletedValue;
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
	@FindBy(xpath = "//span[@class='popup-close-button']")
	WebElement close;
	@FindBy(xpath = "//a[@href='#']//i[@class='icon-power']")
	WebElement SignoutBtn;
	
	public SYS_UserGroups_Department() {
		PageFactory.initElements(driver, this);
	}

	public void DepartmentConfiguration(String noOfAprReqForInitDrpdwn, String noOfAprReqForModDrpdwn,
			String noOfAprReqForSTCDrpdwn) {
		click(Menu, "Menu");
		click(SystemManager, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(ConfigurationMenu, "Configuration Menu");
		click(ConfigDepMenu, "Departmentmenu");
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
		click(ConfigurationMenu, "Configuration Menu");
		TimeUtil.shortWait();
	}


	public void DepartmentRegistration(String Menuname, String DepartmentNameValue, String uniquecodeValue,
			String DescriptionValue, String InitActionVal, String InitActionByVal, String esign,
			String ApprovalRequiredVal, String ApprovalCompletedVal) {

		click(Menu, "Menu");
		click(SystemManager, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(Initate, "Initatemenu");
		click(DepartmentMenu, "Departmentmenu");
		switchToBodyFrame(driver);
		sendText(DepartmentName, DepartmentNameValue, "DepartmentNametextbox");
		sendText(uniquecode, uniquecodeValue, "uniquecodetextbox");
		sendText(Description, DescriptionValue, "Descriptiontextbox");
		click(Submit, "Submitbutton");
		if (prop.getProperty("ApprovalRequired").equalsIgnoreCase("NO")) {

			switchToDefaultContent(driver);
			jsClick(SignoutBtn, "SignOut Button");
			TimeUtil.shortWait();
		} else {
			TimeUtil.shortWait();

			EsignCnfrm(esign, ConfirmMsg, Menuname + " " + prop.getProperty("RegInitiation"), NextButton);

			// Verifying confirmation message verification and Audit Trail
			

			switchToDefaultContent(driver);
			click(Initate, "Initatemenu");
			click(Audittrails, "AuditTrailsMenu");
			click(AduitDepartment, "Department under AuditTrails");
			switchToBodyFrame(driver);
			SearchRecord(SearchFilter, SearchByNew, SearchByNewDropdown, DisplayedRecord, Aud_UniqueCodeField, DisplayBtn);
			driver.switchTo().frame(0);
			TimeUtil.shortWait();
			verifyExactCaption(AuditDepartmentName, DepartmentNameValue);
			verifyExactCaption(AuditUniquecode, uniquecodeValue);
			verifyExactCaption(AuditDescription, DescriptionValue);
			verifyExactCaption(ActionValue, InitActionVal);
			verifyExactCaption(ActionByValue, InitActionByVal);
			String Currentdate = getCurrentDate("MMM dd yyyy");
			verifyCaptionContains(DateTimeValue, Currentdate);
			verifyCaptionContains(ApprovalRequiredValue, ApprovalRequiredVal);
			verifyCaptionContains(ApprovalCompletedValue, ApprovalCompletedVal);
			click(close, "Close");
		}

	}
	public void DepReg(String DepartmentNameValue, String uniquecodeValue,
			String DescriptionValue) {
		String s = "";
		
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			s = TextUtils.randomvalue(3);
			
			System.out.println("Generated S Value is: " + s);
		}
		setDepartment(Department = DepartmentNameValue + s);

		click(Menu, "Menu");
		click(SystemManager, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(Initate, "Initatemenu");
		click(DepartmentMenu, "Departmentmenu");
		switchToBodyFrame(driver);
		sendText(DepartmentName, Department, "DepartmentNametextbox");
		sendText(uniquecode, uniquecodeValue+s, "uniquecodetextbox");
		sendText(Description, DescriptionValue, "Descriptiontextbox");
		click(Submit, "Submitbutton");

}
}
