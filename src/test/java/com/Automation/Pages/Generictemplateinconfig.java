package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.TimeUtil;

public class Generictemplateinconfig extends ActionEngine {

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
	
	@FindBy(id = "DMS_Configuration_Initiate_MENU0120")
	WebElement GenerictemplatemenuininitiateofCONF;
	
	@FindBy(xpath = "//span[@id='select2-ENBHeaderFooter_HeaderFooterType-container']")
	WebElement Templettypeofgentemp;
	@FindBy(xpath= "//ul[@id='select2-ENBHeaderFooter_HeaderFooterType-results']/li[2]")
	WebElement Headerofdrpdwnofgentemp;
	@FindBy(xpath = "//input[@id='ENBHeaderFooter_HeaderFooterDesc']")
	WebElement Titleofthegentemphead;
	@FindBy(id = "ENBHeaderFooter_HeaderFooterCode")
	WebElement Generictemptemplateid;
	
	@FindBy(id = "btnModal_ENBHeaderFooter_PdfTblGen")
	WebElement addbtnofgentemp;
	
	@FindBy(id = "ENBHeaderFooter_HeaderFormat_FindTxt")
	WebElement findfieldofpdftabgen;
	
	//@FindBy(xpath = "//li[@id='select2-ViewerComponents_TemplateType-results']/ul")
	
	@FindBy(id = "ENBHeaderFooter_HeaderFormat_RecordLimit")
	WebElement gentemprecords;
	@FindBy(xpath = "ENBHeaderFooter_HeaderFormat_DisplayBtn")
	WebElement applybuttongentem;
	
	@FindBy(xpath = "//input[@type='radio'][@name='recordSelection']")
	WebElement radiobtnofgentemp;
	
	@FindBy(id = "ENBHeaderFooter_PdfTblGen_selectBtn")
	WebElement addbtn2ofgentemp;
	
	
	
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
	
	
	@FindBy(xpath= "//ul[@id='select2-ENBHeaderFooter_HeaderFooterType-results']/li[3]")
	WebElement footerofdrpdwnofgentemp;
//------------------------------------------------------------------------------------------	
	@FindBy(xpath= "//ul[@id='select2-ENBHeaderFooter_HeaderFooterType-results']/li[4]")
	WebElement formatofdrpdwnofgentemp;
	
	@FindBy(xpath= "//ul[@id='select2-ENBHeaderFooter_HeaderFooterType-results']/li[5]")
	WebElement chitofdrpdwnofgentemp;
	
	@FindBy(xpath= "//ul[@id='select2-ENBHeaderFooter_HeaderFooterType-results']/li[6]")
	WebElement frontapptemofdrpdwnofgentemp;
	
	
    @FindBy(xpath= "//input[@id='Type_1']")
	WebElement Typefieldofformat;
	
   @FindBy(id = "btnModal_ENBHeaderFooter_HeaderFormat")
	WebElement headerformataddbtninformat;
   
   @FindBy(id = "btnModal_ENBHeaderFooter_FooterFormat")
  	WebElement footerformataddbtninformat;
   
   @FindBy(id = "OverrideDocMargin_0")
  	WebElement overridenfieldofmargin;
   
   @FindBy(id = "ENBHeaderFooter_TopMargin")
  	WebElement Topmargin;
   
   @FindBy(id = "ENBHeaderFooter_LeftMargin")
  	WebElement leftmargin;
   
   @FindBy(id = "ENBHeaderFooter_BottomMargin")
	WebElement bottommargin;
  
  @FindBy(id = "ENBHeaderFooter_RightMargin")
 	WebElement rightmargin;
  
  @FindBy(id = "ENBHeaderFooter_HeadeerfromTopMargin")
 	WebElement headertopmargin;
  
  @FindBy(id = "ENBHeaderFooter_FooterFromBottomMargin")
 	WebElement footerbottommargin;
  
  @FindBy(id = "ENBHeaderFooter_Pagetype")
 	WebElement pagesizefield;
  
  @FindBy(id = "ENBHeaderFooter_FooterFormat_selectBtn")
	WebElement footerformaddbtn;
  
  @FindBy(id = "btnModal_ENBHeaderFooter_PdfTblGen")
 	WebElement chitaddbtn;
  
