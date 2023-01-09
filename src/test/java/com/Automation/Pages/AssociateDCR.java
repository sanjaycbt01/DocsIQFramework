package com.Automation.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ESign;
import com.Automation.Utils.TimeUtil;

public class AssociateDCR extends ActionEngine {

	@FindBy(xpath = "//a[@class='caliber-product-dms product-icon1']")
	WebElement docsiqIcon;

	@FindBy(xpath = "//*[@id=\"MenuModule_DMS\"]/li[2]/a")
	WebElement docsManager;

	@FindBy(xpath = "//ul[@id='DMS_Document Manager']/child::li//a[contains(text(),'Transactions')]")
	WebElement transactions;

	@FindBy(xpath = "//a[text()='Associated Document Change Request'][1]")
	WebElement associateDocumentChangeRequest;

	@FindBy(xpath = " //span[@id='btnAdvSearch']")
	WebElement advSearchbtn;

	@FindBy(id = "SearchType")
	WebElement searchBox;

	@FindBy(id = "SrhUniqueCode")
	WebElement uniqueCode;

	@FindBy(xpath = "//button[@class='caliber-button-primary']")
	WebElement applybtn;

	@FindBy(xpath = "//table[@id='ListTab']/tbody/tr[1]")
	WebElement selectDocs;

	@FindBy(xpath = "//input[@id='VersionType_1']")
	WebElement revisionRadiobtn;

	@FindBy(xpath = "//textarea[@id='DMSDocStatusReset_DocResetDesc']")
	WebElement textarea;

	@FindBy(xpath = "//button[@id='btnSubmit'][1]")
	WebElement aDCRbtnSubmit;

	@FindBy(xpath = "//input[@id='txtESignPassword']")
	WebElement passwordtxt;

	@FindBy(xpath = "//input[@id='btnConfirm_1']/self::input")
	WebElement submitEsign;

	@FindBy(xpath = "//input[@id='btnSubmitTmp_1']")
	WebElement assoDocumentPrepsubmit;

	@FindBy(xpath = "//input[@id='btnSubmitTmp']")
	WebElement mainAssoDocumentPrepsubmit;

	// input[@id='btnSubmitTmp']
	@FindBy(xpath = "//button[@id='Submit_Esign']//self::button")
	WebElement proceedEsign;

	// Element for AssociateDocChangeReqReview() Method

	@FindBy(xpath = "//a[text()='My Tasks']/self::a")
	WebElement mytasks;

	@FindBy(xpath = "//span[text()='Associated Document Change Request Approval']/self::span")
	WebElement aDCRreqapp;

	@FindBy(xpath = "a[text()='Revision']/self::a")
	WebElement documentRevisionBtn;

	// Element for AssociateDocChangeReqReview() Method

	@FindBy(xpath = "//label[text()='Approve']/self::label")
	WebElement approveBtn;

	@FindBy(xpath = "//textarea[@id='Remarks']/self::textarea")
	WebElement sendremarkstext;

	@FindBy(xpath = "//span[text()='Document Tasks']/self::span")
	WebElement documentTasks;

	// Element for Document Revision Associate docs
	@FindBy(xpath = "//a[text()='Revision']")
	WebElement documentRevision;

	@FindBy(xpath = "//input[@id='btnConfirm'] ")
	WebElement buttonSubmit;

	// Document Prep of Associate Document
	@FindBy(xpath = "//*[@id=\"ListTab\"]/tbody/tr[4]")
	WebElement associateDocPrep;
	// Document Under prepration approver submit
	@FindBy(xpath = "//button[@id='btnSubmit'][1]")
	WebElement submitEsign1;

	// Document Under Publish Initiation

	@FindBy(xpath = "//table[@id='ListTab']/tbody/tr[3]")
	WebElement associateDocPublishInitiation;

	@FindBy(xpath = "//input[@id='btnConfirm']")
	WebElement associateDocPublishInitiationConfrmbtn;

	@FindBy(xpath = " //button[@class='caliber-button-primary']")
	WebElement associateDocPublishInitiationSubmitbutton;

	@FindBy(xpath = "//button[@id='ConfirmOkBtn']")
	WebElement associateDocPublishInitiationPopUpbtn;

	public AssociateDCR() {

		PageFactory.initElements(driver, this);
	}

