package com.Automation.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
import com.Automation.Utils.MyScreenRecorder;
import com.aventstack.extentreports.ExtentReports;

public class Scenario5documentversionnumtest   extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Version number.xlsx";

	
	@DataProvider(name = "Documentversionnum")
	public Object[][] getDocumentversionnum() {
		Object getDocumentversionnum[][] = Excelutil.getTestData(ExcelPath, "Scenario5");
		return getDocumentversionnum;
	}
	
	
	public Scenario5documentversionnumtest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentversionnum", enabled = true)
		public void Scenario5importflow(String Findtxtofmaindocsearchinimport,String Maindocuniqecodeinimport,String Documenttitleofmaindoc, String Revisionchagedetails,String Changectrlfieldofimport,
				String Importremarks,String Recordsperpageofapprovalofconfigurationmenu,String Findtxtbtnofassociate,String Maindocuniqecodeinimportsub1,String Documenttitleofmaindocsub1,String Changectrlfieldofimportsub1,
				String Maindocuniqecodeinimportsub2,String Documenttitleofmaindocsub2,String Changectrlfieldofimportsub2,String Numberofcopiesfield,String Remarksofprint){

			this.test = extent.createTest("Scenario 5- Import the document, return , re-initiation and its approvals along with its audit trails and taking the print of imported document");
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
	
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {
			
			
	
		
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
			epiqplant.epicplant();
			documentversionnumscena5.Documenttypeimportdocumentregistration(Findtxtofmaindocsearchinimport, Maindocuniqecodeinimport, Documenttitleofmaindoc, Revisionchagedetails, Changectrlfieldofimport);
		
			epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
		epiqplant.epicplant();
		documentversionnumscena5.Documentreturn(Maindocuniqecodeinimport, Importremarks);
		
	epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
   documentversionnumscena5.Documentreinitation(Maindocuniqecodeinimport, Importremarks);
	
			
   epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
    documentversionnumscena5.documentReinitApproval(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimport);
    
    
    //---sub1--
    
    
    epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
documentversionnumscena5.Documenttypeimportdocumentregistrationsub1(Findtxtbtnofassociate, Maindocuniqecodeinimportsub1, Documenttitleofmaindocsub1, Revisionchagedetails, Changectrlfieldofimportsub1);
	
	
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.Documentreturnsub1(Maindocuniqecodeinimportsub1, Importremarks);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena5.Documentreinitationsub1(Maindocuniqecodeinimportsub1, Importremarks);
		
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.documentReinitApprovalsub1(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimportsub1);
    
  //--sub2---


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentversionnumscena5.Documenttypeimportdocumentregistrationsub2(Findtxtbtnofassociate, Maindocuniqecodeinimportsub2, Documenttitleofmaindocsub2, Revisionchagedetails, Changectrlfieldofimportsub2);
	
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.Documentreturnsub2(Maindocuniqecodeinimportsub2, Importremarks);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena5.Documentreinitationsub2(Maindocuniqecodeinimportsub2, Importremarks);	

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.documentReinitApprovalsub2(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimportsub2);
   
//print-----------


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena5.Documenttypepublishinitiation(Findtxtofmaindocsearchinimport, Maindocuniqecodeinimport, Numberofcopiesfield, Remarksofprint);
		

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.Documentpublishinitiationapproval(Maindocuniqecodeinimport);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena5.Documentprintinitiation(Maindocuniqecodeinimport);	

		
		
		
		}	
		
		
		
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }

				
				
			
		//	}
			
	//	}
		
}
				