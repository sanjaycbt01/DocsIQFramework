package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Mappingofepicroleandglobalprofileinsso extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";
	

	@DataProvider(name = "RoleData12")
	public Object[][] getRoleData12() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "epicuserproduct");
		return getRoleData;
	}
	
	public Mappingofepicroleandglobalprofileinsso() {

		super(ConfigsReader.getPropValue("applicationUrl"));
		
		
	}
	
	
	@Test(priority = 1, dataProvider = "RoleData12", enabled = true)

	public void Mappingepicroleandglobalprofileinsso(String userplantnameepic, String Categoryvalepic, String Rolevalepic, String plantvalepic,String userplantnameepic2, String Categoryvalepic2, String Rolevalepic2, String plantvalepic2, String userplantnameepic3, String Categoryvalepic3, String Rolevalepic3, String plantvalepic3){
		
		
		this.test = extent.createTest("mapping of epicroleandglobalprofileinsso");

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
		mappingepicroleandglobalprofileinsso.UserProductepic(userplantnameepic, Categoryvalepic, Rolevalepic, plantvalepic, userplantnameepic2, Categoryvalepic2, Rolevalepic2, plantvalepic2, userplantnameepic3, Categoryvalepic3, Rolevalepic3, plantvalepic3, ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
	}

	
	

	
	
	

	

}
