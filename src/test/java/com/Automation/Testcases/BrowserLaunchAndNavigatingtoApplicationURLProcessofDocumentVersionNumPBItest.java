package com.Automation.Testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
import com.Automation.Utils.MyScreenRecorder;
import com.aventstack.extentreports.ExtentReports;

public class BrowserLaunchAndNavigatingtoApplicationURLProcessofDocumentVersionNumPBItest     extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Version number.xlsx";
	
	
	@DataProvider(name = "Documentversionnum")
	public Object[][] getDocumentversionnum() {
		Object getDocumentversionnum[][] = Excelutil.getTestData(ExcelPath, "Scenario1");
		return getDocumentversionnum;
	}
	
	

	@DataProvider(name = "Documentversionnum2")
	public Object[][] getDocumentversionnum2() {
		Object getDocumentversionnum2[][] = Excelutil.getTestData(ExcelPath, "Scenario2");
		return getDocumentversionnum2;
	}
	
	

	@DataProvider(name = "Documentversionnum3")
	public Object[][] getDocumentversionnum3() {
		Object getDocumentversionnum3[][] = Excelutil.getTestData(ExcelPath, "Scenario3");
		return getDocumentversionnum3;
	}
	
	@DataProvider(name = "Documentversionnum4")
	public Object[][] getDocumentversionnum4() {
		Object getDocumentversionnum4[][] = Excelutil.getTestData(ExcelPath, "Scenario4");
		return getDocumentversionnum4;
	}
	
	
	public BrowserLaunchAndNavigatingtoApplicationURLProcessofDocumentVersionNumPBItest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	
	@Test(priority = 1, dataProvider = "Documentversionnum", enabled = true)
	public void REG_RET_REIN_APR(String FindtextbtninDT,String recordsbtn,String Documenttypetxtbox, String DescriptiontxtboxinDT,String Searchboxofaudittrail,
			String Searchboxofaudittrail1,String Remarksofreturnorapproval,String Searchboxofreinitiation,String RemarksofreinitionofDTofapprovar,
			String Recordsperpageofapprovalofconfigurationmenu,String Searchofapprovalofconfigurationmenu,String aTsearchiconofapprovalofconfigurationmenu,String Documenttypetxtbox1,String Descriptiontxtboxindocumenttype1,String Documenttypetxtboxsub1, String DescriptiontxtboxinDTsub1,String Searchboxofaudittrailsub1,
			String Searchboxofaudittrail1sub1,String Searchboxofreinitiationsub1,String Searchofapprovalofconfigurationmenusub1,String aTsearchiconofapprovalofconfigurationmenusub1,String Documenttypetxtboxsub2, String DescriptiontxtboxinDTsub2,String Searchboxofaudittrailsub2,
			String Searchboxofaudittrail1sub2,String Searchboxofreinitiationsub2,String Searchofapprovalofconfigurationmenusub2,String aTsearchiconofapprovalofconfigurationmenusub2){

		this.test = extent.createTest("Scenario 1- Document Type registration, re-initiation and approvals, along with audit trails");
		
		test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
		.pass("EPIQ PlantSelection");

		
		// Document Registration Initiation
		// -----------------------------
	//	for (int i = 1; i <= 3; i++) {
		
		

		
	epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
		documentversionnumscena1.Documenttypedocumentregistration(FindtextbtninDT, recordsbtn, Documenttypetxtbox, DescriptiontxtboxinDT, Searchboxofaudittrail,ConfigsReader.getPropValue("pwdepic"));
	
		epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
	documentversionnumscena1.Documentreturn(Searchboxofaudittrail1, Remarksofreturnorapproval, ConfigsReader.getPropValue("pwdepic1"));
			
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documentreinitation(Searchboxofreinitiation, RemarksofreinitionofDTofapprovar,ConfigsReader.getPropValue("pwdepic"));
		
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena1.documentReinitApproval(Recordsperpageofapprovalofconfigurationmenu, Searchofapprovalofconfigurationmenu, aTsearchiconofapprovalofconfigurationmenu, ConfigsReader.getPropValue("pwdepic1"));


//---sub1--


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documenttypedocumentregistrationsub1(FindtextbtninDT, recordsbtn, Documenttypetxtboxsub1, DescriptiontxtboxinDTsub1, Searchboxofaudittrailsub1,ConfigsReader.getPropValue("pwdepic"));

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena1.Documentreturnsub1(Searchboxofaudittrail1sub1, Remarksofreturnorapproval, ConfigsReader.getPropValue("pwdepic1"));
	
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documentreinitationsub1(Searchboxofreinitiationsub1, RemarksofreinitionofDTofapprovar,ConfigsReader.getPropValue("pwdepic"));
	
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena1.documentReinitApprovalsub1(Recordsperpageofapprovalofconfigurationmenu, Searchofapprovalofconfigurationmenusub1, aTsearchiconofapprovalofconfigurationmenusub1, ConfigsReader.getPropValue("pwdepic1"));


//--sub2---


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documenttypedocumentregistrationsub2(FindtextbtninDT, recordsbtn, Documenttypetxtboxsub2, DescriptiontxtboxinDTsub2, Searchboxofaudittrailsub2,ConfigsReader.getPropValue("pwdepic"));

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena1.Documentreturnsub2(Searchboxofaudittrail1sub2, Remarksofreturnorapproval, ConfigsReader.getPropValue("pwdepic1"));
	
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documentreinitationsub2(Searchboxofreinitiationsub2, RemarksofreinitionofDTofapprovar,ConfigsReader.getPropValue("pwdepic"));
	
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena1.documentReinitApprovalsub2(Recordsperpageofapprovalofconfigurationmenu, Searchofapprovalofconfigurationmenusub2, aTsearchiconofapprovalofconfigurationmenusub2, ConfigsReader.getPropValue("pwdepic1"));


//--multi---


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena1.Documenttypedocumentregistrationmulti(Documenttypetxtbox1, Descriptiontxtboxindocumenttype1,ConfigsReader.getPropValue("pwdepic"));

           }
	
			
	@Test(priority = 2, dataProvider = "Documentversionnum2", enabled = true)
	public void REG_RET_REIN_APR_Modification(String recordsbtn1,String Mainpagesearchtxtbox, String Modificationremarks,String Mainpagesearchtxtbox1,
			String Mainpagesearchtxtboxsub1,String Mainpagesearchtxtbox1sub1,String Mainpagesearchtxtboxsub2,String Mainpagesearchtxtbox1sub2){
		
		this.test = extent.createTest("Scenario 2- Document Type Modification initiation , Return, Re-initiation, Approved along with audit trails.");
		
		test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
		.pass("EPIQ PlantSelection");


		// Document Registration Initiation
		// -----------------------------
	//	for (int i = 1; i <= 3; i++) {
		
		

		
			epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		epiqplant.epicplant();
		documentversionnumscena2.Documenttypemodification(recordsbtn1, Mainpagesearchtxtbox, Modificationremarks, Mainpagesearchtxtbox1);
		
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
	documentversionnumscena2.Documentreturninmodification(Mainpagesearchtxtbox1, Modificationremarks, ConfigsReader.getPropValue("pwdepic1"));
			
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena2.Documentreinitationmodification(Mainpagesearchtxtbox1, Modificationremarks);
			
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena2.documentReinitApprovalmodification(recordsbtn1, Mainpagesearchtxtbox,ConfigsReader.getPropValue("pwdepic1"));


//---sub1--



			epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		epiqplant.epicplant();
		documentversionnumscena2.Documenttypemodification(recordsbtn1, Mainpagesearchtxtboxsub1, Modificationremarks, Mainpagesearchtxtbox1sub1);
		
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
	documentversionnumscena2.Documentreturninmodification(Mainpagesearchtxtbox1sub1, Modificationremarks, ConfigsReader.getPropValue("pwdepic1"));
			
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena2.Documentreinitationmodification(Mainpagesearchtxtbox1sub1, Modificationremarks);
			
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena2.documentReinitApprovalmodification(recordsbtn1, Mainpagesearchtxtboxsub1,ConfigsReader.getPropValue("pwdepic1"));


//--sub2---   



			epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		epiqplant.epicplant();
		documentversionnumscena2.Documenttypemodificationsub2(recordsbtn1, Mainpagesearchtxtboxsub2, Modificationremarks, Mainpagesearchtxtbox1sub2);
		
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
	documentversionnumscena2.Documentreturninmodificationsub2(Mainpagesearchtxtbox1sub2, Modificationremarks, ConfigsReader.getPropValue("pwdepic1"));
			
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena2.Documentreinitationmodificationsub2(Mainpagesearchtxtbox1sub2, Modificationremarks);
			
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena2.documentReinitApprovalmodificationsub2(recordsbtn1, Mainpagesearchtxtboxsub2,ConfigsReader.getPropValue("pwdepic1"));


            }	
			
	
	@Test(priority = 3, dataProvider = "Documentversionnum3", enabled = true)
	public void Newvesiondoctypeflow(String Searchboxofdocprerequest,String documenttitleofdocprereq, String Changecontrolnumtextbox,String Searchboxofdoctype,
			String Searchbtnofotherscreen,String Printreason,String Txtboxofsub1doc,String Txtboxofsub2doc ) throws AWTException{

		this.test = extent.createTest("Scenario 3- New version type - Prepare the document, Publish and take the Print of the document");
		
		
		// Document Registration Initiation
		// -----------------------------
	//	for (int i = 1; i <= 3; i++) {	
		

		test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
		.pass("EPIQ PlantSelection");

		
			epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		epiqplant.epicplant();
		documentversionnumscena3.Documenttypebasicflow(Searchboxofdocprerequest, documenttitleofdocprereq, Changecontrolnumtextbox);
	
		epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
	documentversionnumscena3.Documentprereqapprovar(Searchboxofdoctype);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena3.Documentprereqapprovar1(Searchboxofdoctype, Txtboxofsub1doc,Txtboxofsub2doc,ConfigsReader.getPropValue("pwdepic"));
	
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena3.documentapprovarpreparationstage(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));


