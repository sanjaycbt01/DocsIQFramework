package com.Automation.Testcases;

import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;

public class DocumentPreparationRequestRegistrationApprovalAuditTrails_Test  extends ActionEngine {
	
	/*Verifying of Document Preparation Request registration Approval and Audit Trails*/
	
	
	public DocumentPreparationRequestRegistrationApprovalAuditTrails_Test() {
		super(ConfigsReader.getPropValue("applicationUrl"));
	}
	@Test()
	public void documentPreparationRequestRegistration() {
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"),ConfigsReader.getPropValue("InitiatorId"),
				ConfigsReader.getPropValue("Initiatorpwd"));
		documenntPrepReqRegApprovalAuditTrails.documentPreparationRequestRegistration();
	}

}
