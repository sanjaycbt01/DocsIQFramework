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

public class SYS_UserGroups_Group extends ActionEngine {
	Properties prop;
	public static String Groupval = "";

	public static String getGroupval() {
		return Groupval;
	}

	public static void setGroup(String Group) {
		Groupval = Group;
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
	@FindBy(id = "TMS_System Manager_User Groups_MEN18_SUBMEN08")
	WebElement GroupCnfgMenu;
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
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtCreate-results']/li[1]")
	WebElement SearchSel1;	
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtModify-results']/li[1]")
	WebElement SearchSel2;
	@FindBy(xpath= "//ul[@id='select2-Config_NarAtStatusChange-results']/li[1]")
	WebElement SearchSel3;
	@FindBy(id = "Config_Remarks")
	WebElement Remarks;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]")
	WebElement SearchSel;
	@FindBy(xpath = "//iframe[@id='bodyFrame']")
	WebElement iframe;
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Search;
	@FindBy(id = "TMS_System Manager_User Groups_MEN66_SUBMEN08")
	WebElement Group;
	@FindBy(id = "Groups_GrpDesc")
	WebElement GroupNameTxt;
	@FindBy(id = "Groups_Description")
	WebElement DescriptionTxt;
	@FindBy(xpath = "//div[@class='form-group']//input[@class='form-control']")
	WebElement AvailableSubgroup_SearchNew;
	@FindBy(xpath = "//div[@class='form-group left-side-list']//input[@type='text']")
	WebElement SelectedSubgroup;
	@FindBy(id = "Groups_Left")
	WebElement AvailableSubgroupList;
	@FindBy(id = "Groups_Left_to")
	WebElement SelSubgroupList;
	@FindBy(xpath = "//select[@id='Groups_Left']//option")
	WebElement AvailableSubgroup1;
	@FindBy(id = "Groups_Left_rightAll")
	WebElement RightToggle1;
	@FindBy(id = "Groups_Left_rightSelected")
	WebElement RightToggle2;
	@FindBy(id = "Groups_Left_leftSelected")
	WebElement LeftToggle1;
	@FindBy(id = "Groups_Left_leftAll")
	WebElement LeftToggle2;
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
	@FindBy(xpath = "//div[@class='sub-page-layout-footer-actions']//button[@class='caliber-button-tertiary existingList']")
	WebElement ViewExistingitems;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement AuditTrails;
	@FindBy(xpath = "//a[@id='GRPAT']")
	WebElement AduitGroup;
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
	@FindBy(id = "displayBtn")
	WebElement Display;
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
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div[2]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATGroupName;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div//div[1]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATUniquecode;
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATDescription;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div[4]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATSubgroup;
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
	@FindBy(xpath = "//i[@class='icon-power']")
	WebElement SignoutButn;

	public SYS_UserGroups_Group() {
		PageFactory.initElements(driver, this);
	}

	public void GroupConfiguration(String noOfAprReqForInitDrpdwn, String noOfAprReqForModDrpdwn,
					String noOfAprReqForSTCDrpdwn) {
				click(Menu, "Menu");
				click(SystemManagerMenu, "SystemManagermenu");
				click(UserGroups, "UserGroups menu");
				click(ConfigurationMenu, "Configuration Menu");
				click(GroupCnfgMenu, "GroupCnfg Menu");
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
			     jsClick(Menu, "Menu");
			}

	public void GroupRegistration(String Menuname, String GroupNameValue, String DescriptionValue, String Subgroupvalue,
			String InitActionVal, String InitActionByVal, String esign, String ApprovalRequiredVal,
			String ApprovalCompletedVal) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager menu");
		click(UserGroups, "UserGroups menu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		TimeUtil.shortWait();
		click(Group, "Group menu");
		switchToBodyFrame(driver);
		click(Submit, "Submitbutton");
		isAlertPresent(driver);
		sendText(GroupNameTxt, GroupNameValue, "GroupNametextbox");
		sendText(DescriptionTxt, DescriptionValue, "Descriptiontextbox");
		String SubgroupNamevalue = SYS_UserGroups_SubGroup.getSubGroupval();
		sendText(AvailableSubgroup_SearchNew, SubgroupNamevalue, "Sub group");
		TimeUtil.shortWait();
		click(AvailableSubgroup1, "AvailableSubgroup1");
		click(RightToggle2, "RightToggle2");
		click(Submit, "Submitbutton");
		if (prop.getProperty("ApprovalRequired").equalsIgnoreCase("NO")) {

			switchToDefaultContent(driver);
			jsClick(SignoutButn, "SignOut Button");
			TimeUtil.shortWait();
		} else {
			TimeUtil.shortWait();

			EsignCnfrm(esign, ConfirmationMsg, Menuname + " " + prop.getProperty("RegInitiation"), NextButton);

			// AudiTrails

			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(InitiateMenu, "Initiate Menu");
			TimeUtil.shortWait();
			jsClick(AuditTrails, "AuditTrails Menu");
			click(AduitGroup, "Group under AuditTrails");
			switchToBodyFrame(driver);
			SearchRecord(SearchFilter, SearchByNew, SearchByNewDropdown, DisplayedRecord, Aud_UniqueCodeField, Display);
			driver.switchTo().frame(0);
			TimeUtil.shortWait();
			verifyUniqueCode(ATUniquecode);
			verifyExactCaption(ATDescription, DescriptionValue);
			verifyExactCaption(ActionValue, InitActionVal);
			verifyExactCaption(ActionByValue, InitActionByVal);
			String Currentdate = getCurrentDate("dd MMM yyyy");
			verifyCaptionContains(DateTimeValue, Currentdate);
			verifyCaptionContains(ApprovalRequiredValue, ApprovalRequiredVal);
			verifyCaptionContains(ApprovalCompletedValue, ApprovalCompletedVal);
			click(CloseBtn, "Close");

		}
	}

	public void GroupReg(String GroupNameValue, String DescriptionValue, String Subgroupvalue) {

		String s = "";
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			s = TextUtils.randomvalue(3);
			System.out.println("Generated S Value is: " + s);
		}
		setGroup(Groupval = GroupNameValue + s);
		String SubgroupNamevalue = SYS_UserGroups_SubGroup.getSubGroupval();
		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager menu");
		click(UserGroups, "UserGroups menu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		click(Group, "Group menu");
		switchToBodyFrame(driver);
		sendText(GroupNameTxt, Groupval, "GroupNametextbox");
		sendText(DescriptionTxt, DescriptionValue, "Descriptiontextbox");
		sendText(AvailableSubgroup_SearchNew, SubgroupNamevalue, "Sub group");
		TimeUtil.shortWait();
		click(AvailableSubgroup1, "AvailableSubgroup1");
		click(RightToggle2, "RightToggle2");
		TimeUtil.shortWait();
		jsClick(Submit, "Submitbutton");
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
		

	}
}
