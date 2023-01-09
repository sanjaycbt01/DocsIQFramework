package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Automation.Base.ActionEngine;

public class Docs_Loginpage extends ActionEngine {
	
	@FindBy(id="company")
	WebElement companytextbox;
	
	@FindBy(id="username")
	WebElement usernametextbox;
	
	@FindBy(id="password")
	WebElement passwordtextbox;
	
	@FindBy(id="btnSubmit")
	WebElement loginbtn;
	
	@FindBy(id="Logout")
	WebElement logoutbtn;
	
	
	public void docsiqlogin(String Company,String InitiatorId, String Initiatorpwd) {
		
		sendText(companytextbox, Company, "companytextbox");
		
		sendText(usernametextbox, InitiatorId, "usernametextbox");
		
		sendText(passwordtextbox, Initiatorpwd, "password");
		
		click(loginbtn, "loginbtn");
		
		
		
		
		
//		try {
//			if(driver.findElement(By.xpath("//*[@id='btnYes']")).isDisplayed())
//			{
//			driver.findElement(By.xpath("//*[@id='btnYes']")).click();
//			}
//			}catch(Exception e){
//			}
		
		
	}
	
	public void docsiqlogout() {
		
		switchToDefaultContent(driver);
		click(logoutbtn, "logoutbtn");
		
	}

	
		
	}
	


