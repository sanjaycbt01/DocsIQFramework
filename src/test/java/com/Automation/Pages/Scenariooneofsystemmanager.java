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

public class Scenariooneofsystemmanager extends ActionEngine{
	
	Properties prop;
	
	
	public static String EMPlevelepic = "";  
	public static String EMProleepic = "";
	public static String EMPtextofstandre = "";
	public static String EMPusergroup = "";
	
	
	public static String getEMPlevelepic() {
		return EMPlevelepic;
		}

	public static void setEMPlevelepic(String epiclevel) {
		EMPlevelepic = epiclevel;
	}
	
	
	public static String getEMProleepic() {
		return EMProleepic;
		}

	public static void setEMProleepic(String epicrole) {
		EMProleepic = epicrole;
	}
	
	
	public static String getEMPtextofstandre() {
		return EMPtextofstandre;
		}

	public static void setEMPtextofstandre(String textofstan) {
		EMPtextofstandre = textofstan;
	}
	
	
	public static String getEMPusergroup() {
		return EMPusergroup;
		}

	public static void setEMPusergroup(String epicusergro) {
		EMPusergroup = epicusergro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	@FindBy(id = "RoleRegistration_RoleRegistrationCode")
	WebElement level;
	
	@FindBy(id = "RoleRegistration_RoleRegistrationDesc")
	WebElement roleTxtbox;
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement Category;
	
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement Technical;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement CatSearchField;
	
	@FindBy(xpath = "//ul[@id='select2-RoleRegistration_CategoryId-results']")
	WebElement Categoryoption;
	
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_CategoryId-results']/li[1]")
	WebElement Catoption;
	
	
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
	
	
	
	
	//-------------------------------------------------------------switchtoscreen
	
	
	
	
   @FindBy(id = "DMS_System Manager_Admin & Security_MENU0152_MENU0084")
	WebElement setglobalprofilemenu;
	
	//=====================================================================
	
	@FindBy(xpath = "//span[text()='Technical']")
	WebElement GCategory ;	
	
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']") //id="select2-RoleRegistration_CategoryId-result-qqyw-1"
	WebElement GTechnical;
	
	
	@FindBy(xpath = "//span[@id='select2-GlobalProfile_RoleId-container']")
	
	
	WebElement Role;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	
	WebElement RoleSearchField;
	
	@FindBy(xpath = "//ul[@id='select2-GlobalProfile_RoleId-results']/li[1]")
	
	WebElement RoleSearchoption;
	
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[0].CheckAll']")
	WebElement  DMmastersCheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[1].CheckAll']")
	WebElement  DMTransactionscheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[2].CheckAll']")
	WebElement DMmodifycheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[3].CheckAll']")
	WebElement DMStatuschangecheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[4].CheckAll']")
	WebElement  DMApporvalCheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[5].CheckAll']")
	WebElement  DMReinitiatecheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[6].CheckAll']")
	WebElement DMAudittrailcheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[0].SMDList[7].CheckAll']")
	WebElement DMReportscheckbox ;
	
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[0].CheckAll']")
	WebElement CONinitiatecheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[1].CheckAll']")
	
	WebElement  CONmodifycheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[2].CheckAll']")
	WebElement CONstatuschangecheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[3].CheckAll']")
	
	WebElement  CONapporvalcheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[4].CheckAll']")
	WebElement CONreinitiatecheckbox ;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[5].CheckAll']")
	
	WebElement  CONtransfercheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[1].SMDList[6].CheckAll']")
	WebElement CONaudittrailcheckbox ;
	
	
	@FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[2].SMDList[0].CheckAll']")
	
	WebElement SMadminandsecuritycheckbox ;
	
     @FindBy(xpath = "//input[@type='checkbox'][@name='GlobalProfile.MDList[2].SMDList[1].CheckAll']")
	
	WebElement SMconfigurtioncheckbox ;
     
     
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
	
	
	
	
	//This initElements method will create all WebElements
	
			public Scenariooneofsystemmanager() {
				PageFactory.initElements(driver, this);
				
			}
		
	public void scenariooneofsysman(String Emplevelepicnew,String Emproleepicnew, String numofrec, String Rolevalepicnew, String textofstandreasons, String uniqueidofusergroup,String usergroupdescription,String Searchofavailableusers,String Search2,
				String Search3,String Usergroserbox,String remarksusgrst,String Usergroserbox1,String remarksusgrst1, String Searchofuserlasfiled,String eSign)
		{
			
			
			
			String s = "";
			String randomval = "";
			
				prop = ConfigsReader.readProperties("./configs/configuration.properties");
				if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
		
					s = TextUtils.randomvalue(3);
					randomval = Integer.toString(TextUtils.randomNumber(1));

				
				} 
		
		setEMPlevelepic(EMPlevelepic =randomval);
		setEMProleepic(EMProleepic =  Emproleepicnew+s);
		setEMPtextofstandre(EMPtextofstandre =  textofstandreasons+s);
		setEMPusergroup(EMPusergroup =  uniqueidofusergroup+s);
	
			waitForPageToLoad(2000);
			
			click(xbutton, "Xbutton menu");
			
			
			
			//TimeUtil.shortWait();
			
			//switchToBodyFrame(driver);
			
			//click(planbutton, "Xbutton menu");
			
			
			//click(xbutton, "Xbutton menu");
			
			
  click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Initiatemenu, "Initiate menu");
			
