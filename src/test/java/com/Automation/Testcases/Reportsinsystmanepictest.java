package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Reportsinsystmanepictest extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Reportsinsysman");
		return getRoleData;
	}

	public Reportsinsystmanepictest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void Reportsinsystemmanepic(String nameonsearch)
	{

		this.test = extent.createTest("Reportsinsystemmanepic");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		
reportsinsystemmanepic.reportsinsystemmangerepic(nameonsearch,ConfigsReader.getPropValue("pwdsso"));

	
	
	}


}
