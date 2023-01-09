package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SSO_UserRegistrationtest extends ActionEngine {
	
	
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "ssouserregistration");
		return getRoleData;
	}
	
	public SSO_UserRegistrationtest () {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}
	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void ssodmsLogin(String Dsearch, String Efirstname, String Elastname, String Euserid, String Empid, String Eemailid)
	{
		//this.test = extent.createTest("RoleData  Flow");
		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
//	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
		ssodmsuserregistration.ssouserregistration(Dsearch, Efirstname, Elastname, Euserid, Empid, Eemailid,ConfigsReader.getPropValue("pwdsso"));
		
		
}
	
}