			click(Registorrolemenu, "Registor role menu");
			
			
			switchToBodyFrame(driver);
			
			
//			click(level, "EmpLevel Txtfield");
	     	//sendText(level, EMPlevelepic, "EmpLevel Txtfield");
	     	sendText(level, Emplevelepicnew, "EmpLevel Txtfield");
	     	
//	        click(Role, "Emprole Txtfield");
			sendText(roleTxtbox, EMProleepic, "Emprole Txtfield");
			
			click(Category, "Empcategory TxtBx");
			
			sendText(CatSearchField, "Technical","Empcategory TxtBx");
			
			
			
			click(Categoryoption, "Empcategory TxtBx");
			
			click(subbutton, "reg role submitbutton");
			
			E_sign.e_Sign(eSign); 
			
		
			 TimeUtil.shortWait();
			
			
			click(nextbtn, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			//-------------------------------------------------------------------------
			
			TimeUtil.shortWait(); 
			
               click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Audittrailmenu, "Audit trail menu");
			
			jsClick(Rolemenuinaudittrail, "Rolemenu in audittrail menu");
			
			
			switchToBodyFrame(driver);
			
			
			click(mainfilterofaudittrail, "mainfilterofaudittrail");
			
			//TimeUtil.shortWait(); 
			 
			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
			 
			 click(applybtnofaudittrail, "apply btn of audittrail");
			 
			 
			 TimeUtil.shortWait();  
			 
			
			 
			// sendText(usergroserbox, EMPlevelepic, "user group searchbox Txtfield Txtfield");
			 sendText(usergroserbox,  EMProleepic, "user group searchbox Txtfield Txtfield");
			 
			  click(Searchsybol, "Search sybol");
	     
	       TimeUtil.shortWait(); 
			 
			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
			 
			 TimeUtil.shortWait();
			 
			 driver.switchTo().frame(0);
			 
			 click(cancelbuttonofaudittrail, "cancelbutton of audittrail");
			 
			// TimeUtil.shortWait();
			 
			 switchToDefaultContent(driver);
	//------------------------------------------------------------		 
			 
			 
			TimeUtil.shortWait(); 
			
			 click(Documentmanagericon, "Document manager icon tab");
				
				click(Systemmagermenu, "System mager menu");
				
				click(Adminsecuritymenu, "Admin security menu");
				
				click(Initiatemenu, "Initiate menu");
				
				click(setglobalprofilemenu, "set globalprofile menu");
			
				switchToBodyFrame(driver);
				
				click(Category, "Empcategory TxtBx");
				
				sendText(CatSearchField, "Technical","Empcategory TxtBx");
				
				click(Catoption, "Empcategory TxtBx");
				
				
				
				
				
