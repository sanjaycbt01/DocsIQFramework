package com.Automation.Pages;

import java.io.Closeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;

public class WorkTransferAuditTrails extends  ActionEngine {
	
	
	@FindBy(xpath = "//a[@class='caliber-product-dms product-icon1']")
	WebElement Docsiqicon;

	@FindBy(xpath= "//a[text()='Document Manager'][1]")
	WebElement DocsManager;
	

	@FindBy(xpath = "//*[@id=\"DMS_Document Manager\"]/li[8]/a")
	WebElement DMAuditTrails;
	
	@FindBy(xpath = "//*[@id=\"DMS_Document Manager_Audit Trails_MENU0142\"]")
	WebElement DMAuditWTFMenu;
	
	@FindBy(xpath = " //span[@id='btnAdvSearch']")
	WebElement AdvSearchbtn;
	
	@FindBy(id="SearchType")
	WebElement SearchBox;
	
	@FindBy(id="SrhUniqueCode")
	WebElement DocUniqueCode;
	
	@FindBy(xpath="//button[@class='caliber-button-primary']")
	WebElement Applybtn;
	
	@FindBy(xpath="//tr[@class='clickRow odd'][1]")
	WebElement selctDocs;
	
	@FindBy(className ="popup-close-button")
	WebElement PopupCloseBtn;
	
	
	
	public WorkTransferAuditTrails() {
		PageFactory.initElements(driver, this);
	}
	
	public void WorkTransferAuditTrails1() {
		
		click(Docsiqicon, "Docsiqicon");
		click(DocsManager, "DocsManager");
		click(DMAuditTrails, "DMAuditTrails");
		click(DMAuditWTFMenu, "DMAuditWTFMenu");
		switchToBodyFrame(driver);
		click(AdvSearchbtn, "AdvSearchbtn");
		selectOptionFromDropdownByName(SearchBox, "Unique Code", "Unique Code");
		sendText(DocUniqueCode, "WTF20220007", "WTF20220007");
		click(Applybtn, "Applybtn");
		click(selctDocs, "selctDocs");
		
		//click( PopupCloseBtn, " PopupCloseBtn");
		verifyCaptionContains(selctDocs, getUniqueCode());
		Logout.signOutPage();
	}

}
