package com.Automation.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
import com.aventstack.extentreports.ExtentReports;

public class DocumentTypeModificationInitiation_Return_ReInitiation_Approved_AlongWithAudittrails   extends  ActionEngine {
	
	
	
	WebDriver driver;
	ExtentReports extentReport;
	int numberOfApprovalReq = 1;
	int returnDropAt = 1;

	String ExcelPath = "./TestData/Document Version number.xlsx";

	
	@DataProvider(name = "Documentversionnum2")
	public Object[][] getDocumentversionnum2() {
		Object getDocumentversionnum2[][] = Excelutil.getTestData(ExcelPath, "Scenario2");
		return getDocumentversionnum2;
	}
	
	
	public DocumentTypeModificationInitiation_Return_ReInitiation_Approved_AlongWithAudittrails() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentversionnum2", enabled = true)
		public void REG_RET_REIN_APR_Modification(String recordsbtn1,String Mainpagesearchtxtbox, String Modificationremarks,String Mainpagesearchtxtbox1,
				String Mainpagesearchtxtboxsub1,String Mainpagesearchtxtbox1sub1,String Mainpagesearchtxtboxsub2,String Mainpagesearchtxtbox1sub2){
			
			//this.test = extent.createTest("Scenario 2- Document Type Modification initiation , Return, Re-initiation, Approved along with audit trails.");
			

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
				
				
			
		//	}
			
	//	}
		
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

			