				click(Role, "Role Field");
				
				sendText(RoleSearchField, EMProleepic, "RoleSearchField txt");
				
				click(RoleSearchoption, "Role Searchoption");
				
				
				
		        click(DMmastersCheckbox, "Documentmanagern masters Checkbox");
		        
		        click(DMTransactionscheckbox, "Documentmanager Transactions checkbox");
		        
		        click(DMmodifycheckbox, "Documentmanager modify checkbox");
		        
		        click(DMStatuschangecheckbox, "Documentmanager statuschange checkbox");
		        
		        click(DMApporvalCheckbox, "Documentmanager Apporval Checkbox");
		        
                click(DMReinitiatecheckbox, "Documentmanager Reinitiate checkbox");
                
                click(DMAudittrailcheckbox, "Document manager Audittrail checkbox");
                
                click(DMReportscheckbox, "Documentmanager Reports checkbox");
		        
		        click(CONinitiatecheckbox, "CONfiguration initiate checkbox");
		        
		        click(CONmodifycheckbox, "CONfiguration modify checkbox");
		        
		        click(CONstatuschangecheckbox, "CONfiguration statuschange checkbox");
		        
		        click(CONapporvalcheckbox, "CONfiguration apporval checkbox");
		        
		        click(CONreinitiatecheckbox, "CONfiguration reinitiate checkbox");
		        
		        click(CONtransfercheckbox, "CONfiguration transfer checkbox");
		        
		        click(CONaudittrailcheckbox, "CONfiguration audittrail checkbox");
		        
		        click(SMadminandsecuritycheckbox, "System manager adminandsecurity checkbox");
		        
                click(SMconfigurtioncheckbox, "System manager configurtion checkbox");
		        
                click(subbutton, "Set Global profile submit button");
                
                E_sign.e_Sign(eSign);
        		
        		
        		 TimeUtil.shortWait();
        		
        		
        		click(nextbtn, "Done button");
        		
        		TimeUtil.shortWait();
        		
        		switchToDefaultContent(driver);
        		
        		
        		TimeUtil.shortWait(); 
    			
                click(Documentmanagericon, "Document manager icon tab");
 			
 			click(Systemmagermenu, "System mager menu");
 			
 			click(Adminsecuritymenu, "Admin security menu");
 			
 			click(Audittrailmenu, "Audit trail menu");
 			
 			jsClick(audittrailglbpromenu, "audittrail glbprofile menu");
 			
 			
 			switchToBodyFrame(driver);
 			
 			
 			click(mainfilterofaudittrail, "mainfilterofaudittrail");
 			
 			//TimeUtil.shortWait(); 
 			 
 			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
 			 
 			 click(applybtnofaudittrail, "apply btn of audittrail");
 			 
 			 
 			 TimeUtil.shortWait();  
 			 
 			 sendText(usergroserbox, EMProleepic, "user group searchbox Txtfield Txtfield");
 			 
 			  click(Searchsybol, "Search sybol");
 	     
 	       TimeUtil.shortWait(); 
 			 
 			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
 			 
 			 TimeUtil.shortWait();
 			 
 			 driver.switchTo().frame(0);
 			 
 			 click(cancelbuttonofaudittrail, "cancelbutton of audittrail");
 			 
 			// TimeUtil.shortWait();
 			 
 			 switchToDefaultContent(driver);
		        
		        
        		TimeUtil.shortWait();
        		
        	    
    			
               click(Documentmanagericon, "Document manager icon tab");
    			
    			click(Systemmagermenu, "System mager menu");
    			
    			click(Adminsecuritymenu, "Admin security menu");
    			
    			click(Initiatemenu, "Initiate menu");
    			
    			click(Registerstandardreason, "Registor Standard reasons menu");
    			
    			
    			switchToBodyFrame(driver);
    			
    			
//    			
    	     	sendText(textofstandardreasons,EMPtextofstandre , "textbox of standard reasons");
    	     	
//    	        
    			
    			
    			click(subbutton, "Standard reasons submitbutton");
    			
