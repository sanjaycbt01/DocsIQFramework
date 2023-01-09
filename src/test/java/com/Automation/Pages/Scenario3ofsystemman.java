package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class Scenario3ofsystemman extends ActionEngine{
	
	Properties prop;
	

	//ddlSelectedPlant_2
	
	@FindBy(id = "ddlSelectedPlant_2")
	WebElement planbutton;
	
	
	@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
	WebElement xbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Documentmanagericon;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
	WebElement Systemmagermenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	WebElement Adminsecuritymenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	WebElement Initiatemenu;
	
	
	@FindBy(xpath = "//a[@id='DMS_System Manager_Admin & Security_MENU0152_MENU0069']")
	WebElement Registorrolemenu;
	
	
	//-----------------------------------------------------
	
	
	
	//------------------------------------------------------------------
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	WebElement Audittrailmenu;
	
	@FindBy(linkText = "Role")
	WebElement Rolemenuinaudittrail;
	
	@FindBy(xpath = "//*[@class='ft-filter']")
	WebElement mainfilterofaudittrail ;
	
	
	@FindBy(xpath = "//input[@type='number'][@name='PageSize']")
	WebElement numofrecordstoenter;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applybtnofaudittrail;
	
	
	@FindBy(xpath = "//td[text()='vasu.ki']")
	WebElement clikonsearchedeleinaudittrail;
	
	@FindBy(xpath = "//span[@class='popup-close-button']")
	WebElement cancelbuttonofaudittrail;
	
	
	
	
	
	
	
     @FindBy(id = "btnSubmit_1")
 	WebElement subbutton;
 	
 	@FindBy(id = "cfnMsg_Next") 
 	WebElement nextbtn;
 	
 	
 	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0071")
 	WebElement Registerstandardreason;
 	
 	@FindBy(id = "StandardReasons_StandardReasonsCode")
 	WebElement textofstandardreasons;
 	
 	
 	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0072")
 	WebElement Registorusergroup;
 	
 	//@FindBy(xpath = "")
	//WebElement ;
 	
 	@FindBy(id = "UserGrp_UserGrpCode")
    WebElement Uniqueidofusergroup;
 	
 	@FindBy(id = "UserGrp_UserGrpDesc")
   WebElement Usergroupdescription;
 	
 	@FindBy(xpath = "//input[@type='text'][@name='q']")
	WebElement searchofavailableusers;
 	
 	@FindBy(xpath = "//button[@id='UsrGrp_Left_rightAll']")
	WebElement clickrightarrowbtn;
 	
 	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0089")
    WebElement Statuschangeusergroup;
 	
 	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement usergroserbox;
 	
 	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement Searchsybol;
 	
 	@FindBy(xpath = "//td[text()='vasu.ki']")//td[contains(text(),'120')]//td[contains(text(),'rkk')]
	WebElement clickonselectedelem;
 	
 	@FindBy(id = "Remarks")
	 WebElement Remarksofusergroupstatuscha;

    @FindBy(xpath = "//button[text()='Inactive']")
    WebElement inactivegroupmenu;
	 	
 	
 	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0088")
    WebElement standardreasonsstatuschangemenu;
 	
 	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0095")
    WebElement Usergropmappingmenu;
 		 	
 	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logout;
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement searchofuserlasfiled;
	
	@FindBy(xpath = "//a[contains(text(),'kram')]")
	//text()[contains(.,'naresh1')]/ancestor::td[1]
	WebElement selctuserlastfiled;
	
	
	@FindBy(id = "UserGrpMapWithUser_userGroupLists_28__NewChkSelected")
    WebElement checkbox;
	
	@FindBy(id = "UserGrpMapWithUser_Remarks")
    WebElement remarksu;
	
	@FindBy(linkText = "Global Profile")
    WebElement audittrailglbpromenu;
	
	
	@FindBy(linkText = "Standard Reasons")
    WebElement StandardReasonsAudittrail;
	
	
	@FindBy(linkText = "User Group")
    WebElement UserGroupaudittrail;
	
	
	@FindBy(linkText = "User Group Mapping")
    WebElement UserGroupMappingaudittrail;
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]")
	WebElement Registrationelementofaudtra;
	
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement Proceedbtnofaudittra;

	
	@FindBy(xpath = "//div[@class='approve-status']/span[1]/span[1]")
	WebElement ApprovalRequiredValue;
	
	@FindBy(xpath = "//div[@class='approve-status']/span[2]/span[1]")
	WebElement ApprovalCompletedValue;
	
	@FindBy(xpath = "//div[text()='Status Change']")
	WebElement ugrevision1stachainaudit;
	
	
	
	
	
	
	//This initElements method will create all WebElements
	
			public Scenario3ofsystemman() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void scenariothreeofsysman(String remkofurgstachan,String numofrec,String eSign)
		{
			
			
			
			String s = "";
			String randomval = "";
			
				prop = ConfigsReader.readProperties("./configs/configuration.properties");
				if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
		
					s = TextUtils.randomvalue(3);
					randomval = Integer.toString(TextUtils.randomNumber(1));

				
				} 
				
				
				String stdrestacha = Scenariooneofsystemmanager.getEMPtextofstandre();
				
				String usrgrostacha = Scenariooneofsystemmanager.getEMPusergroup();
				
				
		
		
			waitForPageToLoad(3000);
			
			click(xbutton, "Xbutton menu");
			
			
	          click(Documentmanagericon, "Document manager icon tab");
    			
    			click(Systemmagermenu, "System mager menu");
    			
    			click(Adminsecuritymenu, "Admin security menu");
    			
    			click(Initiatemenu, "Initiate menu");
    			
    			click(Statuschangeusergroup, "Status change usergroup menu");
    			
    			
    			switchToBodyFrame(driver);
    			
    			TimeUtil.shortWait();
    			
    			click(mainfilterofaudittrail, "mainfilterofaudittrail");
     			
     			//TimeUtil.shortWait(); 
     			 
     			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
     			 
     			 click(applybtnofaudittrail, "apply btn of audittrail");
     			 
     			 
     			 TimeUtil.shortWait();  
     			 
    			
    		//	click(usergroserbox, "user group searchbox Txtfield");
    	     	sendText(usergroserbox, usrgrostacha, "user group searchbox Txtfield Txtfield");
    	     	
   	            click(Searchsybol, "Search sybol");
   	            
   	         //TimeUtil.shortWait();
   	         
   	      switchToDefaultContent(driver);
   	      
   	  TimeUtil.shortWait();
   	      
   	   switchToBodyFrame(driver);
   	      
    		click(clickonselectedelem, "click on selected element");
    			
    			TimeUtil.shortWait();
    			
                sendText(Remarksofusergroupstatuscha,remkofurgstachan ,"Remarks of usergroup statuschange");
    			
    			click(subbutton, "active submitbutton");
    			
    			E_sign.e_Sign(eSign);
    			
    			
    			 TimeUtil.shortWait();
    			
    		/*	
    			click(nextbtn, "Done button");
    			
    			click(inactivegroupmenu, "inactivegroupmenu");
    			
    			click(usergroserbox, "user group searchbox Txtfield");
    			
    	     	sendText(usergroserbox, Usergroserbox, "user group searchbox Txtfield Txtfield");
    	     	
   	            click(Searchsybol, "Search sybol");
    			
    			
    			
    			
                click(clickonselectedelem, "click on selected element");
    			
                sendText(Remarksofusergroupstatuscha,remarksusgrst ,"Remarks of usergroup statuschange");
    			
    			click(subbutton, "inactive submitbutton");
    			
    			E_sign.e_Sign(eSign);
    			
    			*/
    			 
    			 TimeUtil.shortWait();
    			
    			
    			click(nextbtn, "Done button");
    			
    			
    		switchToDefaultContent(driver);
    		
    		
    		
    		TimeUtil.shortWait(); 
			
            click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Audittrailmenu, "Audit trail menu");
			
			jsClick(UserGroupaudittrail, "audittrail UserGroupaudittrail menu");
			
			
			switchToBodyFrame(driver);
			
			
			click(mainfilterofaudittrail, "mainfilterofaudittrail");
			
			//TimeUtil.shortWait(); 
			 
			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
			 
			 click(applybtnofaudittrail, "apply btn of audittrail");
			 
			 
			 TimeUtil.shortWait();  
			 
			 sendText(usergroserbox, usrgrostacha, "user group searchbox Txtfield Txtfield");
			 
			  click(Searchsybol, "Search sybol");
	     
	       TimeUtil.shortWait(); 
			 
			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
			 
			 TimeUtil.shortWait();
			 
			 driver.switchTo().frame(0);
			 
		//-------
			 
			 click(ugrevision1stachainaudit, "usergroup revision1 stacha in audittrail");
			 
			 
			 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
 			 
  			TimeUtil.shortWait();
  			
  		  			
  			
  			JavascriptExecutor js = (JavascriptExecutor) driver;
  		//   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  			
  		js.executeScript("arguments[0].scrollIntoView();", ApprovalRequiredValue);
  		
  			
  			
  			verifyCaptionContains(ApprovalRequiredValue, "ApprovalRequiredVal");
  			
  			verifyCaptionContains(ApprovalCompletedValue, "ApprovalCompletedVal");
  			
  		TimeUtil.shortWait();
  			
  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
  			 
  			 switchToDefaultContent(driver);
  			 
  			 
  			 
  			 //-------------
  			 
         		
			  TimeUtil.shortWait(); 
    			
    			
    	         click(Documentmanagericon, "Document manager icon tab");
    				
    				click(Systemmagermenu, "System mager menu");
    				
    				click(Adminsecuritymenu, "Admin security menu");
    				
    				click(Initiatemenu, "Initiate menu");
    				
    				click(standardreasonsstatuschangemenu, "standard reasons statuschange menu");
    				
    				
    				switchToBodyFrame(driver);
    				
    				
    				click(mainfilterofaudittrail, "mainfilte");
    	 			
    	 			//TimeUtil.shortWait(); 
    	 			 
    	 			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
    	 			 
    	 			 click(applybtnofaudittrail, "apply btn of audittrail");
    	 			 
    	 			 
    	 			 TimeUtil.shortWait();  
    	 			 
    				
    				//click(usergroserbox, "user group searchbox Txtfield");
        	     	sendText(usergroserbox, stdrestacha, "user group searchbox Txtfield Txtfield");
        	    	
       	            click(Searchsybol, "Search sybol");
        			
        			click(clickonselectedelem, "click on selected element");
        			
                    sendText(Remarksofusergroupstatuscha,remkofurgstachan ,"Remarks of usergroup statuschange");
        			
        			click(subbutton, "active submitbutton");
        			
        			E_sign.e_Sign(eSign);
        			
        			
        			 TimeUtil.shortWait();
        	/*		
        			
        			click(nextbtn, "Done button");
        			
        			click(inactivegroupmenu, "inactivegroupmenu");
        			
        			click(usergroserbox, "user group searchbox Txtfield");
        			
        	     	sendText(usergroserbox, Usergroserbox1, "user group searchbox Txtfield Txtfield");
        	     	
       	            click(Searchsybol, "Search sybol");
        			
        			
                    click(clickonselectedelem, "click on selected element");
        			
                    sendText(Remarksofusergroupstatuscha,remarksusgrst1 ,"Remarks of usergroup statuschange");
        			
        			click(subbutton, "inactive submitbutton");
        			
        			E_sign.e_Sign(eSign);
        			
        			*/
        			 
        			 
        			 
        			// TimeUtil.shortWait();
        			
        			
        			click(nextbtn, "Done button");
        			
        		switchToDefaultContent(driver);
        			
        			TimeUtil.shortWait(); 
        			
        			 click(Documentmanagericon, "Document manager icon tab");
 			
 			click(Systemmagermenu, "System mager menu");
 			
 			click(Adminsecuritymenu, "Admin security menu");
 			
 			click(Audittrailmenu, "Audit trail menu");
 			
 			jsClick(StandardReasonsAudittrail, "StandardReasonsAudittrail menu");
 			
 			
 			switchToBodyFrame(driver);
 			
 			
 			click(mainfilterofaudittrail, "mainfilterofaudittrail");
 			
 			//TimeUtil.shortWait(); 
 			 
 			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
 			 
 			 click(applybtnofaudittrail, "apply btn of audittrail");
 			 
 			 
 			 TimeUtil.shortWait();  
 			 
 			 sendText(usergroserbox, stdrestacha, "user group searchbox Txtfield Txtfield");
 			 
 			  click(Searchsybol, "Search sybol");
 	     
 	       TimeUtil.shortWait(); 
 			 
 			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
 			 
 			 TimeUtil.shortWait();
 			 
 			 driver.switchTo().frame(0);
 			 
 		//	TimeUtil.shortWait();
 			 
 			 
 			click(ugrevision1stachainaudit, "standard reasons revision1 stacha in audittrail");
 			 
 			click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
 			 
 			TimeUtil.shortWait();
 			
 		verifyCaptionContains(ApprovalRequiredValue, "ApprovalRequiredVal");
 			
 			verifyCaptionContains(ApprovalCompletedValue, "ApprovalCompletedVal");
 			
 		
 			TimeUtil.shortWait();
 			
 			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
 			 
 			 switchToDefaultContent(driver);
        		
        		//TimeUtil.shortWait();
    			click(logout, "Signout button");
    			TimeUtil.shortWait();
    			
		        
      		
}


}



