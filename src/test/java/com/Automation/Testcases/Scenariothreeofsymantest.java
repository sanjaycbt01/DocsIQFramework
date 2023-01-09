package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Scenariothreeofsymantest   extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "scenario3sysman");
		return getRoleData;
	}

	public Scenariothreeofsymantest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void Scenariothreeofsysman(String remkofurgstachan,String numofrec)
	{

		 this.test = extent.createTest("Scenario three of systemmantest");

		

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariothreeofsysman.scenariothreeofsysman(remkofurgstachan, numofrec,ConfigsReader.getPropValue("pwdepic"));


	
	}

}