    			E_sign.e_Sign(eSign);
    			
    			
    			TimeUtil.shortWait();
    			
    			
    			click(nextbtn, "Done button");
    			
    			TimeUtil.shortWait();
    			
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
 			 
 			sendText(usergroserbox,EMPtextofstandre , "user group searchbox Txtfield Txtfield");
 			 
 			  click(Searchsybol, "Search sybol");
 	     
 	       TimeUtil.shortWait(); 
 			 
 			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
 			 
 			 TimeUtil.shortWait();
 			 
 			 driver.switchTo().frame(0);
 			 
 			 click(cancelbuttonofaudittrail, "cancelbutton of audittrail");
 			 
 			// TimeUtil.shortWait();
 			 
 			 switchToDefaultContent(driver);
    			
    			TimeUtil.shortWait(); 
    			
    			
    			
    			 click(Documentmanagericon, "Document manager icon tab");
    				
    				click(Systemmagermenu, "System mager menu");
    				
    				click(Adminsecuritymenu, "Admin security menu");
    				
    				click(Initiatemenu, "Initiate menu");
    				
    				click(Registorusergroup, "registor user group menu");
    				
    				
    				switchToBodyFrame(driver);
    				
    				
    				sendText(Uniqueidofusergroup,EMPusergroup ,"Unique id of usergroup");
    				
    				sendText(Usergroupdescription,EMPusergroup ,"User group description");
    			//----------	
    				click(searchofavailableusers, "search of available users");
    				
    				sendText(searchofavailableusers,Searchofavailableusers ,"searchofavailableusers");
    				
    				click(clickrightarrowbtn, "click right arrow btn");
    				
    				
                    click(searchofavailableusers, "search of available users");
    				
    				sendText(searchofavailableusers,Search2,"searchofavailableusers");
    				
    				click(clickrightarrowbtn, "click right arrow btn");
    				
    				
    				 click(searchofavailableusers, "search of available users");
     				
     				sendText(searchofavailableusers,Search3,"searchofavailableusers");
     				
     				click(clickrightarrowbtn, "click right arrow btn");
    				
    				
    				
    				
                   
                    click(subbutton, "user group submit button");
                    
                   // E_sign.e_Sign(eSign);
            		
            		
            		 TimeUtil.shortWait();
            		
            		
            		click(nextbtn, "Done button");
            		
            	TimeUtil.shortWait();
            		
            		switchToDefaultContent(driver);
            		
            		
            		
            		TimeUtil.shortWait(); 
        			
                    click(Documentmanagericon, "Document manager icon tab");
     			
     			click(Systemmagermenu, "System mager menu");
     			
     			click(Adminsecuritymenu, "Admin security menu");
     			
     			click(Audittrailmenu, "Audit trail menu");
     			
     			jsClick(UserGroupaudittrail, "UserGroup audittrail menu");
     			
     			
     			switchToBodyFrame(driver);
     			
     			
     			click(mainfilterofaudittrail, "mainfilterofaudittrail");
     			
     			//TimeUtil.shortWait(); 
     			 
     			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
     			 
     			 click(applybtnofaudittrail, "apply btn of audittrail");
     			 
     			 
     			 TimeUtil.shortWait();  
     			 
     			 sendText(usergroserbox,EMPusergroup, "user group searchbox Txtfield Txtfield");
     			 
     			  click(Searchsybol, "Search sybol");
     	     
     	       TimeUtil.shortWait(); 
     			 
     			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
     			 
     			 TimeUtil.shortWait();
     			 
     			 driver.switchTo().frame(0);
     			 
     			 click(cancelbuttonofaudittrail, "cancelbutton of audittrail");
     			 
     			// TimeUtil.shortWait();
     			 
     			 switchToDefaultContent(driver);
    		        
    		        
            		//TimeUtil.shortWait();
            		
            		
            		//TimeUtil.shortWait();
        			
        			//switchToBodyFrame(driver);
        			
        		//	click(planbutton, "Xbutton menu");
        			
        		//	click(xbutton, "Xbutton menu");
        			
