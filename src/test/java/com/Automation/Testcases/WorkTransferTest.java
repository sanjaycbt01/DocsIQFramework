package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;
import com.itextpdf.tool.xml.css.parser.state.Properties;

public class WorkTransferTest extends ActionEngine {
	// WebDriver driver;
	Properties prop;

	String ExcelPath = "./TestData/WorkTransferdata.xlsx";

	public WorkTransferTest() {
		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	/*
	 * @DataProvider(name = "WorkTransfer1") public Object[][] getWorkTransfer() {
	 * Object getWorkTransfer[][] = Excelutil.getTestData(ExcelPath,
	 * "WorkTransfer"); return getWorkTransfer; }
	 */
	@DataProvider(name = "WorkTransfer")
	public Object[][] getworkTransfer() {

		Object workTransfor[][] = Excelutil.getTestData(ExcelPath, "WorkTransfer");
		return workTransfor;
	}

	// method is for WorkTransfer
	@Test(priority = 1, dataProvider = "WorkTransfer", enabled = true)

	public void WorkTransfer(String TranferFrom, String TransferTo, String DocUniCode) {

		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("InitiatorId"),
				ConfigsReader.getPropValue("Initiatorpwd"));

//			Docsloginpage.dociqplantselection();

		WorkTransfer.workTransfer(TranferFrom, TransferTo, DocUniCode);
	}

}
