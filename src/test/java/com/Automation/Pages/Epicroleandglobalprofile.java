package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class Epicroleandglobalprofile extends ActionEngine {

	Properties prop;

	public static String EMPlevel = "";
	public static String EMProle = "";
	public static String EMProlevalepic = "";

	public static String EMPlevepic2 = "";
	public static String EMProleepic2 = "";
	public static String EMProlevalepic2 = "";

	public static String EMPlevepic3 = "";
	public static String EMProleepic3 = "";
	public static String EMProlevalepic3 = "";

	// -----
	public static String getEMPlevepic() {
		return EMPlevel;
	}

	public static void setEMPlevepic(String Emplevelepica) {
		EMPlevel = Emplevelepica;
	}

	public static String getEMProleepic() {
		return EMProle;
	}

	public static void setEMProleepic(String Emproleepica) {
		EMProle = Emproleepica;
	}

	public static String getEMProlevalepic() {
		return EMProlevalepic;
	}

	public static void setEMProlevalepic(String Rolevalepica) {
		EMProlevalepic = Rolevalepica;
	}

	// -------

	public static String getEMPlevepic2() {
		return EMPlevepic2;
	}

	public static void setEMPlevepic2(String Emplevelepicb) {
		EMPlevepic2 = Emplevelepicb;
	}

	public static String getEMProleepic2() {
		return EMProleepic2;
	}

	public static void setEMProleepic2(String Emproleepicb) {
		EMProleepic2 = Emproleepicb;
	}

	public static String getEMProlevalepic2() {
		return EMProlevalepic2;
	}

	public static void setEMProlevalepic2(String Rolevalepicb) {
		EMProlevalepic2 = Rolevalepicb;
	}

	// -------

	public static String getEMPlevepic3() {
		return EMPlevepic3;
	}

	public static void setEMPlevepic3(String Emplevelepicaz) {
		EMPlevepic3 = Emplevelepicaz;
	}

	public static String getEMProleepic3() {
		return EMProleepic3;
	}

	public static void setEMProleepic3(String Emproleepicaz) {
		EMProleepic3 = Emproleepicaz;
	}

	public static String getEMProlevalepic3() {
		return EMProlevalepic3;
	}

	public static void setEMProlevalepic3(String Rolevalepicaz) {
		EMProlevalepic3 = Rolevalepicaz;
	}

	// ddlSelectedPlant_2

	@FindBy(id = "ddlSelectedPlant_2")
	WebElement planbutton;

	@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
	WebElement xbutton;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Documentmanagericon;

	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
	WebElement Systemmagermenu;

	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	WebElement Adminsecuritymenu;

	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	WebElement Initiatemenu;

	@FindBy(xpath = "//a[@id='DMS_System Manager_Admin & Security_MENU0152_MENU0069']")
	WebElement Registorrolemenu;

	// -----------------------------------------------------

	@FindBy(id = "RoleRegistration_RoleRegistrationCode")
	WebElement level;

	@FindBy(id = "RoleRegistration_RoleRegistrationDesc")
	WebElement roleTxtbox;

	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement Category;

	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement Technical;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement CatSearchField;

	@FindBy(xpath = "//ul[@id='select2-RoleRegistration_CategoryId-results']")
	WebElement Categoryoption;

	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_CategoryId-results']/li[1]")
	WebElement Catoption;

	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0084")
	WebElement setglobalprofilemenu;

	// =====================================================================

	@FindBy(xpath = "//span[text()='Technical']")
	WebElement GCategory;

	@FindBy(xpath = "//span[@class='select2-selection__arrow']") // id="select2-RoleRegistration_CategoryId-result-qqyw-1"
	WebElement GTechnical;

	@FindBy(xpath = "//span[@id='select2-GlobalProfile_RoleId-container']")

	WebElement Role;

	@FindBy(xpath = "//input[@class='select2-search__field']")

	WebElement RoleSearchField;

	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_RoleId-results']/li[1]")

	WebElement RoleSearchoption;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[0].CheckAll']")
	WebElement DMmastersCheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[1].CheckAll']")
	WebElement DMTransactionscheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[2].CheckAll']")
	WebElement DMmodifycheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[3].CheckAll']")
	WebElement DMStatuschangecheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[4].CheckAll']")
	WebElement DMApporvalCheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[5].CheckAll']")
	WebElement DMReinitiatecheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[6].CheckAll']")
	WebElement DMAudittrailcheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[7].CheckAll']")
	WebElement DMReportscheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[0].CheckAll']")
	WebElement CONinitiatecheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[1].CheckAll']")

	WebElement CONmodifycheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[2].CheckAll']")
	WebElement CONstatuschangecheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[3].CheckAll']")

	WebElement CONapporvalcheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[4].CheckAll']")
	WebElement CONreinitiatecheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[5].CheckAll']")

	WebElement CONtransfercheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[6].CheckAll']")
	WebElement CONaudittrailcheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[2].SMDList[0].CheckAll']")

	WebElement SMadminandsecuritycheckbox;

	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[2].SMDList[1].CheckAll']")

	WebElement SMconfigurtioncheckbox;

	@FindBy(id = "btnSubmit_1")
	WebElement subbutton;

	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;

	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logout;

	// @FindBy(xpath = "//a[@id='logoutBtn']")
	// WebElement Signout;

	// This initElements method will create all WebElements

	public Epicroleandglobalprofile() {
		PageFactory.initElements(driver, this);

	}

	/*
	 * 
	 * public void epicroleandglobalprofilecreation(String Emplevelepic,String
	 * Emproleepic,String Rolevalepic,String Emplevelepic2,String
	 * Emproleepic2,String Rolevalepic2,String Emplevelepic3,String
	 * Emproleepic3,String Rolevalepic3, String eSign) {
	 * 
	 * String s = ""; String randomval="";
	 * 
	 * String randomval1="";
	 * 
	 * String randomval2="";
	 * 
	 * prop =
	 * ConfigsReader.readProperties("./configs/configuration.properties"); if
	 * (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
	 * 
	 * s = TextUtils.randomvalue(1); randomval=
	 * Integer.toString(TextUtils.randomNumber(1));
	 * 
	 * randomval1= Integer.toString(TextUtils.randomNumber(2));
	 * 
	 * randomval2= Integer.toString(TextUtils.randomNumber(4));
	 * 
	 * }
	 * 
	 * setEMPlevepic(EMPlevepic =Emplevelepic+randomval);
	 * setEMProleepic(EMProleepic = Emproleepic+s);
	 * setEMProlevalepic(EMProlevalepic = Rolevalepic+s);
	 * 
	 * setEMPlevepic2(EMPlevepic2 =Emplevelepic2+randomval1);
	 * setEMProleepic2(EMProleepic2 = Emproleepic2+s);
	 * setEMProlevalepic2(EMProlevalepic2 = Rolevalepic2+s);
	 * 
	 * setEMPlevepic(EMPlevepic3 =Emplevelepic3+randomval2);
	 * setEMProleepic(EMProleepic3 = Emproleepic3+s);
	 * setEMProlevalepic(EMProlevalepic3 = Rolevalepic3+s);
	 * 
	 * 
	 * 
	 * 
	 * waitForPageToLoad(3000);
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * //switchToBodyFrame(driver);
	 * 
	 * // click(planbutton, "Xbutton menu");
	 * 
	 * click(xbutton, "Xbutton menu");
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(Registorrolemenu, "Registor role menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * // click(level, "EmpLevel Txtfield"); sendText(level,Emplevelepic,
	 * "EmpLevel Txtfield");
	 * 
	 * // click(Role, "Emprole Txtfield"); sendText(roleTxtbox, Emproleepic,
	 * "Emprole Txtfield");
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * click(Categoryoption, "Empcategory TxtBx");
	 * 
	 * click(subbutton, "reg role submitbutton");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(setglobalprofilemenu, "set globalprofile menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * click(Catoption, "Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Role, "Role Field");
	 * 
	 * sendText(RoleSearchField, Rolevalepic, "RoleSearchField txt");
	 * 
	 * click(RoleSearchoption, "Role Searchoption");
	 * 
	 * 
	 * 
	 * click(DMmastersCheckbox, "Documentmanagern masters Checkbox");
	 * 
	 * click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");
	 * 
	 * click(DMmodifycheckbox, "Documentmanager modify checkbox");
	 * 
	 * click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");
	 * 
	 * click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");
	 * 
	 * click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");
	 * 
	 * click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");
	 * 
	 * click(DMReportscheckbox, "Documentmanager Reports checkbox");
	 * 
	 * click(CONinitiatecheckbox, "CONfiguration initiate checkbox");
	 * 
	 * click(CONmodifycheckbox, "CONfiguration modify checkbox");
	 * 
	 * click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");
	 * 
	 * click(CONapporvalcheckbox, "CONfiguration apporval checkbox");
	 * 
	 * click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");
	 * 
	 * click(CONtransfercheckbox, "CONfiguration transfer checkbox");
	 * 
	 * click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");
	 * 
	 * click(SMadminandsecuritycheckbox,
	 * "System manager adminandsecurity checkbox");
	 * 
	 * click(SMconfigurtioncheckbox, "System manager configurtion checkbox");
	 * 
	 * click(subbutton, "Set Global profile submit button");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(Registorrolemenu, "Registor role menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * // click(level, "EmpLevel Txtfield"); sendText(level, Emplevelepic2,
	 * "EmpLevel Txtfield");
	 * 
	 * // click(Role, "Emprole Txtfield"); sendText(roleTxtbox, Emproleepic2,
	 * "Emprole Txtfield");
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * click(Categoryoption, "Empcategory TxtBx");
	 * 
	 * click(subbutton, "reg role submitbutton");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * // TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(setglobalprofilemenu, "set globalprofile menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * click(Catoption, "Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Role, "Role Field");
	 * 
	 * sendText(RoleSearchField, Rolevalepic2, "RoleSearchField txt");
	 * 
	 * click(RoleSearchoption, "Role Searchoption");
	 * 
	 * 
	 * 
	 * click(DMmastersCheckbox, "Documentmanagern masters Checkbox");
	 * 
	 * click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");
	 * 
	 * click(DMmodifycheckbox, "Documentmanager modify checkbox");
	 * 
	 * click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");
	 * 
	 * click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");
	 * 
	 * click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");
	 * 
	 * click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");
	 * 
	 * click(DMReportscheckbox, "Documentmanager Reports checkbox");
	 * 
	 * click(CONinitiatecheckbox, "CONfiguration initiate checkbox");
	 * 
	 * click(CONmodifycheckbox, "CONfiguration modify checkbox");
	 * 
	 * click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");
	 * 
	 * click(CONapporvalcheckbox, "CONfiguration apporval checkbox");
	 * 
	 * click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");
	 * 
	 * click(CONtransfercheckbox, "CONfiguration transfer checkbox");
	 * 
	 * click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");
	 * 
	 * click(SMadminandsecuritycheckbox,
	 * "System manager adminandsecurity checkbox");
	 * 
	 * click(SMconfigurtioncheckbox, "System manager configurtion checkbox");
	 * 
	 * click(subbutton, "Set Global profile submit button");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 * 
	 * //TimeUtil.shortWait();
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * //switchToBodyFrame(driver);
	 * 
	 * // click(planbutton, "Xbutton menu");
	 * 
	 * // click(xbutton, "Xbutton menu");
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(Registorrolemenu, "Registor role menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * // click(level, "EmpLevel Txtfield"); sendText(level, Emplevelepic3,
	 * "EmpLevel Txtfield");
	 * 
	 * // click(Role, "Emprole Txtfield"); sendText(roleTxtbox, Emproleepic3,
	 * "Emprole Txtfield");
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * click(Categoryoption, "Empcategory TxtBx");
	 * 
	 * click(subbutton, "reg role submitbutton");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * // TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 * //TimeUtil.shortWait();
	 * 
	 * click(Documentmanagericon, "Document manager icon tab");
	 * 
	 * click(Systemmagermenu, "System mager menu");
	 * 
	 * click(Adminsecuritymenu, "Admin security menu");
	 * 
	 * click(Initiatemenu, "Initiate menu");
	 * 
	 * click(setglobalprofilemenu, "set globalprofile menu");
	 * 
	 * 
	 * switchToBodyFrame(driver);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Category, "Empcategory TxtBx");
	 * 
	 * sendText(CatSearchField, "Technical","Empcategory TxtBx");
	 * 
	 * click(Catoption, "Empcategory TxtBx");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * click(Role, "Role Field");
	 * 
	 * sendText(RoleSearchField, Rolevalepic3, "RoleSearchField txt");
	 * 
	 * click(RoleSearchoption, "Role Searchoption");
	 * 
	 * 
	 * 
	 * click(DMmastersCheckbox, "Documentmanagern masters Checkbox");
	 * 
	 * click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");
	 * 
	 * click(DMmodifycheckbox, "Documentmanager modify checkbox");
	 * 
	 * click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");
	 * 
	 * click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");
	 * 
	 * click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");
	 * 
	 * click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");
	 * 
	 * click(DMReportscheckbox, "Documentmanager Reports checkbox");
	 * 
	 * click(CONinitiatecheckbox, "CONfiguration initiate checkbox");
	 * 
	 * click(CONmodifycheckbox, "CONfiguration modify checkbox");
	 * 
	 * click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");
	 * 
	 * click(CONapporvalcheckbox, "CONfiguration apporval checkbox");
	 * 
	 * click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");
	 * 
	 * click(CONtransfercheckbox, "CONfiguration transfer checkbox");
	 * 
	 * click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");
	 * 
	 * click(SMadminandsecuritycheckbox,
	 * "System manager adminandsecurity checkbox");
	 * 
	 * click(SMconfigurtioncheckbox, "System manager configurtion checkbox");
	 * 
	 * click(subbutton, "Set Global profile submit button");
	 * 
	 * E_sign.e_Sign(eSign);
	 * 
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * click(nextbtn, "Done button");
	 * 
	 * TimeUtil.shortWait();
	 * 
	 * switchToDefaultContent(driver);
	 * 
	 */
	// TimeUtil.shortWait();

	// click(Initiate, "Initiation tab");

	/*
	 * 
	 * TimeUtil.shortWait(); click(logout, "Signout button");
	 * TimeUtil.shortWait();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // E_sign.e_Sign(eSign);
	 * 
	 * 
	 * 
	 * // switchToDefaultContent(driver);
	 * 
	 * }
	 */

	public void epicroleandglobalprofile(String Emplevelepic, String Emproleepic, String eSign) {
		for(int i=0;i<3;i++){
		String s = "";
		String randomval = "";
		boolean multiRole = false;
		
		do{
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
	
				s = TextUtils.randomvalue(3);
				//randomval = Integer.toString(TextUtils.randomNumber(1));
				randomval =Integer.toString(TextUtils.randomNumber(1)) + "." + Integer.toString(TextUtils.randomNumber(1));
			}
	
			setEMPlevepic(EMPlevel = Emplevelepic + randomval);
			setEMProleepic(EMProle = Emproleepic + s);
	
			click(xbutton, "Xbutton menu");
	
			click(Documentmanagericon, "Document manager icon tab");
	
			click(Systemmagermenu, "System mager menu");
	
			click(Adminsecuritymenu, "Admin security menu");
	
			click(Initiatemenu, "Initiate menu");
	
			click(Registorrolemenu, "Registor role menu");
	
			switchToBodyFrame(driver);
	
			// click(level, "EmpLevel Txtfield");
			sendText(level, EMPlevel, "EmpLevel Txtfield");
	
			// click(Role, "Emprole Txtfield");
			sendText(roleTxtbox, EMProle, "Emprole Txtfield");
	
			click(Category, "Empcategory TxtBx");
	
			sendText(CatSearchField, "Technical", "Empcategory TxtBx");
	
			click(Categoryoption, "Empcategory TxtBx");
	
			click(subbutton, "reg role submitbutton");
	
			E_sign.e_Sign(eSign);
			
			
			TimeUtil.shortWait();
			
			
			try {
				multiRole = driver.findElement(By.id("cfnMsg_Back")).isDisplayed();
				if (multiRole == true) {
					driver.findElement(By.id("cfnMsg_Back")).click();
				}
				
			} catch (NoSuchElementException e) {
	
			}
			TimeUtil.shortWait();
			switchToDefaultContent(driver);
		}while(multiRole);
		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver);

		TimeUtil.shortWait();

		click(Documentmanagericon, "Document manager icon tab");

		click(Systemmagermenu, "System mager menu");

		click(Adminsecuritymenu, "Admin security menu");

		click(Initiatemenu, "Initiate menu");

		click(setglobalprofilemenu, "set globalprofile menu");

		switchToBodyFrame(driver);

		click(Category, "Empcategory TxtBx");

		sendText(CatSearchField, "Technical", "Empcategory TxtBx");

		click(Catoption, "Empcategory TxtBx");

		click(Role, "Role Field");

		sendText(RoleSearchField, Emproleepic, "RoleSearchField txt");

		click(RoleSearchoption, "Role Searchoption");

		click(DMmastersCheckbox, "Documentmanagern masters Checkbox");

		click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");

		click(DMmodifycheckbox, "Documentmanager modify checkbox");

		click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");

		click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");

		click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");

		click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");

		click(DMReportscheckbox, "Documentmanager Reports checkbox");

		click(CONinitiatecheckbox, "CONfiguration initiate checkbox");

		click(CONmodifycheckbox, "CONfiguration modify checkbox");

		click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");

		click(CONapporvalcheckbox, "CONfiguration apporval checkbox");

		click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");

		click(CONtransfercheckbox, "CONfiguration transfer checkbox");

		click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");

		click(SMadminandsecuritycheckbox, "System manager adminandsecurity checkbox");

		click(SMconfigurtioncheckbox, "System manager configurtion checkbox");

		click(subbutton, "Set Global profile submit button");

		E_sign.e_Sign(eSign);

		TimeUtil.shortWait();

		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver); 

		TimeUtil.shortWait();

	}

}
	public void epicrole(String Emplevelepic, String Emproleepic, String eSign) {
		for(int i=0;i<3;i++){
		String s = "";
		String randomval = "";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
	
				s = TextUtils.randomvalue(3);
				randomval = Integer.toString(TextUtils.randomNumber(1));
//				randomval =Integer.toString(TextUtils.randomNumber(1,99)) + "." + Integer.toString(TextUtils.randomNumber(1,9));
			}
	
			setEMPlevepic(EMPlevel = Emplevelepic + randomval);
			setEMProleepic(EMProle = Emproleepic + s);
	
			click(xbutton, "Xbutton menu");
	
			click(Documentmanagericon, "Document manager icon tab");
	
			click(Systemmagermenu, "System mager menu");
	
			click(Adminsecuritymenu, "Admin security menu");
	
			click(Initiatemenu, "Initiate menu");
	
			click(Registorrolemenu, "Registor role menu");
	
			switchToBodyFrame(driver);
	
			// click(level, "EmpLevel Txtfield");
			sendText(level, EMPlevel, "EmpLevel Txtfield");
	
			// click(Role, "Emprole Txtfield");
			sendText(roleTxtbox, EMProle, "Emprole Txtfield");
	
			click(Category, "Empcategory TxtBx");
	
			sendText(CatSearchField, "Technical", "Empcategory TxtBx");
	
			click(Categoryoption, "Empcategory TxtBx");
	
			click(subbutton, "reg role submitbutton");
	
			E_sign.e_Sign(eSign);
			TimeUtil.shortWait();
			
	
		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver);

		TimeUtil.shortWait();

		click(Documentmanagericon, "Document manager icon tab");

		click(Systemmagermenu, "System mager menu");

		click(Adminsecuritymenu, "Admin security menu");

		click(Initiatemenu, "Initiate menu");

		click(setglobalprofilemenu, "set globalprofile menu");

		switchToBodyFrame(driver);

		click(Category, "Empcategory TxtBx");

		sendText(CatSearchField, "Technical", "Empcategory TxtBx");

		click(Catoption, "Empcategory TxtBx");

		click(Role, "Role Field");

		sendText(RoleSearchField, Emproleepic, "RoleSearchField txt");

		click(RoleSearchoption, "Role Searchoption");

		click(DMmastersCheckbox, "Documentmanagern masters Checkbox");

		click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");

		click(DMmodifycheckbox, "Documentmanager modify checkbox");

		click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");

		click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");

		click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");

		click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");

		click(DMReportscheckbox, "Documentmanager Reports checkbox");

		click(CONinitiatecheckbox, "CONfiguration initiate checkbox");

		click(CONmodifycheckbox, "CONfiguration modify checkbox");

		click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");

		click(CONapporvalcheckbox, "CONfiguration apporval checkbox");

		click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");

		click(CONtransfercheckbox, "CONfiguration transfer checkbox");

		click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");

		click(SMadminandsecuritycheckbox, "System manager adminandsecurity checkbox");

		click(SMconfigurtioncheckbox, "System manager configurtion checkbox");

		click(subbutton, "Set Global profile submit button");

		E_sign.e_Sign(eSign);

		TimeUtil.shortWait();

		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver);

		TimeUtil.shortWait();

	}

}
	public void epicroleGlobal(String Emplevelepic, String Emproleepic, String eSign) {
		
		String s = "";
		String randomval = "";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
	
				s = TextUtils.randomvalue(3);
				randomval = Integer.toString(TextUtils.randomNumber(1));

			}
	
			setEMPlevepic(EMPlevel = Emplevelepic + randomval);
			setEMProleepic(EMProle = Emproleepic + s);
	
			click(xbutton, "Xbutton menu");
	
			click(Documentmanagericon, "Document manager icon tab");
	
			click(Systemmagermenu, "System mager menu");
	
			click(Adminsecuritymenu, "Admin security menu");
	
			click(Initiatemenu, "Initiate menu");
	
			click(Registorrolemenu, "Registor role menu");
	
			switchToBodyFrame(driver);
	
			// click(level, "EmpLevel Txtfield");
			sendText(level, EMPlevel, "EmpLevel Txtfield");
	
			// click(Role, "Emprole Txtfield");
			sendText(roleTxtbox, EMProle, "Emprole Txtfield");
	
			click(Category, "Empcategory TxtBx");
	
			sendText(CatSearchField, "Technical", "Empcategory TxtBx");
	
			click(Categoryoption, "Empcategory TxtBx");
	
			click(subbutton, "reg role submitbutton");
	
			E_sign.e_Sign(eSign);
			TimeUtil.shortWait();
			
	
		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver);

		TimeUtil.shortWait();

		click(Documentmanagericon, "Document manager icon tab");

		click(Systemmagermenu, "System mager menu");

		click(Adminsecuritymenu, "Admin security menu");

		click(Initiatemenu, "Initiate menu");

		click(setglobalprofilemenu, "set globalprofile menu");

		switchToBodyFrame(driver);

		click(Category, "Empcategory TxtBx");

		sendText(CatSearchField, "Technical", "Empcategory TxtBx");

		click(Catoption, "Empcategory TxtBx");

		click(Role, "Role Field");

		sendText(RoleSearchField, Emproleepic, "RoleSearchField txt");

		click(RoleSearchoption, "Role Searchoption");

		click(DMmastersCheckbox, "Documentmanagern masters Checkbox");

		click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");

		click(DMmodifycheckbox, "Documentmanager modify checkbox");

		click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");

		click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");

		click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");

		click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");

		click(DMReportscheckbox, "Documentmanager Reports checkbox");

		click(CONinitiatecheckbox, "CONfiguration initiate checkbox");

		click(CONmodifycheckbox, "CONfiguration modify checkbox");

		click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");

		click(CONapporvalcheckbox, "CONfiguration apporval checkbox");

		click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");

		click(CONtransfercheckbox, "CONfiguration transfer checkbox");

		click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");

		click(SMadminandsecuritycheckbox, "System manager adminandsecurity checkbox");

		click(SMconfigurtioncheckbox, "System manager configurtion checkbox");

		click(subbutton, "Set Global profile submit button");

		E_sign.e_Sign(eSign);

		TimeUtil.shortWait();

		click(nextbtn, "Done button");

		TimeUtil.shortWait();

		switchToDefaultContent(driver);

		TimeUtil.shortWait();

	}

}

