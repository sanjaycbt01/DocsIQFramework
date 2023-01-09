package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Reportsinsytmanepic extends ActionEngine{
	
	//Properties prop;
	
	//ddlSelectedPlant_2
	
	@FindBy(id = "ddlSelectedPlant_2")
	WebElement planbutton;
	
	
	@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
	WebElement xbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Documentmanagericon;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
	WebElement Systemmagermenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	WebElement Adminsecuritymenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
	WebElement Reportsmenu;
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0148_MENU0054")
	WebElement plantwiseuserlistmenu;
	
	@FindBy(xpath = "//*[@class='ft-filter']")
	WebElement filterbtn1;
	
	@FindBy(id = "displayBtn")
	WebElement applybtn;
	
	
	
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0148_MENU0096")
	WebElement Usersessionlogmenuinreports;
	//----------------------------------------------
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")//----vasu.ki
	WebElement searchfilter;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement searchbtn;
	
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0148_MENU0083")
	WebElement rolewiseglobalprofilereports;
	//----------------------------------------------
	
	@FindBy(id = "select2-RoleID-container")
	WebElement Rolesearchbox;
	
	@FindBy(xpath = "//ul[@id='select2-RoleID-results']/li[2]")
	WebElement dropdownbtn;
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement clickondonebtnofuserpr;
	
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtnofepic;
	
	
	@FindBy(xpath = "//*[@class='ft-filter']")
	WebElement filterbtn;
	
	
	
	@FindBy(id = "displayBtn")
	WebElement applybtn1;
	
	
	
	
	//This initElements method will create all WebElements
	
			public Reportsinsytmanepic() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void reportsinsystemmangerepic(String nameonsearch ,String eSign)
		
		
		{
			
	
			waitForPageToLoad(3000);
			
			click(xbutton, "Xbutton menu");
		
		click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Reportsmenu, "reports menu");
			
			click(plantwiseuserlistmenu, "plantwiseuserlist sub menu");
			
			
			switchToBodyFrame(driver);
			
			click(filterbtn1, "filter btn1");
			
			TimeUtil.shortWait();
			
		//switchToDefaultContent(driver);
			
			click(applybtn, "apply btn");
			
			switchToDefaultContent(driver);
	     	
			
			TimeUtil.shortWait();
			
			
			
             click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Reportsmenu, "reports menu");
			
			click(Usersessionlogmenuinreports, "Usersessionlogmenuinreports sub menu");
			
			
			switchToBodyFrame(driver);
			
			sendText(searchfilter,nameonsearch,"search filter");
			
		//	TimeUtil.shortWait();
			
	//	switchToDefaultContent(driver);
			
			click(searchbtn, "search btn");
	     	
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			TimeUtil.shortWait();
			
			
			
           click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Reportsmenu, "reports menu");
			
			click(rolewiseglobalprofilereports, "rolewiseglobalprofilereports sub menu");
			
			
			switchToBodyFrame(driver);
			
			TimeUtil.shortWait();
			
			jsClick(Rolesearchbox, "Rolesearch box");
			
			TimeUtil.shortWait();
			
	//	switchToDefaultContent(driver);
			
			jsClick(dropdownbtn, "dropdownbtn");
	     	
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			click(logoutbtnofepic, "logoutbtn of epic");
			
			
			
		}
		
}
