package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Plantregtest extends ActionEngine {

	// String ExcelPath = "./TestData/EPIC.xlsx";

	String ExcelPath = "./TestData/Newsheet.xlsx";

	@DataProvider(name = "RoleData")
	public Object[][] getRoleData() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "plantregistration");
		return getRoleData;
	}

	public Plantregtest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	@Test(priority = 1, dataProvider = "RoleData", enabled = true)
	public void ssodmsLogin(String ssoplantname, String ssoplantcode, String ssoplantaddress,
			String ssotimezonesearchbar, String ssoshortdateformat, String ssolongdateformat, String comments) {

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"), ConfigsReader.getPropValue("usernamesso"),
				ConfigsReader.getPropValue("pwdsso"));
		// Rolereg.roleReg();

		ssodmsplantreg.ssodmsplantregistration(ssoplantname, ssoplantcode, ssoplantaddress, ssotimezonesearchbar,
				ssoshortdateformat,ssolongdateformat, comments, ConfigsReader.getPropValue("pwdsso"));

		// ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval,
		// ConfigsReader.getPropValue("pwdsso"));
	}

}
