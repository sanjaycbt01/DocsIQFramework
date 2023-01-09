package com.Automation.Pages;



	import java.util.Properties;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.Automation.Base.ActionEngine;
	import com.Automation.Utils.ConfigsReader;
	import com.Automation.Utils.TextUtils;
	import com.Automation.Utils.TimeUtil;

	public class UserRegistration extends ActionEngine {

		public static String Name = "";

		public static String getName() {
			return Name;
		}

		public static void setName(String name) {
			Name = name;
		}

		Properties prop;
		@FindBy(xpath = "//ul[1]/li[3]/a[1]//span[contains(text(),'Identity Manager')]")
		WebElement identityManager;
		@FindBy(xpath = "//ul[1]/li[3]/ul[@class='sub-menu']/li[1]/a[contains(text(),'Initiate')]")
		WebElement InitiateMenu;
		@FindBy(id = "USERREG")
		WebElement UserRegistration;
		@FindBy(xpath = "//button[@id='btnModal_UserRegistration_Designation']/span")
		WebElement Designation;
		@FindBy(id = "UserRegistration_Designation_FindTxt")
		WebElement FindTxt;
		@FindBy(id = "UserRegistration_Designation_DisplayBtn")
		WebElement ApplyTxt;
		@FindBy(xpath = "//table[@id='ListTab']/tbody/tr[1]/td[1]//input[1]")
		WebElement DesignationRB;
		@FindBy(id = "UserRegistration_Designation_selectBtn")
		WebElement Addbtn;
		@FindBy(id = "UserRegistration_FirstName")
		WebElement firstname;
		@FindBy(id = "UserRegistration_LastName")
		WebElement lastname;
		@FindBy(id = "UserRegistration_UserCode")
		WebElement UserID;
		@FindBy(id = "UserRegistration_EmployeeID")
		WebElement EmployeeID;
		@FindBy(id = "UserRegistration_TemporaryPassword")
		WebElement Temporarypassword;
		@FindBy(id = "btnSubmit")
		WebElement Submitbtn;
		@FindBy(id = "txtESignPassword")
		WebElement Esign;
		@FindBy(id = "Submit_Esign")
		WebElement EsignProceed;
		@FindBy(id = "SelectedDecision_2")
		WebElement Cnfrm;
		@FindBy(id = "SelectedDecision_3")
		WebElement Return;
		@FindBy(xpath= "//textarea[@id='Remarks']")
		WebElement Remarks;
		@FindBy(id = "ChangePassword_CurPswd")
		WebElement ChangeCurrentPWD;
		@FindBy(id = "ChangePassword_NewPswd")
		WebElement ChangeNewPWD;
		@FindBy(id = "ChangePassword_RetypPSwd")
		WebElement ChangeRetypePWD;
		@FindBy(xpath = "//a[@id='logoutBtn']")
		WebElement Signout;

		
		

		public UserRegistration() {
			PageFactory.initElements(driver, this);
		}

		/**
		 * This method is for userRegistration
		 * 
		 */
		public void userRegistration(String Designationval, String firstnameval, String lastnameval, String UserIDval,
				String EmployeeIDval, String eSign) {

			String s = "";
			String s1 = "";
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
				s = TextUtils.randomvalue(3);
				s1=TextUtils.randomAlphaNumeric(2);
				System.out.println("Generated S Value is: " + s);
			}
			setName(Name = UserIDval + s);
			click(identityManager, "identityManager Menu");
			click(InitiateMenu, "InitiateMenu Menu");
			click(UserRegistration, "UserRegistration Menu");
			switchToBodyFrame(driver);
			click(Designation, "Designation Button");
			sendText(FindTxt, Designationval, "FindTxt Button");
			click(ApplyTxt, "ApplyTxt Button");
			SelectRadioBtnAndCheckbox(driver, DesignationRB);
			click(Addbtn, "Add Button");
			sendText(firstname, s1+firstnameval+ s, "firstname txt");
			sendText(lastname, lastnameval+s+s1, "lastname txt");
			sendText(UserID, Name, "UserID txt");
			sendText(EmployeeID, Name, "EmployeeID txt");
			saveTempPassword(driver, Temporarypassword, test);
			click(Submitbtn, "Submit button");
			E_sign.e_Sign(eSign);
			TimeUtil.shortWait();
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(InitiateMenu, "InitiateMenu Menu");
			

		}
		public void userReg(String Designationval, String firstnameval, String lastnameval, String UserIDval,
				String EmployeeIDval, String eSign) {

			String s = "";
			String s1 = "";
			
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
				s = TextUtils.randomvalue(3);
				s1=TextUtils.randomAlphaNumeric(2);
				System.out.println("Generated S Value is: " + s);
			}
			setName(Name = UserIDval+s1);
			click(identityManager, "identityManager Menu");
			click(InitiateMenu, "InitiateMenu Menu");
			click(UserRegistration, "UserRegistration Menu");
			switchToBodyFrame(driver);
			click(Designation, "Designation Button");
			sendText(FindTxt, Designationval, "FindTxt Button");
			click(ApplyTxt, "ApplyTxt Button");
			TimeUtil.shortWait();
			SelectRadioBtnAndCheckbox(driver, DesignationRB);
			click(Addbtn, "Add Button");
			sendText(firstname, firstnameval+s1, "firstname txt");
			sendText(lastname, lastnameval+s, "lastname txt");
			sendText(UserID, Name, "UserID txt");
			sendText(EmployeeID,  Name, "EmployeeID txt");	
			saveTempPassword(driver, Temporarypassword, test);
			click(Submitbtn, "Submit button");
			E_sign.e_Sign(eSign);
			TimeUtil.shortWait();
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(InitiateMenu, "InitiateMenu Menu");
		
		}
		/**
		 * This method is for userRegistration
		 * 
		 */
		public void userReg() {
		
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			switchToBodyFrame(driver);
			SelectRadioBtnAndCheckbox(driver, Cnfrm);
			sendText(Remarks,"Registration cnfrm", "Remarks txt");
			click(Submitbtn, "Submit button");
			enterTempPwd(driver, Esign);
			click(EsignProceed, "Proceedbtn");
			switchToDefaultContent(driver);
			TimeUtil.shortWait();

	}
		/**
		 * This method is for UserResetPWD
		 * 
		 */
		public void userResetPWD(String pwd) {

			
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			switchToBodyFrame(driver);
			enterTempPwd(driver, ChangeCurrentPWD);
			sendText(ChangeNewPWD,pwd, "Remarks txt");
			sendText(ChangeRetypePWD,pwd, "Remarks txt");
			click(Submitbtn, "Submit button");
			switchToDefaultContent(driver);
			TimeUtil.shortWait();
			click(Signout, "Signout button");
			TimeUtil.shortWait();

	}
	}


