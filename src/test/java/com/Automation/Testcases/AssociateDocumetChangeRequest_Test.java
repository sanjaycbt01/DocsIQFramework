package com.Automation.Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

/*Verifying of Associate Document Change Request flow*/

public class AssociateDocumetChangeRequest_Test extends ActionEngine {
	String ExcelPath = "./TestData/AssociateDocChangeReq.xlsx";

	@DataProvider(name = "ADChangeRequest")
	public Object[][] getDPRequestData() {
		Object getDPRequestData[][] = Excelutil.getTestData(ExcelPath, "ADCRequest");
		return getDPRequestData;

	}

	@DataProvider(name = "ADChangeRequestRev1")
	public Object[][] getDPRequestrev() {
		Object getDPRequestData[][] = Excelutil.getTestData(ExcelPath, "ADCRREV1");
		return getDPRequestData;
	}

	@DataProvider(name = "ADChangeUnderPrepIni")
	public Object[][] getADChangeUnderPrep() {
		Object getADCRequestData[][] = Excelutil.getTestData(ExcelPath, "UnderprepReqIni");
		return getADCRequestData;
	}

	@DataProvider(name = "ADCRUnderPreprationaproval")
	public Object[][] getDPunderPrepaprv() {
		Object getDPRequestData[][] = Excelutil.getTestData(ExcelPath, "UnderPreprationaproval");
		return getDPRequestData;
	}

	@DataProvider(name = "UnderPublishinitiation")
	public Object[][] getDPunderPublishini() {
		Object getDPRequestData[][] = Excelutil.getTestData(ExcelPath, "UnderPublishinitiation");
		return getDPRequestData;
	}

	@DataProvider(name = "UnderPublishApproval")
	public Object[][] getDPunderPublishApproval() {
		Object getDPRequestData[][] = Excelutil.getTestData(ExcelPath, "UnderPublishApproval");
		return getDPRequestData;
	}

	public AssociateDocumetChangeRequest_Test() {
		super(ConfigsReader.getPropValue("applicationUrl"));
	}

	@Test(priority = 1, dataProvider = "ADChangeRequest", enabled = true)
	public void associatedocumentchangereq(String DocUniqueCodeval) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("InitiatorId"),
				ConfigsReader.getPropValue("Initiatorpwd"));
		AssociateDocCR.associateDocChangeReq(DocUniqueCodeval);

	}

	@Test(priority = 2, dataProvider = "ADChangeRequestRev1", enabled = true)
	public void adcrReview(String UniqueCodeval, String Remark) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID1"),
				ConfigsReader.getPropValue("Approver1pwd"));
		AssociateDocCR.associateDocChangeReqReview(UniqueCodeval, Remark);

	}

	@Test(priority = 3, dataProvider = "ADChangeRequestRev1", enabled = true)
	public void AdcrApprove(String UniqueCodeval, String Remark) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID2"),
				ConfigsReader.getPropValue("Approver2pwd"));
		AssociateDocCR.associateDocChangeReqReview(UniqueCodeval, Remark);

	}

	@Test(priority = 4, dataProvider = "ADChangeUnderPrepIni", enabled = true)
	public void ADCRunderPrepInitiationreq(String UniqueCodeValue, String Esignpwd) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("InitiatorId"),
				ConfigsReader.getPropValue("Initiatorpwd"));
		AssociateDocCR.underPreprationReqInitiation(UniqueCodeValue, ConfigsReader.getPropValue("Initiatorpwd"));

	}

	@Test(priority = 5, dataProvider = "ADCRUnderPreprationaproval", enabled = true)
	public void ADCRunderPreprationaprv(String UniqueCodevalue1, String Remarks, String Esignpwd) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID1"),
				ConfigsReader.getPropValue("Approver1pwd"));
		AssociateDocCR.underPreparationApproval(UniqueCodevalue1, Remarks, ConfigsReader.getPropValue("Approver1pwd"));

	}

	@Test(priority = 6, dataProvider = "ADCRUnderPreprationaproval", enabled = true)
	public void ADCRunderPreprationaprv1(String UniqueCodevalue1, String Remarks, String Esignpwd) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID2"),
				ConfigsReader.getPropValue("Approver2pwd"));
		AssociateDocCR.underPreparationApproval(UniqueCodevalue1, Remarks, ConfigsReader.getPropValue("Approver2pwd"));
	}

	@Test(priority = 7, dataProvider = "UnderPublishinitiation", enabled = true)
	public void ADCRunderPublishInitiation(String UniqueCodevaluePub, String Esignpwd) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("InitiatorId"),
				ConfigsReader.getPropValue("Initiatorpwd"));
		AssociateDocCR.associateDocunderPublishInitiation(UniqueCodevaluePub,
				ConfigsReader.getPropValue("Initiatorpwd"));
	}

	@Test(priority = 8, dataProvider = "UnderPublishApproval", enabled = true)
	public void AdcrPublishapproval(String UniqueCodevaluePublish, String Remarks, String Esignpwd) {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID1"),
				ConfigsReader.getPropValue("Approver1pwd"));
		AssociateDocCR.associateDocUnderPublishApprover(UniqueCodevaluePublish, Remarks,
				ConfigsReader.getPropValue("Approver1pwd"));
	}

	@Test(priority = 9, dataProvider = "UnderPublishApproval", enabled = true)
	public void AdcrPublishapproval1(String UniqueCodevaluePublish, String Remarks, String Esignpwd) {

		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"), ConfigsReader.getPropValue("ApproverID2"),
				ConfigsReader.getPropValue("Approver2pwd"));
		AssociateDocCR.associateDocUnderPublishApprover(UniqueCodevaluePublish, Remarks,
				ConfigsReader.getPropValue("Approver2pwd"));
	}

//	@AfterTest
//	public void afterTest() {
//		extent.flush();

}
