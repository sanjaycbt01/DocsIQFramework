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

public class Documentversionnumberscenario2   extends ActionEngine {
	Properties prop;
	public static String EMPdocumenttypetxtbox = "";
	

	public static String getEMPdocumenttypetxtbox() {
		return EMPdocumenttypetxtbox;
	}

	public static void setEMPdocumenttypetxtbox(String doctypetextbox) {
		EMPdocumenttypetxtbox = doctypetextbox;
	}


	
	@FindBy(id = "ddlSelectedPlant_2")
	WebElement planbutton;
	
	
	
//	@FindBy(xpath = "sessionBuilderModal")
//	WebElement Documentmanagericon;
	
	
	//@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
//	WebElement xbutton;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/a[1]")
	WebElement Documentmanagericon;
	
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")  
	WebElement Configurationmainmenu;
	
	
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
	WebElement Modificationmenuinconfigurationmodule;
	
	@FindBy(id = "DMS_Configuration_Modify_MENU0112")
	WebElement DocumenttypemenuinModificationofCONF;
	
	@FindBy(xpath = "//*[@class='ft-filter']")
	WebElement advancedsearchinmodification;
	
	@FindBy(xpath = "//input[@type='number'][@name='PageSize']")
	WebElement totalrecords;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applybtnofmodification;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement mainpagesearchtxtbox;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement mainpagesearchicon;
	
	
	//----------------------------------------------------------------------------
	
	
	@FindBy(xpath = "//h6[text()='Common Configurations']")
	WebElement commonconfigurationsinmodifiscre;
	
	@FindBy(id = "select2-DocumentType_VersionStart-container")
	WebElement versionnumstartsfromdrpbtn1;
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[3]")
	WebElement startdigitsdrpdwn2digitsn;
	
	@FindBy(xpath = "//textarea[@id='DocumentType_Remarks']")
	WebElement modificationremarks;
	

	@FindBy(id = "DMS_Configuration_Audit Trails")
	WebElement configurationautditrailmenu1;
	
	@FindBy(id = "DMS_Configuration_Audit Trails_MENU0112")
	WebElement DTaudittrailofconf1;
	
	@FindBy(xpath = "//*[@class='ft-filter']")
	WebElement advancedsearchinmodification1;
	
	@FindBy(xpath = "//input[@type='number'][@name='PageSize']")
	WebElement totalrecords1;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applybtnofmodification1;
	
	
	
	
//------------------------------------------------------------------------------------------
	
	
	//-----------------------------------------------------------------------
	
	
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[5]/a[1]")
	WebElement apporvalmenuinconfigu1;
	
	@FindBy(id = "DMS_Configuration_Approval_MENU0112")
	WebElement DTmenuinapprovalsofconfigu1;
	
	@FindBy(xpath = "//button[text()='Modification']")
	WebElement Modificationtabinapproval;
	
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement recodofmaindocinat1;
	
	@FindBy(xpath = "//label[contains(text(),'Return')]")
	WebElement lablecontianreturnscrollmo;
	
	@FindBy(id = "SelectedDecision_3")
	WebElement radiobtnofreturnmo;
	
	@FindBy(xpath = "//textarea[@id='Remarks']")//textarea[@id='DocumentType_Remarks']
	WebElement remarksofreturnorapprovalmo;
	
	//logout
	
	
	@FindBy(xpath = "//ul[@id='DMS_Configuration_Re-initiate']")
	WebElement reinitiationinconfigmo;
	
	@FindBy(id = "DMS_Configuration_Re-initiate_MENU0112")
	WebElement DTreininitioninconfigmo;
	
	//button[text()='Modification']
	
	@FindBy(xpath = "//td[contains(text(),'ram.g')]")
	WebElement reinitionsselectingrecords;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement mainpagesearchtxtbox1;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement mainpagesearchicon1;
	
	@FindBy(xpath = "//td[text()='ram.g']")
	WebElement recodofmaindocinatmodireini;
	
	@FindBy(xpath = "//h6[contains(text(),'Common Configurations')]")
	WebElement reinitionofDTcommonconfigumore;
	
