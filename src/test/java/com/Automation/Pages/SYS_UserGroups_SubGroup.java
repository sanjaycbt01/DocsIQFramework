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

public class SYS_UserGroups_SubGroup extends ActionEngine {
	Properties prop;
	public static String SubGroupval = "";

	public static String getSubGroupval() {
		return SubGroupval;
	}

	public static void setSubGroup(String subGroup) {
		SubGroupval = subGroup;
	}

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
	@FindBy(id = "TMS_System Manager_User Groups_MEN18_SUBMEN16")
	WebElement SubGroupConfig;
	@FindBy(id = "TMS_System Manager_User Groups_MEN66_SUBMEN16")
	WebElement SubGroup;
	@FindBy(id = "Subgroup_SubgrpDesc")
	WebElement SubGroupNameTxt;
	@FindBy(id = "Subgroup_Description")
	WebElement DescriptionText;
	@FindBy(id = "Subgroup_JDSC")
	WebElement JobResponsibilityTxt;
	@FindBy(id = "btnSubmit")
	WebElement Submit;
	@FindBy(xpath = "//span[@id='Subgroup_SubgrpDesc-error']")
	WebElement Alert;
	@FindBy(id = "txtESignPassword")
	WebElement Esign;
	@FindBy(id = "Submit_Esign")
	WebElement EsignProceed;
	@FindBy(xpath = "//span[contains(@class,'confirmation_text')]")
	WebElement ConfirmationMsg;
	@FindBy(id = "cfnMsg_Next")
	WebElement DoneNewButton;
	@FindBy(id = "cfnMsg_Next")
	WebElement NextButton;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement AuditTrails;
	@FindBy(xpath = "//a[@title='System Manager_New->User Groups_New->Audit Trails_New->Subgroup']")
	WebElement AduitSubgroup;
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
	@FindBy(id = "Description")
	WebElement GroupLike_New;
	@FindBy(xpath = "//input[@id='UniqueCode']")
	WebElement UnicodeLike_New;
	@FindBy(id = "displayBtn")
	WebElement Apply_New;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchBy_NewField;
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[2]")
	WebElement SearchByGroupName;
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
	WebElement ATSubGroupName;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[2]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATUniquecode;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[3]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATDescription;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[4]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATJobResponsibility;
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
	WebElement CloseBtn;
	@FindBy(xpath = "//i[@class='icon-power']")
	WebElement SignoutButn;

	public SYS_UserGroups_SubGroup() {
		PageFactory.initElements(driver, this);
	}

	public void SubGroupConfiguration(String noOfAprReqForInitDrpdwn, String noOfAprReqForModDrpdwn,String noOfAprReqForSTCDrpdwn) 
	{
		click(Menu, "Menu");
		click(SystemManagerMenu, "SystemManagermenu");
		click(UserGroups, "UserGroups menu");
		click(ConfigurationMenu, "Configuration Menu");
		click(SubGroupConfig, "SubGroup Config");
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
		Element2.sendKeys(noOfAprReqForSTCDrpdwn);
		TimeUtil.shortWait();
		click(SearchSel3, "SearchSel");
		sendText(Remarks, "Configured", "RemarksVal");
		click(SubmitBtn, "Submit Button");
        switchToDefaultContent(driver);
	     jsClick(Menu, "Menu");

	}

	public void SubgroupRegistration(String Menuname, String Alertmsg, String ExpectedLabelvalues,
			String SubGroupNameValue, String DescriptionValue, String JobResponsibilityValue, String Expectedspanvalues,
			String esign, String InitActionVal, String InitActionByVal, String ApprovalRequiredVal,
			String ApprovalCompletedVal) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager menu");
		click(UserGroups, "UserGroups menu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		TimeUtil.shortWait();
		click(SubGroup, "SubGroup Menu");
		switchToBodyFrame(driver);
		click(Submit, "Submitbutton");
		isAlertPresent(driver);
		verifyExactCaption(Alert, Alertmsg);
		sendText(SubGroupNameTxt, SubGroupNameValue, "SubGroupName textbox");
		sendText(DescriptionText, DescriptionValue, "Description textbox");
		sendText(JobResponsibilityTxt, JobResponsibilityValue, "JobResponsibility textbox");
		click(Submit, "Submitbutton");
		if (prop.getProperty("ApprovalRequired").equalsIgnoreCase("NO")) {

			switchToDefaultContent(driver);
			jsClick(SignoutButn, "SignOut Button");
			TimeUtil.shortWait();
		} else {
			TimeUtil.shortWait();

			EsignCnfrm(esign, ConfirmationMsg, Menuname + " " + prop.getProperty("RegInitiation"), NextButton);
			// Audit Trail verification
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(InitiateMenu, "Initiate Menu");
			TimeUtil.shortWait();
			jsClick(AuditTrails, "AuditTrails Menu");
			AduitSubgroup.click();
			switchToBodyFrame(driver);
			SearchRecord(SearchFilter, SearchByNew, SearchByNewDropdown, DisplayedRecord, Aud_UniqueCodeField,
					DisplayBtn);
			driver.switchTo().frame(0);
			TimeUtil.shortWait();
			verifyExactCaption(ATSubGroupName, SubGroupNameValue);
			verifyUniqueCode(ATUniquecode);
			verifyExactCaption(ATDescription, DescriptionValue);
			verifyExactCaption(ATJobResponsibility, JobResponsibilityValue);
			verifyExactCaption(ActionValue, InitActionVal);
			verifyExactCaption(ActionByValue, InitActionByVal);
			String Currentdate = getCurrentDate("dd MMM yyyy");
			verifyCaptionContains(DateTimeValue, Currentdate);
			verifyCaptionContains(ApprovalRequiredValue, ApprovalRequiredVal);
			verifyCaptionContains(ApprovalCompletedValue, ApprovalCompletedVal);
			click(CloseBtn, "Close");

		}

	}

	public void SubgroupReg(String SubGroupNameValue, String DescriptionValue, String JobResponsibilityValue) {
		String s = "";
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			s = TextUtils.randomvalue(3);
			System.out.println("Generated S Value is: " + s);
		}
		setSubGroup(SubGroupval = SubGroupNameValue + s);
		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager menu");
		click(UserGroups, "UserGroups menu");
		click(InitiateMenu, "Initatemenu");
		click(SubGroup, "SubGroup Menu");
		switchToBodyFrame(driver);
		sendText(SubGroupNameTxt, SubGroupval, "SubGroupName textbox");
		sendText(DescriptionText, DescriptionValue, "Description textbox");
		sendText(JobResponsibilityTxt, JobResponsibilityValue, "JobResponsibility textbox");
		click(Submit, "Submitbutton");
		TimeUtil.shortWait();
		switchToDefaultContent(driver);
	

	}
}
