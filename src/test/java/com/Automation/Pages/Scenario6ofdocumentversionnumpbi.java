package com.Automation.Pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class Scenario6ofdocumentversionnumpbi  extends ActionEngine {
	Properties prop;
	public static String EMPdocumenttypetxtbox = "";
	

	public static String getEMPdocumenttypetxtbox() {
		return EMPdocumenttypetxtbox;
	}

	public static void setEMPdocumenttypetxtbox(String doctypetextbox) {
		EMPdocumenttypetxtbox = doctypetextbox;
	}


	
//	@FindBy(id = "ddlSelectedPlant_2")
	//WebElement planbutton;
	
	@FindBy(css = "span[id='selectPlant_81']")
	WebElement planbutton;
	
	
	
	
	
	//@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
//	WebElement xbutton;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/a[1]")
	WebElement Documentmanagericon;
	
//	@FindBy(xpath = "sessionBuilderModal")
//	WebElement Documentmanagericon;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")  
	WebElement Configurationmainmenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
	WebElement Initiatemenuinconfigurationmodule;
	
	@FindBy(id = "DMS_Configuration_Initiate_MENU0112")
	WebElement DocumenttypemenuininitiateofCONF;
	
	
	@FindBy(xpath = "//a[contains(text(),'Single Document Type')]")
	WebElement SingledocumenttypefieldinDT;
	
	@FindBy(id = "btnModal_DocumentType_CopyFrmExst")
	WebElement addbtnofexistingdocumentinDT;
	
	@FindBy(id = "DocumentType_CopyFrmExst_FindTxt")
	WebElement findtextbtninDT;
	
	@FindBy(id = "DocumentType_CopyFrmExst_RecordLimit")
	WebElement Recordsbtn;
	
	@FindBy(id = "DocumentType_CopyFrmExst_DisplayBtn")
	WebElement applybtnofexistingdoc;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement radiobtnofselectedexistingdoc;
	
	@FindBy(xpath = "//button[@id='DocumentType_CopyFrmExst_selectBtn']")
	WebElement addbtninexistingdoc;
	
	@FindBy(id= "DocumentType_DocumentTypeCode")
	WebElement documenttypetxtbox;
	
	@FindBy(id = "DocumentType_DocumentTypeDesc")
	WebElement descriptiontxtboxindocumenttype;
	
	
	
	@FindBy(id = "select2-DocumentType_NoOfDigitsForVersionNumber-container")
	WebElement dropdwnbtnofversionnum;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[3]")
	WebElement drpdwnofversion3;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[2]")
	WebElement drpdwnofversion2;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[4]")
	WebElement drpdwnofversion4;
	
	@FindBy(id = "select2-DocumentType_VersionStart-container")
	WebElement versionnumstartsfromdrpbtn;
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[2]")
	WebElement startdigitsdrpdwn2digits;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[2]")
	WebElement startdigitsdrpdwn3digits;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[2]")
	WebElement startdigitsdrpdwn4digits;
	
	//@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	//WebElement logoutbtn;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")
			WebElement configurationautditrailmenu;
			
	
	//@FindBy(id = "DMS_Configuration_Audit Trails")
//	WebElement configurationautditrailmenu;
	
	@FindBy(id = "DMS_Configuration_Audit Trails_MENU0112")
	WebElement DTaudittrailofconf;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchboxofaudittrail;
	
	@FindBy(xpath = "//span[@id='btnClientSearch']")
	WebElement searchiconofaudittrail;
	
	
	@FindBy(xpath = "//td[contains(text(),'ramg1.g')]")
	WebElement recodofmaindocinat;
	
	
	
	
	@FindBy(xpath = "//iframe[@id='bodyFrame']")
	WebElement audittraildocselecting;
	
	
	@FindBy(xpath = "//div[@class='approve-status']/span[1]/span[1]")
	WebElement ApprovalRequiredValuetext;
	
	@FindBy(xpath = "//div[@class='approve-status']/span[2]/span[1]")
	WebElement ApprovalCompletedValuetext;
	
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtn;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[5]/a[1]")
	WebElement apporvalmenuinconfigu;
	
	@FindBy(id = "DMS_Configuration_Approval_MENU0112")
	WebElement DTmenuinapprovalsofconfigu;
	
	@FindBy(xpath = "//td[contains(text(),'ramg1.g')]")
	WebElement InDTofapprovalselectingoption;
	
	@FindBy(xpath = "//label[contains(text(),'Return')]")
	WebElement lablecontianreturnscroll;
	
	@FindBy(id = "SelectedDecision_3")
	WebElement radiobtnofreturn;
	
	@FindBy(xpath = "//textarea[@id='Remarks']")//textarea[@id='DocumentType_Remarks']
	WebElement remarksofreturnorapproval;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[6]/a[1]")
	WebElement reinitiationinconfig;
	
	@FindBy(id = "DMS_Configuration_Re-initiate_MENU0112")
	WebElement DTreininitioninconfig;
	
	@FindBy(xpath = "//td[contains(text(),'ram.g')]")
	WebElement reinitionsselectingrecords;
	
	@FindBy(xpath = "//h6[contains(text(),'Common Configurations')]")
	WebElement reinitionofDTcommonconfigu;
	
	@FindBy(id = "select2-DocumentType_NoOfDigitsForVersionNumber-container")
	WebElement reinitionnumofdigitsofversionnumincommonconfig;
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[3]")
	WebElement reinitiationofCCofdrpdwnofversion3;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[4]")
	WebElement reinitiationofCCofdrpdwnofversion4;
	
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[2]")
	WebElement reinitiationofCCofdrpdwnofversion2;
	
	@FindBy(id = "select2-DocumentType_VersionStart-container")
	WebElement reinitionofversionnumstartsfromincommonconfig;
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[2]")
	WebElement reinitionofstartdigitsdrpdwn2digits;
	
	@FindBy(xpath = "//textarea[@id='DocumentType_Remarks']")
	WebElement remarksofreinitionofDTofapprovar;
	
	@FindBy(xpath = "//*[@class='ft-filter']")  
	WebElement filterofapprovalofconfigurationmenu;
	
	@FindBy(id = "PageSize")
	WebElement recordsperpageofapprovalofconfigurationmenu;
	
	@FindBy(id = "displayBtn")
	WebElement applybtnofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement searchiconofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement clickonselectedrecordofapprovalofconfig;
	
	@FindBy(id = "SelectedDecision_2")
	WebElement approveradiobtnofapproval;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")
	WebElement adittrailmenuinconfig;
	
	@FindBy(id = "DMS_Configuration_Audit Trails_MENU0112")
	WebElement DTmenuinaudittrail;
	
	@FindBy(xpath = "//*[@class='ft-filter']")  
	WebElement ATfilterofapprovalofconfigurationmenu;
	
	@FindBy(id = "PageSize")
	WebElement ATrecordsperpageofapprovalofconfigurationmenu;
	
	@FindBy(id = "displayBtn")
	WebElement ATapplybtnofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement ATsearchofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement ATsearchiconofapprovalofconfigurationmenu;
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement ATclickonselectedrecordofapprovalofconfig;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtninall;
	
	@FindBy(xpath = "//span[@class='popup-close-button']")
		WebElement cancelbuttonofaudittrail;
	
	@FindBy(xpath = "//body")
		WebElement cancelbtnofpopup;
		
	
	
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Multi Document Type')]")
		WebElement multidocutype;
	
	@FindBy(xpath = "//button[@id='btnModal_DocumentType_MainDocument']")
		WebElement maindocaddbut;
	
	@FindBy(css = "input[type=radio][name='recordSelection']")
		WebElement radiobtnofmaindoc;
		
	@FindBy(xpath = "//button[@id='DocumentType_MainDocument_selectBtn']")
		WebElement Addbtnofmainmultidoc;
		
	@FindBy(xpath = "//button[@id='btnModal_DocumentType_AsscDocument']")
		WebElement associateaddbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
		WebElement addbtnofassbt1;
	
	@FindBy(xpath = "//tbody/tr[2]/td[3]/button[1]")
		WebElement addbtnofassbt2;
	
	
	@FindBy(xpath = "//button[@id='DocumentType_AsscDocument_selectBtn']")
		WebElement Addbtnofassocimulti1;
	
	@FindBy(id= "DocumentType_DocumentTypeCode")
	WebElement documenttypetxtbox1;
	
	@FindBy(id = "DocumentType_DocumentTypeDesc")
	WebElement descriptiontxtboxindocumenttype1;
//--------------------------------------------------------------------------------------------------------------------new	
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0123")
	WebElement Importmenuintrasactions;
	
	@FindBy(xpath = "//button[@id='btnModal_Import_MainDocType']")
	WebElement addbtnofmaindocinimport;
	
	@FindBy(xpath = "//input[@id='Import_MainDocType_FindTxt']")
	WebElement findtxtofmaindocsearchinimport;

	@FindBy(id = "Import_MainDocType_DisplayBtn")
	WebElement applybtninmaindocimport;
	
	@FindBy(xpath = "//a[text()='Maindoc-rk']")
	WebElement maidocrecord;
	
	@FindBy(xpath = "//a[text()='PMG-r']")
	WebElement documentrepository;

	@FindBy(xpath = "//input[@type='radio'][@name='recordSelection']")
	WebElement radiobtnofsection;
	
	@FindBy(xpath = "//button[@id='Import_MainDocType_SecPopUp_selectBtn']")
	WebElement addbtnofimport;
	
	@FindBy(xpath = "//input[@id='Import_MassUploadCode']")
	WebElement maindocuniqecodeinimport;
	
	@FindBy(xpath = "//input[@id='Import_MassUploadDesc']")
	WebElement documenttitleofmaindoc;
	
	@FindBy(xpath = "//label[text()='Choose File']")
	WebElement choosefileinimport;
	
	@FindBy(xpath = "//textarea[@id='Import_RevisionChangeDetailss']")
	WebElement revisionchagedetails;
	
	@FindBy(xpath = "//input[@id='Import_ChangeControlNumber']")
	WebElement changectrlfieldofimport;
	
	
	//submit
	
	//no esign
	
	//done
	
	//audittrailflow
	
	//logout
	
	@FindBy(xpath = "//span[contains(text(),'Import Approval')]")
	WebElement importapproval;
	
	
	//searchbox, searchicon
	
	
	//same flow no esign
	
	//logout
	
	
	@FindBy(xpath = "//span[contains(text(),'Import Re-Initiation')]")
	WebElement importreinitiation;
	
	@FindBy(id = "Import_Remarks")
WebElement importremarks1;
	
	@FindBy(xpath = "//textarea[@id='Remarks']")
	WebElement importremarks;
		
	//nosign,logout
	
	@FindBy(id = "DMS_Document Manager_Audit Trails")
	WebElement documentmanageraudittrails;
	
	@FindBy(id = "DMS_Document Manager_Audit Trails_MENU0123")
	WebElement documentmanageraudittrailsimportmenu;
	
	
	
	///subdocflow1
	
	@FindBy(xpath = "//input[@id='DoctypeCategory_1']")
	WebElement associatedocradiobtn;
	
	@FindBy(xpath = "//button[@id='btnModal_Import_MainDocument']")
	WebElement addbtnofmaindocinassociate;
	
	@FindBy(xpath = "//input[@id='Import_MainDocument_FindTxt']")
	WebElement findtxtbtnofassociate;
	
	
	@FindBy(id = "Import_MainDocument_DisplayBtn")
	WebElement applybtnofassociatedocimport;
	
	@FindBy(xpath = "//input[@type='radio'][@name='recordSelection']")
	WebElement radiobtnofselectitemofassociate;
	
	@FindBy(id = "Import_MainDocument_selectBtn")
	WebElement addbtnofassociatenew1;
	
	@FindBy(id = "btnModal_Import_AssDocType")
	WebElement associtatedocaddbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Associate-rk1')]")
	WebElement selectingassocitatedocument;
	
	@FindBy(xpath = "//a[contains(text(),'PMG-r')]")
	WebElement pmgrselecting;
	
	
	
	
	
	
	//input[@type='radio'][@name='recordSelection']
	
	@FindBy(xpath = "//a[text()='Associate-rk2']")
	WebElement selectingassocitatedocument2doc;
	
	
//	@FindBy(xpath = "//a[text()='PMG-r']")
	//WebElement documentrepository;

	
	//@FindBy(xpath = "//input[@type='radio'][@name='recordSelection']")
	//WebElement radiobtnofsection;
	
	@FindBy(xpath = "//button[@id='Import_AssDocType_SecPopUp_selectBtn']")
	WebElement addbtnofasso1;
	
	/*
	@FindBy(xpath = "//input[@id='Import_MassUploadCode']")
	WebElement maindocuniqecodeinimport;
	
	@FindBy(xpath = "//input[@id='Import_MassUploadDesc']")
	WebElement documenttitleofmaindoc;
	
	@FindBy(xpath = "//label[text()='Choose File']")
	WebElement choosefileinimport;
	
	
	@FindBy(xpath = "//textarea[@id='Import_RevisionChangeDetailss']")
	WebElement revisionchagedetails;
	
	@FindBy(xpath = "//input[@id='Import_ChangeControlNumber']")
	WebElement changectrlfieldofimport;
	
	*/
	
	//submitbtn,donebtnnoesign
	
	
	//adittrails
	
	//logout
	
	//impitapprovalnoesignlogout
	
	
	
	
	
	//@FindBy(xpath = "//input[@id='Import_MassUploadCode']")
	//WebElement maindocuniqecodeinimport;
	
	
	//importapproval
	
//----------------	print flow
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0132")
	WebElement printrequestmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Maindoc-rk')]")
		WebElement maindocforprint;
//-------imp----------------------------------------------------------------------		
	
	@FindBy(xpath = "//span[contains(text(),'massupload-m1rk21')]")
	WebElement realmaindoc1;
	
	//------------------------------------------------------------------------vvvimp-------------	
	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	WebElement otherscreenmaindoc;
	
	@FindBy(xpath = "//input[@id='DMSPrintRequest_NoofCopies']")
	WebElement numberofcopiesfield;
	
	@FindBy(xpath = "//input[@type='radio'][@name='DMSPrintRequest.PrintType']")
	WebElement radiobtnofcontrolledcpy;
	
	@FindBy(xpath = "//textarea[@id='DMSPrintRequest_PrintReason']")
	WebElement remarksofprint;
	
	//submit,noesign,done,logout
	
	//@FindBy(xpath = "//span[contains(text(),'Print Request Approval')]")
	//WebElement printrequestapproval;
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement selectingofrecord;
	
	//clickonapprovedonelogout
	
//	@FindBy(xpath = "//span[text()='Print']")
	//WebElement printmenu;
	

	@FindBy(xpath = "//tbody/tr[1]/td[9]/a[1]")
	WebElement prinbtn;
	
	

	@FindBy(linkText = "Document Manager")
	WebElement DocumentManagericon;
	
	@FindBy(linkText = "Transactions")
	WebElement DocumentManagertransactionsubmenu;
	
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0041")
	WebElement mytaskmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Document Tasks')]")
	WebElement documenttasks;
	
	
	@FindBy(xpath = "//span[contains(text(),'Print Request Approval')]")
	WebElement printrequestapproval;
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0132")
	WebElement Printrequrestmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Maindoc-rk')]")
	WebElement recordofrkmainprintreq;
	
	@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement clickonselectedrecordofprint;
	
	@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")
	WebElement clickonselectedrecordofprint1;
	
	@FindBy(id = "DMSPrintRequest_NoofCopies")
	WebElement numofcopiesofprint;
	
    @FindBy(id = "DMSPrintRequest_PrintReason")
	WebElement numofcopiesofprintreason;
    
    @FindBy(xpath = "//input[@id='PrintType_0']")
	WebElement radiobtnofuncontrolledcpy;
    
    @FindBy(xpath = "//span[contains(text(),'Print Request Approval')]")
   	WebElement printrequestapprovalnew;
    
    @FindBy(xpath = "//td[text()='ramg1.g']")
   	WebElement selectingrecord;
    
    @FindBy(xpath = "//body/form[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]")
   	WebElement printmenu;
    
    @FindBy(xpath = "//a[text()='Print']")
   	WebElement printbtn;
    
   @FindBy(xpath = "//span[@id='select2-PrinterSelList-container']")
   	WebElement selectionofdrpprinter;
    
    @FindBy(xpath = "//ul[@id='select2-PrinterSelList-results']/li[2]")
   	WebElement pdflite;
    
    @FindBy(xpath = "//button[contains(text(),'Print')]")
   	WebElement printbtn1;
    
  
  //signout
    
    @FindBy(xpath = "//input[@id='WordPreviewBtn']")
	WebElement wordpreviewbtn;
  
  
  /*
  
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtninall;
	
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	*/
	@FindBy(id = "btnSubmitTmp")
	WebElement SubmitBtntemp;
	
	
	 @FindBy(xpath = "//input[@id='SelectedDecision_2']")
		WebElement radiobtnofapprove;
	
	 
	 @FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[8]/a[1]")
		WebElement audittrailimp;
	
	
			
	 @FindBy(xpath = "//input[@id='btnConfirm_1']")
	 WebElement confirmbtn;

	 @FindBy(xpath = "//span[@id='select2-Import_MainDocument_selectDdl-container']")
	 WebElement spin1;

	 @FindBy(xpath = "//ul[@id='select2-Import_MainDocument_selectDdl-results']/li[2]")
	 WebElement dropdwndoctype;
	 
	 
	
	
	
	 @FindBy(xpath = "//input[@type='radio'][@name='recordSelection']")
	 WebElement radiobtnassomain;
	 

	 @FindBy(xpath = "//button[@id='Import_MainDocument_selectBtn']")
	 WebElement addbtnofassomain;
	 
	 @FindBy(xpath = "//span[contains(text(),'Mainvasimport1')]")
	 WebElement selrecordofprint;
	 
	 @FindBy(xpath = "//span[contains(text(),'massupload-m1rk21')]")
	 WebElement recordimportothertool;
	 
	
	
	
	
	
	
	
	
	
	
	
	
	//button[@id='btnModal_DocumentType_AsscDocument']
	
	
	
	
	public Scenario6ofdocumentversionnumpbi() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is for document registration
	 * @throws AWTException 
	 * 
	 * 
	 */
	
	

public void documentReinitApproval(String Recordsperpageofapprovalofconfigurationmenu,String Maindocuniqecodeinimport) {
	
	jsClick(Documentmanagericon, "Document manager icon tab");
	jsClick(DocumentManagericon, "DocumentManagermenu");
	jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
	jsClick(mytaskmenu, "mytaskmenu");
	switchToBodyFrame(driver);
	TimeUtil.shortWait();
	jsClick(importapproval, "importapproval");
	TimeUtil.shortWait();
	switchToDefaultContent(driver);
	TimeUtil.shortWait();
 switchToBodyFrame(driver);
	
	jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
	  
 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
 sendText(recordsperpageofapprovalofconfigurationmenu,Recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
  
  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
  sendText(searchofapprovalofconfigurationmenu,Maindocuniqecodeinimport, "searchofapprovalofconfigurationmenu");
	
  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
  
  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
  
  TimeUtil.shortWait();
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
	
	TimeUtil.shortWait();
  
   jsClick(approveradiobtnofapproval, "approveradiobtnofapproval");
  
   jsClick(SubmitBtn, "Submit Btn");
		
		//E_sign.e_Sign(eSign);
		
	//	TimeUtil.shortWait();
		
		jsClick(nextbtninall, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		
		
		//Audittrail of document reinitiationapproval
		
		 
		jsClick(Documentmanagericon, "Document manager icon tab");
		jsClick(DocumentManagericon, "DocumentManagermenu");
		jsClick(audittrailimp, "documentmanageraudittrails");
		jsClick(documentmanageraudittrailsimportmenu, "documentmanageraudittrailsimportmenu");
		switchToBodyFrame(driver);
		
		
		
         jsClick(ATfilterofapprovalofconfigurationmenu, "ATfilterofapprovalofconfigurationmenu");
		 
		 jsClick(ATrecordsperpageofapprovalofconfigurationmenu, "ATrecordsperpageofapprovalofconfigurationmenu");
		 
		 jsClick(ATapplybtnofapprovalofconfigurationmenu, "ATapplybtnofapprovalofconfigurationmenu");
		 
		 jsClick(ATsearchofapprovalofconfigurationmenu, "ATsearchofapprovalofconfigurationmenu");
		 sendText(ATsearchofapprovalofconfigurationmenu,Maindocuniqecodeinimport,"ATsearchofapprovalofconfigurationmenu");
		 
		 jsClick(ATsearchiconofapprovalofconfigurationmenu, "ATsearchiconofapprovalofconfigurationmenu");
		 
		 jsClick(ATclickonselectedrecordofapprovalofconfig, "ATclickonselectedrecordofapprovalofconfig");
		
		 TimeUtil.shortWait();
			 
			 driver.switchTo().frame(0);
			 
			 TimeUtil.shortWait();
			 
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  		
		  			js1.executeScript("arguments[0].scrollIntoView();",ApprovalRequiredValuetext);
		  			
		  			TimeUtil.shortWait();
		  	
		  			 verifyCaptionContains(ApprovalRequiredValuetext, "ApprovalRequiredValuetext");
		  		
		  TimeUtil.shortWait();
	  			
	  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
	  			 
	  			 switchToDefaultContent(driver);
	  			 
	  			 jsClick(logoutbtn, "logoutbtn");	
	         			
		
		
		
		
}
		
		
//-----------sub1


	/**
	 * This method is for documentReinitApproval
	 * 
	 * 
	 */
	public void documentReinitApprovalsub1(String Recordsperpageofapprovalofconfigurationmenu,String Maindocuniqecodeinimportsub1) {
		
		jsClick(Documentmanagericon, "Document manager icon tab");
		jsClick(DocumentManagericon, "DocumentManagermenu");
		jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
		jsClick(mytaskmenu, "mytaskmenu");
		switchToBodyFrame(driver);
		TimeUtil.shortWait();
		jsClick(importapproval, "importapproval");
		TimeUtil.shortWait();
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
	 switchToBodyFrame(driver);
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
	 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 sendText(recordsperpageofapprovalofconfigurationmenu,Recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
	  
	  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
	  sendText(searchofapprovalofconfigurationmenu,Maindocuniqecodeinimportsub1, "searchofapprovalofconfigurationmenu");
		
	  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
	  
	  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
	  
	  TimeUtil.shortWait();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
		
		TimeUtil.shortWait();
	  
	   jsClick(approveradiobtnofapproval, "approveradiobtnofapproval");
	  
	   jsClick(SubmitBtn, "Submit Btn");
			
			//E_sign.e_Sign(eSign);
			
		//	TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			//Audittrail of document reinitiationapproval
			
			 
			jsClick(Documentmanagericon, "Document manager icon tab");
			jsClick(DocumentManagericon, "DocumentManagermenu");
			jsClick(audittrailimp, "documentmanageraudittrails");
			jsClick(documentmanageraudittrailsimportmenu, "documentmanageraudittrailsimportmenu");
			switchToBodyFrame(driver);
			
			jsClick(ATfilterofapprovalofconfigurationmenu, "ATfilterofapprovalofconfigurationmenu");
			 
			 jsClick(ATrecordsperpageofapprovalofconfigurationmenu, "ATrecordsperpageofapprovalofconfigurationmenu");
			 
			 jsClick(ATapplybtnofapprovalofconfigurationmenu, "ATapplybtnofapprovalofconfigurationmenu");
			 
			 jsClick(ATsearchofapprovalofconfigurationmenu, "ATsearchofapprovalofconfigurationmenu");
			 sendText(ATsearchofapprovalofconfigurationmenu,Maindocuniqecodeinimportsub1,"ATsearchofapprovalofconfigurationmenu");
			 
			 jsClick(ATsearchiconofapprovalofconfigurationmenu, "ATsearchiconofapprovalofconfigurationmenu");
			 
			 jsClick(ATclickonselectedrecordofapprovalofconfig, "ATclickonselectedrecordofapprovalofconfig");
			
			 TimeUtil.shortWait();
				 
				 driver.switchTo().frame(0);
				 
				 TimeUtil.shortWait();
				 
				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  		
			  			js1.executeScript("arguments[0].scrollIntoView();",ApprovalRequiredValuetext);
			  			
			  			TimeUtil.shortWait();
			  	
			  			 verifyCaptionContains(ApprovalRequiredValuetext, "ApprovalRequiredValuetext");
			  		
			  TimeUtil.shortWait();
		  			
		  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
		  			 
		  			 switchToDefaultContent(driver);
		  			 
		         		jsClick(logoutbtn, "logoutbtn");	
		         			
			
			
			
			
	}
			

				
				
//-------------------print
		
		
		public void Documenttypepublishinitiation(String Findtxtofmaindocsearchinimport,String Maindocuniqecodeinimport,String Numberofcopiesfield,String Remarksofprint){
			
			 
			 String s = "";
				String randomval = "";
				
					prop = ConfigsReader.readProperties("./configs/configuration.properties");
					if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			
						s = TextUtils.randomvalue(2);
						randomval = Integer.toString(TextUtils.randomNumber(1));


			
			}
			
			
			//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);
			
			//TimeUtil.shortWait();
			
			waitForPageToLoad(1000);
			 
			/*            
			 pasteDataUsingRobot("venkatapm");
			 Robot robot;
			 robot = new Robot();
			 TimeUtil.shortWait();
			 robot.keyPress(KeyEvent.VK_DOWN);
			 TimeUtil.shortWait();
			 robot.keyPress(KeyEvent.VK_TAB);
			 pasteDataUsingRobot("TRY@1234");
			 TimeUtil.shortWait();
			 robot.keyPress(KeyEvent.VK_DOWN);
			 TimeUtil.shortWait();
			 robot.keyPress(KeyEvent.VK_TAB);
			 TimeUtil.shortWait();
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyPress(KeyEvent.VK_ENTER);
			 TimeUtil.shortWait();    
			 */
			
			//pasteDataUsingRobot("venkatapm");
			/*
			 Robot robot;
			 robot = new Robot();
			 TimeUtil.shortWait();
			 
			 
			 robot.keyPress(KeyEvent.VK_ENTER);
			// robot.keyPress(KeyEvent.VK_ENTER);
			 TimeUtil.shortWait();    
			// jsClick(cancelbtnofpopup, "cancelbtnofpopup");
			 
				// TimeUtil.shortWait();*/
				
			jsClick(Documentmanagericon, "Document manager icon tab");
			jsClick(DocumentManagericon, "DocumentManagermenu");
			jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
			jsClick(printrequestmenu, "printrequestmenu");
			switchToBodyFrame(driver);
			
			jsClick(searchboxofaudittrail, "searchboxofaudittrail");
			sendText(searchboxofaudittrail,Findtxtofmaindocsearchinimport,"searchboxofaudittrail");
			
			jsClick(searchiconofaudittrail, "searchiconofaudittrail");
			
		    TimeUtil.shortWait(); 
				
		     jsClick(maindocforprint, "maindocforprint");
		     
		     TimeUtil.shortWait(); 
		     
		   //  jsClick(recordimportothertool, "recordimportothertool");
		     
		   //  TimeUtil.shortWait();
		   
		     
		    jsClick(searchboxofaudittrail, "searchboxofaudittrail");
				sendText(searchboxofaudittrail,Maindocuniqecodeinimport,"searchboxofaudittrail");
				
	jsClick(searchiconofaudittrail, "searchiconofaudittrail");
	
	
		TimeUtil.shortWait(); 
				
			//	jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
				
				//TimeUtil.shortWait(); 
				
				 jsClick(realmaindoc1, "realmaindoc");
		    
		   
		    TimeUtil.shortWait(); 
		    
		    
		    
		    jsClick(otherscreenmaindoc, "otherscreenmaindoc");
		    
		    TimeUtil.shortWait(); 
		    
		    jsClick(numberofcopiesfield, "numberofcopiesfield");
			sendText(numberofcopiesfield,Numberofcopiesfield,"numberofcopiesfield");
			
			jsClick(remarksofprint, "remarksofprint");
			sendText(remarksofprint,Remarksofprint,"remarksofprint");
		    
		    jsClick(radiobtnofcontrolledcpy, "radiobtnofcontrolledcpy");
		    
		    TimeUtil.shortWait(); 
		    
		   jsClick(SubmitBtn, "SubmitBtn");
					
		           TimeUtil.shortWait();
					
					jsClick(nextbtninall, "Done button");
					
					TimeUtil.shortWait();
					
					
					
				 switchToDefaultContent(driver);
			  			 
			         		jsClick(logoutbtn, "logoutbtn");	
			         		
			         			}
					
		 
		 /**
			 * This m
			 * 
			 * 
			 */
			public void Documentpublishinitiationapproval(String Maindocuniqecodeinimport) {
				
				jsClick(Documentmanagericon, "Document manager icon tab");
				jsClick(DocumentManagericon, "DocumentManagermenu");
				jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
				jsClick(mytaskmenu, "mytaskmenu");
				switchToBodyFrame(driver);
				TimeUtil.shortWait();
				jsClick(printrequestapproval, "printrequestapproval");
				TimeUtil.shortWait();
				switchToDefaultContent(driver);
				TimeUtil.shortWait();
				switchToBodyFrame(driver);
				
				 jsClick(searchboxofaudittrail, "searchboxofaudittrail");
					sendText(searchboxofaudittrail,Maindocuniqecodeinimport,"searchboxofaudittrail");
					
					jsClick(searchiconofaudittrail, "searchiconofaudittrail");
					
				      TimeUtil.shortWait(); 
			    
			    jsClick(selectingofrecord, "selectingofrecord");
			    
			    TimeUtil.shortWait(); 
				
				 jsClick(radiobtnofapprove, "approveradiobtn");
				 
				
			 jsClick(SubmitBtn, "Submit Btn");
					
					//E_sign.e_Sign(eSign);
					
					//TimeUtil.shortWait();
					
					jsClick(nextbtninall, "Done button");
					
					TimeUtil.shortWait();
					
					switchToDefaultContent(driver);
					
					jsClick(logoutbtn, "logoutbtn");
					
			}
			
			
			
			/**
			 * This metho
			 * 
			 * 
			 */
			public void Documentprintinitiation(String Maindocuniqecodeinimport ) {
				
				
				

				jsClick(Documentmanagericon, "Document manager icon tab");
				jsClick(DocumentManagericon, "DocumentManagermenu");
				jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
				jsClick(mytaskmenu, "mytaskmenu");
				switchToBodyFrame(driver);
				TimeUtil.shortWait();
				jsClick(printmenu, "printmenu");
				TimeUtil.shortWait();
				switchToDefaultContent(driver);
				TimeUtil.shortWait();
				
				switchToBodyFrame(driver);
				 jsClick(searchboxofaudittrail, "searchboxofaudittrail");
					sendText(searchboxofaudittrail,Maindocuniqecodeinimport,"searchboxofaudittrail");
					
					jsClick(searchiconofaudittrail, "searchiconofaudittrail");
					
				      TimeUtil.shortWait(); 
			    
			    jsClick(prinbtn, "prinbtn");
			    
			    TimeUtil.shortWait(); 
				
				    jsClick(selectionofdrpprinter, "selectionofdrpprinter");
				  
				  jsClick(pdflite, "pdflite");
				  
				  jsClick(printbtn1, "printbtn1");
				  
				  TimeUtil.shortWait();
				  
				//  TimeUtil.shortWait();
				  
				 // TimeUtil.shortWait();
				  
				//  jsClick(okkkbtn, "okkkbtn");
				  
				  TimeUtil.shortWait();
				  
				  				
						switchToDefaultContent(driver);
						
						jsClick(logoutbtn, "logoutbtn");
						
						
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
		
		
		