	@FindBy(id = "select2-DocumentType_VersionStart-container")
	WebElement reinitionofversionnumstartsfromincommonconfigmo;
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_VersionStart-results']/li[2]")
	WebElement reinitionofstartdigitsdrpdwn2digitsmo;
	
	@FindBy(xpath = "//textarea[@id='DocumentType_Remarks']")
	WebElement remarksofreinitionofDTofapprovarmo;
	
	
	//logout
	
	//modificationtab
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement modificationapprovalsearchtxt;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement modificationapprovalsearchicon;
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement modificationrecordds;
	
	//scrol uptoreturn
	@FindBy(id = "SelectedDecision_2")
	WebElement approveradiobtnofapprovalmo;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")
	WebElement adittrailmenuinconfigmo;
	
	@FindBy(id = "DMS_Configuration_Audit Trails_MENU0112")
	WebElement DTmenuinaudittrailmo;
	
	@FindBy(xpath = "//*[@class='ft-filter']")  
	WebElement ATfilterofapprovalofconfigurationmenumo;
	
	@FindBy(id = "PageSize")
	WebElement ATrecordsperpageofapprovalofconfigurationmenumo;
	
	@FindBy(id = "displayBtn")
	WebElement ATapplybtnofapprovalofconfigurationmenumo;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement ATsearchofapprovalofconfigurationmenumo;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement ATsearchiconofapprovalofconfigurationmenumo;
	
	@FindBy(xpath = "//td[text()='ramg1.g']")
	WebElement ATclickonselectedrecordofapprovalofconfigmo;
	
	
	@FindBy(xpath = "//span[contains(text(),'Revision No.:0')]")
	WebElement audittrailrev0;
	
	@FindBy(xpath = "//span[contains(text(),'Revision No.:1')]")
	WebElement audittrailrev1;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement Proceedbtnofaudittra;

	@FindBy(xpath = "//div[@class='approve-status']/span[1]/span[1]")
	WebElement ApprovalRequiredValue;
	
	@FindBy(xpath = "//div[@class='approve-status']/span[2]/span[1]")
	WebElement ApprovalCompletedValue;
	
	@FindBy(xpath = "//span[@class='popup-close-button']")
	WebElement cancelbuttonofaudittrail1;
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtnofepic;
	
	
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtninall1;
	
	@FindBy(xpath = "//span[@class='popup-close-button']")
		WebElement cancelbuttonofaudittrail;
	
	
	
	
	
	
	
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
	
	@FindBy(id = "//button[@id='DocumentType_CopyFrmExst_selectBtn']")
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
	
	
	@FindBy(id = "DMS_Configuration_Audit Trails")
	WebElement configurationautditrailmenu;
	
	@FindBy(id = "DMS_Configuration_Audit Trails_MENU0112")
	WebElement DTaudittrailofconf;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchboxofaudittrail;
	
	@FindBy(xpath = "//span[@id='btnClientSearch']")
	WebElement searchiconofaudittrail;
	
	
	@FindBy(xpath = "//td[text()='ram.g']")
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
	
	@FindBy(xpath = "//ul[@id='DMS_Configuration_Re-initiate']")
	WebElement reinitiationinconfig;
	
	@FindBy(id = "DMS_Configuration_Re-initiate_MENU0112")
	WebElement DTreininitioninconfig;
	
	
	@FindBy(xpath = "//h6[contains(text(),'Common Configurations')]")
	WebElement reinitionofDTcommonconfigu;
	
	@FindBy(id = "select2-DocumentType_NoOfDigitsForVersionNumber-container")
	WebElement reinitionnumofdigitsofversionnumincommonconfig;
	
	
	@FindBy(xpath = "//ul[@id='select2-DocumentType_NoOfDigitsForVersionNumber-results']/li[3]")
	WebElement reinitiationofCCofdrpdwnofversion3;
	
	
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
		WebElement cancelbuttonofaudittrailmo;
	
	