	public void associateDocChangeReq(String DocUniqueCodeval) {

		TimeUtil.mediumWait();
		click(docsiqIcon, "Docsiqicon");
		// TimeUtil.shortWait();
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(associateDocumentChangeRequest, "AssociateDocumentChangeRequest");

		switchToBodyFrame(driver);

		click(advSearchbtn, "AdvSearchbtn");
		selectOptionFromDropdownByName(searchBox, "Doc. Unique Code", "Doc. Unique Code");
		sendText(uniqueCode, DocUniqueCodeval, "30SQA-Main-0202-000");
		click(applybtn, " Applybtn");
		click(selectDocs, "selectDocs");

		click(revisionRadiobtn, "RevisionRadiobtn");
		SendTextUsingJSInnerText(textarea, "Revise the Document", "Revise the document");
		click(aDCRbtnSubmit, "ADCRbtnSubmit");

		// Esign of ADCR

		sendText(passwordtxt, "password5", "Passwordtxt val");
		// click(SubmitEsign, "SubmitEsign");
		click(proceedEsign, "proceed Esign btn");

		Logout.signOutPage();

	}

//-------------------------------------------------------------------------	

	// for AssociateDocChangeReqReview() Method

	public void associateDocChangeReqReview(String UniqueCodeval, String Remark) {

		TimeUtil.mediumWait();
		click(docsiqIcon, "Docsiqicon");
		// TimeUtil.shortWait();
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(mytasks, " Mytasks");

		switchToBodyFrame(driver);

		click(aDCRreqapp, "ADCRreqapp");

		// Bellow Common xpath for all method element

		click(advSearchbtn, "	AdvSearchbtn");
		selectOptionFromDropdownByName(searchBox, "Unique Code", "Unique Code");
		sendText(uniqueCode, UniqueCodeval, "30SQA-Main-0202-000-Rev-6 ");
		click(applybtn, "	Applybtn");
		click(selectDocs, "selectDocs");
		click(approveBtn, "ApproveBtn");
		sendText(sendremarkstext, Remark, "Remarks txtfield");
		click(aDCRbtnSubmit, "ADCRbtnSubmit");

		sendText(passwordtxt, "password2", "Passwordtxt val");
		click(proceedEsign, "proceed Esign btn");

		Logout.signOutPage();

	}
	// for associateDocChangeReqApprover() Method

//	public void AssociateDocChangeReqApprover1(String UniqueCodeval, String Remark) {
//		TimeUtil.mediumWait();
//		click(Docsiqicon, "Docsiqicon");
//		// TimeUtil.shortWait();
//		click(DocsManager, "DocsManager");
//		click(Transactions, "Transactions");
//		click(Mytasks, " Mytasks");
//
//		switchToBodyFrame(driver);
//
//		click(ADCRreqapp, "ADCRreqapp");
//
//		// Bellow Common xpath for all method element
//
//		click(AdvSearchbtn, "	AdvSearchbtn");
//		selectOptionFromDropdownByName(SearchBox, "Unique Code", "Unique Code");
//		sendText(UniqueCode, UniqueCodeval, "30SQA-Main-0202-000-Rev-5 ");
//		click(Applybtn, "	Applybtn");
//		click(selectDocs, "selectDocs");
//		click(ApproveBtn, "ApproveBtn");
//		sendText(Sendremarkstext, Remark, "ApprovetheDocument");
//
//		click(SubmitEsign, "submit Esign");
//
//		sendText(Passwordtxt, "password2", "Passwordtxt val");
//		click(proceedEsign, "proceed Esign btn");
//
//		Logout.signOutPage();
//
//	}

	// Method for ADCR under Prepration initiation
	public void underPreprationReqInitiation(String UniqueCodeValue, String Esignpwd) {

		click(docsiqIcon, "Docsiqicon");
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(mytasks, " Mytasks");

		switchToBodyFrame(driver);

		click(documentTasks, " myTasks document Tasks");
		click(advSearchbtn, "  AdvSearchbtn iconon right top");
		selectOptionFromDropdownByName(searchBox, "Doc. Unique Code", "Doc. Unique Code");
		sendText(uniqueCode, UniqueCodeValue, "30SQA-Main-0202-000-");
		click(applybtn, "Applybtn to select document");
		click(selectDocs, "click the selected document");

		click(documentRevision, "DocumentRevision button");
		click(buttonSubmit, " Submit for under prepInitiation");

//		click(AssociateDocPrep, "AssociateDocPrep");
//		click(AssoDocumentPrepsubmit, "AssoDocumentPrepsubmit");

		sendText(passwordtxt, Esignpwd, "Passwordtxt val");
		click(proceedEsign, "proceed Esign btn");

		click(associateDocPrep, "AssociateDocPrep");
		click(assoDocumentPrepsubmit, "AssoDocumentPrepsubmit");

//		Submit the associate docs using Esign
		click(mainAssoDocumentPrepsubmit, "mainAssociate DocumentPrep submit");
		sendText(passwordtxt, "password5", "Passwordtxt val");
		click(proceedEsign, "proceed Esign btn");

		Logout.signOutPage();
	}
	// Method for Document under Under Preparation Approval

