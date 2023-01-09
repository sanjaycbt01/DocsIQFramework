package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class DMS_UserRegistration extends ActionEngine{
	
	
	Properties prop;
	public static String EMPfistname = "";
	public static String EMPLastname = "";
	public static String EMPuserid = "";
	public static String EMPempid = "";
    public static String EMPemail = "";
    
    
    
			
	public static String getEMPfistname() {
		return EMPfistname;
		}

	public static void setEMPfistname(String Efirstname1) {
		EMPfistname = Efirstname1;
	}
	
	public static String getEMPLastname() {
		return EMPLastname;
		}

	public static void setEMPLastname(String EMPlastname1) {
		EMPLastname = EMPlastname1;
	}
	
	
	public static String getEMPuserid() {
		return EMPuserid;
		}

	public static void setEMPuserid(String Euserid1) {
		EMPuserid = Euserid1;
	}
	
	public static String getEMPempid() {
		return EMPempid;
		}

	public static void setgetEMPempid(String Empid1) {
		EMPempid = Empid1;
	}
	
	
	public static String getEMPemail() {
		return EMPemail;
		}

	public static void setEMPemail(String Eemailid1) {
		EMPemail = Eemailid1;
	}
	
	
	

	
	@FindBy(xpath = "//text()[contains(.,'Identity Manager')]/ancestor::a[1]")
	WebElement IdentityManager;
	
	@FindBy(xpath = "//text()[.='Initiate']/ancestor::a[1]")
	WebElement Initiate;
	
    @FindBy(id = "USERREG")
	WebElement UserRegistration;
	
	@FindBy(xpath = "//text()[contains(.,'Add Item')]/ancestor::button[1]")
	WebElement Addbutton;
	//---------------------
	@FindBy(id= "UserRegistration_Designation_FindTxt")
	WebElement DesignationfindTxt;
	
	@FindBy(css = "input[type=radio][name='recordSelection']")
	WebElement radiobutton;
	
	@FindBy(xpath= "//button[text()='Add']")
	WebElement add;
//	-------------------------------------
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.FirstName']")
	WebElement Firstname;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.LastName']")
	WebElement Lastname;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.UserCode']")
	WebElement Userid;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.EmployeeID']")
	WebElement Employeeid;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.EmailID']")
	WebElement Emailid;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.TemporaryPassword']")
	WebElement Temperarypwd;
	
	@FindBy(xpath= "//button[text()='Submit']")
	WebElement Sumbit;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement Next;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	
	
	
	
	
	
	//This initElements method will create all WebElements
	
	public DMS_UserRegistration () {
		PageFactory.initElements(driver, this);
		
	}

	
	public void ssouserregistration(String Dsearch, String Efirstname, String Elastname, String Euserid, String Empid, String Eemailid, String eSign)
	{
		
		{
			String s = "";
			String randomval="";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
				
				s = TextUtils.randomvalue(3);
				randomval= Integer.toString(TextUtils.randomNumber(3));
				
			}
			
		    
			
			
			setEMPfistname(EMPfistname = Efirstname+s);
			
			setEMPLastname(EMPLastname =  Elastname+s);
			
			setEMPuserid(EMPuserid = Euserid+s);
			
			setEMPemail(EMPempid =  Empid+s);
			
			setEMPemail(EMPemail =Eemailid+s);
			
			
		//	String EMPdesignationcode = Dsearch;
			
		String	Dcodeindesignf = SSO_Designation.getEMPdesignationcode();
			
		
		
		
		
		
		
		waitForPageToLoad(3000);
		
        click(IdentityManager, "Identity mmanager tab");
		
		click(Initiate, "Initiate tab");
		
		click(UserRegistration, "UserRegistration tab");
		
		switchToBodyFrame(driver);
		
        click(Addbutton, "Addbutton tab");
        
        
        click(DesignationfindTxt, "Designation search");
		sendText(DesignationfindTxt, Dcodeindesignf, "Designation search");
		
		 click(radiobutton, "radio button tab");
		
         click(add, "add button");
         
         click(Firstname, "Emp First name");
 		sendText(Firstname, EMPfistname, "Emp First name");
 		
 		click(Lastname, "Emp Last name");
		sendText(Lastname, EMPLastname, "Emp Last name");
	
		click(Userid, "Emp userid");
		sendText(Userid, EMPuserid, "Emp userid");
		
		
		
		
		
//String	nuid =	Userid.getAttribute(Euserid);
		
	  click(Employeeid, "Empid Txtfield");
		sendText(Employeeid,EMPempid , "Empid Txtfield");
		
		click(Emailid, "Emp Emailid Txtfield");
		sendText(Emailid, EMPemail, "Emp Emailid Txtfield");
		
		saveTempPassword(driver, Temperarypwd, test);

         
   //  Temperarypwd.getAttribute(tp);
  
 // String	nuid =	Userid.getAttribute(Euserid);
  
 // System.out.println(tp);
  
  //System.out.println(nuid);
  
  
    
  //  System.out.print(tpass);
    
    
         
      //   saveTemperarypwd(driver,Temperarypwd , test);
		
		//saveUniqueCode(driver,Userid );
	
		click(Sumbit, "Submit button");
		
		
		E_sign.e_Sign(eSign);
		
		
		 TimeUtil.shortWait();
		
		
	click(Next, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
		click(Signout, "Signout button");
		TimeUtil.shortWait();
		
		
		/*
		E_sign.e_Sign(eSign);
		
		click(Next,"Next buttton");
		
		click(Initiate, "Initiate tab");
		
		*/
		
		
	}	
		
		
		
	}
	
}
