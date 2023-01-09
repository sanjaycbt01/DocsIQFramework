package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;

public class Epiqlogintestingbuild extends  ActionEngine {
	
	@FindBy(id = "company")
	WebElement companyTxtBx;

	@FindBy(id = "username")
	WebElement userNameTxtBx;

	@FindBy(id = "password")
	WebElement passwordTxtBx;
	
	@FindBy(id = "btnSubmit")
	WebElement loginBtn;
	
	
	

	//This initElements method will create all WebElements
	
			public Epiqlogintestingbuild() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void epicdmsLogin(String companycodeepiq1, String usernameepic1,String pwdepic1)
		{
			waitForPageToLoad(3000);
			
			click(companyTxtBx, "companycodesso Txtfield");
	     	sendText(companyTxtBx, companycodeepiq1, "companycodesso Txtfield");
	     	
	        click(userNameTxtBx, "epic username Txtfield");
			sendText(userNameTxtBx, usernameepic1, "userNameepic Txtfield");
			
			click(passwordTxtBx, "epic password TxtBx");
			sendText(passwordTxtBx, pwdepic1, "password epic");
			
			click(loginBtn, "epic Login Button");
			
			try {
			boolean multiLogin = driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).isDisplayed();
			if (multiLogin == true) {
				driver.findElement(By.xpath("//button[@class='caliber-button-primary']")).click();
			}
				
		} catch (NoSuchElementException e) {

		}
			
		}
}
