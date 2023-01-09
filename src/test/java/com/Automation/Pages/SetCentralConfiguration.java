package com.Automation.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;


public class SetCentralConfiguration extends ActionEngine{
	
		@FindBy(xpath = "//div[@class='menu-toggler sidebar-toggler']")
		WebElement Menu;
		@FindBy(xpath = "//span[@class='title'][contains(text(),'System Manager')]")
		WebElement SystemManagerMenu;
		@FindBy(xpath = "//a[contains(text(),'Admin & Security')]")
		WebElement AdminSecMenu;
		@FindBy(xpath = "//li[contains(@class,'nav-item open')]//a[contains(@class,'nav-link nav-toggle')][contains(text(),'Initiate')]")
		WebElement InitiateMenu;		
		@FindBy(xpath = "//a[@id='DFCNG']")
		WebElement SetcentralConfig;	
		@FindBy(id = "CentralConfiguration_DrTimeLimitRequired")
		WebElement EnableTimeLimitNo;		
		@FindBy(id = "CentralConfiguration_DrTimeLimitRequired")
		WebElement EnableTimeLimitOptional;		
		@FindBy(id = "CentralConfiguration_DrTimeLimitDays")
		WebElement DefaultDays;		
		@FindBy(id = "CentralConfiguration_EffFrmDateOptional")
		WebElement EffectivefromMandatory;	
		@FindBy(id = "CentralConfiguration_EffFrmDateOptional")
		WebElement EffectivefromOptional;	
		@FindBy(id = "CentralConfiguration_NxtRvwDateOptional")
		WebElement NextReviewfromMandatory;	
		@FindBy(id = "CentralConfiguration_NxtRvwDateOptional")
		WebElement NextReviewfromOptional;	
		@FindBy(id = "CentralConfiguration_OJTRequired")
		WebElement OnjobTrainingNo;
		@FindBy(id = "CentralConfiguration_OJTRequired")
		WebElement OnjobTrainingYes;	
		@FindBy(id = "CentralConfiguration_JobRspAccRequired")
		WebElement UserAcceptanceNo;
		@FindBy(id = "CentralConfiguration_JobRspAccRequired")
		WebElement UserAcceptanceYes;		
		@FindBy(id = "CentralConfiguration_JobDepAccRequired")
		WebElement AuthorizedDeputyAcceptanceNo;	
		@FindBy(id = "CentralConfiguration_JobDepAccRequired")
		WebElement AuthorizedDeputyAcceptanceYes;	
		@FindBy(id = "CentralConfiguration_JobDepAccRequired")
		WebElement ActiveDirectoryIntegrationNo;	
		@FindBy(id = "CentralConfiguration_JobDepAccRequired")
		WebElement ActiveDirectoryIntegrationYes;	
		@FindBy(id = "CentralConfiguration_DocReadLimitDays")
		WebElement PermissibleDocumentReadingperday;	
		@FindBy(id = "CentralConfiguration_TimeSpentOnDocumentRequired")
		WebElement TimeSpentOnDocumentReadingyes;	
		@FindBy(id = "CentralConfiguration_TimeSpentOnDocumentRequired")
		WebElement TimeSpentOnDocumentReadingNo;	
		@FindBy(id = "CentralConfiguration_BioMetricRequired")
		WebElement BiometricOptionalNo;	
		@FindBy(id = "CentralConfiguration_BioMetricRequired")
		WebElement BiometricOptionalyes;
		@FindBy(id = "CentralConfiguration_QnpTimeLimitRequired")
		WebElement TargetDateForQPNo;	
		@FindBy(id = "CentralConfiguration_QnpTimeLimitRequired")
		WebElement TargetDateForQPYes;		
		@FindBy(id = "CentralConfiguration_QnpTimeLimitDays")
		WebElement NoOfdaysforRespondQP;	
		@FindBy(id = "CentralConfiguration_RetakeRequired")
		WebElement RetakeExamReqOptional;	
		@FindBy(id = "CentralConfiguration_RetakeRequired")
		WebElement RetakeExamReqNo;	
		@FindBy(id = "CentralConfiguration_RetakeAttempts")
		WebElement TotalNoofAttempts;	
		@FindBy(id = "CentralConfiguration_RetakeReleaseRequired")
		WebElement ReleaseRetakeExamReqYes;	
		@FindBy(id = "CentralConfiguration_RetakeReleaseRequired")
		WebElement ReleaseRetakeExamReqNo;	
		@FindBy(id = "CentralConfiguration_AckByTneRequired")
		WebElement AckBytheTraineeReqNo;
		@FindBy(id = "CentralConfiguration_AckByTneRequired")
		WebElement AckBytheTraineeReqYes;	
		@FindBy(id = "CentralConfiguration_AckByTnePeriod")
		WebElement AckPeriodDays;
		@FindBy(id = "CentralConfiguration_JumblingRequired")
		WebElement JumbledQueReqNo;
		@FindBy(id = "CentralConfiguration_JumblingRequired")
		WebElement JumbledQueReqYes;	
		@FindBy(id = "CentralConfiguration_Remarks")
		WebElement Remarks;
		@FindBy(id = "btnSubmit")
		WebElement Submit;
		
		public SetCentralConfiguration() {
			PageFactory.initElements(driver, this);
		}
		
		public void SetCentral_Config() {

			
			click(Menu, "Menu");
			click( SystemManagerMenu, "System Manager Menu");
			click( AdminSecMenu, "Admin&Security Menu");
			click( InitiateMenu, "Initiate Menu");
			click( SetcentralConfig, "SetcentralConfig Menu");

			

	}
	}


