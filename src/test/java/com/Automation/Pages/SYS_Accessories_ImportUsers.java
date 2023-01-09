package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;



public class SYS_Accessories_ImportUsers extends ActionEngine {
	WebDriver driver;
	@FindBy(xpath = "//li[@class='menuicon-NIC400  menu-icons product-icon']/a")
	WebElement Menu;
	@FindBy(id = "TMS_System Manager")
	WebElement SystemManager;
	@FindBy(xpath = "//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Accessories_New')]")
	WebElement AccessoriesMenu;
	@FindBy(id = "ADIUSR")
	WebElement ImportUsersMenu;
	@FindBy(xpath = "/html[1]/body[1]/form[1]/section[1]/section[1]/div[2]/div[2]/div[1]/div[1]/label[1]")
	WebElement Choosefile;
	@FindBy(id = "Uploadbtn")
	WebElement Upload;
	
	public SYS_Accessories_ImportUsers() {
		PageFactory.initElements(driver, this);
	}


	public void ImpUsers(String Docpath) {


		click( Menu, "Menu");
	    click(SystemManager, "System Manager Menu");
		click(AccessoriesMenu, "Accessories Menu");
		click(ImportUsersMenu, "ImportUsers Menu");
		switchToBodyFrame(driver);
		click(Choosefile, "Choosefile Menu");
		TimeUtil.shortWait();
		uploadDocument(Docpath);
		click( Upload, "Upload Menu");

	}
}