	public void underPreparationApproval(String UniqueCodeValue1, String Remarks, String Esignpwd) {
		click(docsiqIcon, "Docsiqicon");
		// TimeUtil.shortWait();
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(mytasks, " Mytasks");

		switchToBodyFrame(driver);

		click(documentTasks, " myTasks document Tasks");
		click(advSearchbtn, "  AdvSearchbtn iconon right top");
		selectOptionFromDropdownByName(searchBox, "Doc. Unique Code", "Doc. Unique Code");
		sendText(uniqueCode, UniqueCodeValue1, "30SQA-Main-0202-000-");
		click(applybtn, "Applybtn to select document");
		click(selectDocs, "click the selected document");

		click(approveBtn, "ApproveBtn");
		sendText(sendremarkstext, Remarks, "ApprovetheDocument");

		click(submitEsign1, "submit Esign1  Doc underPreparation approver");

		sendText(passwordtxt, Esignpwd, "Passwordtxt val");
		click(proceedEsign, "proceed Esign btn");

		Logout.signOutPage();
	}
	// Method for Document under Publish initiation

	public void associateDocunderPublishInitiation(String UniqueCodevaluePub, String Esignpwd) {
		click(docsiqIcon, "Docsiqicon");
		// TimeUtil.shortWait();
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(mytasks, " Mytasks");

		switchToBodyFrame(driver);

		click(documentTasks, " myTasks document Tasks");
		click(advSearchbtn, "  AdvSearchbtn iconon right top");
		selectOptionFromDropdownByName(searchBox, "Doc. Unique Code", "Doc. Unique Code");
		sendText(uniqueCode, UniqueCodevaluePub, "30SQA-Main-0202-000");
		click(applybtn, "Applybtn to select document");
		click(selectDocs, "click the selected document");
		click(associateDocPublishInitiation, "Associate Document Publish Initiation");
		click(associateDocPublishInitiationConfrmbtn, "AssociateDocPublishInitiationconfrmbtn");
		click(associateDocPublishInitiationSubmitbutton, "Associate Document Publish Initiation complete Submitbutton");

		click(associateDocPublishInitiationPopUpbtn, "Associate DocPublish Initiation (PopUpbtn) ok");
		click(submitEsign1, "submit Esign1  Doc publish initiation");
		sendText(passwordtxt, Esignpwd, "Passwordtxt val");
		click(proceedEsign, "proceed to Esign btn");

		// for main Esign Submit button
		click(submitEsign1, "submit Esign1  Doc publish initiation");
		sendText(passwordtxt, Esignpwd, "Passwordtxt val");
		click(proceedEsign, "proceed to Esign btn");

		Logout.signOutPage();

	}

	// for Associate Document under Publish Approver() Method
	public void associateDocUnderPublishApprover(String UniqueCodevaluePublish, String Remarks, String Esignpwd) {
		click(docsiqIcon, "Docsiqicon");
		// TimeUtil.shortWait();
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(mytasks, " Mytasks");

		switchToBodyFrame(driver);

		click(documentTasks, " myTasks document Tasks");
		click(advSearchbtn, "  AdvSearchbtn iconon right top");
		selectOptionFromDropdownByName(searchBox, "Doc. Unique Code", "Doc. Unique Code");
		sendText(uniqueCode, UniqueCodevaluePublish, "30SQA-Main-0202-000");
		click(applybtn, "Applybtn to select document");
		click(selectDocs, "click the selected document");

		click(approveBtn, "ApproveBtn");
		sendText(sendremarkstext, Remarks, "Approve the Document  for Publish");

		click(submitEsign1, "submit Esign1  Doc underPreparation approver");

		sendText(passwordtxt, Esignpwd, "Passwordtxt val");
		click(proceedEsign, "proceed Esign btn");

		Logout.signOutPage();
	}
}