//---


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena3.Documenttypepublishinitiation(Searchboxofdoctype, Searchbtnofotherscreen, Printreason,ConfigsReader.getPropValue("pwdepic"));

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena3.Documentpublishinitiationapproval(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));
	
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena3.Documentprintinitiation(Searchboxofdoctype);

		}	
	
	
@Test(priority = 4, dataProvider = "Documentversionnum4", enabled = true)
		public void Newvesiondoctypeflowmodification(String Searchboxofdocprerequest,String documenttitleofdocprereqrev, String Changecontrolnumtextboxrev,String Searchboxofdoctype,
				String Searchbtnofotherscreen,String Printreason,String Txtboxofsub1doc,String Txtboxofsub2doc,String Findtextofrevexidoc ) throws AWTException{

			this.test = extent.createTest("Scenario 4- Revision of the Published document, Print of the revised Document");
			
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {	
			
	
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
	
			
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
			epiqplant.epicplant();
			documentversionnumscena4.Documenttypebasicflow(Searchboxofdocprerequest, documenttitleofdocprereqrev, Changecontrolnumtextboxrev,Findtextofrevexidoc);
		
			epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
		epiqplant.epicplant();
		documentversionnumscena4.Documentprereqapprovar(Searchboxofdoctype);
	
	epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentversionnumscena4.Documentprereqapprovar1(Searchboxofdoctype, Txtboxofsub1doc,Txtboxofsub2doc,ConfigsReader.getPropValue("pwdepic"));
	
   epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
	documentversionnumscena4.documentapprovarpreparationstage(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));
    
    
    //---sub1--
    
    
    epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentversionnumscena4.Documenttypepublishinitiation(Searchboxofdoctype, Searchbtnofotherscreen, Printreason,ConfigsReader.getPropValue("pwdepic"));

	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena4.Documentpublishinitiationapproval(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));
		
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena4.Documentprintinitiation(Searchboxofdoctype);
	
			}	
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }
		
		

				
				}
				
