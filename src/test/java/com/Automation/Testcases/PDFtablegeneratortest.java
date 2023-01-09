package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class PDFtablegeneratortest   extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Scenario1ofconfigurationmodule.xlsx"; 

	@DataProvider(name = "pdftablegen")
	public Object[][] getpdftablegen() {
		Object getpdftablegen[][] = Excelutil.getTestData(ExcelPath, "PDFtablegen");
		return getpdftablegen;
	}

	public PDFtablegeneratortest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "pdftablegen", enabled = true)
	public void PDFtablegeneratorinconfig(String searchoftempletpdf ,String desofpdftabgen, String numofrowsinpdftab, String numofcolumnsinpdftable, String uniqcodofpdftabgen,
			String searchoftempletpdf1 ,String desofpdftabgen1, String numofrowsinpdftab1, String numofcolumnsinpdftable1, String uniqcodofpdftabgen1,
			String searchoftempletpdf2 ,String desofpdftabgen2, String numofrowsinpdftab2, String numofcolumnsinpdftable2, String uniqcodofpdftabgen2,String searchoftempletpdf3, String uniqcodofpdftabgen3, String desofpdftabgen3 )
	{

		// this.test = extent.createTest("PDF table generator menu of configuration module in Initiate submenu ");
         epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
         
       pdftablegenerator.PDFtablegeneratormenuinconfigmodule(searchoftempletpdf, desofpdftabgen, numofrowsinpdftab, numofcolumnsinpdftable, uniqcodofpdftabgen) ;
       pdftablegenerator.PDFtablegeneratormenuinconfigmodfooter(searchoftempletpdf1, desofpdftabgen1, numofrowsinpdftab1, numofcolumnsinpdftable1, uniqcodofpdftabgen1);
       pdftablegenerator.PDFtablegeneratormenuinconfigmodchhistemp(searchoftempletpdf2, desofpdftabgen2, numofrowsinpdftab2, numofcolumnsinpdftable2, uniqcodofpdftabgen2);
       pdftablegenerator.PDFtablegeneratormenuinconfigmodfrontappro(searchoftempletpdf3, desofpdftabgen3, numofrowsinpdftab2, numofcolumnsinpdftable2, uniqcodofpdftabgen3);
	
	}
}

