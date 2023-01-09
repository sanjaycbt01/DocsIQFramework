package com.Automation.Testcases;

import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;

public class WTFauditTrailsTest extends ActionEngine {
		
	public WTFauditTrailsTest(){
	       super(ConfigsReader.getPropValue("applicationUrl"));
	}
	
	
	// method is for WorkTransfer Audit Trails
	@Test(priority = 1, enabled = true)
	public void WtfauditTrails() {
		
		Docsloginpage.docsiqlogin(ConfigsReader.getPropValue("Company"),
					ConfigsReader.getPropValue("InitiatorId"),
					ConfigsReader.getPropValue("Initiatorpwd"));
		
		WTFAuditTrails.WorkTransferAuditTrails1();
		
        	
	}
}
