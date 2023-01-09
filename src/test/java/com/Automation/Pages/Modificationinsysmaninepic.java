package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Modificationinsysmaninepic extends ActionEngine{
	
	//Properties prop;
	
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
 	
 //	@FindBy(xpath = "//td[contains(text(),'rkking3')]")
	//text()[contains(.,'naresh1')]/ancestor::td[1]
 	
 	@FindBy(xpath = "//span[contains(text(),'Technical')]")
	WebElement selctuserlastfiled;
 	
 	
 	
	
	
//	@FindBy(xpath = "//td[contains(text(),'kram.k')]")
	
	@FindBy(xpath = "//td[text()='Technical']")
	WebElement selecttheelement;
	
	@FindBy(id = "SMDChk_9") // SMDChk_9,SMDChk_9
	WebElement checkboxaudtra;
	
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
	
	
	@FindBy(id = "UserProfile_Remarks")
	WebElement mouserproileremarks;
	
	
	@FindBy(id = "cfnMsg_Next")
	WebElement clickondonebtnofuserpr;
	
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtnofepic;
	
	
	
	
	
	
	//This initElements method will create all WebElements
	
			public Modificationinsysmaninepic() {
				PageFactory.initElements(driver, this);
				
			}
		
		public void sysmanadminandsecmodifysubmenus(String Usergroserbox,String Usergroserbox1 , String rmk1,String rmk2,String eSign)
		
		
		{
			
	
			waitForPageToLoad(3000);
			
			click(xbutton, "Xbutton menu");
			
		 click(Documentmanagericon, "Document manager icon tab");
			
			click(Systemmagermenu, "System mager menu");
			
			click(Adminsecuritymenu, "Admin security menu");
			
			click(Modifymenu, "modify menu");
			
			click(modifisetglobalprofile, "modifiy setglobalprofile menu");
			
			
			switchToBodyFrame(driver);
			
			sendText(usergroserbox, Usergroserbox, "user group searchbox Txtfield Txtfield");
	     	
	            click(Searchsybol, "Search sybol");
	            
	            
	            switchToDefaultContent(driver);
	       	      
	         	 // TimeUtil.shortWait();
	         	      
	         	   switchToBodyFrame(driver);
	            
	         //	  TimeUtil.shortWait();
			

			click(selctuserlastfiled, "select the element");
			
			TimeUtil.shortWait();
			
			click(checkboxaudtra, "checkbox audittrail checkbox");
			
		jsClick(modifyrmks, "checkbox audittrail checkbox");
			
			sendText(modifyrmks,rmk1, "modifyrmks of globalprofile");
			
			click(submitbtnofmodifygolpro, "submitbutton of global profile");
			
			E_sign.e_Sign(eSign);
			
			
			 TimeUtil.shortWait();
			
			
			click(clickondonebtnofuserpr, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
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
				
				click(checkboxaudtra, "checkbox audittrail checkbox");
				
				sendText(mouserproileremarks,rmk2, "modifyrmks of userprofile");
				
				click(submitbtnofmodifygolpro, "submitbutton of global profile");
				
				E_sign.e_Sign(eSign);
				
				
				 TimeUtil.shortWait();
				
				
				click(clickondonebtnofuserpr, "Done button");
				
				TimeUtil.shortWait();
				
				switchToDefaultContent(driver);
				
				TimeUtil.shortWait(); 
				
			
			
			 
			TimeUtil.shortWait();
			click(logoutbtnofepic, "Signout button");
			TimeUtil.shortWait();
			
			
			
			
		
			
		//	E_sign.e_Sign(eSign);
			
			
			
		//	switchToDefaultContent(driver);
			
		}

}






