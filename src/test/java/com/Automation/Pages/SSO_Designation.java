package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class SSO_Designation extends ActionEngine{
	
	
	Properties prop;
	public static String EMPdesignationcode = "";
	public static String EMPdesignation = "";
	
	public static String getEMPdesignationcode() {
		return EMPdesignationcode;
		}

	public static void setEMPdesignationcode(String empdescode) {
		EMPdesignationcode = empdescode;
	}
	
	public static String getEMPdesignation() {
		return EMPdesignation;
		}

	public static void setEMPdesignation(String empdesign) {
		EMPdesignation = empdesign;
	}
	
	
	
	
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;
	
	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;
	
	@FindBy(xpath = "//a[@id='DSGNINIT']")
	WebElement DesignationMenu;
	
	@FindBy(xpath = "//input[@type='text'][@name='Designation.DesignationCode']")
	WebElement Designationcode;
	
	
	@FindBy(xpath = "//input[@type='text'][@name='Designation.DesignationDesc']")
	WebElement Designation;
	
	@FindBy(id = "Designation_Level")
	WebElement Level;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Designationsubmitbutoon;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement Next;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	
	
	//This initElements method will create all WebElements
	
	public SSO_Designation() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void ssodmsdesignation(String EmpDesignationcode,String EmpDesignation, String EmpLevel, String eSign)
	{
		
		
		
		String s = "";
		String s1="";
	
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			
			s = TextUtils.randomvalue(3);
			s1= TextUtils.randomvalue(3);
			
		}
		
		setEMPdesignationcode(EMPdesignationcode =EmpDesignationcode+s);
		setEMPdesignation(EMPdesignation =  EmpDesignation+s1);
		
		
       String EMPlevelval =DMS_Roleregistrationflow.getEMPname();
		
		
     
		
		
        
		
		
		
		waitForPageToLoad(3000);
		
		 click(Sysmantab, "System mmanager tab");
		
		click(Adminandsecurity, "Admin and security tab");
		
		click(Initiate, "Initiation tab");
		
		/*waitForPageToLoad(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		waitForPageToLoad(3000);*/
		
	//	TimeUtil.shortWait();
		
		click(DesignationMenu, "Designation tab");
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", DesignationMenu);
	//	DesignationMenu.click();
		
	//	waitForPageToLoad(3000);
		
		switchToBodyFrame(driver);
		
		click(Designationcode, "EmpDesignation Txtfield");
     	sendText(Designationcode, EMPdesignationcode, "EmpDesignationcode Txtfield");
     	
        click(Designation, "EmpDesignation Txtfield");
		sendText(Designation, EMPdesignation, "EmpDesignation Txtfield");
		
		 click(Level, "EmpLevel Txtfield");
		//sendText(Level, EMPlevelval, "EmpLevel Txtfield");
		sendText(Level,EmpLevel , "EmpLevel Txtfield");
			
	    click(Designationsubmitbutoon, "Designation submit button");
	    
	    
	    
	    
	    
		
		E_sign.e_Sign(eSign);
		
		
		 TimeUtil.shortWait();
		
		
		click(Next, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		
		
		
		click(Initiate, "Initiation tab");
		
		TimeUtil.shortWait();
		click(Signout, "Signout button");
		TimeUtil.shortWait();
		
		
		
	/*    
		
		E_sign.e_Sign(eSign);
		
		click(Next,"Next buttton");
		
		click(Initiate, "Initiation tab");
		
		switchToDefaultContent(driver);
		
		//click(Next,"Next buttton");
		 * 
		 * 
		 */
		
	}
	
	
	
	

}
