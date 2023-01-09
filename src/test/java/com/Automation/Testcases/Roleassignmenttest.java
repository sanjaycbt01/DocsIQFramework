package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
 
public class Roleassignmenttest extends ActionEngine {
	
	
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "roleasignment");
		return getRoleData;
	}
	
	public Roleassignmenttest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void ssodmsLogin(String userna,String role) {
		
		

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
//	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
		ssodmsroleassignment.ssodmsroleassignment(userna, role,ConfigsReader.getPropValue("pwdsso"));
}
	
}









