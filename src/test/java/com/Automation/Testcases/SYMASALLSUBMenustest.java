package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SYMASALLSUBMenustest extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Epicsymaadmsecallta");
		return getRoleData;
	}
	
	@DataProvider(name = "RoleData1")
	public Object[][] getRoleData1() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Modificationinepic");
		return getRoleData;
	}
	
	@DataProvider(name = "RoleData2")
	public Object[][] getRoleData2() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Reportsinsysman");
		return getRoleData;
	}

	public SYMASALLSUBMenustest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void Systmadmisecalltabs(String Emplevelepicnew,String Emproleepicnew,String Rolevalepicnew, String textofstandreasons, String uniqueidofusergroup,String usergroupdescription,String Searchofavailableusers,String Search2,
			String Search3,String Usergroserbox,String remarksusgrst,String Usergroserbox1,String remarksusgrst1, String Searchofuserlasfiled)
	{

		this.test = extent.createTest("Systemmangager all tabs");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		smasinitiateallsubmenusobj.sysmanadminandsecallsubmenus(Emplevelepicnew, Emproleepicnew, Rolevalepicnew, textofstandreasons, uniqueidofusergroup, usergroupdescription, Searchofavailableusers, Search2, Search3, Usergroserbox, remarksusgrst, Usergroserbox1, remarksusgrst1,
				Searchofuserlasfiled,ConfigsReader.getPropValue("pwdsso"));

	
	}
	
	
	@Test(priority = 2, dataProvider = "RoleData1", enabled = true)
	public void Modificationinepicof(String Usergroserbox,String Usergroserbox1,String rmk1, String rmk2)
	{

		 this.test = extent.createTest("Modificationinepicof");

		
		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		// Rolereg.roleReg();

		modificationinsysman.sysmanadminandsecmodifysubmenus(Usergroserbox,Usergroserbox1, rmk1, rmk2 ,ConfigsReader.getPropValue("pwdsso"));

		
	
	}
	
	
	@Test(priority = 3, dataProvider = "RoleData2", enabled = true)
	public void Reportsinsystemmanepic(String nameonsearch)
	{

		this.test = extent.createTest("Reportsinsystemmanepic");

		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"), ConfigsReader.getPropValue("pwdepic"));
		
reportsinsystemmanepic.reportsinsystemmangerepic(nameonsearch,ConfigsReader.getPropValue("pwdsso"));

	
	
	}

	
	
	


}
