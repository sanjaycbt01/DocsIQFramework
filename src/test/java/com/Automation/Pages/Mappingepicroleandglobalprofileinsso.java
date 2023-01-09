package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Mappingepicroleandglobalprofileinsso extends ActionEngine{
	
	//Properties prop;
	
	
	
	
	@FindBy(xpath = "//ul[1]/li[3]/a[1]//span[contains(text(),'Identity Manager')]")
	WebElement IdentityManager;
	
	@FindBy(xpath = "//ul[1]/li[3]/ul[@class='sub-menu']/li[1]/a[contains(text(),'Initiate')]")
	WebElement InitiateMenu;
	
	@FindBy(id = "USERASS")
	WebElement UserProduct;
	
	@FindBy(xpath = "//button[@id='btnModal_UserProductsAssignment_User']/span")
	WebElement Additem;
	
	//-------------------------------------------------
	
	@FindBy(id = "UserProductsAssignment_User_FindTxt")
	WebElement FindTxt;
	
	@FindBy(id = "UserProductsAssignment_User_DisplayBtn")
	WebElement Apply;
	
	@FindBy(xpath = "//table[@id='ListTab1']/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement UserRB;
	
	@FindBy(id = "UserProductsAssignment_User_selectBtn")
	WebElement Addbtn;
	
	
	
	@FindBy(xpath = "//div[@class='col-sm-2']/input[@name='UserProductsAssignment.UserProductsList[1].IsChecked']")
	WebElement Selectbtn;
	
	@FindBy(xpath = "//select[@name='UserProductsAssignment.UserProductsList[1].CategoryId']/following::span[1]")
	WebElement Category;
	
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement searchfield;
	
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[1]")
	WebElement Categoryoption;
	
	@FindBy(xpath = "//select[@name='UserProductsAssignment.UserProductsList[1].RoleId']/following::span[1]")
	WebElement Role;
	
	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	WebElement rolesearchfield;
	
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[1]")
/*	 //li[@id='select2-UserProductsList_RoleId_8-result-419i-17']*/
WebElement Roleoption;
	
	@FindBy(xpath = "//button[@id='btnModal_Plant_1']/span")
	WebElement Plantbtn;
	
	@FindBy(id = "Plant_1_FindTxt")
	WebElement Plantfindtxxt;
	
	@FindBy(xpath = "//input[@id='Plant_1_DisplayBtn']")
	WebElement PlantApplybtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/button[1]")
	WebElement PlantADDbtn;
	
	@FindBy(xpath = "//button[@id='Plant_1_selectBtn']")
	WebElement FinalADDbtn;
	
	@FindBy(id = "btnSubmit")
	WebElement Submitbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	
	public Mappingepicroleandglobalprofileinsso() {
		PageFactory.initElements(driver, this);
	}

	
	public void UserProductepic(String userplantnameepic, String Categoryvalepic, String Rolevalepic, String plantvalepic,String userplantnameepic2, String Categoryvalepic2, String Rolevalepic2, String plantvalepic2, String userplantnameepic3, String Categoryvalepic3, String Rolevalepic3, String plantvalepic3, String eSign){
		
		waitForPageToLoad(3000);
		
		//String	userregfirstna = DMS_UserRegistration.getEMPfistname();
		
		//String roleleval1= Epicroleandglobalprofilecre.getEMProlevalepic();
				
				//String roleleval2=Epicroleandglobalprofilecre.getEMProlevalepic2();
				
						String roleleval=Epicroleandglobalprofile.getEMProleepic();
						
//						String roleleval2=Epicroleandglobalprofile.getEMProleepic2();
//						
//						String roleleval3=Epicroleandglobalprofile.getEMProleepic3();
		
		
		
		
		
		click(IdentityManager, "identityManager Menu");
		 
		 click(InitiateMenu, "InitiateMenu Menu");
		 
		click(UserProduct, "UserProduct Menu");
		
		switchToBodyFrame(driver);
		
		TimeUtil.shortWait();
		
		click(Additem, "Additem Button");
		
		sendText(FindTxt,userplantnameepic, "User FindTxt");
		
		click(Apply, "Apply Button");
		
		TimeUtil.shortWait();
		
		click(UserRB, "User RB");
		
		click(Addbtn, "Add Button");
		
		click(Selectbtn, "Select btn");
		
		click(Category, "Category Button");
		
		TimeUtil.shortWait();
		
		sendText(searchfield, Categoryvalepic, "Category Field");
		
		click(Categoryoption, "Category option");
		
		click(Role, "Role Button");
		
		sendText(rolesearchfield, roleleval, "role search Field");
		
		click(Roleoption, "Role option");
		
		click(Plantbtn, "Plant option");
		
		sendText(Plantfindtxxt, plantvalepic, "plant value Field");
		TimeUtil.shortWait();
		
		click(PlantApplybtn, "Plant option");
		
		click(PlantADDbtn, "Plant ADDbtn");
		
		click(FinalADDbtn, "final ADDbtn");
		
		click(Submitbtn, "Submit button");
		
		E_sign.e_Sign(eSign);
		
		
		
		 TimeUtil.shortWait();
			
			
			click(nextbtn, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			TimeUtil.shortWait(); 
			
//			click(InitiateMenu, "InitiateMenu Menu");
//			
//			click(IdentityManager, "identityManager Menu");
//			
//			click(IdentityManager, "identityManager Menu");
//			 
//			 click(InitiateMenu, "InitiateMenu Menu");
//			 
//			click(UserProduct, "UserProduct Menu");
//			
//			switchToBodyFrame(driver);
//			
//			TimeUtil.shortWait();
//			
//			click(Additem, "Additem Button");
//			
//			sendText(FindTxt,userplantnameepic2, "User FindTxt");
//			
//			click(Apply, "Apply Button");
//			
//			TimeUtil.shortWait();
//			
//			click(UserRB, "User RB");
//			
//			click(Addbtn, "Add Button");
//			
//			click(Selectbtn, "Select btn");
//			
//			click(Category, "Category Button");
//			
//			TimeUtil.shortWait();
//			
//			sendText(searchfield, Categoryvalepic2, "Category Field");
//			
//			click(Categoryoption, "Category option");
//			
//			click(Role, "Role Button");
//			
//			sendText(rolesearchfield, roleleval2, "role search Field");
//			
//			click(Roleoption, "Role option");
//			
//			click(Plantbtn, "Plant option");
//			
//			sendText(Plantfindtxxt, plantvalepic2, "plant value Field");
//			TimeUtil.shortWait();
//			
//			click(PlantApplybtn, "Plant option");
//			
//			click(PlantADDbtn, "Plant ADDbtn");
//			
//			click(FinalADDbtn, "final ADDbtn");
//			
//			click(Submitbtn, "Submit button");
//			
//			E_sign.e_Sign(eSign);
//			
//			
//			
//			 TimeUtil.shortWait();
//				
//				
//				click(nextbtn, "Done button");
//				
//				TimeUtil.shortWait();
//				
//				switchToDefaultContent(driver);
//				
//				TimeUtil.shortWait();
//				
//				click(InitiateMenu, "InitiateMenu Menu");
//				
//				click(IdentityManager, "identityManager Menu");
//				
//				click(IdentityManager, "identityManager Menu");
//				 
//				 click(InitiateMenu, "InitiateMenu Menu");
//				 
//				click(UserProduct, "UserProduct Menu");
//				
//				switchToBodyFrame(driver);
//				
//				TimeUtil.shortWait();
//				
//				click(Additem, "Additem Button");
//				
//				sendText(FindTxt,userplantnameepic3, "User FindTxt");
//				
//				click(Apply, "Apply Button");
//				
//				TimeUtil.shortWait();
//				
//				click(UserRB, "User RB");
//				
//				click(Addbtn, "Add Button");
//				
//				click(Selectbtn, "Select btn");
//				
//				click(Category, "Category Button");
//				
//				TimeUtil.shortWait();
//				
//				sendText(searchfield, Categoryvalepic3, "Category Field");
//				
//				click(Categoryoption, "Category option");
//				
//				click(Role, "Role Button");
//				
//				sendText(rolesearchfield, roleleval3, "role search Field");
//				
//				click(Roleoption, "Role option");
//				
//				click(Plantbtn, "Plant option");
//				
//				sendText(Plantfindtxxt, plantvalepic3, "plant value Field");
//				TimeUtil.shortWait();
//				
//				click(PlantApplybtn, "Plant option");
//				
//				click(PlantADDbtn, "Plant ADDbtn");
//				
//				click(FinalADDbtn, "final ADDbtn");
//				
//				click(Submitbtn, "Submit button");
//				
//				E_sign.e_Sign(eSign);
//				
//				
//				
//				 TimeUtil.shortWait();
//					
//					
//					click(nextbtn, "Done button");
//					
//					TimeUtil.shortWait();
//					
//					switchToDefaultContent(driver);
//					
//					
//					
//				click(InitiateMenu, "Initiation tab");
//			

			TimeUtil.shortWait();
			click(Signout, "Signout button");
			TimeUtil.shortWait();
//			
//			
//	
//		
//		
		
		}	
			
	
	
	
}
