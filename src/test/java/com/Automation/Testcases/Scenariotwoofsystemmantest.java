package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Scenariotwoofsystemmantest   extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Modificationinepic");
		return getRoleData;
	}

	public Scenariotwoofsystemmantest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void Scenariotwoofsysman(String Usergroserbox,String Usergroserbox1,String rmk1, String rmk2)
	{

		 this.test = extent.createTest("Scenario two of systemmantest");

		// int i=3;
		// for(i=0;i<=3;i++){

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariotwoofsysman.scenariotwoofsystemmanagermodify(Usergroserbox, Usergroserbox1, rmk1, rmk2,ConfigsReader.getPropValue("pwdepic"));

		// ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval,
		// ConfigsReader.getPropValue("pwdsso"));
		// }

	
	}



}
