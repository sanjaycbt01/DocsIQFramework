package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Senariooneofsystmantest extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Epicsymaadmsecallta");
		return getRoleData;
	}
	
	public Senariooneofsystmantest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void Scenariooneofsysman(String Emplevelepicnew,String Emproleepicnew, String numofrec, String Rolevalepicnew, String textofstandreasons, String uniqueidofusergroup,String usergroupdescription,String Searchofavailableusers,String Search2,
			String Search3,String Usergroserbox,String remarksusgrst,String Usergroserbox1,String remarksusgrst1, String Searchofuserlasfiled)
	{

		this.test = extent.createTest("Scenario1 of System Manager");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariooneofsysman.scenariooneofsysman(Emplevelepicnew, Emproleepicnew, numofrec, Rolevalepicnew, textofstandreasons, uniqueidofusergroup, usergroupdescription, Searchofavailableusers, Search2, Search3, Usergroserbox, remarksusgrst, Usergroserbox1, remarksusgrst1, Searchofuserlasfiled,ConfigsReader.getPropValue("pwdepic"));

	
	}
	
}
