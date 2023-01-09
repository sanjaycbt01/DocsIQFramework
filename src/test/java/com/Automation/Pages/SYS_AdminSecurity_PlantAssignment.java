package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;
;

public class SYS_AdminSecurity_PlantAssignment extends ActionEngine
{
	@FindBy(xpath = "//li[@class='menuicon-NIC400  menu-icons product-icon']/a")
	WebElement Menu;
	@FindBy(xpath = "//ul[1]/li[4]/a[contains(text(),'System Manager')]")
	WebElement SystemManagerMenu;
	@FindBy(xpath ="//ul[1]/li[2]/a[contains(text(),'Admin & Security')]")
	WebElement AdminandSecurityMenu;
	@FindBy(xpath = "//a[contains(@class,'sub-menu1')][contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	@FindBy(xpath = "//a[@id='ADPASN']")
	WebElement PlantAssignmentmenu;
	@FindBy(xpath = "//div[@class='col-sm-5 left-side-div']//div[1]/input[1]")
	WebElement SearchBy_New;
	@FindBy(id = "User_Left_rightAll")
	WebElement UserLeftRightAll;
	@FindBy(id ="User_Left_rightSelected")
	WebElement UserLeft;	
	@FindBy(xpath = "//div[@class='col-sm-5 left-side-div']//div[1]/select[1]/option[1]")
	WebElement Selectedplant;
	@FindBy(id = "User_Left_leftSelected")
	WebElement UserRightAll;
	@FindBy(id = "User_Left_leftAll")
	WebElement UserRight;
	@FindBy(id = "btnSubmit")
	WebElement Submitbtn;
	@FindBy(xpath = "//span[contains(@class,'confirmation_text')]")
	WebElement ConfirmationMsg;
	@FindBy(id = "cfnMsg_Next")
	WebElement DoneNewButton;
	@FindBy(xpath = "//ul[@class='sub-menu']//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Audit Trails')]")
	WebElement AuditTrails;
	@FindBy(xpath = "//a[@id='PAAUD']")
	WebElement ATPlantAssignment;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	WebElement EmployeeID;
	@FindBy(id = "SearchTypeDD")
	WebElement SearchBy;
	@FindBy(id = "//input[@value='Display']")
	WebElement DisplayBtn;
	@FindBy(xpath = "//i[@class='ft-filter']")
	WebElement SearchFilter;
	@FindBy(xpath = "//span[@id='select2-SearchType-container']")
	WebElement SearchByNew;
    @FindBy(xpath = "//input[@id='SrhDescription']")
	WebElement SearchfieldLike_New;   
    @FindBy(id = "SrhUniqueCode")
  	WebElement SearchfieldUserName_New;   
	@FindBy(id = "displayBtn")
	WebElement Apply_New;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement SearchBy_NewField;
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[2]")
	WebElement SearchByUserName;
	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[3]")
	WebElement SearchByEmployeeID;
	@FindBy(id = "displayBtn")
	WebElement ApplyNew;
	@FindBy(xpath = "//div[@class='table-responsive']//td[1]")
	WebElement DisplayedRecord;
	@FindBy(xpath = "//div[@class='table-responsive']//td[1]")
	WebElement ATDisplayedRecord;	
	@FindBy(id = "AuditEventModal_View")
	WebElement ProceedBtn;
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div[1]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATUnicode;		
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div//div[2]//div[1]//div[1]//div[1]//span[1]")
	WebElement ATUserName;	
	@FindBy(xpath = "//body//div[@id='CompareTRN']//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//span[1]")
	WebElement AssignedPlant;	
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
	public SYS_AdminSecurity_PlantAssignment() {
		PageFactory.initElements(driver, this);
	}

//	Initiate PlantAssignment
	

	public void PlantAssign(String Plantname,String UserName, String EmployeeID,
			String initActionVal, String initActionByVal,  String ApprovalRequiredVal,
			String ApprovalCompletedVal) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager Menu");
	    click(AdminandSecurityMenu, "Admin and SecurityMenu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		TimeUtil.shortWait();
		js.executeScript("arguments[0].click();", PlantAssignmentmenu);
		switchToBodyFrame(driver);
		click(SearchFilter, "SearchFilter");
		click(SearchByNew, "SearchByNew");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Ele1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        jse.executeScript("arguments[0].value='User Name_New';", Ele1);
		TimeUtil.mediumWait();
		click(SearchByUserName, "SearchByNewDropdown");
		sendText(SearchfieldUserName_New, EmployeeID, "UserName field");
		TimeUtil.shortWait();
		click(ApplyNew, "Display");
		TimeUtil.shortWait();
		click(DisplayedRecord, "Displayed Record");
		sendText(SearchBy_New, Plantname, "Search field");
		TimeUtil.shortWait();
		click(Selectedplant, "Selectedplant button");
		click(UserLeft, "UserLeft button");
		click(Submitbtn, "Submit button");
		TimeUtil.shortWait();
		saveUniqueCode(driver,ConfirmationMsg);
		String msg =getConfirmationmsg(driver, ConfirmationMsg);
		verifyCaptionContains(ConfirmationMsg, msg);
		String unicode = getUniqueCode();
		verifyCaptionContains(ConfirmationMsg, unicode);
		click(DoneNewButton, "Next Button");
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
		click(InitiateMenu, "Initiate Menu");
		TimeUtil.shortWait();
		click(AuditTrails, "Audit Trails Menu");
		click(ATPlantAssignment, "plantAssignment under AuditTrails");
		switchToBodyFrame(driver);
		click(SearchFilter, "SearchFilter");
		click(SearchByNew, "SearchByNew");
		WebElement Ele = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        jse.executeScript("arguments[0].value='User Name_New';", Ele);
		TimeUtil.mediumWait();
		click(SearchByUserName, "SearchByNewDropdown");
		sendText(SearchfieldUserName_New, EmployeeID, "UserName field");
		TimeUtil.shortWait();
		click(ApplyNew, "Display");
		TimeUtil.shortWait();
		click( ATDisplayedRecord, "Displayed Record");
		driver.switchTo().frame(0);
		verifyUniqueCode(ATUnicode);
		verifyExactCaption(ATUserName, UserName);
		verifyExactCaption(AssignedPlant, Plantname);
		verifyExactCaption(ActionValue, initActionVal);
		verifyExactCaption(ActionByValue, initActionByVal);
		String Currentdate = getCurrentDate("MMM d yyyy");
		verifyCaptionContains(DateTimeValue, Currentdate);
		verifyCaptionContains(ApprovalRequiredValue, ApprovalRequiredVal);
		verifyCaptionContains( ApprovalCompletedValue, ApprovalCompletedVal);
		click(CloseBtn, "Close");

	}
	public void PlantAssgn(String Plantname,String EmployeeID
			) {

		click(Menu, "Menu");
		click(SystemManagerMenu, "System Manager Menu");
	    click(AdminandSecurityMenu, "Admin and SecurityMenu");
		TimeUtil.shortWait();
		click(InitiateMenu, "Initatemenu");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		TimeUtil.shortWait();
		js.executeScript("arguments[0].click();", PlantAssignmentmenu);
		switchToBodyFrame(driver);
		click(SearchFilter, "SearchFilter");
		click(SearchByNew, "SearchByNew");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Ele1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        jse.executeScript("arguments[0].value='User Name_New';", Ele1);
		TimeUtil.mediumWait();
		click(SearchByUserName, "SearchByNewDropdown");
		sendText(SearchfieldUserName_New, EmployeeID, "UserName field");
		TimeUtil.shortWait();
		click(ApplyNew, "Display");
		TimeUtil.shortWait();
		click(DisplayedRecord, "Displayed Record");
		sendText(SearchBy_New, Plantname, "Search field");
		TimeUtil.shortWait();
		click(Selectedplant, "Selectedplant button");
		click(UserLeft, "UserLeft button");
		click(Submitbtn, "Submit button");
		TimeUtil.shortWait();
		switchToDefaultContent(driver);
		click(InitiateMenu, "Initatemenu");
		
		TimeUtil.shortWait();
	}
}
