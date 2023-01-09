package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SSO_Designationtest extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Designation");
		return getRoleData;
	}
	public SSO_Designationtest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void ssodmsLogin( String EmpDesignationcode, String EmpDesignation, String EmpLevel) {

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		
		
		ssodesignation.ssodmsdesignation(EmpDesignationcode, EmpDesignation, EmpLevel, ConfigsReader.getPropValue("pwdsso"));
		
		
} 

}
