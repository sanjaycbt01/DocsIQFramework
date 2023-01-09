package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Scenariotwoofsystemmanager extends ActionEngine{
	
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
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement Modifymenu;
	
	
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0153_MENU0084")
	WebElement modifisetglobalprofile;
	
	//@FindBy(id = "DMS_System Manager_Admin & Security_MENU0153_MENU0087")
	//WebElement modifisetuserprofile;
	
	
	
	
	//-----------------------------------------------------
	
	
	@FindBy(xpath = "//*[@placeholder='Search This Page']")
	WebElement usergroserbox;
 	
 	@FindBy(xpath = "//*[@class='ft-search']")
	WebElement Searchsybol;
	
	//--------------
 	
 	
 	 	
// 		@FindBy(xpath = "//td[contains(text(),'rkking3')]")
 		//text()[contains(.,'naresh1')]/ancestor::td[1]
 	 	
 	 	@FindBy(xpath = "//span[contains(text(),'Technical')]")
 		WebElement selctuserlastfiled;
 	 	
 	 	
 	 	
 		
 		
// 		@FindBy(xpath = "//td[contains(text(),'kram.k')]")
 		
 		@FindBy(xpath = "//td[text()='Technical']")
 		WebElement selecttheelement;
 		
 	 	
 		
 		
// 		@FindBy(xpath = "//td[contains(text(),'kram.k')]")
 		
	@FindBy(id = "SMDChk_32")
	WebElement checkboxmasters;
	
	@FindBy(id = "SMDChk_29")
	WebElement checkboxtransactions;
	
	@FindBy(id = "SMDChk_12")
	WebElement checkboxmodify;
	
	@FindBy(id = "SMDChk_33")
	WebElement checkboxstatuschange;
	
	@FindBy(id = "SMDChk_14")
	WebElement checkboxapproval;
	
	@FindBy(id = "SMDChk_15")
	WebElement checkboxreinitiate;
	
	@FindBy(id = "SMDChk_31")
	WebElement checkboxaudittrail;
	
	@FindBy(id = "SMDChk_30")
	WebElement checkboxreports;
	
	
	@FindBy(id = "GlobalProfile_Remarks")
	WebElement modifyrmks;
	
//	@FindBy(id = "SMDChk_31") // SMDChk_9,SMDChk_9
	//WebElement checkboxaudtra;
	
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtnofmodifygolpro;
	
	//--------------------
	
	@FindBy(id = "DMS_System Manager_Admin & Security_MENU0153_MENU0087")
	WebElement modifisetuserprofile;
	
	
	//-------------------------------------------
	
	
	
	@FindBy(xpath = "//td[contains(text(),'kram.k')]")
	WebElement mousergroselecbtn;
	
	@FindBy(id = "SMDChk_3")//SMDChk_32
	WebElement checkboxcoinitiate;
	
	@FindBy(id = "SMDChk_4")
	WebElement checkboxconmodify;
	
	@FindBy(id = "SMDChk_5")
	WebElement checkboxconstatuschan;
	
	@FindBy(id = "SMDChk_6")
	WebElement checkboxconapproval;
	
	@FindBy(id = "SMDChk_7")
	WebElement checkboxconreinitiate;
	
	@FindBy(id = "SMDChk_8")
	WebElement checkboxcontransfer;
	
	@FindBy(id = "SMDChk_9")
	WebElement checkboxconaudittrail;
	
	
	
	
	
	@FindBy(id = "UserProfile_Remarks")
	WebElement mouserproileremarks;
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement clickondonebtnofuserpr;
	
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtnofepic;
	
	
	
	@FindBy(linkText = "Global Profile")
    WebElement audittrailglbpromenu;
	
	@FindBy(linkText = "User Profile")
    WebElement audittrailuserpromenu;
	
	
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]")
	WebElement Registrationelementofaudtra;
	
	
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement Proceedbtnofaudittra;

	
	@FindBy(xpath = "//div[@class='approve-status']/span[1]/span[1]")
	WebElement ApprovalRequiredValue;
	
	@FindBy(xpath = "//div[@class='approve-status']/span[2]/span[1]")
	WebElement ApprovalCompletedValue;
	
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
	
	@FindBy(xpath = "//span[contains(text(),'Revision No.:0')]")
	WebElement audittrailrev0;
	
	@FindBy(xpath = "//span[contains(text(),'Revision No.:1')]")
	WebElement audittrailrev1;
	
	@FindBy(xpath = "//div[contains(text(),'Configuration')]")
	WebElement configinuserpro;
	
	@FindBy(xpath = "//div[contains(text(),'DocumentManager')]")
	WebElement documaninglopro;
	
	@FindBy(xpath = "//div[contains(text(),'Masters')]")
	WebElement mastersglopro;
	
	
	
	


	
	//This initElement0 method will create all WebElements
	
			public Scenariotwoofsystemmanager() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void scenariotwoofsystemmanagermodify(String Usergroserbox,String Usergroserbox1 , String rmk1,String rmk2,String eSign)
		
		
		{
			String globalprofilerole = Scenariooneofsystemmanager.getEMProleepic();
			waitForPageToLoad(3000);
			click(xbutton, "Xbutton menu");	
	        click(Documentmanagericon, "Document manager icon tab");
			click(Systemmagermenu, "System mager menu");
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Modifymenu, "modify menu");
			
			click(modifisetglobalprofile, "modifiy setglobalprofile menu");
			
			
			switchToBodyFrame(driver);
			
			sendText(usergroserbox, globalprofilerole, "user group searchbox Txtfield Txtfield");
	     	
	            click(Searchsybol, "Search sybol");
	            
	            
	            switchToDefaultContent(driver);
	       	      
	         	 // TimeUtil.shortWait();
	         	      
	         	   switchToBodyFrame(driver);
	            
	         //	  TimeUtil.shortWait();
			

			click(selctuserlastfiled, "select the element");
			
			TimeUtil.shortWait();
			
			
			
			click(checkboxmasters, "checkbox masters checkbox");
			
			click(checkboxtransactions, "checkbox transactions checkbox");
			
			click(checkboxmodify, "checkbox modify checkbox");
			
			click(checkboxstatuschange, "checkbox statuschange checkbox");
			
			click(checkboxapproval, "checkbox approval checkbox");
			
			click(checkboxreinitiate, "checkbox reinitiate checkbox");
			
			click(checkboxaudittrail, "checkbox audittrail checkbox");
			
			click(checkboxreports, "checkbox reports checkbox");
			
			
			
		jsClick(modifyrmks, "checkbox audittrail checkbox");
			
			sendText(modifyrmks,rmk1, "modifyrmks of globalprofile");
			
			click(submitbtnofmodifygolpro, "submitbutton of global profile");
			
			E_sign.e_Sign(eSign);
			
			
			 TimeUtil.shortWait();
			
			
			click(clickondonebtnofuserpr, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
//-------------------------------------------------------------------------
			
			TimeUtil.shortWait(); 
			
               click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Audittrailmenu, "Audit trail menu");
			
			jsClick(audittrailglbpromenu, "audit trail glbpro menu");
			
			
			switchToBodyFrame(driver);
			
			
			click(mainfilterofaudittrail, "mainfilterofaudittrail");
			
			//TimeUtil.shortWait(); 
			 
			 sendText(numofrecordstoenter, "250" , "num of records to enter");
			 
			 click(applybtnofaudittrail, "apply btn of audittrail");
			 
			 
			 TimeUtil.shortWait();  
			 
			
			 
			// sendText(usergroserbox, EMPlevelepic, "user group searchbox Txtfield Txtfield");
			 sendText(usergroserbox,  globalprofilerole, "user group searchbox Txtfield Txtfield");
			 
			  click(Searchsybol, "Search sybol");
	     
	       TimeUtil.shortWait(); 
			 
			 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
			 
			 TimeUtil.shortWait();
			 
			 driver.switchTo().frame(0);
			 
			// click(audittrailrev0, "audittrail rev0");
			 
			 click(audittrailrev1, "audittrail rev0");
			 
			 
			 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
 			 
  			TimeUtil.shortWait();
  			
  		//	switchToDefaultContent(driver);
 			 
  		//	switchToBodyFrame(driver);
  			
  			
  			JavascriptExecutor js = (JavascriptExecutor) driver;
  		//   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  			
  		js.executeScript("arguments[0].scrollIntoView();", mastersglopro);
  	
  			 
  			// TimeUtil.shortWait();
  		
  		
  		verifyCaptionContains(mastersglopro, "masters glopro in gloproVal");
  		
  		TimeUtil.shortWait();
  		
  		
  		js.executeScript("arguments[0].scrollIntoView();", ApprovalRequiredValue);
  		
  			
  			
  			verifyCaptionContains(ApprovalRequiredValue, "ApprovalRequiredVal");
  			
  			verifyCaptionContains(ApprovalCompletedValue, "ApprovalCompletedVal");
  			
  		
  			
  			
  			
  			
  			
  			TimeUtil.shortWait();
  			
  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
  			 
  			 switchToDefaultContent(driver);
         		
			 
			 
			 
			 
			 
			 
			
	//------------------------------------------------------------		 
			
			
			TimeUtil.shortWait(); 
			
			
			
			 click(Documentmanagericon, "Document manager icon tab");
				
				click(Systemmagermenu, "System mager menu");
				
				click(Adminsecuritymenu, "Admin security menu");
				
				click(Modifymenu, "modify menu");
				
				click(modifisetuserprofile, "modifiy setuserprofile menu");
				
				
				switchToBodyFrame(driver);
				
				sendText(usergroserbox, Usergroserbox1, "user group searchbox Txtfield Txtfield");
		     	
		            click(Searchsybol, "Search sybol");
		            
		            switchToDefaultContent(driver);
		       	      
		         	  TimeUtil.shortWait();
		         	      
		         	   switchToBodyFrame(driver);
		            
		         	  TimeUtil.shortWait();
				

				click(selecttheelement, "select the element");
				
				
				
				click(checkboxcoinitiate, "checkbox config initiate");
				
				click(checkboxconmodify, "checkbox conmodify ");
				
				click(checkboxconstatuschan, "checkbox config statuschan checkbox");
				
				click(checkboxconapproval, "checkbox config approval checkbox");
				
				click(checkboxconreinitiate, "checkbox config reinitiate checkbox");
				
				click(checkboxcontransfer, "checkbox config transfer checkbox");
				
				click(checkboxconaudittrail, "checkbox config audittrail checkbox");
				
				
				
				
				
				
				
				sendText(mouserproileremarks,rmk2, "modifyrmks of userprofile");
				
				click(submitbtnofmodifygolpro, "submitbutton of global profile");
				
				E_sign.e_Sign(eSign);
				
				
				 TimeUtil.shortWait();
				
				
				click(clickondonebtnofuserpr, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				
				//-------------------------------------------------------------------------
				
				TimeUtil.shortWait(); 
				
	               click(Documentmanagericon, "Document manager icon tab");
				
				click(Systemmagermenu, "System mager menu");
				
				click(Adminsecuritymenu, "Admin security menu");
				
				click(Audittrailmenu, "Audit trail menu");
				
				jsClick(audittrailuserpromenu, "Rolemenu in audittrail menu");
				
				
				switchToBodyFrame(driver);
				
				
				click(mainfilterofaudittrail, "mainfilterofaudittrail");
				
				//TimeUtil.shortWait(); 
				 
				 sendText(numofrecordstoenter, "250" , "numofrecordstoenter");
				 
				 click(applybtnofaudittrail, "apply btn of audittrail");
				 
				 
				 TimeUtil.shortWait();  
				 
				
				 
				// sendText(usergroserbox, EMPlevelepic, "user group searchbox Txtfield Txtfield");
				 sendText(usergroserbox,  Usergroserbox1, "user group searchbox Txtfield Txtfield");
				 
				  click(Searchsybol, "Search sybol");
		     
		       TimeUtil.shortWait(); 
				 
				 click(clikonsearchedeleinaudittrail, "click on searched ele in audittrail");
				 
				 TimeUtil.shortWait();
				 
				 driver.switchTo().frame(0);
				 
				 click(audittrailrev1, "audittrail rev0");
				 
				// click(audittrailrev0, "audittrail rev0");
				 
			//	 click(audittrailrev1, "audittrail rev0");
				 
				 
				 click(Proceedbtnofaudittra, "Proceedbtn of audittrail");
	 			 
	  			TimeUtil.shortWait();
	  			
	  		//	switchToDefaultContent(driver);
	 			 
	  		//	switchToBodyFrame(driver);
	  			
	  			
	  			JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  		//   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  			
	  		//js1.executeScript("arguments[0].scrollIntoView();", ApprovalRequiredValue);
	  		
	  		js1.executeScript("arguments[0].scrollIntoView();", configinuserpro);
	  	
	  			 
	  			// TimeUtil.shortWait();
	  		
	  		//jsClick(configinuserpro, "config in userpro");
	  		
	  		
	  		verifyCaptionContains(configinuserpro, "config in userpro");
	  		
	  		//verifyCaptionContains(configinuserpro, "config in userpro");
	  			
	  		TimeUtil.shortWait();	
	  		
	  		
	  		js1.executeScript("arguments[0].scrollIntoView();", ApprovalRequiredValue);
	  		
	  			verifyCaptionContains(ApprovalRequiredValue, "ApprovalRequiredVal");
	  			
	  			verifyCaptionContains(ApprovalCompletedValue, "ApprovalCompletedVal");
	  			
	  		//	documaninglopro
	  		
	  			
	  			
	  			TimeUtil.shortWait();
	  			
	  			jsClick(cancelbuttonofaudittrail, "cancelbutton of audittrail");
	  			 
	  			 switchToDefaultContent(driver);
	         		
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
		//------------------------------------------------------------		 
				
				
				//TimeUtil.shortWait(); 
				
			
			
			 
			TimeUtil.shortWait();
			click(logoutbtnofepic, "Signout button");
			TimeUtil.shortWait();
			
			
			
			
		
			
		//	E_sign.e_Sign(eSign);
			
			
			
		//	switchToDefaultContent(driver);
			
		}

		

}
