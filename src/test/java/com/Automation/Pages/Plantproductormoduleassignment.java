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

public class Plantproductormoduleassignment extends ActionEngine{
	
	Properties prop;
	
	@FindBy(xpath = "//ul[1]/li[3]/a[1]//span[contains(text(),'Identity Manager')]")
	WebElement IdentityManager;
	
	@FindBy(xpath = "//ul[1]/li[3]/ul[@class='sub-menu']/li[1]/a[contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	
	@FindBy(xpath = "//a[@id='PRDPLTASG']")
	WebElement ProductModuleplantmenu;
	
	@FindBy(xpath = "//button[@id='btnModal_Plant_0']")
	WebElement addbuttonofproduct;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/button[1]")
	WebElement plantaddbutton;
	
	@FindBy(xpath = "//button[@id='Plant_0_selectBtn']")
	WebElement finaladdbtn;
	
	//scrool---------------------------------------------------------------
	
	@FindBy(xpath = "//button[@id='btnModal_Plant_1']")
	WebElement product2addbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/button[1]")
	WebElement plantaddbtn2;
	
	@FindBy(xpath = "//button[@id='Plant_1_selectBtn']")
	WebElement finaladdbtn2;
	
	@FindBy(xpath = "//textarea[@name='ProductPlantAssignment.Remarks']")
	WebElement Remarks;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	
	
	
	
	public Plantproductormoduleassignment() {
		PageFactory.initElements(driver, this);
	}

	
	public void ssodmsplantpromoduleass(String plantremarksfield, String eSign) {
		waitForPageToLoad(3000);


	click(IdentityManager, "identityManager Menu");
	
		click(InitiateMenu, "InitiateMenu Menu");
		
		click(ProductModuleplantmenu, "ProductModule Menu");
		
		switchToBodyFrame(driver);
		
		
		 click(addbuttonofproduct, "add button of product Txtfield");
		 
		 TimeUtil.shortWait();
		 
		 switchToDefaultContent(driver);
		 
		 switchToBodyFrame(driver);
		 
			click(plantaddbutton, "plant addbutton Txtfield");
			
		 click(finaladdbtn, "final addbtn");
		 
		//switchToDefaultContent(driver);
		 
		// TimeUtil.shortWait();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			
			click(product2addbtn, "product2 addbtn");
			
			switchToDefaultContent(driver);
			
			TimeUtil.shortWait();
			
			switchToBodyFrame(driver);
			
			//TimeUtil.shortWait();
			
			//switchToBodyFrame(driver);
			
			//TimeUtil.shortWait();
			
			 click(plantaddbtn2, "plantaddbtn 2");
			 
			 click(finaladdbtn2, "finaladdbtn 2");
			 
			// switchToDefaultContent(driver);
			 
			// TimeUtil.shortWait();
			 
			 
			/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;
				  
					js1.executeScript("window.scrollBy(750,document.body.scrollHeight)");
					
					switchToDefaultContent(driver);*/
					
					TimeUtil.shortWait();
					
					
					jsClick(Remarks, "Remarks Txtfield");
					sendText(Remarks, plantremarksfield, "Remarks Txtfield");
					
					click(submitbtn, "submitbtn");
					
					
			 E_sign.e_Sign(eSign);
			 
			 
			 TimeUtil.shortWait();
				
				
				click(nextbtn, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				
				
				click(InitiateMenu, "Initiation tab");
				
				TimeUtil.shortWait();
				click(Signout, "Signout button");
				TimeUtil.shortWait();
				
				
			
		/*	 
			 
			click(nextbtn,"Next buttton");
			
			click(InitiateMenu, "InitiateMenu Menu");
			
			*/
			
			
		}	
			
		
		
	}

