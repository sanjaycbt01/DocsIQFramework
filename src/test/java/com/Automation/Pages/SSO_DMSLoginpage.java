package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;

public class SSO_DMSLoginpage extends ActionEngine {
	
	
//	@FindBy(id = "company")
	//WebElement companyTxtBx;
	
	@FindBy(id = "txtUserIdVis")
	WebElement SSOuserNameTxtBx;

	@FindBy(id = "txtPasswordVis")
	WebElement SSOpasswordTxtBx;
	
	@FindBy(id = "LoginBtn")
	WebElement SSOloginBtn;
	
	
	//This initElements method will create all WebElements
	
			public SSO_DMSLoginpage() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void ssodmsLogin(String companycodesso,String usernamesso,String pwdsso)
		{
			waitForPageToLoad(3000);
			
			//click(companyTxtBx, "companycodesso Txtfield");
	     	//sendText(companyTxtBx, companycodesso, "companycodesso Txtfield");
	     	
	        click(SSOuserNameTxtBx, "sso username Txtfield");
			sendText(SSOuserNameTxtBx, usernamesso, "userNamesso Txtfield");
			
			click(SSOpasswordTxtBx, "sso password TxtBx");
			sendText(SSOpasswordTxtBx, pwdsso, "password sso");
			
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