        		/*	
        			
                   click(Documentmanagericon, "Document manager icon tab");
        			
        			click(Systemmagermenu, "System mager menu");
        			
        			click(Adminsecuritymenu, "Admin security menu");
        			
        			click(Initiatemenu, "Initiate menu");
        			
        			click(Statuschangeusergroup, "Status change usergroup menu");
        			
        			
        			switchToBodyFrame(driver);
        			
        			TimeUtil.shortWait();
        			
        		//	click(usergroserbox, "user group searchbox Txtfield");
        	     	sendText(usergroserbox, Usergroserbox, "user group searchbox Txtfield Txtfield");
        	     	
       	            click(Searchsybol, "Search sybol");
       	            
       	         //TimeUtil.shortWait();
       	         
       	      switchToDefaultContent(driver);
       	      
       	  TimeUtil.shortWait();
       	      
       	   switchToBodyFrame(driver);
       	      
        		click(clickonselectedelem, "click on selected element");
        			
        			TimeUtil.shortWait();
        			
                    sendText(Remarksofusergroupstatuscha,remarksusgrst ,"Remarks of usergroup statuschange");
        			
        			click(subbutton, "active submitbutton");
        			
        			E_sign.e_Sign(eSign);
        			
        			
        			 TimeUtil.shortWait();
        			
        			
        			click(nextbtn, "Done button");
        			
        			click(inactivegroupmenu, "inactivegroupmenu");
        			
        			click(usergroserbox, "user group searchbox Txtfield");
        			
        	     	sendText(usergroserbox, Usergroserbox, "user group searchbox Txtfield Txtfield");
        	     	
       	            click(Searchsybol, "Search sybol");
        			
        			
        			
        			
                    click(clickonselectedelem, "click on selected element");
        			
                    sendText(Remarksofusergroupstatuscha,remarksusgrst ,"Remarks of usergroup statuschange");
        			
        			click(subbutton, "inactive submitbutton");
        			
        			E_sign.e_Sign(eSign);
        			
        			
        			 TimeUtil.shortWait();
        			
        			
        			click(nextbtn, "Done button");
        			
        		switchToDefaultContent(driver);
        			
        			TimeUtil.shortWait(); 
        			
        			
        			
        			 click(Documentmanagericon, "Document manager icon tab");
        				
        				click(Systemmagermenu, "System mager menu");
        				
        				click(Adminsecuritymenu, "Admin security menu");
        				
        				click(Initiatemenu, "Initiate menu");
        				
        				click(standardreasonsstatuschangemenu, "standard reasons statuschange menu");
        				
        				
        				switchToBodyFrame(driver);
        				
        				click(usergroserbox, "user group searchbox Txtfield");
            	     	sendText(usergroserbox, Usergroserbox1, "user group searchbox Txtfield Txtfield");
            	     	
           	            click(Searchsybol, "Search sybol");
            			
            			click(clickonselectedelem, "click on selected element");
            			
                        sendText(Remarksofusergroupstatuscha,remarksusgrst1 ,"Remarks of usergroup statuschange");
            			
            			click(subbutton, "active submitbutton");
            			
            			E_sign.e_Sign(eSign);
            			
            			
            			 TimeUtil.shortWait();
            			
            			
            			click(nextbtn, "Done button");
            			
            			click(inactivegroupmenu, "inactivegroupmenu");
            			
            			click(usergroserbox, "user group searchbox Txtfield");
            			
            	     	sendText(usergroserbox, Usergroserbox1, "user group searchbox Txtfield Txtfield");
            	     	
           	            click(Searchsybol, "Search sybol");
            			
            			
                        click(clickonselectedelem, "click on selected element");
            			
                        sendText(Remarksofusergroupstatuscha,remarksusgrst1 ,"Remarks of usergroup statuschange");
            			
            			click(subbutton, "inactive submitbutton");
            			
            			E_sign.e_Sign(eSign);
            			
            			
            			 TimeUtil.shortWait();
            			
            			
            			click(nextbtn, "Done button");
            			
            		switchToDefaultContent(driver);
            			
            			TimeUtil.shortWait(); 
            			
            			
            		*/
     		               	TimeUtil.shortWait();
            			
           	
            			 click(Documentmanagericon, "Document manager icon tab");
            				
