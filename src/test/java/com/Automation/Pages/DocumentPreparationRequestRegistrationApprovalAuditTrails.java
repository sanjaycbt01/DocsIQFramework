package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;

public class DocumentPreparationRequestRegistrationApprovalAuditTrails extends ActionEngine {

	@FindBy(xpath = "//a[@class='caliber-product-dms product-icon1']/self::a")
	WebElement docsiqIcon;

	@FindBy(xpath = "//a[text()='Document Manager'][1]")
	WebElement documentManagerMenu;

	@FindBy(xpath = "//ul[@id='DMS_Document Manager']//a[text()='Transactions']")
	WebElement transactionMenu;

	@FindBy(xpath = "//ul[@id='DMS_Document Manager_Transactions']/child::li[2]")
	WebElement documentPreparationRequestMenu;

	@FindBy(xpath = " //span[@id='btnAdvSearch']")
	WebElement advSearchbtn;
	
	@FindBy(xpath = "//select[@class='caliber-selectdropdown select2-hidden-accessible valid']/following-sibling::span")
	WebElement searchBox;

	@FindBy(xpath = "//li[text()='Main Document Type']")
	WebElement searchMainDocType;

	@FindBy(xpath = "//td[@class='applyBtn']")
	WebElement applybtn;

	
	
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Document Tasks')]")
	WebElement myDocumentTaskMenu;

	@FindBy(xpath = "//span[@id='btnAdvSearch']")
	WebElement btnSearch;

	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement selectbtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement searchField;

	@FindBy(xpath = "//ul[@id='select2-SearchType-results']/li[1]")
	WebElement selectoption;

	@FindBy(id = "SrhUniqueCode")
	WebElement unicode;

//	@FindBy(id = "displayBtn")
//	WebElement applybtn;

	@FindBy(xpath = "//table[@id='ListTab']/tbody/tr[1]/td[1]")
	WebElement displayedRecord;

	public DocumentPreparationRequestRegistrationApprovalAuditTrails() {

		PageFactory.initElements(driver, this);
	}

	public void documentPreparationRequestRegistration() {

		click(docsiqIcon, "Docsiqicon Button");
		// TimeUtil.shortWait();
		click(documentManagerMenu, "Document Manager Menu ");
		click(transactionMenu, "Transaction sub Menu");
		click(documentPreparationRequestMenu, "document Preparation Request Menu");
		switchToBodyFrame(driver);
		click(advSearchbtn, "advance Search doc btn");
		click(searchBox, "searchBox");
		selectOptionFromDropdownByName(searchMainDocType, "searchMainDocType", "Unique Code");
		click(searchMainDocType, "searchMainDocType");
		sendText(searchMainDocType, "searchMainDocType", "searchMainDocType");
		
		click(searchMainDocType, "searchMainDocType");
		
		
		sendText(searchMainDocType, "UniqueCodeval", "30SQA-Main-0202-000-Rev-5 ");
		
		
		//click( applybtn, "applybtn");
		
		
		Logout.signOutPage();

	}
}
