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

public class Scenario1ofdocumentrunningnumtest   extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Running number.xlsx";

	
	@DataProvider(name = "Documentrunningnum")
	public Object[][] getDocumentrunningnum() {
		Object getDocumentrunningnum[][] = Excelutil.getTestData(ExcelPath, "Scenario1");
		return getDocumentrunningnum;
	}
	
	
	public Scenario1ofdocumentrunningnumtest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentrunningnum", enabled = true)
		public void Newvesiondoctypeflow(String Searchboxofdocprerequest,String documenttitleofdocprereq, String Changecontrolnumtextbox,String Searchboxofdoctype,
				String Searchbtnofotherscreen,String Printreason,String Txtboxofsub1docnew,String Txtboxofsub2docnew,String Txtboxofsub3docnew,String Txtboxofsub4docnew,String Txtboxofsub5docnew) throws AWTException{

			//this.test = extent.createTest("Scenario 1- Document Type registration, re-initiation and approvals, along with audit trails");
			
			
			// Document Registration Initiation
			// -----------------------------
		//	for (int i = 1; i <= 3; i++) {	
			
	
			test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
			.pass("EPIQ PlantSelection");
	
			
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
			epiqplant.epicplant();
			documentrunningnumscena1.Documenttypebasicflow(Searchboxofdocprerequest, documenttitleofdocprereq, Changecontrolnumtextbox);
		
			epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
		epiqplant.epicplant();
		documentrunningnumscena1.Documentprereqapprovar(Searchboxofdoctype);
	
	epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentrunningnumscena1.Documentprereqapprovar1(Searchboxofdoctype, Txtboxofsub1docnew,Txtboxofsub3docnew,Txtboxofsub1docnew,Txtboxofsub4docnew,Txtboxofsub5docnew,ConfigsReader.getPropValue("pwdepic"));
		
   epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
	epiqplant.epicplant();
	documentrunningnumscena1.documentapprovarpreparationstage(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));
    
    
    //-------------------------
    
    
    epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
	epiqplant.epicplant();
	documentrunningnumscena1.Documenttypepublishinitiation(Searchboxofdoctype, Searchbtnofotherscreen, Printreason,ConfigsReader.getPropValue("pwdepic"));

	epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"), ConfigsReader.getPropValue("pwdepic1"));
epiqplant.epicplant();
documentrunningnumscena1.Documentpublishinitiationapproval(Searchboxofdoctype, ConfigsReader.getPropValue("pwdepic1"));
		
epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
epiqplant.epicplant();
documentrunningnumscena1.Documentprintinitiation(Searchboxofdoctype);
	
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

			
		
