package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class DMS_Roleregistrationflow extends ActionEngine{
	
	
	
	Properties prop;
	public static String EMPname = "";
	public static String EMProle = "";
	
	public static String getEMPname() {
		return EMPname;
		}

	public static void setEMPname(String name) {
		EMPname = name;
	}
	
	public static String getEMProle() {
		return EMProle;
		}

	public static void setEMProle(String role) {
		EMProle = role;
	}
	
	
	
	//@FindBy(xpath = "//input[@class="nav-link nav-toggle"']")
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;
	
	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;
	
	@FindBy(id = "NWROL")
	WebElement Registorrole;
	
	@FindBy(xpath = "//input[@type='text'][@name='RoleRegistration.RoleRegistrationCode']")
	WebElement Level;
	
	@FindBy(xpath = "//input[@type='text'][@name='RoleRegistration.RoleRegistrationDesc']")
	WebElement Role;
	
	@FindBy(xpath = "//span[text()='Technical']")
	WebElement Category;
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']") //id="select2-RoleRegistration_CategoryId-result-qqyw-1"
	WebElement Technical;
	
	@FindBy(id = "btnSubmit_1")
	WebElement regrolesubbutton;
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	@FindBy(id = "NextActionPath")
	WebElement backbtn;
	
	
	
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	
	
	
	
	//This initElements method will create all WebElements
	
			public DMS_Roleregistrationflow() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void ssodmsroleregistor(String Emplevel,String Emprole,String eSign)
		{
			
			/*
			String s = "";
			String randomval="";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
				
				s = TextUtils.randomvalue(1);
				randomval= Integer.toString(TextUtils.randomNumber(1));
				
			*/
				String s = "";
				String randomval = "";
				
					prop = ConfigsReader.readProperties("./configs/configuration.properties");
					if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			
						s = TextUtils.randomvalue(3);
						randomval = Integer.toString(TextUtils.randomNumber(1));


			
			}
			
			setEMPname(EMPname =randomval);
			setEMProle(EMProle =  Emprole+s);
			waitForPageToLoad(3000);
			
            click(Sysmantab, "System mmanager tab");
			
			click(Adminandsecurity, "Admin and security tab");
			
			click(Initiate, "Initiation tab");
			
			click(Registorrole, "Registerrole tab");
			
			switchToBodyFrame(driver);
			
			click(Level, "EmpLevel Txtfield");
	     	//sendText(Level, EMPname, "EmpLevel Txtfield");
	     	sendText(Level,Emplevel , "EmpLevel Txtfield");
	     	
	        click(Role, "Emprole Txtfield");
			sendText(Role, EMProle, "Emprole Txtfield");
			
			click(Category, "Empcategory TxtBx");
			
			click(Technical, "Empcategory TxtBx");
			
			click(regrolesubbutton, "regrolesubmitbutton");
			
			E_sign.e_Sign(eSign);
			
			
			 TimeUtil.shortWait();
			
			
			click(nextbtn, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			
			click(Initiate, "Initiation tab");
			
			TimeUtil.shortWait();
			click(Signout, "Signout button");
			TimeUtil.shortWait();
			
			
			
			
		
			
		//	E_sign.e_Sign(eSign);
			
			
			
		//	switchToDefaultContent(driver);
			
		}
		


}


