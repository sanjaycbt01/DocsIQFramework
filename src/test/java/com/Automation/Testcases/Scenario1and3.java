package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Scenario1and3   extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData1")
	public Object[][] getRoleData1() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Epicsymaadmsecallta");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData2")
	public Object[][] getRoleData2() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "scenario3sysman");
		return getRoleData;
	}
	
	@DataProvider(name = "RoleData3")
	public Object[][] getRoleData3() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Reportsinsysman");
		return getRoleData;
	}
	
	
	
	public Scenario1and3() {

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
	public void Scenariothreeofsysman(String remkofurgstachan,String numofrec)
	{

		 this.test = extent.createTest("Scenario three of systemmantest");

		

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariothreeofsysman.scenariothreeofsysman(remkofurgstachan, numofrec,ConfigsReader.getPropValue("pwdepic"));


	
	}
	
	@Test(priority = 3, dataProvider = "RoleData3", enabled = true)
	public void Scenariofourofsysman(String nameonsearch)
	{

		this.test = extent.createTest("Scenario4 of systemmantest");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		
reportsinsystemmanepic.reportsinsystemmangerepic(nameonsearch,ConfigsReader.getPropValue("pwdsso"));

	
	
	}



}
