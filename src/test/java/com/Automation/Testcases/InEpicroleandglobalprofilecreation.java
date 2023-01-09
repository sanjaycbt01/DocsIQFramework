package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class InEpicroleandglobalprofilecreation extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData11")
	public Object[][] getRoleData11() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Newroleandglobalprofileepic");
		return getRoleData;
	}

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Role");
		return getRoleData;
	}

	public InEpicroleandglobalprofilecreation() {

		super(ConfigsReader.getPropValue("EpicapplicationUrl"));

	}

	// @Test(priority = 1, dataProvider = "RoleData11", enabled = true)
	// public void Epicroleandglobalprofilecreation(String Emplevelepic, String
	// Emproleepic, String Rolevalepic,
	// String Emplevelepic2, String Emproleepic2, String Rolevalepic2, String
	// Emplevelepic3, String Emproleepic3,
	// String Rolevalepic3) {
	//
	// this.test = extent.createTest("Inepicroleandglobalprofilecreation");
	//
	// // int i=3;
	// // for(i=0;i<=3;i++){
	//
	// epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("usernameepic"),
	// ConfigsReader.getPropValue("pwdepic"));
	// // Rolereg.roleReg();
	// epicroleandglobalprofilecre.epicroleandglobalprofilecreation(Emplevelepic,
	// Emproleepic, Rolevalepic,
	// ConfigsReader.getPropValue("pwdepic"));
	//
	// //
	// epicroleandglobalprofilecre.epicroleandglobalprofilecreation(Emplevelepic,
	// // Emproleepic, Rolevalepic,
	// // Emplevelepic2, Emproleepic2, Rolevalepic2, Emplevelepic3,
	// // Emproleepic3, Rolevalepic3,
	// // ConfigsReader.getPropValue("pwdsso"));
	//
	// // ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval,
	// // ConfigsReader.getPropValue("pwdsso"));
	//
	//
	// }

	@Test(dataProvider = "RoleData", enabled = true)
	public void Epicrole(String Emplevelepic, String Emproleepic) {
		// --------------------------
		
				this.test = extent.createTest("Inepicroleandglobalprofilecreation");
				epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq"),ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));

			}
		} 