            				click(Systemmagermenu, "System mager menu");
            				
            				click(Adminsecuritymenu, "Admin security menu");
            				
            				click(Initiatemenu, "Initiate menu");
            				
            				click(Usergropmappingmenu, "Usergroup mapping menu");
            				
            				switchToBodyFrame(driver);
                			
                			TimeUtil.shortWait();
                			
                			
                			
                			
            				
        
           sendText(searchofuserlasfiled, Searchofuserlasfiled,"searchofuser filed");
           
      //    sendText(searchofuserlasfiled, uniqueidofusergroup,"searchofuser filed");
           
           
           
           click(Searchsybol, "Search sybol");
            
	         //TimeUtil.shortWait();
	         
	      switchToDefaultContent(driver);
	      
	  TimeUtil.shortWait();
	      
	//   switchToBodyFrame(driver);
           
           
           
           switchToBodyFrame(driver);
           
            click(selctuserlastfiled, "selctuser last filed");
            
            click(checkbox, "checkbox filed");
            
            sendText(remarksu, "good","remarksufiled");
            
            click(subbutton, "submitbutton");
            
                             E_sign.e_Sign(eSign);
                		
                		
                		 TimeUtil.shortWait();
                		
                		
                		click(nextbtn, "Done button");
                		
                		TimeUtil.shortWait();
                		
                		switchToDefaultContent(driver);
                		
                		TimeUtil.shortWait(); 
            			
                        click(Documentmanagericon, "Document manager icon tab");
         			
         			click(Systemmagermenu, "System mager menu");
         			
         			click(Adminsecuritymenu, "Admin security menu");
         			
         			click(Audittrailmenu, "Audit trail menu");
         			
         			jsClick(UserGroupMappingaudittrail, "UserGroupMappingaudittrail menu");
         			
         			
         			switchToBodyFrame(driver);
         			
         			
         			click(mainfilterofaudittrail, "mainfilterofaudittrail");
         			
         			//TimeUtil.shortWait(); 
         			 
         			 sendText(numofrecordstoenter, numofrec , "numofrecordstoenter");
         			 
         			 click(applybtnofaudittrail, "apply btn of audittrail");
         			 
         			 
         			 TimeUtil.shortWait();  
         			 
         			 sendText(usergroserbox, Searchofuserlasfiled, "user group searchbox Txtfield Txtfield");
         			 
         			  click(Searchsybol, "Search sybol");
         	     
         	       TimeUtil.shortWait(); 
         			 
         			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
         			 
         			 TimeUtil.shortWait();
         			 
         			 driver.switchTo().frame(0);
         			 
         		//	TimeUtil.shortWait();
         			 
         			 
         			click(Registrationelementofaudtra, "Registration element ofaudittrail"); 
         			 
         			click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
         			 
         			TimeUtil.shortWait();
         			
         		//	switchToDefaultContent(driver);
        			 
         		//	switchToBodyFrame(driver);
         			
         			
         			JavascriptExecutor js = (JavascriptExecutor) driver;
         		//   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         			
         		js.executeScript("arguments[0].scrollIntoView();", ApprovalRequiredValue);
         	
         			 
         			// TimeUtil.shortWait();
         			
         			
         			verifyCaptionContains(ApprovalRequiredValue, "ApprovalRequiredVal");
         			
         			verifyCaptionContains(ApprovalCompletedValue, "ApprovalCompletedVal");
         			
         			//click(close, "Close");
         		//	jsClick(AuditTrails, "AuditTrails Menu");
         			
         			TimeUtil.shortWait();
         			
         			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
         			 
         			 switchToDefaultContent(driver);
                		
                		
                		
        		        
                		
                		//TimeUtil.shortWait();
            			click(logout, "Signout button");
            			TimeUtil.shortWait();
            			
        		        
              		
		}


}
