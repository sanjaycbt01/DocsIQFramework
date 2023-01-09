package com.Automation.Pages;

import java.sql.Time;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ESign;
import com.Automation.Utils.TimeUtil;

public class Work_Transfer extends ActionEngine {

	@FindBy(xpath = "//a[@class='caliber-product-dms product-icon1']")
	WebElement docsiqicon;

	@FindBy(xpath = "//ul[@id='DMS_Document Manager']")
	WebElement docsManager;

	@FindBy(xpath = "//ul[@id='DMS_Document Manager']/child::li//a[contains(text(),'Transactions')]")
	WebElement transactions;

	@FindBy(xpath = "/html/body/div[2]/ul/li/ul/li[2]/ul/li[3]/ul/li[16]/a")
	WebElement worktransfer_menu;

	@FindBy(id = "btnModal_DMSWorkTransfer_TrnsferFrom")
	WebElement transferfrom_user;

	@FindBy(xpath = "//*[@id=\"ListTab\"]/tbody/tr[27]/td/input")
	WebElement radioBtn_skumar2_user;

	@FindBy(id = "DMSWorkTransfer_TrnsferFrom_selectBtn")
	WebElement userAdd_btn;

	@FindBy(id = "btnModal_DMSWorkTransfer_TrnsferTo")
	WebElement usertransferto_btn;

	@FindBy(xpath = "//*[@id=\"ListTab\"]/tbody/tr[17]/td/input")
	WebElement radioBtn_skumar4_user;

	@FindBy(xpath = "//*[@id=\"DMSWorkTransfer_TrnsferTo_selectBtn\"]")
	WebElement transfertoUser_addbtn;

	@FindBy(id = "btnModal_DMSWorkTransfer_MultiDocsAul")
	WebElement click_Addtask;

	@FindBy(xpath = "//button[@class='DMSWorkTransfer_MultiDocsAulAddRemoveBtn btn btn-sm  notselected'][1]")
	WebElement select_docs;

	@FindBy(xpath = "//button[@id='DMSWorkTransfer_MultiDocsAul_selectBtn']")
	WebElement addDocs_btn;

	@FindBy(xpath = "//*[@id='btnSubmit']")
	WebElement submit_btn;

	@FindBy(xpath = "//input[@id='txtESignPassword']")
	WebElement passwordtxt;

	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement submitEsign;

	public Work_Transfer() {
		PageFactory.initElements(driver, this);
	}

	public void workTransfer(String tranferFrom, String transferTo, String docUniCode) {
		TimeUtil.shortWait();
		click(docsiqicon, "Docsiqicon");
		click(docsManager, "DocsManager");
		click(transactions, "Transactions");
		click(worktransfer_menu, "Worktransfer_menu");

		switchToBodyFrame(driver);
		// Add Transfer user skumar2
		click(transferfrom_user, "transferfrom_user");
		click(radioBtn_skumar2_user, "RadioBtn_skumar2_user");
		click(userAdd_btn, "UserAdd_btn");
		// //Add Transfer user skumar4
		click(usertransferto_btn, "Usertransferto_btn");
		click(radioBtn_skumar4_user, "RadioBtn_skumar4_user");
		click(transfertoUser_addbtn, " TransfertoUser_addbtn");
		// click_Addtask
		click(click_Addtask, "click_Addtask");
		// switchToBodyFrame(driver);
		click(select_docs, "select_docs");
		// TimeUtil.shortWait();
		// switchToDefaultContent(driver);

		click(addDocs_btn, "addDocs_btn");
		click(submit_btn, "Submit_btn");
		sendText(passwordtxt, "password4", "Passwordtxt val");
		click(submitEsign, "submit Esign");
		ESign.Esign("pass1");

	}

}
