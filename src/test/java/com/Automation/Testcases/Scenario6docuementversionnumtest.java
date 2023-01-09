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

public class Scenario6docuementversionnumtest extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Version number.xlsx";

	
	@DataProvider(name = "Documentversionnum")
	public Object[][] getDocumentversionnum() {
		Object getDocumentversionnum[][] = Excelutil.getTestData(ExcelPath, "Scenario6");
		return getDocumentversionnum;
	}
	
	
	public Scenario6docuementversionnumtest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentversionnum", enabled = true)
		public void Scenario6massuploadimportflow(String Recordsperpageofapprovalofconfigurationmenu,String Maindocuniqecodeinimport,
				String Maindocuniqecodeinimportsub1,String Findtxtofmaindocsearchinimport,String Numberofcopiesfield,String Remarksofprint){

			this.test = extent.createTest("Scenario 6- Massupload the required number of document, approvals, audit trails and print of the massuploaded documents");
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
	
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {
		
	 epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
    documentversionnumscena6.documentReinitApproval(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimport);
    
    
    //---sub1--
    
    
    
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena6.documentReinitApprovalsub1(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimportsub1);
    
  //--sub2---

 
//print-----------


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena6.Documenttypepublishinitiation(Findtxtofmaindocsearchinimport, Maindocuniqecodeinimport, Numberofcopiesfield, Remarksofprint);
		

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena6.Documentpublishinitiationapproval(Maindocuniqecodeinimport);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena6.Documentprintinitiation(Maindocuniqecodeinimport);	

		
		
		
		}	
		
		
		
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }

				
				
			
		//	}
			
	//	}
		
}
