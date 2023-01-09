package com.Automation.Testcases;
/*
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class BasicRegistrationaandModificationflowinSystemmanagerModule   extends ActionEngine {

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
	
	@DataProvider(name = "RoleData3")
	public Object[][] getRoleData3() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "scenario3sysman");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData4")
	public Object[][] getRoleData4() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Reportsinsysman");
		return getRoleData;
	}
	
	
	public BasicRegistrationaandModificationflowinSystemmanagerModule () {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData1", enabled = true)
	public void basicRegistrationaandModificationflowinSystemmanagermodule (String Emplevelepicnew,String Emproleepicnew, String numofrec, String Rolevalepicnew, String textofstandreasons, String uniqueidofusergroup,String usergroupdescription,String Searchofavailableusers,String Search2,
			String Search3,String Usergroserbox,String remarksusgrst,String Usergroserbox1,String remarksusgrst1, String Searchofuserlasfiled)
	{

		this.test = extent.createTest("Registration of Role,Globalprofile,Register standard reasons and usergroup mapping in System Manager Module");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariooneofsysman.scenariooneofsysman(Emplevelepicnew, Emproleepicnew, numofrec, Rolevalepicnew, textofstandreasons, uniqueidofusergroup, usergroupdescription, Searchofavailableusers, Search2, Search3, Usergroserbox, remarksusgrst, Usergroserbox1, remarksusgrst1, Searchofuserlasfiled,ConfigsReader.getPropValue("pwdepic"));

	
	}
	
	@Test(priority = 2, dataProvider = "RoleData2", enabled = true)
	public void Scenariotwoofsysman(String Usergroserbox,String Usergroserbox1,String rmk1, String rmk2)
	{

		 this.test = extent.createTest("Modification of Global profile and User profile in System manager module");

		// int i=3;
		// for(i=0;i<=3;i++){

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariotwoofsysman.scenariotwoofsystemmanagermodify(Usergroserbox, Usergroserbox1, rmk1, rmk2,ConfigsReader.getPropValue("pwdepic"));

		// ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval,
		// ConfigsReader.getPropValue("pwdsso"));
		// }

	
	}
	
	@Test(priority = 3, dataProvider = "RoleData3", enabled = true)
	public void Scenariothreeofsysman(String remkofurgstachan,String numofrec)
	{

		 this.test = extent.createTest("Status change of usergroup and status change of standard reasons in System manager moduel");

		

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		scenariothreeofsysman.scenariothreeofsysman(remkofurgstachan, numofrec,ConfigsReader.getPropValue("pwdepic"));


	
	}
	
	@Test(priority = 4, dataProvider = "RoleData4", enabled = true)
	public void Scenariofourofsysman(String nameonsearch)
	{

		this.test = extent.createTest("Reports in System manager Module");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
		
reportsinsystemmanepic.reportsinsystemmangerepic(nameonsearch,ConfigsReader.getPropValue("pwdsso"));

	
	
	}


	
}*/