	@FindBy(linkText = "Audit Trails")
	WebElement configurationautditrailmenuz;
		
	
	@FindBy(linkText = "Re-initiate")
	WebElement Reinitiationofconfig;
		
	
	
	
	//@FindBy(id = "DMS_Configuration_Audit Trails")
	//WebElement configurationautditrailmenuz;
	
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	
	
	
	
	public Documentversionnumberscenario2() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is for document registration
	 * 
	 * 
	 */
	
	
public void Documenttypemodification(String recordsbtn1,String Mainpagesearchtxtbox, String Modificationremarks,String Mainpagesearchtxtbox1) {
		
 
 String s = "";
	String randomval = "";
	
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {

			s = TextUtils.randomvalue(3);
			randomval = Integer.toString(TextUtils.randomNumber(1));



}


//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);

 
 
         waitForPageToLoad(3000);
            
		//click(xbutton, "Xbutton menu");	
            
         
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Modificationmenuinconfigurationmodule, "Modification menu in configuration module");
		click(DocumenttypemenuinModificationofCONF, "Documenttype menu in ModificationofCONF");
		switchToBodyFrame(driver);
		
		//jsClick(Modificationtabinapproval, "Modificationtabinapproval");
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
		 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
		 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
		  
		  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtbox, "searchofapprovalofconfigurationmenu");
			
		  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
		  
		  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
		  
		  TimeUtil.shortWait();
		//---------------------------------------------------------------------------------------------------
		
		  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
		  
		  TimeUtil.shortWait();
		  
jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
		  
		  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
		  
		  
		  
		  
	//	jsClick(commonconfigurationsinmodifiscre, "commonconfigurationsinmodifiscre");
		
		//jsClick(versionnumstartsfromdrpbtn1, "versionnumstartsfromdrpbtn1");
		
		//jsClick(startdigitsdrpdwn2digitsn, "startdigitsdrpdwn2digitsn");
		
		jsClick(modificationremarks, "modification remarks");
		sendText(modificationremarks,Modificationremarks,"modification remarks");
		
		jsClick(SubmitBtn, "Submit Btn");
		
		//E_sign.e_Sign(eSign);
		
		TimeUtil.shortWait();
		
		jsClick(nextbtninall, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver); 
		
		
//Audittrailofregistrationorinitiation
		 
		jsClick(Documentmanagericon, "Document manager icon tab");
		 
		 jsClick(Configurationmainmenu, "Configurationmain menu");
		 
		 TimeUtil.shortWait();
			
			click(configurationautditrailmenuz, "configurationautditrailmenu");
			
			jsClick(DTaudittrailofconf, "DT audittrail of conf");
			
	switchToBodyFrame(driver);
	
	jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
	  
	 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
	 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
	  
	  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
	  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtbox1, "searchofapprovalofconfigurationmenu");
		
	  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
	  
	  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
	  
	  //TimeUtil.shortWait();
        TimeUtil.shortWait(); 
		 
        driver.switchTo().frame(0);
        
        click(audittrailrev1, "audittrail rev1");
   	 
   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
   	 
   		TimeUtil.shortWait();
		 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	  		
	  			js.executeScript("arguments[0].scrollIntoView();",ApprovalRequiredValuetext);
	  			
	  			TimeUtil.shortWait();
	  	
	  			 verifyCaptionContains(ApprovalRequiredValuetext, "ApprovalRequiredValuetext");
	  		
	  TimeUtil.shortWait();
  			
  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
  			 
  			 switchToDefaultContent(driver);
  			 
         		jsClick(logoutbtn, "logoutbtn");	
         		
         			}
		





/**
 * This method is for ModifyDoumentreturn
 * 
 * 
 */
	
	
	
	
	
