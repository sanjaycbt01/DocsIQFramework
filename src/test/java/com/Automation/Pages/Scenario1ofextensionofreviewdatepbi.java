package com.Automation.Pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class Scenario1ofextensionofreviewdatepbi  extends ActionEngine {
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
	
	//--------------------------------------------------------------------------------------------ssss
	
	
	@FindBy(linkText = "Document Manager")
	WebElement DocumentManagericon;
	
	@FindBy(linkText = "Transactions")
	WebElement DocumentManagertransactionsubmenu;
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0001")
	WebElement Documentprepationrequest;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchboxofdocprerequest;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement searchiconofdocprerequest;
	
	@FindBy(xpath = "//td[contains(text(),'Mainrun1')]")
	WebElement clickonrecordofdocprerequest;
	
	//-----------------------------------------
	
	@FindBy(xpath = "//input[@id='PreparationRequest_DocumentDesc']")
	WebElement Documenttitleofdocprereq;
	
	@FindBy(id = "PreparationRequest_CcNo")
	WebElement changecontrolnumtextbox;
	
	@FindBy(xpath = "//button[@id='btnModal_PreparationRequest_ToUserToGroup_0']")
	WebElement addbtnofusergrpindocprereq;
	
	@FindBy(xpath = "//input[@id='PreparationRequest_ToUserToGroup_0WorkType_A1_1']")
	WebElement radiobtnofgroupofmaindoc;
	
	@FindBy(xpath = "//button[@id='PreparationRequest_ToUserToGroup_0_selectBtn']")
	WebElement Addbtnofprereqgroup;
	
	@FindBy(id = "btnConfirm")
	WebElement submitbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtn1;
	
	@FindBy(id = "DMS_Document Manager_Transactions")
	WebElement documentmanagertransactionsmenu;
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0041")
	WebElement mytaskmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Document Tasks')]")
	WebElement documenttasks;
	
	//same search 3
/*	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchboxofdocprerequest;
	
	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement searchiconofdocprerequest;
	*/
	@FindBy(xpath = "//td[text()='Under Preparation Request Approval']")
	WebElement recordofselecteditem;
	
	@FindBy(xpath = "//input[@id='SelectedDecision_2']")
	WebElement radiobtnofapprove;
	
//---------------------------------------------------------------------
	
	/*
	
	@FindBy(id = "DMS_Document Manager_Transactions")
	WebElement documentmanagertransactionsmenu;
	
	@FindBy(id = "DMS_Document Manager_Transactions_MENU0041")
	WebElement mytaskmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Document Tasks')]")
	WebElement documenttasks;
	
	 */
	
	@FindBy(xpath = "//td[text()='Under Preparation Initiation']")
	WebElement recordofselecteditem2stage;
	
	@FindBy(xpath = "//td[contains(text(),'Under Preparation Initiation')]")
	WebElement recordofselecteditemofmainpagescreen;
	
	@FindBy(xpath = "//button[@id='btnModal_Preparation_ToUserToGroup_0']")
	WebElement addbuttonofagroupinprestage;
	
	@FindBy(id = "Preparation_ToUserToGroup_0WorkType_A1_1")
	WebElement radiobtnofpreinchargegrp;
	
	@FindBy(id = "Preparation_ToUserToGroup_0_selectBtn")
	WebElement addbtnofpreparation;
	
	@FindBy(xpath = "//label[text()='Choose File']")//label[text()='Choose File']
	WebElement choosefilelabelofprepationpage;
	
	
	
	
	
	
	
	
	//---------------------------------------------------------------------------------------------------
	
	//subdocuments
	//------------------------------------------------------------------------------------
	
	@FindBy(id = "btnSubmitTmp")
	WebElement submitbutton;
	
	@FindBy(xpath = "//td[text()='Under Preparation Approval']")
	WebElement recordofpreparationapproval;
	
	@FindBy(id = "SelectedDecision_2")
	WebElement approveradiobtn;
	
	//same all
	@FindBy(xpath = "//td[text()='Under Publish Initiation']")
	WebElement recordofunderpublishinitiation;
	
	@FindBy(xpath = "//td[contains(text(),'Under Publish Initiation')]")
	WebElement recordofunderpublishinitiation1;
	
	@FindBy(id = "btnModal_DocumentPublish_SelRepDom")
	WebElement addbtnofpublishinitiationstage;
	
	@FindBy(id = "DocumentPublish_SelRepDom_FindTxt")
	WebElement searchbtnofotherscreen;
	
	@FindBy(id = "DocumentPublish_SelRepDom_DisplayBtn")
	WebElement applybtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
	WebElement subaddbtn;
	
	@FindBy(id = "DocumentPublish_SelRepDom_selectBtn")
	WebElement addbtnof2inpublish;
	
	@FindBy(id = "DocumentPublish_Prtremarks")
	WebElement printreason;
	
	@FindBy(id = "btnModal_DocumentPublish_ToUserToGroup_0")
	WebElement approver1assigntoaddbtn;
	
	@FindBy(xpath = "//input[@id='DocumentPublish_ToUserToGroup_0WorkType_A1_1']")
	WebElement radiobtnofassigntogrp;
	
	@FindBy(id = "DocumentPublish_ToUserToGroup_0_selectBtn")
	WebElement addbtnofsecond;
	
	@FindBy(id = "btnConfirm")
	WebElement confirmbtn1;
	
	@FindBy(xpath = "//td[text()='Under Publish Approval']")
	WebElement underpublishapproval;
	
	@FindBy(xpath = "//td[text()='Under Preparation Request Approval']")
	WebElement underpublishinitiaproval;
	
	
	//input[@id='SelectedDecision_2']approve
	
	//----------------------------------------------------
	
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
  
  
  
  
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtninall;
	
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;
	
	@FindBy(id = "btnSubmitTmp")
	WebElement SubmitBtntemp;
	
	
	
	@FindBy(xpath = "//span[text()='Print']")
	WebElement printoftasks;

@FindBy(xpath = "//button[@id='OkBtn']")
	WebElement okkkbtn;





@FindBy(xpath = "//td[contains(text(),'Associate-rk1')]")
WebElement sub1doc;

@FindBy(id = "PreparationRequest_DocumentDesc")
WebElement txtboxofsub1doc;

@FindBy(xpath = "//td[contains(text(),'Associate-rk2')]")
WebElement sub2doc;

@FindBy(id = "PreparationRequest_DocumentDesc")
WebElement txtboxofsub2doc;


@FindBy(xpath = "//input[@id='btnConfirm']")
WebElement confimbtnneww;

@FindBy(xpath = "/html[1]/body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
WebElement sub1;

@FindBy(xpath = "//tbody/tr[3]/td[2]")
WebElement sub2;

@FindBy(xpath = "//button[@id='btnModal_PreparationRequest_Repository']")
WebElement repositoryaddbtn;

@FindBy(xpath = "//input[@id='VersionType_6']")
WebElement doccorrectionsradiobtn;

@FindBy(xpath = "//input[@id='btnConfirm_1']")
WebElement confirmbtn;

@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement sub1docnew;
	
  @FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement sub2docnew;
	
@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")
	WebElement sub3docnew;
	

@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")
	WebElement sub4docnew;
	

 @FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]")
	WebElement sub5docnew;

//-------------------------------------------------------------------------------------------------------------------------------

     @FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement sub1docnewnext;
	
  @FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")
	WebElement sub2docnewnext;
	
@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")
	WebElement sub3docnewnext;
	

@FindBy(xpath = "//body[1]/form[1]/section[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]")
	WebElement sub4docnewnext;
	

@FindBy(xpath = "//tbody/tr[6]/td[1]")
	WebElement sub5docnewnext;
//--------------------------------------------------------------------------------------------

@FindBy(id = "DMS_Document Manager_Transactions_DMS0924")
WebElement extensionofreviewdatemenuintransac;

@FindBy(xpath = "//button[@id='btnModal_ExtensionReviewDate_MainDocType']")
WebElement addbtninextenofrevdatedoc;

@FindBy(xpath = "//input[@id='ExtensionReviewDate_MainDocType_FindTxt']")
WebElement findtextofextenofreviewdate;

@FindBy(xpath = "//input[@id='ExtensionReviewDate_MainDocType_DisplayBtn']")
WebElement applybutton;

@FindBy(xpath = "//a[text()='Maintest3extre']")
WebElement selecteddocrecord;

@FindBy(xpath = "//button[@id='maindocs']")
WebElement addbtnofsubscreen;

@FindBy(xpath = "//button[@id='ExtensionReviewDate_MainDocType_MainDocPopUp_selectBtn']")
WebElement addbtnofsubscreen2;

@FindBy(xpath = "//input[@id='btnConfirm']")
WebElement confirmbuttton;

@FindBy(xpath = "//body/div[2]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[8]/a[1]")
WebElement adittrailsofdocma;

@FindBy(xpath = "//a[@id='DMS_Document Manager_Audit Trails_DMS0924']")
WebElement exofrevewdatemenuinadittrailsofdocma;

@FindBy(xpath = "//td[contains(text(),'ramg1.g')]")
WebElement clickingonramg1record;

@FindBy(xpath = "//span[contains(text(),'Extension of Review Date Approval')]")
WebElement extensionofrevdateappmenu;
















//test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
	//	.pass("EPIQ PlantSelection");
	
	
	public Scenario1ofextensionofreviewdatepbi() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */
	
	
public void Documenttypebasicflowextensionofrevdate(String Findtextofextenofreviewdate,String Searchboxofdoctype,String eSign){
		
 
 String s = "";
	String randomval = "";
	
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {

			s = TextUtils.randomvalue(3);
			randomval = Integer.toString(TextUtils.randomNumber(1));



}


//setEMPdocumenttypetxtbox(EMPdocumenttypetxtbox =  Documenttypetxtbox+s);

//TimeUtil.shortWait();

waitForPageToLoad(3000);
 

//uploadDocument("C:\\Users\\venkatapm\\OneDrive - caliberuniversal\\Desktop\\ramkri.docx");



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
/*	
 jsClick(Documentmanagericon, "Document manager icon tab");
		jsClick(DocumentManagericon, "DocumentManagermenu");
		jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
		jsClick(extensionofreviewdatemenuintransac, "extensionofreviewdatemenuintransac");
		switchToBodyFrame(driver);
		
	jsClick(addbtninextenofrevdatedoc, "addbtninextenofrevdatedoc");
	
	TimeUtil.shortWait();
		
	jsClick(findtextofextenofreviewdate, "findtextofextenofreviewdate");
	sendText(findtextofextenofreviewdate,Findtextofextenofreviewdate,"findtextofextenofreviewdate");	
	
	jsClick(applybutton, "applybutton");
	
	TimeUtil.shortWait();
	
	jsClick(selecteddocrecord, "selecteddocrecord");
	
	jsClick(addbtnofsubscreen, "addbtnofsubscreen");
	
jsClick(addbtnofsubscreen2, "addbtnofsubscreen2");

TimeUtil.shortWait();

jsClick(confirmbuttton, "confirmbuttton");

  E_sign.e_Sign(eSign);
		  
			TimeUtil.shortWait();
			//jsClick(nextbtninall, "Done button");
		jsClick(nextbtn, "nextbtn");
		
		 switchToDefaultContent(driver);
		*/ 
		 jsClick(Documentmanagericon, "Document manager icon tab");
			jsClick(DocumentManagericon, "DocumentManagermenu");
			jsClick(adittrailsofdocma, "adittrailsofdocma");
			jsClick(exofrevewdatemenuinadittrailsofdocma, "exofrevewdatemenuinadittrailsofdocma");
			switchToBodyFrame(driver);
			
			jsClick(searchboxofdocprerequest, "searchboxofdocprerequest");
			sendText(searchboxofdocprerequest,Findtextofextenofreviewdate,"searchboxofdocprerequest");
			
			jsClick(searchiconofdocprerequest, "searchiconofdocprerequest");
			
	    TimeUtil.shortWait(); 
	    
	    jsClick(clickingonramg1record, "clickingonramg1record");
	    
	    TimeUtil.shortWait(); 
	    
	    switchToDefaultContent(driver);
		 
	    jsClick(logoutbtn, "logoutbtn");	
  		
  			}
	
		
      
	
/**
 * This method is 
 * 
 * 
 */
public void Documentprereqapprovar(String Searchboxofdoctype,String eSign) {
	
	
	jsClick(Documentmanagericon, "Document manager icon tab");
	jsClick(DocumentManagericon, "DocumentManagermenu");
	jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
	jsClick(mytaskmenu, "mytaskmenu");
	switchToBodyFrame(driver);
	TimeUtil.shortWait();
	jsClick(extensionofrevdateappmenu, "extensionofrevdateappmenu");
	TimeUtil.shortWait();
	switchToDefaultContent(driver);
	TimeUtil.shortWait();
switchToBodyFrame(driver);
	
jsClick(searchboxofdocprerequest, "searchboxofdocprerequest");
	sendText(searchboxofdocprerequest,Searchboxofdoctype,"searchboxofdocprerequest");
	
	jsClick(searchiconofdocprerequest, "searchiconofdocprerequest");
	
    TimeUtil.shortWait(); 
    
    jsClick(clickingonramg1record, "clickingonramg1record");
	 
	 TimeUtil.shortWait();
	 
	 jsClick(radiobtnofapprove, "radiobtnofapprove");
	 
	 jsClick(SubmitBtn, "Submit Btn");
		
		E_sign.e_Sign(eSign);
		TimeUtil.shortWait();
		
		jsClick(nextbtninall, "Done button");
		
		switchToDefaultContent(driver);
		
		 jsClick(Documentmanagericon, "Document manager icon tab");
			jsClick(DocumentManagericon, "DocumentManagermenu");
			jsClick(adittrailsofdocma, "adittrailsofdocma");
			jsClick(exofrevewdatemenuinadittrailsofdocma, "exofrevewdatemenuinadittrailsofdocma");
			switchToBodyFrame(driver);
			
			jsClick(searchboxofdocprerequest, "searchboxofdocprerequest");
			sendText(searchboxofdocprerequest,Searchboxofdoctype,"searchboxofdocprerequest");
			
			jsClick(searchiconofdocprerequest, "searchiconofdocprerequest");
			
	    TimeUtil.shortWait(); 
	    
	    jsClick(clickingonramg1record, "clickingonramg1record");
	    
TimeUtil.shortWait(); 
	    
	    switchToDefaultContent(driver);
		 
		 
	    jsClick(logoutbtn, "logoutbtn");	
		
			}
	
	/**
	 * This metho
	 * 
	 * 
	 */
	public void Documentprintinitiation(String Searchboxofdoctype ) {
		
		
		

		jsClick(Documentmanagericon, "Document manager icon tab");
		jsClick(DocumentManagericon, "DocumentManagermenu");
		jsClick(DocumentManagertransactionsubmenu, "DocumentManagertransactionsubmenu");
		jsClick(mytaskmenu, "mytaskmenu");
		switchToBodyFrame(driver);
		TimeUtil.shortWait();
		jsClick(printoftasks, "printoftasks");
		TimeUtil.shortWait();
		switchToDefaultContent(driver);
		TimeUtil.shortWait();
		
		switchToBodyFrame(driver);
		
			jsClick(searchboxofdocprerequest, "searchboxofdocprerequest");
			sendText(searchboxofdocprerequest,Searchboxofdoctype,"searchboxofdocprerequest");
			
			jsClick(searchiconofdocprerequest, "searchiconofdocprerequest");
        TimeUtil.shortWait(); 
		 
        jsClick(printbtn, "printbtn");
        
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
