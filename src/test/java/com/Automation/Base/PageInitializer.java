package com.Automation.Base;

import com.Automation.Pages.AssociateDCR;
import com.Automation.Pages.Docs_Loginpage;
import com.Automation.Pages.DocumentPreReq;
import com.Automation.Pages.DocumentPreparationRequestRegistrationApprovalAuditTrails;
import com.Automation.Pages.MytaskDocTask;
import com.Automation.Pages.PrintDriverConfig;
import com.Automation.Pages.Signout;
import com.Automation.Pages.WorkTransferAuditTrails;
import com.Automation.Pages.Work_Transfer;
import com.Automation.Utils.ESign;

public class PageInitializer extends TestEngine {

	public static DocumentPreparationRequestRegistrationApprovalAuditTrails documenntPrepReqRegApprovalAuditTrails;
	public static AssociateDCR AssociateDocCR;
	public static WorkTransferAuditTrails WTFAuditTrails;
	public static Work_Transfer WorkTransfer;
	public static TestEngine Testsetup;
	public static ESign E_sign;
	public static Signout Logout;
	public static Docs_Loginpage Docsloginpage;
	public static DocumentPreReq DocPreReq;
	public static MytaskDocTask DocumentTask;
	public static PrintDriverConfig print1;

	public PageInitializer(String url) {

		super(url);
	}

	public PageInitializer() {

	}

	public static void initializePageObjects() {

		documenntPrepReqRegApprovalAuditTrails = new DocumentPreparationRequestRegistrationApprovalAuditTrails();
		AssociateDocCR = new AssociateDCR();
		WTFAuditTrails = new WorkTransferAuditTrails();
		WorkTransfer = new Work_Transfer();
		Testsetup = new TestEngine();
		E_sign = new ESign();
		Logout = new Signout();
		Docsloginpage = new Docs_Loginpage();
		DocPreReq = new DocumentPreReq();
		DocumentTask = new MytaskDocTask();
		print1 = new PrintDriverConfig();
	}
}
