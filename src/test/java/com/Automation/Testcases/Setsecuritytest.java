package com.Automation.Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
import com.Automation.Utils.MyScreenRecorder;

public class Setsecuritytest extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";

	
	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "setsecurityprofile");
		return getRoleData;
	}
	public Setsecuritytest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	
	
	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void SSOSetsecurityprofile(String minuseridlen,String minpasslen,String maxtanureofpass, String passexpalert , String retainhislastpass, String Accountlockout, String idealsessiontimeout , String remarks)
	{
		test.createNode("EPIQ Login Test").pass("EPIQ Login").createNode("EPIQ PlantSelection Test")
		.pass("EPIQ PlantSelection");
		
		
		//test.createNode("EPIQ Login Test").pass("EPIQ Login");

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
//		ssosetsecurity.ssodmssetsecurityprofile(minuseridlen, minpasslen, maxtanureofpass, passexpalert, retainhislastpass, Accountlockout, idealsessiontimeout, remarks, ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}

	@AfterTest
	public void afterTest() {
	extent.flush();
	MyScreenRecorder.stopRecording(); }


}
