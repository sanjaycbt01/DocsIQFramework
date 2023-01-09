package com.Automation.Pages;
/*
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Documenttype  extends ActionEngine {

	Properties prop;
	
	
	 @FindBy(id = "ddlSelectedPlant_2")
	WebElement planbutton;
	@FindBy(xpath = "//div[contains(text(),'Cannot Create Session for Quality Management Syste')]")
	WebElement xbutton;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement Documentmanagericon;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	WebElement Configurationmainmenu;
	
	@FindBy(xpath = "//body/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
	WebElement Initiatemenuinconfigurationmodule;
	
	@FindBy(xpath = "//a[@id='DMS_Configuration_Initiate_MENU0112']")
	WebElement Documenttypemenu;
	
	@FindBy(xpath = "//a[contains(text(),'Single Document Type')]")
	WebElement SingledocumenttypefieldinDT;
	
	@FindBy(id= "DocumentType_DocumentTypeCode")
	WebElement documenttypetxtbox;
	
	@FindBy(id = "DocumentType_DocumentTypeDesc")
	WebElement descriptiontxtboxindocumenttype;
	
	@FindBy(id = "btnModal_DocumentType_CopyFrmExst")
	WebElement addbtnofexistingdocumentinDT;
	
	@FindBy(css = "input[type=radio][name='recordSelection']")
	WebElement singledtradiobtn;
	
	@FindBy(id = "DocumentType_CopyFrmExst_selectBtn")
	WebElement addbbtnofsingledtradioscreen;
	
	
	
	
	
//------------------------------------------------------------------------	
	@FindBy(xpath = "//h6[text()='Common Configurations']")
	WebElement commonconfigurationsdrpmenuinDT;
	
	@FindBy(id = "select2-ViewerComponents_TemplateType-container")
	WebElement templettypedropdwnbtninpdftablegenerator;
	
	
	@FindBy(xpath = "//input[@class ='select2-search__field']")
	WebElement searchoftemplettypefield;
	
	//@FindBy(xpath = "//li[@id='select2-ViewerComponents_TemplateType-results']/ul")
	@FindBy(xpath = "//ul[@id='select2-ViewerComponents_TemplateType-results']/li[1]")
	WebElement Templetheader;
	@FindBy(xpath = "//ul[@id='select2-ViewerComponents_TemplateType-results']/li[2]")
	WebElement headerindropdwn;
	@FindBy(xpath = "//table[@id='basicTable']/tbody/tr[1]/td[1]")
	WebElement cellofatable;
	//@FindBy(xpath = "//*[@class='fa fa-list-alt']")//tbody/tr[5]/td[1]/button[1]/i[1]
	@FindBy(xpath = "//tbody/tr[5]/td[1]/button[1]/i[1]")
	WebElement bindingfieldsoftexticon;
	@FindBy(xpath = "//td[text()='DocCreFormatUniqueCode']")
	WebElement bindingfieldsofcell;
	@FindBy(xpath = "//button[@id='FinalSubmitBtn']")
	WebElement addbtnofcellbindingfield;
	@FindBy(id = "btnSubmit")
	WebElement submitbtnofcellbindingfield;
	@FindBy(id = "cfnMsg_Next")
	WebElement Donebtn;
	//---------------------------------------------------------------------------------------
	
	
	@FindBy(xpath = "//ul[@id='select2-ViewerComponents_TemplateType-results']/li[3]")
	WebElement footerindropdwn;
	
	@FindBy(xpath = "//ul[@id='select2-ViewerComponents_TemplateType-results']/li[4]")
	WebElement changehistempindrpdwn;
	
	@FindBy(xpath = "//ul[@id='select2-ViewerComponents_TemplateType-results']/li[5]")
	WebElement frontapprovaltemptempindrpdwn;
	
	
	
	@FindBy(xpath = "//*[@class='ft-power font-red font-size-20']")
	WebElement logoutbtnofepic;
	@FindBy(id = "Config_IsEsignAtCreatAppr")
	WebElement checkboxatcallesignatapproval;
	
	@FindBy(xpath = "//input[@id='resetTable']")
	WebElement Resettablebutton;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesbuttonresettable;
	
	@FindBy(xpath = "//button[@id='SubmitWidth']")
	WebElement addbutonofchhis;
	
	@FindBy(xpath = "//td[text()='DocPreInitiatedOn']")
	WebElement binidingfieldsofchhis;
	
	@FindBy(xpath = "//td[text()='SNo']")
	WebElement binidingfieldsoffrontapptemp;
	
	
	
	
	
	
	public PDFtablegeneraterinconfiguration() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is for PDF table generator menu in configuration module
	 * 
	 */
	/*public void PDFtablegeneratormenuinconfigmodule(String searchoftempletpdf ,String desofpdftabgen, String numofrowsinpdftab, String numofcolumnsinpdftable, String uniqcodofpdftabgen) {
		
		waitForPageToLoad(1000);
		click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(PDFtablegeneratormenuininitiateofCONF, "PDFtablegenerator menu in initiate of CONF");
		
		switchToBodyFrame(driver);
		
		click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(headerindropdwn, "headerindropdwn");
		
		jsClick(Uniquecodeofpdftablegenerator, "Uniquecodeofpdftablegenerator");
sendText(Uniquecodeofpdftablegenerator,uniqcodofpdftabgen,"Uniquecode of pdftable generator");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(numofrowscomponentinpdftablegenerator,numofrowsinpdftab ,"num of rows component in pdftable generator");
		sendText(numofcolumscomponentinpdftablegenerator,numofcolumnsinpdftable,"numofcolumscomponentinpdftablegenerator");
		sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		
		TimeUtil.shortWait();
		
		
	//	driver.get("URL of target website or webpage"); // Define the URL of the target website.
		Actions actions = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//table[@id='basicTable']/tbody/tr[1]/td[1]")); 
		actions.doubleClick(ele).perform();
		
		
		
		//doubleclick(cellofatable, "cell of a table");
		
		/* switchToDefaultContent(driver);
		
		TimeUtil.shortWait();
		
		switchToBodyFrame(driver);*/
		
