package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Loginwithtemppwd extends ActionEngine {
	
	Properties prop;
	
	@FindBy(xpath= "//input[@type='text'][@name='UserRegistration.TemporaryPassword']")
	WebElement Temperarypwd;
	
	
//	@FindBy(id = "company")
	//WebElement companyTxtBx;
	
	@FindBy(id = "txtUserIdVis")
	WebElement SSOuserNameTxtBx;

	@FindBy(id = "txtPasswordVis")
	WebElement SSOpasswordTxtBx;
	
	@FindBy(id = "LoginBtn")
	WebElement SSOloginBtn;
	
	
	
	
	//This initElements method will create all WebElements
	
			public Loginwithtemppwd() {
				PageFactory.initElements(driver, this);
				
			}
		
		
		public void ssoLoginwithtemppwd()
		{
			waitForPageToLoad(3000);
			
		
			
			
			waitForPageToLoad(3000);
			//click(companyTxtBx, "companycodesso Txtfield");
	     //	sendText(companyTxtBx, companycodesso, "companycodesso Txtfield");
	     	
			String EMPID = DMS_UserRegistration.getEMPuserid();
			
			click(SSOuserNameTxtBx, "sso username Txtfield");
			sendText(SSOuserNameTxtBx, EMPID, "EMPID ");
			
			
			
			//sendText(SSOuserNameTxtBx, EMPuserid, "userNamesso Txtfield");
			
			click(SSOpasswordTxtBx, "sso password TxtBx");
			
			
			enterTempPwd(driver, SSOpasswordTxtBx);
			
			
			
			
			
			click(SSOloginBtn, "sso Login Button");
			
			try {
			boolean multiLogin = driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).isDisplayed();
			if (multiLogin == true) {
				driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).click();
			}
				
		} catch (NoSuchElementException e) {

		}
			
		}
		


}
