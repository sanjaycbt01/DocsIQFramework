package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Generictempinconfigtest extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Scenario1ofconfigurationmodule.xlsx"; 

	@DataProvider(name = "gentemp")
	public Object[][] getgentemp() {
		Object getgentemp[][] = Excelutil.getTestData(ExcelPath, "Generictemplate");
		return getgentemp;
	}

	public Generictempinconfigtest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "gentemp", enabled = true) 
	public void Generictemplateinconfig(String titleofgentemp ,String gentemptempid, String findfieldofgentemp, String Gentemprecords,String titleofgentempfo ,String gentemptempidfo, String findfieldofgentempfo,
			String Gentemprecordsfo,String titleofgentempform,String gentemptempidform,String topmargin,String Leftmargin,String Bottommargin,String Rightmargin,String Headertopmargin,String Footerbotmargin,String titleofgentempchit,String gentemptempidchit,String titleofgentempfrotem, String gentemptempidfrotem)
	{

		// this.test = extent.createTest("PDF table generator menu of configuration module in Initiate submenu ");
         epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
         
    //  genetempinconfigurationmodule.Generictemplatemenuinconfigmodule(titleofgentemp, gentemptempid, findfieldofgentemp, Gentemprecords,ConfigsReader.getPropValue("pwdepic")); 
     // genetempinconfigurationmodule.Generictemplatemenuinconfigmodfot(titleofgentempfo, gentemptempidfo, findfieldofgentempfo, Gentemprecordsfo,ConfigsReader.getPropValue("pwdepic"));
     genetempinconfigurationmodule.Generictemplatemenuinconfigmodformat(titleofgentempform, gentemptempidform, findfieldofgentemp, Gentemprecords, findfieldofgentempfo, Gentemprecordsfo, topmargin, Leftmargin, Bottommargin, Rightmargin, Headertopmargin, Footerbotmargin,ConfigsReader.getPropValue("pwdepic"));
         genetempinconfigurationmodule.Generictemplatemenuinconfigmodchit(titleofgentempchit, gentemptempidchit,ConfigsReader.getPropValue("pwdepic"));          
         genetempinconfigurationmodule.Generictemplatemenuinconfigmodfronapptem(titleofgentempfrotem, gentemptempidfrotem,ConfigsReader.getPropValue("pwdepic"));
	}
}