/*	jsClick(bindingfieldsoftexticon, "binding fields of texticon");
	
	TimeUtil.shortWait();
		
     	jsClick(bindingfieldsofcell, "bindingfieldsofcell");
	
     	TimeUtil.shortWait();
		
	     	jsClick(addbtnofcellbindingfield, "add btn of cellbindingfield");
	     	
	     	TimeUtil.shortWait();
	     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

	
public void PDFtablegeneratormenuinconfigmodfooter(String searchoftempletpdf1 ,String desofpdftabgen1, String numofrowsinpdftab1, String numofcolumnsinpdftable1, String uniqcodofpdftabgen1) {
		
	waitForPageToLoad(1000);
		//click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(PDFtablegeneratormenuininitiateofCONF, "PDFtablegenerator menu in initiate of CONF");
		
		switchToBodyFrame(driver);
		
		click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(footerindropdwn, "footer in dropdwn");
		
		jsClick(Uniquecodeofpdftablegenerator, "Uniquecodeofpdftablegenerator");
sendText(Uniquecodeofpdftablegenerator,uniqcodofpdftabgen1,"Uniquecode of pdftable generator");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(numofrowscomponentinpdftablegenerator,numofrowsinpdftab1 ,"num of rows component in pdftable generator");
		sendText(numofcolumscomponentinpdftablegenerator,numofcolumnsinpdftable1,"numofcolumscomponentinpdftablegenerator");
		sendText(descriptionpdftablegenerator,desofpdftabgen1,"descriptionpdftablegenerator");
		
		TimeUtil.shortWait();
		
		
	//	driver.get("URL of target website or webpage"); // Define the URL of the target website.
		Actions actions = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//table[@id='basicTable']/tbody/tr[1]/td[1]")); 
		actions.doubleClick(ele).perform();
		
		
		
		//doubleclick(cellofatable, "cell of a table");
		
		/* switchToDefaultContent(driver);
		
		TimeUtil.shortWait();
		
		switchToBodyFrame(driver);*/
		