public void Documentreturninmodification(String Mainpagesearchtxtbox1,String Modificationremarks,String eSign) {
	
	
	click(Documentmanagericon, "Document manager icon tab");
	
	click(Configurationmainmenu, "Configuration mainmenu");
	
	jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
	
	jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
	
	switchToBodyFrame(driver);
	
	jsClick(Modificationtabinapproval, "Modificationtabinapproval");
	
	
	
	
jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
	sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1,"mainpagesearchtxtbox1");
	
	jsClick(mainpagesearchicon1, "mainpagesearchicon1");
	
    TimeUtil.shortWait(); 
	 
    jsClick(recodofmaindocinat1, "recodofmaindocinat1");
	 
	 TimeUtil.shortWait();
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
  		
		js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
		
		TimeUtil.shortWait();

	 jsClick(radiobtnofreturnmo, "radio btn of return");
	 
	 jsClick(remarksofreturnorapprovalmo, "remarksofreturnorapprovalmo");
	 sendText(remarksofreturnorapprovalmo,Modificationremarks , "remarksofreturnorapprovalmo");
	 
	 jsClick(SubmitBtn, "Submit Btn");
		
		E_sign.e_Sign(eSign);
		
		TimeUtil.shortWait();
		
		jsClick(nextbtninall, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		
		jsClick(logoutbtn, "logoutbtn");
		
}







/**
 * This method is for DocumentReinitation
 * 
 * 
 */
	
	
	
public void Documentreinitationmodification(String Mainpagesearchtxtbox1,String Modificationremarks ) {
	
	
	
click(Documentmanagericon, "Document manager icon tab");
	
	click(Configurationmainmenu, "Configuration mainmenu");
	
	jsClick(Reinitiationofconfig, "reinitiation in config");
	
	jsClick(DTreininitioninconfig, "DT reininition in config");
	
	switchToBodyFrame(driver);
	
	jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
	
	
jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
	sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1,"mainpagesearchtxtbox1");
	
	jsClick(mainpagesearchicon1, "mainpagesearchicon1");
	
    TimeUtil.shortWait(); 
	 
    jsClick(recodofmaindocinatmodireini, "recodofmaindocinatmodireini");
    
	  TimeUtil.shortWait();
	  
	  
	  jsClick(reinitionofDTcommonconfigumore, "reinitionofDTcommonconfigumore");
	  
	  TimeUtil.shortWait();
	  
	  jsClick(reinitionofversionnumstartsfromincommonconfigmo, "reinitionofversionnumstartsfromincommonconfigmo");
	  
	  jsClick(reinitionofstartdigitsdrpdwn2digitsmo, "reinitionofstartdigitsdrpdwn2digitsmo");
	  
	 jsClick(remarksofreinitionofDTofapprovarmo, "remarksofreinitionofDTofapprovarmo");
		sendText(remarksofreinitionofDTofapprovarmo,Modificationremarks,"remarksofreinitionofDTofapprovarmo");
		
		 jsClick(SubmitBtn, "Submit Btn");
			
		//	E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			jsClick(logoutbtn, "logoutbtn");
			
			
}




/**
 * This method is for documentReinitApprovalmodification
 * 
 * 
 */

	
public void documentReinitApprovalmodification(String recordsbtn1,String Mainpagesearchtxtbox,String eSign) {
	
click(Documentmanagericon, "Document manager icon tab");
	
	click(Configurationmainmenu, "Configuration mainmenu");
	
	jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
	
	jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
	
	switchToBodyFrame(driver);
	
	jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
	
	 TimeUtil.shortWait();
	
	jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
	  
 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
  
  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtbox, "searchofapprovalofconfigurationmenu");
	
  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
  
  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
  
  TimeUtil.shortWait();
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
	
	TimeUtil.shortWait();
  
   jsClick(approveradiobtnofapproval, "approveradiobtnofapproval");
  
   jsClick(SubmitBtn, "Submit Btn");
		
		E_sign.e_Sign(eSign);
		
		TimeUtil.shortWait();
		
		jsClick(nextbtninall, "Done button");
		
		TimeUtil.shortWait();
		
		switchToDefaultContent(driver);
		
		
		//Audittrail of document reinitiationapproval
		
		jsClick(Documentmanagericon, "Document manager icon tab");
		 
		 jsClick(Configurationmainmenu, "Configurationmain menu");
		 
		 TimeUtil.shortWait();
			
			click(configurationautditrailmenuz, "configurationautditrailmenu");
			
			jsClick(DTaudittrailofconf, "DT audittrail of conf");
			
		switchToBodyFrame(driver);
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
		 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
		 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
		  
		  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtbox, "searchofapprovalofconfigurationmenu");
			
		  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
		  
		 
		 jsClick(ATclickonselectedrecordofapprovalofconfig, "ATclickonselectedrecordofapprovalofconfig");
		
		 TimeUtil.shortWait(); 
		 
	        driver.switchTo().frame(0);
	        
	        click(audittrailrev1, "audittrail rev1");
	   	 
	   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
	   	 
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
			

