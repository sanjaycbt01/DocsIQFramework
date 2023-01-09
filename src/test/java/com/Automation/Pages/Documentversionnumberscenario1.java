
	package com.Automation.Pages;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Properties;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.Automation.Base.ActionEngine;
	import com.Automation.Utils.ConfigsReader;
	import com.Automation.Utils.TextUtils;
	import com.Automation.Utils.TimeUtil;

	public class Documentversionnumberscenario1 extends ActionEngine {
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
		
		
		@FindBy(xpath = "//button[@id='btnModal_DocumentType_IssCodePrintType']")
 		WebElement addbtnofissuececode;
		
		@FindBy(xpath = "//tbody/tr[2]/td[2]/button[1]")
 		WebElement removebtn;
		
		
		@FindBy(xpath = "//button[@id='DocumentType_IssCodePrintType_selectBtn']")
 		WebElement selectaddbtnofcode;
		
		
		
		
		
		
		//button[@id='DocumentType_IssCodePrintType_selectBtn']
		
		
		
		
		
		
		//button[@id='btnModal_DocumentType_AsscDocument']
		
		
		
		
		public Documentversionnumberscenario1() {
			PageFactory.initElements(driver, this);
		}

		/**
		 * This method is for document registration
		 * @throws AWTException 
		 * 
		 * 
		 */
		
		
 public void Documenttypedocumentregistration(String FindtextbtninDT,String recordsbtn,String Documenttypetxtbox, String DescriptiontxtboxinDT,String Searchboxofaudittrail,String eSign){
			
	 
	 String s = "";
		String randomval = "";
		
			prop = ConfigsReader.readProperties("./configs/configuration.properties");
			if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
	
				s = TextUtils.randomvalue(3);
				randomval = Integer.toString(TextUtils.randomNumber(1));


	
	}
	
	
	setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);
	
	//TimeUtil.shortWait();
	
	waitForPageToLoad(3000);
	 
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
			jsClick(Configurationmainmenu, "Configuration mainmenu");
			jsClick(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
			jsClick(DocumenttypemenuininitiateofCONF, "Documenttype menu in initiate of CONF");
			switchToBodyFrame(driver);
			
			click(SingledocumenttypefieldinDT, "Singledocumenttype field in DT");
			
			click(addbtnofexistingdocumentinDT, "addbtn of existingdocument in DT");
			
			jsClick(findtextbtninDT, "findtext btn in DT");
			sendText(findtextbtninDT,FindtextbtninDT,"findtextbtninDT");
			
			jsClick(Recordsbtn, "Records btn");
			sendText(Recordsbtn,recordsbtn,"Recordsbtn");
			
			jsClick(applybtnofexistingdoc, "applybtn of existing doc");
			
			TimeUtil.shortWait();
			
			jsClick(radiobtnofselectedexistingdoc, "radiobtnofselectedexistingdoc");
			
			jsClick(addbtninexistingdoc, "addbtninexistingdoc");
			
			TimeUtil.shortWait();
			
			jsClick(documenttypetxtbox, "documenttype txtbox");
			sendText(documenttypetxtbox,Documenttypetxtbox,"documenttype txtbox");
			
			jsClick(descriptiontxtboxindocumenttype, "descriptiontxtbox in documenttype");
			sendText(descriptiontxtboxindocumenttype,DescriptiontxtboxinDT,"descriptiontxtbox in documenttype");
			
			jsClick(dropdwnbtnofversionnum, "dropdwnbtnofversionnum");
			
			jsClick(drpdwnofversion2, "drpdwnofversion2");
			
			jsClick(versionnumstartsfromdrpbtn, "versionnumstartsfromdrpbtn");
			
			jsClick(startdigitsdrpdwn2digits, "startdigitsdrpdwn2digits");
			
			
			
			
			jsClick(addbtnofissuececode, "addbtnofissuececode");
			
			TimeUtil.shortWait();
			
			jsClick(removebtn, "removebtn");
			
			TimeUtil.shortWait();
			
			jsClick(selectaddbtnofcode, "selectaddbtnofcode");
			
			TimeUtil.shortWait();
			
			
			

			
			
			
			
			
			
			
			
			jsClick(SubmitBtn, "Submit Btn");
			
			E_sign.e_Sign(eSign);
			
			TimeUtil.shortWait();
			
			jsClick(nextbtninall, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
	//Audittrailofregistrationorinitiation
			 
			jsClick(Documentmanagericon, "Document manager icon tab");
			 
		 jsClick(Configurationmainmenu, "Configurationmain menu");
			
			jsClick(configurationautditrailmenu, "configuration autditrail menu");
			
			jsClick(DTaudittrailofconf, "DT audittrail of conf");
			
		switchToBodyFrame(driver);
			
			jsClick(searchboxofaudittrail, "searchboxofaudittrail");
			sendText(searchboxofaudittrail,Searchboxofaudittrail,"searchboxofaudittrail");
			
			jsClick(searchiconofaudittrail, "searchiconofaudittrail");
			
            TimeUtil.shortWait(); 
			 
            jsClick(recodofmaindocinat, "recodofmaindocinat");
			 
			 TimeUtil.shortWait();
			 
			 driver.switchTo().frame(0);
			 
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
	 * This method is for Doumentreturn
	 * 
	 * 
	 */
	public void Documentreturn(String Searchboxofaudittrail,String Remarksofreturnorapproval,String eSign) {
		
		
		click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
	jsClick(searchboxofaudittrail, "searchboxofaudittrail");
		sendText(searchboxofaudittrail,Searchboxofaudittrail,"searchboxofaudittrail");
		
		jsClick(searchiconofaudittrail, "searchiconofaudittrail");
		
        TimeUtil.shortWait(); 
		 
        jsClick(InDTofapprovalselectingoption, "In DT of approval selecting option");
		 
		 TimeUtil.shortWait();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	  		
			js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
			
			TimeUtil.shortWait();
	
		 jsClick(radiobtnofreturn, "radio btn of return");
		 
		 jsClick(remarksofreturnorapproval, "remarksofreturnorapproval");
		 sendText(remarksofreturnorapproval,Remarksofreturnorapproval , "remarksofreturnorapproval");
		 
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
	public void Documentreinitation(String Searchboxofreinitiation,String RemarksofreinitionofDTofapprovar,String eSign ) {
		
		
		
click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(reinitiationinconfig, "reinitiation in config");
		
		jsClick(DTreininitioninconfig, "DT reininition in config");
		
		switchToBodyFrame(driver);
		
	jsClick(searchboxofaudittrail, "searchboxofaudittrail");
		sendText(searchboxofaudittrail,Searchboxofreinitiation,"searchboxofaudittrail");
		
		jsClick(searchiconofaudittrail, "searchiconofaudittrail");
		
        TimeUtil.shortWait(); 
		 
        jsClick(reinitionsselectingrecords, "reinitionsselectingrecords");
        
		  TimeUtil.shortWait();
		 
		  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
		  
		  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
		  
		  jsClick(reinitiationofCCofdrpdwnofversion4, "reinitiationofCCofdrpdwnofversion3");
		  
		  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
		  
		  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
		  
		  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
		  
		  jsClick(reinitiationofCCofdrpdwnofversion2, "reinitiationofCCofdrpdwnofversion2");
		  
		  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
		  
		  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
		  
		  
		  jsClick(remarksofreinitionofDTofapprovar, "remarksofreinitionofDTofapprovar");
			sendText(remarksofreinitionofDTofapprovar,RemarksofreinitionofDTofapprovar,"remarksofreinitionofDTofapprovar");
			
			
			 jsClick(SubmitBtn, "Submit Btn");
				
				E_sign.e_Sign(eSign);
				
				TimeUtil.shortWait();
				
				jsClick(nextbtninall, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				jsClick(logoutbtn, "logoutbtn");
				
				
	}
	
	
	

	/**
	 * This method is for documentReinitApproval
	 * 
	 * 
	 */
	public void documentReinitApproval(String Recordsperpageofapprovalofconfigurationmenu,String Searchofapprovalofconfigurationmenu,String aTsearchiconofapprovalofconfigurationmenu,String eSign) {
		
click(Documentmanagericon, "Document manager icon tab");
		
		click(Configurationmainmenu, "Configuration mainmenu");
		
		jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
		
		jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
		
		switchToBodyFrame(driver);
		
		jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
		  
	 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 sendText(recordsperpageofapprovalofconfigurationmenu,Recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
	 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
	  
	  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
	  sendText(searchofapprovalofconfigurationmenu,Searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		
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
				
				jsClick(configurationautditrailmenu, "configuration autditrail menu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
			switchToBodyFrame(driver);
			
			
             jsClick(ATfilterofapprovalofconfigurationmenu, "ATfilterofapprovalofconfigurationmenu");
			 
			 jsClick(ATrecordsperpageofapprovalofconfigurationmenu, "ATrecordsperpageofapprovalofconfigurationmenu");
			 
			 jsClick(ATapplybtnofapprovalofconfigurationmenu, "ATapplybtnofapprovalofconfigurationmenu");
			 
			 jsClick(ATsearchofapprovalofconfigurationmenu, "ATsearchofapprovalofconfigurationmenu");
			 sendText(ATsearchofapprovalofconfigurationmenu,aTsearchiconofapprovalofconfigurationmenu,"ATsearchofapprovalofconfigurationmenu");
			 
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
	
	public void Documenttypedocumentregistrationsub1(String FindtextbtninDT,String recordsbtn,String Documenttypetxtboxsub1, String DescriptiontxtboxinDTsub1,String Searchboxofaudittrailsub1,String eSign){
		
		 
		 String s = "";
			String randomval = "";
			
				prop = ConfigsReader.readProperties("./configs/configuration.properties");
				if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
		
					s = TextUtils.randomvalue(2);
					randomval = Integer.toString(TextUtils.randomNumber(1));


		
		}
		
		
	//	setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);
		
		//TimeUtil.shortWait();
		
		waitForPageToLoad(3000);
		 
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
				jsClick(Configurationmainmenu, "Configuration mainmenu");
				jsClick(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
				jsClick(DocumenttypemenuininitiateofCONF, "Documenttype menu in initiate of CONF");
				switchToBodyFrame(driver);
				
				click(SingledocumenttypefieldinDT, "Singledocumenttype field in DT");
				
				click(addbtnofexistingdocumentinDT, "addbtn of existingdocument in DT");
				
				jsClick(findtextbtninDT, "findtext btn in DT");
				sendText(findtextbtninDT,FindtextbtninDT,"findtextbtninDT");
				
				jsClick(Recordsbtn, "Records btn");
				sendText(Recordsbtn,recordsbtn,"Recordsbtn");
				
				jsClick(applybtnofexistingdoc, "applybtn of existing doc");
				
				TimeUtil.shortWait();
				
				jsClick(radiobtnofselectedexistingdoc, "radiobtnofselectedexistingdoc");
				
				jsClick(addbtninexistingdoc, "addbtninexistingdoc");
				
				TimeUtil.shortWait();
				
				jsClick(documenttypetxtbox, "documenttype txtbox");
				sendText(documenttypetxtbox,Documenttypetxtboxsub1,"documenttype txtbox");
				
				jsClick(descriptiontxtboxindocumenttype, "descriptiontxtbox in documenttype");
				sendText(descriptiontxtboxindocumenttype,DescriptiontxtboxinDTsub1,"descriptiontxtbox in documenttype");
				
				jsClick(dropdwnbtnofversionnum, "dropdwnbtnofversionnum");
				
				jsClick(drpdwnofversion3, "drpdwnofversion3");
				
				jsClick(versionnumstartsfromdrpbtn, "versionnumstartsfromdrpbtn");
				
				jsClick(startdigitsdrpdwn2digits, "startdigitsdrpdwn2digits");
				
				

				jsClick(addbtnofissuececode, "addbtnofissuececode");
				
				TimeUtil.shortWait();
				
				jsClick(removebtn, "removebtn");
				
				TimeUtil.shortWait();
				
				jsClick(selectaddbtnofcode, "selectaddbtnofcode");
				
				TimeUtil.shortWait();
				
				
				
				
				
				
				
				
				
				
				jsClick(SubmitBtn, "Submit Btn");
				
				E_sign.e_Sign(eSign);
				
				TimeUtil.shortWait();
				
				jsClick(nextbtninall, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				
		//Audittrailofregistrationorinitiation
				 
				jsClick(Documentmanagericon, "Document manager icon tab");
				 
			 jsClick(Configurationmainmenu, "Configurationmain menu");
				
				jsClick(configurationautditrailmenu, "configuration autditrail menu");
				
				jsClick(DTaudittrailofconf, "DT audittrail of conf");
				
			switchToBodyFrame(driver);
				
				jsClick(searchboxofaudittrail, "searchboxofaudittrail");
				sendText(searchboxofaudittrail,Searchboxofaudittrailsub1,"searchboxofaudittrail");
				
				jsClick(searchiconofaudittrail, "searchiconofaudittrail");
				
	            TimeUtil.shortWait(); 
				 
	            jsClick(recodofmaindocinat, "recodofmaindocinat");
				 
				 TimeUtil.shortWait();
				 
				 driver.switchTo().frame(0);
				 
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
		 * This method is for Doumentreturn
		 * 
		 * 
		 */
		public void Documentreturnsub1(String Searchboxofaudittrail1sub1,String Remarksofreturnorapproval,String eSign) {
			
			
			click(Documentmanagericon, "Document manager icon tab");
			
			click(Configurationmainmenu, "Configuration mainmenu");
			
			jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
			
			jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
			
			switchToBodyFrame(driver);
			
		jsClick(searchboxofaudittrail, "searchboxofaudittrail");
			sendText(searchboxofaudittrail,Searchboxofaudittrail1sub1,"searchboxofaudittrail");
			
			jsClick(searchiconofaudittrail, "searchiconofaudittrail");
			
	        TimeUtil.shortWait(); 
			 
	        jsClick(InDTofapprovalselectingoption, "In DT of approval selecting option");
			 
			 TimeUtil.shortWait();
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		  		
				js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
				
				TimeUtil.shortWait();
		
			 jsClick(radiobtnofreturn, "radio btn of return");
			 
			 jsClick(remarksofreturnorapproval, "remarksofreturnorapproval");
			 sendText(remarksofreturnorapproval,Remarksofreturnorapproval , "remarksofreturnorapproval");
			 
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
		public void Documentreinitationsub1(String Searchboxofreinitiationsub1,String RemarksofreinitionofDTofapprovar,String eSign ) {
			
			
			
	click(Documentmanagericon, "Document manager icon tab");
			
			click(Configurationmainmenu, "Configuration mainmenu");
			
			jsClick(reinitiationinconfig, "reinitiation in config");
			
			jsClick(DTreininitioninconfig, "DT reininition in config");
			
			switchToBodyFrame(driver);
			
		jsClick(searchboxofaudittrail, "searchboxofaudittrail");
			sendText(searchboxofaudittrail,Searchboxofreinitiationsub1,"searchboxofaudittrail");
			
			jsClick(searchiconofaudittrail, "searchiconofaudittrail");
			
	        TimeUtil.shortWait(); 
			 
	        jsClick(reinitionsselectingrecords, "reinitionsselectingrecords");
	        
			  TimeUtil.shortWait();
			 
			  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
			  
			  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
			  
			  jsClick(reinitiationofCCofdrpdwnofversion4, "reinitiationofCCofdrpdwnofversion3");
			  
			  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
			  
			  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
			  
			  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
			  
			  jsClick(reinitiationofCCofdrpdwnofversion3, "reinitiationofCCofdrpdwnofversion3");
			  
			  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
			  
			  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
			  
			  
			  jsClick(remarksofreinitionofDTofapprovar, "remarksofreinitionofDTofapprovar");
				sendText(remarksofreinitionofDTofapprovar,RemarksofreinitionofDTofapprovar,"remarksofreinitionofDTofapprovar");
				
				
				 jsClick(SubmitBtn, "Submit Btn");
					
					E_sign.e_Sign(eSign);
					
					TimeUtil.shortWait();
					
					jsClick(nextbtninall, "Done button");
					
					TimeUtil.shortWait();
					
					switchToDefaultContent(driver);
					
					jsClick(logoutbtn, "logoutbtn");
					
					
		}
		
		
		

		/**
		 * This method is for documentReinitApproval
		 * 
		 * 
		 */
		public void documentReinitApprovalsub1(String Recordsperpageofapprovalofconfigurationmenu,String Searchofapprovalofconfigurationmenusub1,String aTsearchiconofapprovalofconfigurationmenusub1,String eSign) {
			
	click(Documentmanagericon, "Document manager icon tab");
			
			click(Configurationmainmenu, "Configuration mainmenu");
			
			jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
			
			jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
			
			switchToBodyFrame(driver);
			
			jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
			  
		 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 sendText(recordsperpageofapprovalofconfigurationmenu,Recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
		 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
		  
		  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
		  sendText(searchofapprovalofconfigurationmenu,Searchofapprovalofconfigurationmenusub1, "searchofapprovalofconfigurationmenu");
			
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
					
					jsClick(configurationautditrailmenu, "configuration autditrail menu");
					
					jsClick(DTaudittrailofconf, "DT audittrail of conf");
					
				switchToBodyFrame(driver);
				
				
	             jsClick(ATfilterofapprovalofconfigurationmenu, "ATfilterofapprovalofconfigurationmenu");
				 
				 jsClick(ATrecordsperpageofapprovalofconfigurationmenu, "ATrecordsperpageofapprovalofconfigurationmenu");
				 
				 jsClick(ATapplybtnofapprovalofconfigurationmenu, "ATapplybtnofapprovalofconfigurationmenu");
				 
				 jsClick(ATsearchofapprovalofconfigurationmenu, "ATsearchofapprovalofconfigurationmenu");
				 sendText(ATsearchofapprovalofconfigurationmenu,aTsearchiconofapprovalofconfigurationmenusub1,"ATsearchofapprovalofconfigurationmenu");
				 
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
				
				
	
	//--sub2
		
		
		
		public void Documenttypedocumentregistrationsub2(String FindtextbtninDT,String recordsbtn,String Documenttypetxtboxsub2, String DescriptiontxtboxinDTsub2,String Searchboxofaudittrailsub2,String eSign){
			
			 
			 String s = "";
				String randomval = "";
				
					prop = ConfigsReader.readProperties("./configs/configuration.properties");
					if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			
						s = TextUtils.randomvalue(2);
						randomval = Integer.toString(TextUtils.randomNumber(1));


			
			}
			
			
			//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);
			
			//TimeUtil.shortWait();
			
			waitForPageToLoad(3000);
			 
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
					jsClick(Configurationmainmenu, "Configuration mainmenu");
					jsClick(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
					jsClick(DocumenttypemenuininitiateofCONF, "Documenttype menu in initiate of CONF");
					switchToBodyFrame(driver);
					
					click(SingledocumenttypefieldinDT, "Singledocumenttype field in DT");
					
					click(addbtnofexistingdocumentinDT, "addbtn of existingdocument in DT");
					
					jsClick(findtextbtninDT, "findtext btn in DT");
					sendText(findtextbtninDT,FindtextbtninDT,"findtextbtninDT");
					
					jsClick(Recordsbtn, "Records btn");
					sendText(Recordsbtn,recordsbtn,"Recordsbtn");
					
					jsClick(applybtnofexistingdoc, "applybtn of existing doc");
					
					TimeUtil.shortWait();
					
					jsClick(radiobtnofselectedexistingdoc, "radiobtnofselectedexistingdoc");
					
					jsClick(addbtninexistingdoc, "addbtninexistingdoc");
					
					TimeUtil.shortWait();
					
					jsClick(documenttypetxtbox, "documenttype txtbox");
					sendText(documenttypetxtbox,Documenttypetxtboxsub2,"documenttype txtbox");
					
					jsClick(descriptiontxtboxindocumenttype, "descriptiontxtbox in documenttype");
					sendText(descriptiontxtboxindocumenttype,DescriptiontxtboxinDTsub2,"descriptiontxtbox in documenttype");
					
					jsClick(dropdwnbtnofversionnum, "dropdwnbtnofversionnum");
					
					jsClick(drpdwnofversion4, "drpdwnofversion4");
					
					jsClick(versionnumstartsfromdrpbtn, "versionnumstartsfromdrpbtn");
					
					jsClick(startdigitsdrpdwn2digits, "startdigitsdrpdwn2digits");
					
					
					
					

					jsClick(addbtnofissuececode, "addbtnofissuececode");
					
					TimeUtil.shortWait();
					
					jsClick(removebtn, "removebtn");
					
					TimeUtil.shortWait();
					
					jsClick(selectaddbtnofcode, "selectaddbtnofcode");
					
					TimeUtil.shortWait();
					
					
					
					
					
					
					jsClick(SubmitBtn, "Submit Btn");
					
					E_sign.e_Sign(eSign);
					
					TimeUtil.shortWait();
					
					jsClick(nextbtninall, "Done button");
					
					TimeUtil.shortWait();
					
					switchToDefaultContent(driver);
					
					
			//Audittrailofregistrationorinitiation
					 
					jsClick(Documentmanagericon, "Document manager icon tab");
					 
				 jsClick(Configurationmainmenu, "Configurationmain menu");
					
					jsClick(configurationautditrailmenu, "configuration autditrail menu");
					
					jsClick(DTaudittrailofconf, "DT audittrail of conf");
					
				switchToBodyFrame(driver);
					
					jsClick(searchboxofaudittrail, "searchboxofaudittrail");
					sendText(searchboxofaudittrail,Searchboxofaudittrailsub2,"searchboxofaudittrail");
					
					jsClick(searchiconofaudittrail, "searchiconofaudittrail");
					
		            TimeUtil.shortWait(); 
					 
		            jsClick(recodofmaindocinat, "recodofmaindocinat");
					 
					 TimeUtil.shortWait();
					 
					 driver.switchTo().frame(0);
					 
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
			 * This method is for Doumentreturn
			 * 
			 * 
			 */
			public void Documentreturnsub2(String Searchboxofaudittrail1sub2,String Remarksofreturnorapproval,String eSign) {
				
				
				click(Documentmanagericon, "Document manager icon tab");
				
				click(Configurationmainmenu, "Configuration mainmenu");
				
				jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
				
				jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
				
				switchToBodyFrame(driver);
				
			jsClick(searchboxofaudittrail, "searchboxofaudittrail");
				sendText(searchboxofaudittrail,Searchboxofaudittrail1sub2,"searchboxofaudittrail");
				
				jsClick(searchiconofaudittrail, "searchiconofaudittrail");
				
		        TimeUtil.shortWait(); 
				 
		        jsClick(InDTofapprovalselectingoption, "In DT of approval selecting option");
				 
				 TimeUtil.shortWait();
				 
				 JavascriptExecutor js = (JavascriptExecutor) driver;
			  		
					js.executeScript("arguments[0].scrollIntoView();",lablecontianreturnscroll);
					
					TimeUtil.shortWait();
			
				 jsClick(radiobtnofreturn, "radio btn of return");
				 
				 jsClick(remarksofreturnorapproval, "remarksofreturnorapproval");
				 sendText(remarksofreturnorapproval,Remarksofreturnorapproval , "remarksofreturnorapproval");
				 
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
			public void Documentreinitationsub2(String Searchboxofreinitiationsub2,String RemarksofreinitionofDTofapprovar,String eSign ) {
				
				
				
		click(Documentmanagericon, "Document manager icon tab");
				
				click(Configurationmainmenu, "Configuration mainmenu");
				
				jsClick(reinitiationinconfig, "reinitiation in config");
				
				jsClick(DTreininitioninconfig, "DT reininition in config");
				
				switchToBodyFrame(driver);
				
			jsClick(searchboxofaudittrail, "searchboxofaudittrail");
				sendText(searchboxofaudittrail,Searchboxofreinitiationsub2,"searchboxofaudittrail");
				
				jsClick(searchiconofaudittrail, "searchiconofaudittrail");
				
		        TimeUtil.shortWait(); 
				 
		        jsClick(reinitionsselectingrecords, "reinitionsselectingrecords");
		        
				  TimeUtil.shortWait();
				 
				  jsClick(reinitionofDTcommonconfigu, "reinition of DT commonconfigu");
				  
				  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
				  
				  jsClick(reinitiationofCCofdrpdwnofversion2, "reinitiationofCCofdrpdwnofversion3");
				  
				  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
				  
				  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
				  
				  jsClick(reinitionnumofdigitsofversionnumincommonconfig, "reinitionnumofdigitsofversionnumincommonconfig");
				  
				  jsClick(reinitiationofCCofdrpdwnofversion4, "reinitiationofCCofdrpdwnofversion4");
				  
				  jsClick(reinitionofversionnumstartsfromincommonconfig, "reinitionofversionnumstartsfromincommonconfig");
				  
				  jsClick(reinitionofstartdigitsdrpdwn2digits, "reinitionofstartdigitsdrpdwn2digits");
				  
				  
				  jsClick(remarksofreinitionofDTofapprovar, "remarksofreinitionofDTofapprovar");
					sendText(remarksofreinitionofDTofapprovar,RemarksofreinitionofDTofapprovar,"remarksofreinitionofDTofapprovar");
					
					
					 jsClick(SubmitBtn, "Submit Btn");
						
						E_sign.e_Sign(eSign);
						
						TimeUtil.shortWait();
						
						jsClick(nextbtninall, "Done button");
						
						TimeUtil.shortWait();
						
						switchToDefaultContent(driver);
						
						jsClick(logoutbtn, "logoutbtn");
						
						
			}
			
			
			

			/**
			 * This method is for documentReinitApproval
			 * 
			 * 
			 */
			public void documentReinitApprovalsub2(String Recordsperpageofapprovalofconfigurationmenu,String Searchofapprovalofconfigurationmenusub2,String aTsearchiconofapprovalofconfigurationmenusub2,String eSign) {
				
		click(Documentmanagericon, "Document manager icon tab");
				
				click(Configurationmainmenu, "Configuration mainmenu");
				
				jsClick(apporvalmenuinconfigu, "apporvalmenuinconfigu");
				
				jsClick(DTmenuinapprovalsofconfigu, "DTmenu in approvals of configu");
				
				switchToBodyFrame(driver);
				
				jsClick(filterofapprovalofconfigurationmenu, "filterofapprovalofconfigurationmenu");
				  
			 jsClick(recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 sendText(recordsperpageofapprovalofconfigurationmenu,Recordsperpageofapprovalofconfigurationmenu, "recordsperpageofapprovalofconfigurationmenu");
			 jsClick(applybtnofapprovalofconfigurationmenu, "applybtnofapprovalofconfigurationmenu");
			  
			  jsClick(searchofapprovalofconfigurationmenu, "searchofapprovalofconfigurationmenu");
			  sendText(searchofapprovalofconfigurationmenu,Searchofapprovalofconfigurationmenusub2, "searchofapprovalofconfigurationmenu");
				
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
						
						jsClick(configurationautditrailmenu, "configuration autditrail menu");
						
						jsClick(DTaudittrailofconf, "DT audittrail of conf");
						
					switchToBodyFrame(driver);
					
					
		             jsClick(ATfilterofapprovalofconfigurationmenu, "ATfilterofapprovalofconfigurationmenu");
					 
					 jsClick(ATrecordsperpageofapprovalofconfigurationmenu, "ATrecordsperpageofapprovalofconfigurationmenu");
					 
					 jsClick(ATapplybtnofapprovalofconfigurationmenu, "ATapplybtnofapprovalofconfigurationmenu");
					 
					 jsClick(ATsearchofapprovalofconfigurationmenu, "ATsearchofapprovalofconfigurationmenu");
					 sendText(ATsearchofapprovalofconfigurationmenu,aTsearchiconofapprovalofconfigurationmenusub2,"ATsearchofapprovalofconfigurationmenu");
					 
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
		
	//multi-----
			
			
			public void Documenttypedocumentregistrationmulti(String Documenttypetxtbox1,String Descriptiontxtboxindocumenttype1 ,String eSign){
				
				 
				 String s = "";
					String randomval = "";
					
						prop = ConfigsReader.readProperties("./configs/configuration.properties");
						if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
				
							s = TextUtils.randomvalue(2);
							randomval = Integer.toString(TextUtils.randomNumber(1));


				
				}
				
				
				//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);
				
				//TimeUtil.shortWait();
				
				waitForPageToLoad(3000);
				 
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
						jsClick(Configurationmainmenu, "Configuration mainmenu");
						jsClick(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
						jsClick(DocumenttypemenuininitiateofCONF, "Documenttype menu in initiate of CONF");
						switchToBodyFrame(driver);
						
					//	click(SingledocumenttypefieldinDT, "Singledocumenttype field in DT");
						
						jsClick(multidocutype, "multidocutype");
						
						jsClick(maindocaddbut, "maindocaddbut");
						
						TimeUtil.shortWait();
						
						jsClick(radiobtnofmaindoc, "radiobtnofmaindoc");
						
						jsClick(Addbtnofmainmultidoc, "Addbtnofmainmultidoc");
						
						TimeUtil.shortWait();
						
						jsClick(associateaddbtn, "associateaddbtn");
						
						TimeUtil.shortWait();
						
						jsClick(addbtnofassbt1, "addbtnofassbt1");
						
						TimeUtil.shortWait();
						
						jsClick(addbtnofassbt2, "addbtnofassbt2");
						
						jsClick(Addbtnofassocimulti1, "Addbtnofassocimulti1");
						
						TimeUtil.shortWait();
						
						jsClick(documenttypetxtbox1, "documenttypetxtbox1");
						  sendText(documenttypetxtbox1,Documenttypetxtbox1, "documenttypetxtbox1");
						  
							jsClick(descriptiontxtboxindocumenttype1, "descriptiontxtboxindocumenttype1");
						  sendText(descriptiontxtboxindocumenttype1,Descriptiontxtboxindocumenttype1, "descriptiontxtboxindocumenttype1");		
						
							jsClick(SubmitBtn, "Submit Btn");
						
						E_sign.e_Sign(eSign);
						
						TimeUtil.shortWait();
						
						jsClick(nextbtninall, "Done button");
						
						TimeUtil.shortWait();
						
						switchToDefaultContent(driver);	
	
						jsClick(logoutbtn, "logoutbtn");
	
	
	
	
	
	}

	}	
			
			
			
			
			
		