/*	jsClick(bindingfieldsoftexticon, "binding fields of texticon");
	
	TimeUtil.shortWait();
		
     	jsClick(bindingfieldsofcell, "bindingfieldsofcell");
	
     	TimeUtil.shortWait();
		
	     	jsClick(addbtnofcellbindingfield, "add btn of cellbindingfield");
	     	
	     	TimeUtil.shortWait();
	     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

	
/*public void PDFtablegeneratormenuinconfigmodchhistemp(String searchoftempletpdf2 ,String desofpdftabgen2, String numofrowsinpdftab2, String numofcolumnsinpdftable2, String uniqcodofpdftabgen2) {
	
	waitForPageToLoad(1000);
		//click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(PDFtablegeneratormenuininitiateofCONF, "PDFtablegenerator menu in initiate of CONF");
		
		switchToBodyFrame(driver);
		
		click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(changehistempindrpdwn, "change history templet in drpdwn");
		
		jsClick(Uniquecodeofpdftablegenerator, "Uniquecodeofpdftablegenerator");
sendText(Uniquecodeofpdftablegenerator,uniqcodofpdftabgen2,"Uniquecode of pdftable generator");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(numofrowscomponentinpdftablegenerator,numofrowsinpdftab2 ,"num of rows component in pdftable generator");
		sendText(numofcolumscomponentinpdftablegenerator,numofcolumnsinpdftable2,"numofcolumscomponentinpdftablegenerator");
		sendText(descriptionpdftablegenerator,desofpdftabgen2,"descriptionpdftablegenerator");
		
		TimeUtil.shortWait();
		
		jsClick(Resettablebutton, "Reset table button");
		
		TimeUtil.shortWait();
		
		
		jsClick(yesbuttonresettable, "yes button resettable");
		
		TimeUtil.shortWait();
		
		jsClick(addbutonofchhis, "addbuton of chhis");
		
		
		
		
		
		
		TimeUtil.shortWait();
		
	//	driver.get("URL of target website or webpage"); // Define the URL of the target website.
		Actions actions = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//table[@id='basicTable']/tbody/tr[1]/td[1]")); 
		actions.doubleClick(ele).perform();
		
		
		
		//doubleclick(cellofatable, "cell of a table");
		
		/* switchToDefaultContent(driver);
		
		TimeUtil.shortWait();
		
		switchToBodyFrame(driver);*/
/*		
	jsClick(bindingfieldsoftexticon, "binding fields of texticon");
	
	TimeUtil.shortWait();
		
     	jsClick(binidingfieldsofchhis, "biniding fields of change history template");
	
     	TimeUtil.shortWait();
		
	     	jsClick(addbtnofcellbindingfield, "add btn of cellbindingfield");
	     	
	     	TimeUtil.shortWait();
	     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

public void PDFtablegeneratormenuinconfigmodfrontappro(String searchoftempletpdf3,String desofpdftabgen3, String numofrowsinpdftab2, String numofcolumnsinpdftable2, String uniqcodofpdftabgen3) {
	
	waitForPageToLoad(1000);
		//click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(PDFtablegeneratormenuininitiateofCONF, "PDFtablegenerator menu in initiate of CONF");
		
		switchToBodyFrame(driver);
		
		click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(frontapprovaltemptempindrpdwn, "change history templet in drpdwn");
		
		jsClick(Uniquecodeofpdftablegenerator, "Uniquecodeofpdftablegenerator");
sendText(Uniquecodeofpdftablegenerator,uniqcodofpdftabgen3,"Uniquecode of pdftable generator");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(numofrowscomponentinpdftablegenerator,numofrowsinpdftab2 ,"num of rows component in pdftable generator");
		sendText(numofcolumscomponentinpdftablegenerator,numofcolumnsinpdftable2,"numofcolumscomponentinpdftablegenerator");
		sendText(descriptionpdftablegenerator,desofpdftabgen3,"descriptionpdftablegenerator");
		
		TimeUtil.shortWait();
		
		jsClick(Resettablebutton, "Reset table button");
		
		TimeUtil.shortWait();
		
		
		jsClick(yesbuttonresettable, "yes button resettable");
		
		TimeUtil.shortWait();
		
		jsClick(addbutonofchhis, "addbuton of chhis");
		
		
		
		
		
		
		TimeUtil.shortWait();
		
	//	driver.get("URL of target website or webpage"); // Define the URL of the target website.
		Actions actions = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//table[@id='basicTable']/tbody/tr[1]/td[1]")); 
		actions.doubleClick(ele).perform();
		
		
		
		//doubleclick(cellofatable, "cell of a table");
		
		/* switchToDefaultContent(driver);
		
		TimeUtil.shortWait();
		
		switchToBodyFrame(driver);*/
		
/*	jsClick(bindingfieldsoftexticon, "binding fields of texticon");
	
	TimeUtil.shortWait();
		
     	jsClick(binidingfieldsoffrontapptemp, "biniding fields of change history template");
	
     	TimeUtil.shortWait();
		
	     	jsClick(addbtnofcellbindingfield, "add btn of cellbindingfield");
	     	
	     	TimeUtil.shortWait();
	     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

	
}*/
