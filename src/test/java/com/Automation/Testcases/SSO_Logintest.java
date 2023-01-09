package com.Automation.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SSO_Logintest  extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Newrole1");
		return getRoleData;
	}
	public SSO_Logintest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void ssodmsLogin( String Emplevel, String Emprole) {

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}
	
}
