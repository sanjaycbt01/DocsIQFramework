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

public class Scenario3ofextensionofreviewdatepbitest   extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Extension of review date.xlsx";

	
	@DataProvider(name = "Documentversionnum")
	public Object[][] getDocumentversionnum() {
		Object getDocumentversionnum[][] = Excelutil.getTestData(ExcelPath, "Scenario3");
		return getDocumentversionnum;
	}
	
	
	public Scenario3ofextensionofreviewdatepbitest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentversionnum", enabled = true)
		public void Scenario3importflowandmassupload(String Findtxtofmaindocsearchinimport,String Maindocuniqecodeinimport,String Documenttitleofmaindoc, String Revisionchagedetails,String Changectrlfieldofimport,
				String Importremarks,String Recordsperpageofapprovalofconfigurationmenu,String Findtxtbtnofassociate,String Maindocuniqecodeinimportsub1,String Documenttitleofmaindocsub1,String Changectrlfieldofimportsub1,
				String Findtextofextenofreviewdate,String Searchboxofdoctype, String Numberofcopiesfield,String Remarksofprint,String Findtextofextenofreviewdate1,String Searchboxofdoctype1){

			this.test = extent.createTest("Scenario 3-Extension of review date import and massupload flow");
			
			
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {
			
		
	
		
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
			epiqplant.epicplant();
			scenario3ofextensionofrevdate.Documenttypeimportdocumentregistration(Findtxtofmaindocsearchinimport, Maindocuniqecodeinimport, Documenttitleofmaindoc, Revisionchagedetails, Changectrlfieldofimport);
		
			epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
		epiqplant.epicplant();
		scenario3ofextensionofrevdate.DocumentApprove(Maindocuniqecodeinimport, Importremarks);
	
	 epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	scenario3ofextensionofrevdate.Documenttypeimportdocumentregistrationsub1(Findtxtbtnofassociate, Maindocuniqecodeinimportsub1, Documenttitleofmaindocsub1, Revisionchagedetails, Changectrlfieldofimportsub1);
	
	
	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentapprovesub1(Maindocuniqecodeinimportsub1, Importremarks);



epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documenttypebasicflowextensionofrevdate(Findtextofextenofreviewdate, Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic"));

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentprereqapprovar(Searchboxofdoctype,ConfigsReader.getPropValue("pwdepic"));


epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentprintinitiation(Searchboxofdoctype);

//-------------------------------------------------------------------------------------

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.documentReinitApproval(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimportsub1);
		
epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.documentReinitApprovalsub1(Recordsperpageofapprovalofconfigurationmenu, Maindocuniqecodeinimportsub1);
    
 

//print-----------

/*
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentversionnumscena5.Documenttypepublishinitiation(Findtxtofmaindocsearchinimport, Maindocuniqecodeinimport, Numberofcopiesfield, Remarksofprint);
		

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentversionnumscena5.Documentpublishinitiationapproval(Maindocuniqecodeinimport);

epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentprintinitiationmass(Maindocuniqecodeinimport);	

*/
/*
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documenttypebasicflowextensionofrevdate1(Findtextofextenofreviewdate1, Searchboxofdoctype1, ConfigsReader.getPropValue("pwdepic"));

epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentprereqapprovar1(Searchboxofdoctype1,ConfigsReader.getPropValue("pwdepic"));

*/
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
scenario3ofextensionofrevdate.Documentprintinitiation1(Searchboxofdoctype1);

		
		
		}	
		
		
		
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }

				
				
			
		//	}
			
	//	}
		
}
