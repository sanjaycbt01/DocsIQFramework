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

public class DocumentTypeRegistration_ReinitiationAndApprovals_AlongwithAudittrails extends  ActionEngine {
	
	
	
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
	
	
	public DocumentTypeRegistration_ReinitiationAndApprovals_AlongwithAudittrails() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));

	}
	
	//epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));

// REGISTRATION_RETURN_REINITIATION_APROVAL_
		// =================================================================================
		@Test(priority = 1, dataProvider = "Documentversionnum", enabled = true)
		public void REG_RET_REIN_APR(String FindtextbtninDT,String recordsbtn,String Documenttypetxtbox, String DescriptiontxtboxinDT,String Searchboxofaudittrail,
				String Searchboxofaudittrail1,String Remarksofreturnorapproval,String Searchboxofreinitiation,String RemarksofreinitionofDTofapprovar,
				String Recordsperpageofapprovalofconfigurationmenu,String Searchofapprovalofconfigurationmenu,String aTsearchiconofapprovalofconfigurationmenu,String Documenttypetxtbox1,String Descriptiontxtboxindocumenttype1,String Documenttypetxtboxsub1, String DescriptiontxtboxinDTsub1,String Searchboxofaudittrailsub1,
				String Searchboxofaudittrail1sub1,String Searchboxofreinitiationsub1,String Searchofapprovalofconfigurationmenusub1,String aTsearchiconofapprovalofconfigurationmenusub1,String Documenttypetxtboxsub2, String DescriptiontxtboxinDTsub2,String Searchboxofaudittrailsub2,
				String Searchboxofaudittrail1sub2,String Searchboxofreinitiationsub2,String Searchofapprovalofconfigurationmenusub2,String aTsearchiconofapprovalofconfigurationmenusub2){

			//this.test = extent.createTest("Scenario 1- Document Type registration, re-initiation and approvals, along with audit trails");
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
		
		@AfterTest
		public void afterTest() {
		extent.flush();
		MyScreenRecorder.stopRecording(); }

				
				
			
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

			
		