  @FindBy(id = "ENBHeaderFooter_PdfTblGen_selectBtn")
	WebElement chitaddbtninscreen;
  
  @FindBy(id = "ENBHeaderFooter_PdfTblGen_selectBtn")
 	WebElement frontaddbtninscreen;
   
  @FindBy(id = "ENBHeaderFooter_HeaderFormat_selectBtn")
	WebElement add2btninformathead;
  @FindBy(id = "ENBHeaderFooter_FooterFormat_selectBtn")
 	WebElement add2btninformatfotter; 
 
  
  
  
	
	
	public Generictemplateinconfig() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is for Generic Template menu in configuration module
	 * 
	 */
	public void Generictemplatemenuinconfigmodule(String titleofgentemp ,String gentemptempid, String findfieldofgentemp, String Gentemprecords,String eSign) {
		
		waitForPageToLoad(1000);
		click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(GenerictemplatemenuininitiateofCONF, "Generictemplate menu in initiateofCONF");
		
		switchToBodyFrame(driver);
		
		click(Templettypeofgentemp, "Templettype of gentemp");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(Headerofdrpdwnofgentemp, "Headerofdrpdwnofgentemp");
		
		jsClick(Titleofthegentemphead, "Titleofthegentemphead");
sendText(Titleofthegentemphead,titleofgentemp,"Titleofthegentemphead");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(Generictemptemplateid,gentemptempid ,"Generictemplate template id");
		
		
		
		//TimeUtil.shortWait(); 
		
		click(addbtnofgentemp, "addbtnofgentemp"); 
		
		TimeUtil.shortWait();
		
	//switchToBodyFrame(driver);
		
	//jsClick(findfieldofpdftabgen, "findfield of gentemp");
	//sendText(findfieldofpdftabgen,findfieldofgentemp ,"findfield of gentem");
	
	//jsClick(gentemprecords, "gentemp records");
	//sendText(gentemprecords,Gentemprecords ,"gentemp records");
	
	//jsClick(applybuttongentem, "applybuttongentem");
	
	jsClick(radiobtnofgentemp, "radiobtn of gentemp");
	
	jsClick(addbtn2ofgentemp, "addbtn2 of gentemp");
	
	TimeUtil.shortWait();
		
     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
     	
     	E_sign.e_Sign(eSign);
		
		
		 TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

	
	
public void Generictemplatemenuinconfigmodfot(String titleofgentempfo ,String gentemptempidfo, String findfieldofgentempfo, String Gentemprecordsfo,String eSign) {
		
		//waitForPageToLoad(1000);
		//click(xbutton, "Xbutton menu");	
        click(Documentmanagericon, "Document manager icon tab");
		click(Configurationmainmenu, "Configuration mainmenu");
		click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
		click(GenerictemplatemenuininitiateofCONF, "Generictemplate menu in initiateofCONF");
		
		switchToBodyFrame(driver);
		
		click(Templettypeofgentemp, "Templettype of gentemp");
		//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
	//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
	click(footerofdrpdwnofgentemp, "footer of drpdwn of gentemp");
		
		jsClick(Titleofthegentemphead, "Titleofthegentempfooter");
sendText(Titleofthegentemphead,titleofgentempfo,"Titleofthegentempfooter");
	//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
		sendText(Generictemptemplateid,gentemptempidfo ,"Generictemplate template id");
		
		
		
		//TimeUtil.shortWait(); 
		
		click(addbtnofgentemp, "addbtnofgentemp"); 
		
		TimeUtil.shortWait();
		
	//switchToBodyFrame(driver);
		
	//jsClick(findfieldofpdftabgen, "findfield of gentemp");
	//sendText(findfieldofpdftabgen,findfieldofgentempfo ,"findfield of gentem");
	
	//jsClick(gentemprecords, "gentemp records");
	//sendText(gentemprecords,Gentemprecordsfo ,"gentemp records");
	
	//jsClick(applybuttongentem, "applybuttongentem");
	
	jsClick(radiobtnofgentemp, "radiobtn of gentemp");
	
	jsClick(addbtn2ofgentemp, "addbtn2 of gentemp");
	
	TimeUtil.shortWait();
		
     	
	     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
     	
     	TimeUtil.shortWait();
     	
     	E_sign.e_Sign(eSign);
		
		
		 TimeUtil.shortWait();
	     	
  jsClick(Donebtn, "Done btn");
	  
	  
		       switchToDefaultContent(driver);
	}

	
public void Generictemplatemenuinconfigmodformat(String titleofgentempform,String gentemptempidform,String findfieldofgentemp, String Gentemprecords, String findfieldofgentempfo, String Gentemprecordsfo,
		String topmargin,String Leftmargin,String Bottommargin,String Rightmargin,String Headertopmargin,String Footerbotmargin,String eSign) {
	
	waitForPageToLoad(1000);
	click(xbutton, "Xbutton menu");	
    click(Documentmanagericon, "Document manager icon tab");
	click(Configurationmainmenu, "Configuration mainmenu");
	click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
	click(GenerictemplatemenuininitiateofCONF, "Generictemplate menu in initiateofCONF");
	
	switchToBodyFrame(driver);
	
	click(Templettypeofgentemp, "Templettype of gentemp");
	//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
click(formatofdrpdwnofgentemp, "format of drpdwn of gentemp");
	
	jsClick(Titleofthegentemphead, "Titleofthegentempformat");
sendText(Titleofthegentemphead,titleofgentempform,"Titleofthegentempformat");
//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
	sendText(Generictemptemplateid,gentemptempidform ,"Generictemplate template id");
	
	click(Typefieldofformat, "Typefieldofformat");
	
	//TimeUtil.shortWait(); 
	
	click(headerformataddbtninformat, "headerformataddbtninformat"); 
	
	TimeUtil.shortWait();
	
//switchToBodyFrame(driver);
	
//jsClick(findfieldofpdftabgen, "findfield of gentemp");
//sendText(findfieldofpdftabgen,findfieldofgentemp ,"findfield of gentem");

//jsClick(gentemprecords, "gentemp records");
//sendText(gentemprecords,Gentemprecords ,"gentemp records");

//jsClick(applybuttongentem, "applybuttongentem");

jsClick(radiobtnofgentemp, "radiobtn of gentemp");

jsClick(add2btninformathead, "add2 btn in formathead");

TimeUtil.shortWait();


//------------------------------------------------

click(footerformataddbtninformat, "footer format addbtn in format"); 

TimeUtil.shortWait();

//switchToBodyFrame(driver);

//jsClick(findfieldofpdftabgen, "findfield of gentemp");
//sendText(findfieldofpdftabgen,findfieldofgentempfo ,"findfield of gentem");

//jsClick(gentemprecords, "gentemp records");
//sendText(gentemprecords,Gentemprecordsfo ,"gentemp records");

//jsClick(applybuttongentem, "applybuttongentem");

jsClick(radiobtnofgentemp, "radiobtn of gentemp");

jsClick(add2btninformatfotter, "add2 btn informatfotter");

TimeUtil.shortWait();

jsClick(overridenfieldofmargin, "overridenfieldofmargin");

//jsClick(Topmargin, "Topmargin");
//sendText(Topmargin,topmargin ,"Topmargin");

//sendText(leftmargin,Leftmargin ,"leftmargin");

//sendText(bottommargin,Bottommargin ,"bottommargin");

//sendText(rightmargin,Rightmargin ,"rightmargin");

//sendText(headertopmargin,Headertopmargin ,"headertopmargin");

//sendText(footerbottommargin,Footerbotmargin ,"footerbottommargin");

//sendText(pagesizefield,Pagesizefield ,"pagesizefield");

jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
 	
 	TimeUtil.shortWait();
 	
 	E_sign.e_Sign(eSign);
	
	
	 TimeUtil.shortWait();
     	
jsClick(Donebtn, "Done btn");
  
  
	       switchToDefaultContent(driver);
}

public void Generictemplatemenuinconfigmodchit(String titleofgentempchit,String gentemptempidchit,String eSign) {
	
	//waitForPageToLoad(1000);
	//click(xbutton, "Xbutton menu");	
    click(Documentmanagericon, "Document manager icon tab");
	click(Configurationmainmenu, "Configuration mainmenu");
	click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
	click(GenerictemplatemenuininitiateofCONF, "Generictemplate menu in initiateofCONF");
	
	switchToBodyFrame(driver);
	
	click(Templettypeofgentemp, "Templettype of gentemp");
	//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
click(chitofdrpdwnofgentemp, "chit of drpdwn of gentemp");
	
	jsClick(Titleofthegentemphead, "Titleofthegentempformat");
sendText(Titleofthegentemphead,titleofgentempchit,"Titleofthegentempformat");
//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
	sendText(Generictemptemplateid,gentemptempidchit ,"Generictemplate template id");
	
	click(Typefieldofformat, "Typefieldofformat");
	
	//TimeUtil.shortWait(); 
	
	click(headerformataddbtninformat, "headerformataddbtninformat"); 
	
	TimeUtil.shortWait();
	
	jsClick(radiobtnofgentemp, "radiobtn of gentemp");
	
jsClick(addbtn2ofgentemp, "addbtn2 of gentemp");

TimeUtil.shortWait();
//------------------------------------------------

click(footerformataddbtninformat, "footer format addbtn in format"); 

TimeUtil.shortWait();

jsClick(radiobtnofgentemp, "radiobtn of gentemp");

jsClick(footerformaddbtn, "addbtn2 of gentemp");

TimeUtil.shortWait();

//jsClick(overridenfieldofmargin, "overridenfieldofmargin");

//--------------------------------------------------------------------


click(chitaddbtn, "chit addbtn"); 

TimeUtil.shortWait();

jsClick(radiobtnofgentemp, "radiobtn of gentemp");

jsClick(chitaddbtninscreen, "chitaddbtninscreen");

TimeUtil.shortWait();

//jsClick(overridenfieldofmargin, "overridenfieldofmargin");


jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
 	
 	TimeUtil.shortWait();
 	
 	E_sign.e_Sign(eSign);
	
	
	 TimeUtil.shortWait();
     	
jsClick(Donebtn, "Done btn");
  
  
	       switchToDefaultContent(driver);
}


public void Generictemplatemenuinconfigmodfronapptem(String titleofgentempfrotem ,String gentemptempidfrotem,String eSign) {
	
	//waitForPageToLoad(1000);
	//click(xbutton, "Xbutton menu");	
    click(Documentmanagericon, "Document manager icon tab");
	click(Configurationmainmenu, "Configuration mainmenu");
	click(Initiatemenuinconfigurationmodule, "Initiate menu in configuration module");
	click(GenerictemplatemenuininitiateofCONF, "Generictemplate menu in initiateofCONF");
	
	switchToBodyFrame(driver);
	
	click(Templettypeofgentemp, "Templettype of gentemp");
	//sendText(searchoftemplettypefield,searchoftempletpdf,"searchoftemplettypefield");
//	click(templettypedropdwnbtninpdftablegenerator, "templet type dropdwn btn in pdftablegenerator");
click(frontapptemofdrpdwnofgentemp, "frontapptem ofdrpdwnofgentemp");
	
	jsClick(Titleofthegentemphead, "Titleofthegentemphead");
sendText(Titleofthegentemphead,titleofgentempfrotem,"Titleofthegentemphead");
//	sendText(descriptionpdftablegenerator,desofpdftabgen,"descriptionpdftablegenerator");
	sendText(Generictemptemplateid,gentemptempidfrotem ,"Generictemplate template id");
	
	
	
	//TimeUtil.shortWait(); 
	
	click(addbtnofgentemp, "addbtnofgentemp"); 
	
	TimeUtil.shortWait();
	
//switchToBodyFrame(driver);
	
//jsClick(findfieldofpdftabgen, "findfield of gentemp");
//sendText(findfieldofpdftabgen,findfieldofgentemp ,"findfield of gentem");

//jsClick(gentemprecords, "gentemp records");
//sendText(gentemprecords,Gentemprecords ,"gentemp records");

//jsClick(applybuttongentem, "applybuttongentem");

jsClick(radiobtnofgentemp, "radiobtn of gentemp");

jsClick(frontaddbtninscreen, "addbtn2 of gentemp");

TimeUtil.shortWait();
	
 	
     	jsClick(submitbtnofcellbindingfield, "submitbtnofcellbindingfield");
 	
 	TimeUtil.shortWait();
 	
 	E_sign.e_Sign(eSign);
	
	
	 TimeUtil.shortWait();
     	
jsClick(Donebtn, "Done btn");
  
  
	       switchToDefaultContent(driver);
}


	

	
}