//for subdoc1



public void Documenttypemodificationsub1(String recordsbtn1,String Mainpagesearchtxtboxsub1, String Modificationremarks,String Mainpagesearchtxtbox1sub1) {
	
	 
	 String s = "";
		String randomval = "";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {

				s = TextUtils.randomvalue(3);
				randomval = Integer.toString(TextUtils.randomNumber(1));



	}


	//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);

	 
	 
	         waitForPageToLoad(3000);
	            
			//click(xbutton, "Xbutton menu");	
	            
	         
	        click(Documentmanagericon, "Document manager icon tab");
			click(Configurationmainmenu, "Configuration mainmenu");
			click(Modificationmenuinconfigurationmodule, "Modification menu in configuration module");
			click(DocumenttypemenuinModificationofCONF, "Documenttype menu in ModificationofCONF");
			switchToBodyFrame(driver);
			
			//jsClick(Modificationtabinapproval, "Modificationtabinapproval");
			
			jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
			  
			 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
			 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
			  
			  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
			  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub1, "searchofapprovalofconfigurationmenu");
				
			  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
			  
			  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
			  
			  TimeUtil.shortWait();
			//---------------------------------------------------------------------------------------------------
			
			  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
			  
			  TimeUtil.shortWait();
			  
	jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
			  
			  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
			  
			  
			  
			  
		//	jsClick(commonconfigurationsinmodifiscre, "commonconfigurationsinmodifiscre");
			
			//jsClick(versionnumstartsfromdrpbtn1, "versionnumstartsfromdrpbtn1");
			
			//jsClick(startdigitsdrpdwn2digitsn, "startdigitsdrpdwn2digitsn");
			
			jsClick(modificationremarks, "modification remarks");
			sendText(modificationremarks,Modificationremarks,"modification remarks");
			
			jsClick(SubmitBtn, "Submit Btn");
			
			//E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver); 
			
			
	//Audittrailofregistrationorinitiation
			 
			jsClick(Documentmanagericon, "Document manager icon tab");
			 
			 jsClick(Configurationmainmenu, "Configurationmain menu");
			 
			 TimeUtil.shortWait();
				
				click(configurationautditrailmenuz, "configurationautditrailmenu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
		switchToBodyFrame(driver);
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
		 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
		 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
		  
		  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtbox1sub1, "searchofapprovalofconfigurationmenu");
			
		  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
		  
		  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
		  
		  //TimeUtil.shortWait();
	        TimeUtil.shortWait(); 
			 
	        driver.switchTo().frame(0);
	        
	        click(audittrailrev1, "audittrail rev1");
	   	 
	   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
	   	 
	   		TimeUtil.shortWait();
			 
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		  		
		  			js.executeScript("arguments[0].scrollIntoView();",ApprovalRequiredValuetext);
		  			
		  			TimeUtil.shortWait();
		  	
		  			 verifyCaptionContains(ApprovalRequiredValuetext, "ApprovalRequiredValuetext");
		  		
		  TimeUtil.shortWait();
	  			
	  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
	  			 
	  			 switchToDefaultContent(driver);
	  			 
	         		jsClick(logoutbtn, "logoutbtn");	
	         		
	         			}
			





	/**
	 * This method is for ModifyDoumentreturn
	 * 
	 * 
	 */
		
		
		
		
		
	public void Documentreturninmodificationsub1(String Mainpagesearchtxtbox1sub1,String Modificationremarks,String eSign) {
		
		
		click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");
		
		
		
		
	jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
		sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1sub1,"mainpagesearchtxtbox1");
		
		jsClick(mainpagesearchicon1, "mainpagesearchicon1");
		
	    TimeUtil.shortWait(); 
		 
	    jsClick(recodofmaindocinat1, "recodofmaindocinat1");
		 
		 TimeUtil.shortWait();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	  		
			js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
			
			TimeUtil.shortWait();

		 jsClick(radiobtnofreturnmo, "radio btn of return");
		 
		 jsClick(remarksofreturnorapprovalmo, "remarksofreturnorapprovalmo");
		 sendText(remarksofreturnorapprovalmo,Modificationremarks , "remarksofreturnorapprovalmo");
		 
		 jsClick(SubmitBtn, "Submit Btn");
			
			E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			jsClick(logoutbtn, "logoutbtn");
			
	}







	/**
	 * This method is for DocumentReinitation
	 * 
	 * 
	 */
		
		
		
	public void Documentreinitationmodificationsub1(String Mainpagesearchtxtbox1sub1,String Modificationremarks ) {
		
		
		
	click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(Reinitiationofconfig, "reinitiation in config");
		
		jsClick(DTreininitioninconfig, "DT reininition in config");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
		
		
	jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
		sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1sub1,"mainpagesearchtxtbox1");
		
		jsClick(mainpagesearchicon1, "mainpagesearchicon1");
		
	    TimeUtil.shortWait(); 
		 
	    jsClick(recodofmaindocinatmodireini, "recodofmaindocinatmodireini");
	    
		  TimeUtil.shortWait();
		  
		  
		  jsClick(reinitionofDTcommonconfigumore, "reinitionofDTcommonconfigumore");
		  
		  TimeUtil.shortWait();
		  
		  jsClick(reinitionofversionnumstartsfromincommonconfigmo, "reinitionofversionnumstartsfromincommonconfigmo");
		  
		  jsClick(reinitionofstartdigitsdrpdwn2digitsmo, "reinitionofstartdigitsdrpdwn2digitsmo");
		  
		 jsClick(remarksofreinitionofDTofapprovarmo, "remarksofreinitionofDTofapprovarmo");
			sendText(remarksofreinitionofDTofapprovarmo,Modificationremarks,"remarksofreinitionofDTofapprovarmo");
			
			 jsClick(SubmitBtn, "Submit Btn");
				
			//	E_sign.e_Sign(eSign);
				
				TimeUtil.shortWait();
				
				jsClick(nextbtninall, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				jsClick(logoutbtn, "logoutbtn");
				
				
	}




	/**
	 * This method is for documentReinitApprovalmodification
	 * 
	 * 
	 */

		
	public void documentReinitApprovalmodificationsub1(String recordsbtn1,String Mainpagesearchtxtboxsub1,String eSign) {
		
	click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
		
		 TimeUtil.shortWait();
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
	 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
	 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
	  
	  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
	  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub1, "searchofapprovalofconfigurationmenu");
		
	  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
	  
	  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
	  
	  TimeUtil.shortWait();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
		
		TimeUtil.shortWait();
	  
	   jsClick(approveradiobtnofapproval, "approveradiobtnofapproval");
	  
	   jsClick(SubmitBtn, "Submit Btn");
			
			E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			//Audittrail of document reinitiationapproval
			
			jsClick(Documentmanagericon, "Document manager icon tab");
			 
			 jsClick(Configurationmainmenu, "Configurationmain menu");
			 
			 TimeUtil.shortWait();
				
				click(configurationautditrailmenuz, "configurationautditrailmenu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
			switchToBodyFrame(driver);
			
			jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
			  
			 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
			 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
			  
			  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
			  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub1, "searchofapprovalofconfigurationmenu");
				
			  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
			  
			 
			 jsClick(ATclickonselectedrecordofapprovalofconfig, "ATclickonselectedrecordofapprovalofconfig");
			
			 TimeUtil.shortWait(); 
			 
		        driver.switchTo().frame(0);
		        
		        click(audittrailrev1, "audittrail rev1");
		   	 
		   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
		   	 
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
				
			
			
	



