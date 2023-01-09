package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Roletest  extends ActionEngine {
	
	String ExcelPath = "./TestData/EPIC.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Role");
		return getRoleData;
	}

	/**
	 * Method is for Login & Role Registration
	 * 
	 * @parameters
	 */
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void RoleReg() {

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("company"),ConfigsReader.getPropValue("UserID"), ConfigsReader.getPropValue("UserPWD"));
		//Rolereg.roleReg();
}
}
