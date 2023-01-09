package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Userproormodasstest extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "userproduct");
		return getRoleData;
	}
	public Userproormodasstest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	
	public void ssouserproductmod(String userplantname, String Categoryval, String Roleval, String plantval) {

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
		ssouserproductormoduleass.UserProduct(userplantname, Categoryval, Roleval, plantval,ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}
	
}