////For subdoc2



public void Documenttypemodificationsub2(String recordsbtn1,String Mainpagesearchtxtboxsub2, String Modificationremarks,String Mainpagesearchtxtbox1sub2) {
	
	 
	 String s = "";
		String randomval = "";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {

				s = TextUtils.randomvalue(3);
				randomval = Integer.toString(TextUtils.randomNumber(1));



	}


	//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);

	 
	 
	         waitForPageToLoad(3000);
	            
			//click(xbutton, "Xbutton menu");	
	            
	         
	        click(Documentmanagericon, "Document manager icon tab");
			click(Configurationmainmenu, "Configuration mainmenu");
			click(Modificationmenuinconfigurationmodule, "Modification menu in configuration module");
			click(DocumenttypemenuinModificationofCONF, "Documenttype menu in ModificationofCONF");
			switchToBodyFrame(driver);
			
			//jsClick(Modificationtabinapproval, "Modificationtabinapproval");
			
			jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
			  
			 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
			 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
			  
			  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
			  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub2, "searchofapprovalofconfigurationmenu");
				
			  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
			  
			  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
			  
			  TimeUtil.shortWait();
			//---------------------------------------------------------------------------------------------------
			
			  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
			  
			  TimeUtil.shortWait();
			  
	jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
			  
			  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
			  
			  
			  
			  
		//	jsClick(commonconfigurationsinmodifiscre, "commonconfigurationsinmodifiscre");
			
			//jsClick(versionnumstartsfromdrpbtn1, "versionnumstartsfromdrpbtn1");
			
			//jsClick(startdigitsdrpdwn2digitsn, "startdigitsdrpdwn2digitsn");
			
			jsClick(modificationremarks, "modification remarks");
			sendText(modificationremarks,Modificationremarks,"modification remarks");
			
			jsClick(SubmitBtn, "Submit Btn");
			
			//E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver); 
			
			
	//Audittrailofregistrationorinitiation
			 
			jsClick(Documentmanagericon, "Document manager icon tab");
			 
			 jsClick(Configurationmainmenu, "Configurationmain menu");
			 
			 TimeUtil.shortWait();
				
				click(configurationautditrailmenuz, "configurationautditrailmenu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
		switchToBodyFrame(driver);
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
		 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
		 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
		  
		  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub2, "searchofapprovalofconfigurationmenu");
			
		  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
		  
		  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
		  
		  //TimeUtil.shortWait();
	        TimeUtil.shortWait(); 
			 
	        driver.switchTo().frame(0);
	        
	        click(audittrailrev1, "audittrail rev1");
	   	 
	   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
	   	 
	   		TimeUtil.shortWait();
			 
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		  		
		  			js.executeScript("arguments[0].scrollIntoView();",ApprovalRequiredValuetext);
		  			
		  			TimeUtil.shortWait();
		  	
		  			 verifyCaptionContains(ApprovalRequiredValuetext, "ApprovalRequiredValuetext");
		  		
		  TimeUtil.shortWait();
	  			
	  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
	  			 
	  			 switchToDefaultContent(driver);
	  			 
	         		jsClick(logoutbtn, "logoutbtn");	
	         		
	         			}
			





	/**
	 * This method is for ModifyDoumentreturn
	 * 
	 * 
	 */
		
		
		
		
		
	public void Documentreturninmodificationsub2(String Mainpagesearchtxtbox1sub2,String Modificationremarks,String eSign) {
		
		
		click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");
		
		
		
		
	jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
		sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1sub2,"mainpagesearchtxtbox1");
		
		jsClick(mainpagesearchicon1, "mainpagesearchicon1");
		
	    TimeUtil.shortWait(); 
		 
	    jsClick(recodofmaindocinat1, "recodofmaindocinat1");
		 
		 TimeUtil.shortWait();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	  		
			js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
			
			TimeUtil.shortWait();

		 jsClick(radiobtnofreturnmo, "radio btn of return");
		 
		 jsClick(remarksofreturnorapprovalmo, "remarksofreturnorapprovalmo");
		 sendText(remarksofreturnorapprovalmo,Modificationremarks , "remarksofreturnorapprovalmo");
		 
		 jsClick(SubmitBtn, "Submit Btn");
			
			E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			jsClick(logoutbtn, "logoutbtn");
			
	}







	/**
	 * This method is for DocumentReinitation
	 * 
	 * 
	 */
		
		
		
	public void Documentreinitationmodificationsub2(String Mainpagesearchtxtbox1sub2,String Modificationremarks ) {
		
		
		
	click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(Reinitiationofconfig, "reinitiation in config");
		
		jsClick(DTreininitioninconfig, "DT reininition in config");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
		
		
	jsClick(mainpagesearchtxtbox1, "mainpagesearchtxtbox1");
		sendText(mainpagesearchtxtbox1,Mainpagesearchtxtbox1sub2,"mainpagesearchtxtbox1");
		
		jsClick(mainpagesearchicon1, "mainpagesearchicon1");
		
	    TimeUtil.shortWait(); 
		 
	    jsClick(recodofmaindocinatmodireini, "recodofmaindocinatmodireini");
	    
		  TimeUtil.shortWait();
		  
		  
		  jsClick(reinitionofDTcommonconfigumore, "reinitionofDTcommonconfigumore");
		  
		  TimeUtil.shortWait();
		  
		  jsClick(reinitionofversionnumstartsfromincommonconfigmo, "reinitionofversionnumstartsfromincommonconfigmo");
		  
		  jsClick(reinitionofstartdigitsdrpdwn2digitsmo, "reinitionofstartdigitsdrpdwn2digitsmo");
		  
		 jsClick(remarksofreinitionofDTofapprovarmo, "remarksofreinitionofDTofapprovarmo");
			sendText(remarksofreinitionofDTofapprovarmo,Modificationremarks,"remarksofreinitionofDTofapprovarmo");
			
			 jsClick(SubmitBtn, "Submit Btn");
				
			//	E_sign.e_Sign(eSign);
				
				TimeUtil.shortWait();
				
				jsClick(nextbtninall, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				jsClick(logoutbtn, "logoutbtn");
				
				
	}




	/**
	 * This method is for documentReinitApprovalmodification
	 * 
	 * 
	 */

		
	public void documentReinitApprovalmodificationsub2(String recordsbtn1,String Mainpagesearchtxtboxsub2,String eSign) {
		
	click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
		jsClick(Modificationtabinapproval, "Modificationtabinapproval");	
		
		 TimeUtil.shortWait();
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
	 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
	 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
	  
	  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
	  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub2, "searchofapprovalofconfigurationmenu");
		
	  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
	  
	  jsClick(clickonselectedrecordofapprovalofconfig, "clickonselectedrecordofapprovalofconfig");
	  
	  TimeUtil.shortWait();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
		
		TimeUtil.shortWait();
	  
	   jsClick(approveradiobtnofapproval, "approveradiobtnofapproval");
	  
	   jsClick(SubmitBtn, "Submit Btn");
			
			E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			//Audittrail of document reinitiationapproval
			
			jsClick(Documentmanagericon, "Document manager icon tab");
			 
			 jsClick(Configurationmainmenu, "Configurationmain menu");
			 
			 TimeUtil.shortWait();
				
				click(configurationautditrailmenuz, "configurationautditrailmenu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
			switchToBodyFrame(driver);
			
			jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
			  
			 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 sendText(recordsperpageofapprovalofconfigurationmenu,recordsbtn1, "recordsperpageofapprovalofconfigurationmenu");
			 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
			  
			  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
			  sendText(searchofapprovalofconfigurationmenu,Mainpagesearchtxtboxsub2, "searchofapprovalofconfigurationmenu");
				
			  jsClick(searchiconofapprovalofconfigurationmenu, "searchiconofapprovalofconfigurationmenu");
			  
			 
			 jsClick(ATclickonselectedrecordofapprovalofconfig, "ATclickonselectedrecordofapprovalofconfig");
			
			 TimeUtil.shortWait(); 
			 
		        driver.switchTo().frame(0);
		        
		        click(audittrailrev1, "audittrail rev1");
		   	 
		   	 	 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
		   	 
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
				
			
			
	}











		
		

		
		




		
		


