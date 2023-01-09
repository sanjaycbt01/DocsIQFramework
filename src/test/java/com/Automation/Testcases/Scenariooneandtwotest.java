package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Scenariooneandtwotest    extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData1")
	public Object[][] getRoleData1() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Epicsymaadmsecallta");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData2")
	public Object[][] getRoleData2() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Modificationinepic");
		return getRoleData;
	}
	
	
	
	public Scenariooneandtwotest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData1", enabled = true)
	public void Scenariooneofsysman(String Emplevelepicnew,String Emproleepicnew, String numofrec, String Rolevalepicnew, String textofstandreasons, String uniqueidofusergroup,String usergroupdescription,String Searchofavailableusers,String Search2,
			String Search3,String Usergroserbox,String remarksusgrst,String Usergroserbox1,String remarksusgrst1, String Searchofuserlasfiled)
	{

		this.test = extent.createTest("Scenario1 of System Manager");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariooneofsysman.scenariooneofsysman(Emplevelepicnew, Emproleepicnew, numofrec, Rolevalepicnew, textofstandreasons, uniqueidofusergroup, usergroupdescription, Searchofavailableusers, Search2, Search3, Usergroserbox, remarksusgrst, Usergroserbox1, remarksusgrst1, Searchofuserlasfiled,ConfigsReader.getPropValue("pwdepic"));

	
	}
	
	@Test(priority = 2, dataProvider = "RoleData2", enabled = true)
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
