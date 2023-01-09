package com.Automation.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.TextUtils;
import com.Automation.Utils.TimeUtil;

public class SSODMS_Plantregistration extends ActionEngine {

	Properties prop;
	
	public static String EMPplantname = "";
	public static String EMPplantcode = "";
	
    public static String getEMPplantname() {
		return EMPplantname;
		}

	public static void setEMPplantname(String ssoplantname1) {
		EMPplantname = ssoplantname1;
	}
	
	public static String getEMPplantcode() {
		return  EMPplantcode;
		}

	public static void setEMPplantcode(String ssoplantcode1) {
		 EMPplantcode = ssoplantcode1;
	}
	
	
	
	@FindBy(xpath = "//text()[contains(.,'System Manager')]/ancestor::a[1]")
	WebElement Sysmantab;

	@FindBy(xpath = "//text()[.='Admin & Security']/ancestor::a[1]")
	WebElement Adminandsecurity;

	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	WebElement Initiate;

	@FindBy(id = "PLTINIT")
	WebElement Plantmenu;

	@FindBy(xpath = "//input[@type='text'][@name='PlantReg.PlantDesc']")
	WebElement Plantname;

	@FindBy(xpath = "//input[@type='text'][@name='PlantReg.PlantCode']")
	WebElement Plantcode;

	@FindBy(xpath = "//textarea[@name='PlantReg.Address']")
	WebElement Plantaddress;

	@FindBy(id = "select2-PlantReg_TimeZoneType-container")
	WebElement Timezone;

	@FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
	WebElement timezonesearchbar;

	@FindBy(xpath = "//ul[@id='select2-PlantReg_TimeZoneType-results']//li[1]")
	WebElement timezonefield;

	@FindBy(id = "select2-PlantReg_ShortDateFormatId-container")
	WebElement shortdateformat;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement shortdateformatsearchbar;

	@FindBy(xpath = "//ul[@id='select2-PlantReg_ShortDateFormatId-results']/li[1]")
	WebElement shortdateformatfield;

	@FindBy(id = "select2-PlantReg_LongDateFormatId-container")
	WebElement longdateformat;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement longdateformatsearchbar;

	@FindBy(xpath = "//ul[@id='select2-PlantReg_LongDateFormatId-results']/li[1]")
	WebElement longdateformatfield;

	@FindBy(id = "PlantReg_Comments")
	WebElement commentsfield;

	@FindBy(id = "btnSubmit")
	WebElement plantsubmitbtn;
	
	@FindBy(id = "cfnMsg_Next")
	WebElement nextbtn;
	
	@FindBy(xpath = "//a[@id='logoutBtn']")
	WebElement Signout;

	

	// This initElements method will create all WebElements

	public SSODMS_Plantregistration() {
		PageFactory.initElements(driver, this);

	}

	public void ssodmsplantregistration(String ssoplantname, String ssoplantcode, String ssoplantaddress,
			String ssotimezonesearchbar, String ssoshortdateformat,String ssolongdateformat, String comments, String eSign) {
		waitForPageToLoad(3000);
		
		String s = "";
		String s1="";
	
		prop = ConfigsReader.readProperties("./configs/configuration.properties");
		if (prop.getProperty("EnableAppendRandomValue").equalsIgnoreCase("YES")) {
			
			s = TextUtils.randomvalue(3);
			s1= TextUtils.randomAlphaNumeric(3);
			
		}
		
		setEMPplantname(EMPplantname =ssoplantname+s1);
		setEMPplantcode(EMPplantcode =  ssoplantcode+s);
		
		
		
		

		click(Sysmantab, "System mmanager tab");
		click(Adminandsecurity, "Admin and security tab");
		click(Initiate, "Initiation tab");

		click(Plantmenu, "plant menu tab");

		switchToBodyFrame(driver);

		click(Plantname, "Plantname Txtfield");
		sendText(Plantname, EMPplantname, "Plantname Txtfield");

		click(Plantcode, "Plantcode Txtfield");
		sendText(Plantcode, EMPplantcode, "Plantcode Txtfield");

		click(Plantaddress, "plant address txt field");
		sendText(Plantaddress, ssoplantaddress, "plant address txt field");

		click(Timezone, "time zone ");

		click(timezonesearchbar, "timezone searchbar field");
		sendText(timezonesearchbar, ssotimezonesearchbar, "time zone search bar field");

		// waitForPageToLoad(3000);

		// switchToBodyFrame(driver);

		TimeUtil.shortWait();

		click(timezonefield, "time zone field");

		TimeUtil.shortWait();

		click(shortdateformat, "short date format");

		TimeUtil.shortWait();

		click(shortdateformatsearchbar, "shortdateformat searchbar");
		sendText(shortdateformatsearchbar, ssoshortdateformat, "shortdateformat searchbar");

		TimeUtil.shortWait();

		click(shortdateformatfield, "shortdate formatfield");

		TimeUtil.shortWait();

		click(longdateformat, "longdate format");

		TimeUtil.shortWait();

		click(longdateformatsearchbar, "longdateformat searchbar");
		sendText(longdateformatsearchbar, ssolongdateformat, "longdateformat searchbar");

		click(longdateformatfield, "longdateformat field");

		TimeUtil.shortWait();

		click(commentsfield, "comments field");
		sendText(commentsfield, comments, "comments field");

		click(plantsubmitbtn, "plant submit btn");
		
		E_sign.e_Sign(eSign);
		
		
		
		 TimeUtil.shortWait();
			
			
			click(nextbtn, "Done button");
			
			TimeUtil.shortWait();
			
			switchToDefaultContent(driver);
			
			
			
			click(Initiate, "Initiation tab");
			
			
			TimeUtil.shortWait();
			click(Signout, "Signout button");
			TimeUtil.shortWait();
			
			
		
	/*	
		
		click(nextbtn,"Next buttton");
		
		click(Initiate, "Initiation tab");
		
		

		switchToDefaultContent(driver);

		// click(Next,"Next buttton");
		 * 
		 */
		
		

	}

}
