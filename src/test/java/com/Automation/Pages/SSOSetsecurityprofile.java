package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class SSOSetsecurityprofile extends ActionEngine{
	
	
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;
	
	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;
	
	@FindBy(id = "SECPRO")
	WebElement Setsecurityprofilemenu;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.MinUsrNameLen']")
	WebElement Minuseridlen;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.MinPSWLen']")
	WebElement Minpasslen;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.MaxPSWTenure']")
	WebElement Maxtanureofpass;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.PSWExpiryAlert']")
	WebElement Passexpalert;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.PSWHistory']")
	WebElement Retainhislastpass;
	
	@FindBy(id = "PswCmplx_2")
	WebElement Passcomplexcity;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.AccountLockOut']")
	WebElement accountlockout;
	
	@FindBy(xpath = "//input[@type='number'][@name='SecurityProfile.IdleSession']")
	WebElement Idealsessiontimeout;
	
	@FindBy(xpath = "//textarea[@name='SecurityProfile.Remarks']")
	WebElement Remarks;
	
	@FindBy(xpath = "//input[@type='button'][@id='btnConfirm']")
	WebElement submitbtn;
	
	
	@FindBy(id = "ConfirmOkBtn")
	WebElement confirm;
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextloginbtn;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
//	@FindBy(xpath = "cfnMsg_Next")
	//WebElement donebtn;
	
	
	
	
	
	//This initElements method will create all WebElements
	
			public SSOSetsecurityprofile() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void ssodmssetsecurityprofile(String minuseridlen,String minpasslen,String maxtanureofpass, String passexpalert , String retainhislastpass, String Accountlockout, String idealsessiontimeout , String remarks, String eSign)
		{
			waitForPageToLoad(3000);
			
            click(Sysmantab, "System mmanager tab");
			
			click(Adminandsecurity, "Admin and security tab");
			
			click(Initiate, "Initiation tab");
			
			click(Setsecurityprofilemenu, "setsecurityprofiletab");
			
			switchToBodyFrame(driver);
			
			click(Minuseridlen, "Min userid length");
	     	sendText(Minuseridlen,minuseridlen , "Min userid length");
	     	
	     	click(Minpasslen, "Min pass len");
	     	sendText(Minpasslen,minpasslen , "Min pass len");
	     	
	     	click(Maxtanureofpass, "Maxtanureofpass");
	     	sendText(Maxtanureofpass,maxtanureofpass , "Maxtanureofpass");
	     	
	     	click(Passexpalert, "Pwd exp alert");
	     	sendText(Passexpalert,passexpalert , "Pwd exp alert");
	     	
	     	click(Retainhislastpass, "Retain his last pass");
	     	sendText(Retainhislastpass,retainhislastpass , "Retainhislastpass");
	     	
	     	TimeUtil.shortWait();
	     	
	        click(Passcomplexcity, "Password complexcity");
	        
	        click(accountlockout, "accountlockout");
	     	sendText(accountlockout,Accountlockout , "accountlockout");
	     	
	     	click(Idealsessiontimeout, "Ideal session timeout");
	     	sendText(Idealsessiontimeout,idealsessiontimeout , "Ideal session timeout");
	     	
	     	click(Remarks, "Remarks");
	     	sendText(Remarks, remarks, "Remarks");
	     	
	        click(submitbtn, "submit btn");
	        
	        //TimeUtil.shortWait();
	        
	        TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			TimeUtil.shortWait();
			
	        
	        
	        
	        switchToBodyFrame(driver);
	        
	        E_sign.e_Sign(eSign);
	        
	       TimeUtil.shortWait();
	        
	        
	        
	        click( nextloginbtn, "confirm btn");
	        
	        switchToDefaultContent(driver);
	        
	       
	        
	      // click(loginbtn, "login btn");
	        
	      //  switchToDefaultContent(driver);
	        
	      //  TimeUtil.shortWait();
	        
	        //switchToDefaultContent(driver);
	        
	        
	     	
	       click(Initiate, "Initiation tab");
	       
			TimeUtil.shortWait();
			click(Signout, "Signout button");
			TimeUtil.shortWait();
			
			//driver.quit();
			
			//TimeUtil.shortWait();
			
			//driver.navigate().to("EpicapplicationUrl");
			
			//TimeUtil.shortWait();
			
			
			
			
	        
	        
			
		//	E_sign.e_Sign(eSign);
			
			
			
		}
		


}


