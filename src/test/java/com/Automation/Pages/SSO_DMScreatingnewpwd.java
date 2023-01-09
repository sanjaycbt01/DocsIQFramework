package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class SSO_DMScreatingnewpwd extends ActionEngine{
	
	Properties prop;
	
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.TemporaryPassword']")
	WebElement Temperarypwd;
	
	
	@FindBy(id = "SelectedDecision_2")
	WebElement conformradiobtn;
	
	@FindBy(id= "btnSubmit_1")
	WebElement submitbtn;
	
//	-----------------------------------
	
	@FindBy(id= "txtESignPassword") 
	WebElement SSOpasswordTxtBx;
	
	@FindBy(id= "Submit_Esign") 
	WebElement esignproceedbtn;
	
	
	
	
	
	@FindBy(xpath="//input[@type='password'][@name='ChangePassword.CurPswd']")
	WebElement currentpwd;
	
	@FindBy(xpath= "//input[@type='password'][@name='ChangePassword.NewPswd']")
	WebElement newpwd;
	
	@FindBy(xpath= "//input[@type='password'][@name='ChangePassword.RetypPSwd']")
	WebElement retypenewpwd;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbut2;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement login;
	
	//------------------------------------
	
	@FindBy(id = "txtUserIdVis")
	WebElement SSOuserNameTxtBx;

	@FindBy(id = "txtPasswordVis")
	WebElement newpasswordlog;
	
	@FindBy(id = "LoginBtn")
	WebElement SSOloginBtn;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	//This initElements method will create all WebElements
	
	public  SSO_DMScreatingnewpwd() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void ssodmscreatingnewpwd(String newpass, String renewpass ,String pwdssonepwd)
	{
		waitForPageToLoad(3000);
		
		
		
		String EMPID = DMS_UserRegistration.getEMPuserid();
		
		// String EMPuserid = usernamessonepwd;
			
	//	 usernamessonepwd = DMS_UserRegistration.getEMPuserid();
			
			
		
		switchToBodyFrame(driver);
		
		
		
		
        click(conformradiobtn, "confirmation radio button");
		
		click(submitbtn, "submitbutton of confirmationpage");
		
		
		switchToDefaultContent(driver);
		
		waitForPageToLoad(3000);
		
		switchToBodyFrame(driver);
		
		/*
		
     //  click(SSOuserNameTxtBx, "SSOuserName TxtBx");
       
    //   sendText(SSOuserNameTxtBx,EMPID, "SSOuserName TxtBx");
		
		//enterTempPwd(driver, SSOpasswordTxtBx);
		
		
		*/
		
		click(SSOpasswordTxtBx, "esign password");
		
		enterTempPwd(driver, SSOpasswordTxtBx);
		
		
       // sendText(esignpwd, esignpass , "esign password");
        
        click(esignproceedbtn, "proceed button esign");
        
        
        TimeUtil.shortWait();
		
		
         click(currentpwd, "current password");
       
       enterTempPwd(driver, currentpwd);
      //  sendText(currentpwd, currentpass , "current password");
        
        click(newpwd, "new password");
        sendText(newpwd, newpass , "new password");
        
        click(retypenewpwd, "retype new password");
        
        
        sendText(retypenewpwd, renewpass , "retype new password");
        
        click(submitbut2, "submit2 button");
        
        switchToDefaultContent(driver);
        
        switchToBodyFrame(driver);
        
        
        
        click(login, "relogin button");
        
        switchToDefaultContent(driver); 
        
        waitForPageToLoad(3000);
        
        //switchToBodyFrame(driver);
        
        click(SSOuserNameTxtBx, "sso username Txtfield");
		sendText(SSOuserNameTxtBx, EMPID, "userNamesso Txtfield");
        
      //  enterUniqueCode(driver,SSOuserNameTxtBx);
		
		click(newpasswordlog, "sso password TxtBx");
		
	
		sendText(newpasswordlog, pwdssonepwd, "password sso");
		
		click(SSOloginBtn, "sso Login Button");
		
		TimeUtil.shortWait();
		click(Signout, "Signout button");
		TimeUtil.shortWait();
		
		
		try {
		boolean multiLogin = driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).isDisplayed();
		if (multiLogin == true) {
			driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).click();
		}
			
	} catch (NoSuchElementException e) {

	}
		
	}
	

        
        
		
		
		
        
        
       
	
}