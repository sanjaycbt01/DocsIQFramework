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

public class Scenario3ofdocumentrunnumpbitest   extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Running number.xlsx";

	
	@DataProvider(name = "Documentrunningnum")
	public Object[][] getDocumentrunningnum() {
		Object getDocumentrunningnum[][] = Excelutil.getTestData(ExcelPath, "Scenario3");
		return getDocumentrunningnum;
	}
	
	
	public Scenario3ofdocumentrunnumpbitest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentrunningnum", enabled = true)
		public void Newvesiondoctypeflow(String Searchboxofplant,String Searchboxofdocofdt,String Searchboxofdocofdtrep,String Remarksarea
				,String Remarksarea1,String Searchboxofdoctype,String Searchbtnofotherscreen,String Printreason) throws AWTException{

			this.test = extent.createTest("Scenario 3-Verification of Configured of document running number at Document Transfer");
			
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {	
			
	
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
	
			
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
			epiqplant.epicplant();
			documentrunningnumscena3.Documenttypebasicflowofdoctransfer(Searchboxofplant, Searchboxofdocofdt, Searchboxofdocofdtrep, Remarksarea, ConfigsReader.getPropValue("pwdepic1"));
		
		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentrunningnumscena3.Documenttransfer(Searchboxofplant, Searchboxofdocofdt, Remarksarea1, Searchboxofdoctype, Searchbtnofotherscreen, Printreason,ConfigsReader.getPropValue("pwdepic1"));
		
   epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
	documentrunningnumscena3.documentapprovarpreparationstage(Searchboxofdoctype,ConfigsReader.getPropValue("pwdepic1"));
    
    
    //-------------------------
    
    
   
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }

				
				
	
}
				
/*				

			// TOPIC Registration Return
			// -------------------------
			if (numberOfApprovalReq > 0) {

				for (int i = 1; i <= numberOfApprovalReq; i++) {
					login.loginToApplication(ConfigsReader.getPropValue("AprvID" + i),
							ConfigsReader.getPropValue("AprvPWD" + i));
					login.selectPlant1();
					if (i == returnDropAt) {
						InitiateTopic.topicReturn(Menuname, TopicName, TopicUniqueCode, Description, ModDocument,
								ConfigsReader.getPropValue("AprvPWD"), RTNActionVal,
								ConfigsReader.getPropValue("RTNActionByVal"), RTNRemarks,
								ConfigsReader.getPropValue("ApprovalReqVal"),
								ConfigsReader.getPropValue("ApprovalCompVal"));
						Logout.signOutPage();
					} else {
						login.loginToApplication(ConfigsReader.getPropValue("AprvID"),
								ConfigsReader.getPropValue("AprvPWD"));
						login.selectPlant1();
						InitiateTopic.topicApproval(Menuname, TopicName, TopicUniqueCode, Description, Document,
								ConfigsReader.getPropValue("AprvPWD"), InitActionVal,
								ConfigsReader.getPropValue("InitActionByVal"), AppActionVal,
								ConfigsReader.getPropValue("AppActionByVal"), AppRemarks,
								ConfigsReader.getPropValue("ApprovalReqVal"), ConfigsReader.getPropValue("ApprovalCompVal"),
								ConfigsReader.getPropValue("Approvalcompleted"));
						Logout.signOutPage();
					}
				}
			} else {
				test.info("No of Approvals:0, So not executed");
			}

			// TOPIC Registration Re-initiation
			// ------------------------------------
			if (numberOfApprovalReq > 0) {
				login.loginToApplication(ConfigsReader.getPropValue("UserID"), ConfigsReader.getPropValue("UserPWD"));
				login.selectPlant1();
				InitiateTopic.topicReinitation(Menuname, TopicName, TopicUniqueCode, Description, ModDocument, ReinitTopic,
						ConfigsReader.getPropValue("UserPWD"), RTNActionVal, ConfigsReader.getPropValue("RTNActionByVal"),
						RTNRemarks, ReInitActionVal, ConfigsReader.getPropValue("ReInitActionByVal"), ModReinitRemarks,
						ConfigsReader.getPropValue("ApprovalReqVal"), ConfigsReader.getPropValue("ApprovalCompVal"));
				Logout.signOutPage();
			}

			else {
				test.info("No of Approvals:0, So not executed");
			}
			// TOPIC Registration Re-initiation Approve
			// --------------------------------------------
			if (numberOfApprovalReq > 0) {

				for (int i = 1; i <= numberOfApprovalReq; i++) {
					login.loginToApplication(ConfigsReader.getPropValue("AprvID" + i),
							ConfigsReader.getPropValue("AprvPWD" + i));
					login.selectPlant1();
					InitiateTopic.topicReinitApproval(Menuname, ReinitTopic, TopicUniqueCode, Description, ModDocument,
							ConfigsReader.getPropValue("AprvPWD"), ReInitActionVal,
							ConfigsReader.getPropValue("ReInitActionByVal"), AppActionVal,
							ConfigsReader.getPropValue("AppActionByVal"), AppRemarks, ModReinitRemarks,
							ConfigsReader.getPropValue("ApprovalReqVal"), ConfigsReader.getPropValue("ApprovalCompVal"),
							ConfigsReader.getPropValue("Approvalcompleted"));
					Logout.signOutPage();
				}

			}
			}
			
			*/

			
		
