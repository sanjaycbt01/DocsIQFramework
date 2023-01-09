package com.Automation.Testcases;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;

import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SSO_UserRegistrationPreRequisites extends ActionEngine {
	String ExcelPath = "./TestData/SSOUserRegistration.xlsx";
/*
	@DataProvider(name = "UserRegistration")
	public Object[][] getUserRegistrationData() {
		Object getUserRegistrationData[][] = Excelutil.getTestData(ExcelPath, "UserRegistration");
		return getUserRegistrationData;
	}
	
	@DataProvider(name = "UserReg")
	public Object[][] getUserRegData() {
		Object getUserRegistrationData[][] = Excelutil.getTestData(ExcelPath, "UserReg");
		return getUserRegistrationData;
	}

	@DataProvider(name = "UserProductModuleAssignment")
	public Object[][] getUserProductModuleAssignmentData() {
		Object getUserProductModuleAssignmentData[][] = Excelutil.getTestData(ExcelPath, "UserProductModuleAssignment");
		return getUserProductModuleAssignmentData;
	}

	@DataProvider(name = "RoleAssignment")
	public Object[][] getRoleRegistrationRegData() {
		Object getRoleRegistrationData1[][] = Excelutil.getTestData(ExcelPath, "RoleAssignment");
		return getRoleRegistrationData1;
	}

	@DataProvider(name = "ProductModulePlantAssignment")
	public Object[][] getProductModulePlantAssignmentRegData() {
		Object getProductModulePlantAssignmentRegData[][] = Excelutil.getTestData(ExcelPath,
				"ProductModulePlantAssignment");
		return getProductModulePlantAssignmentRegData;
	}

	@DataProvider(name = "SetGlobalProfile")
	public Object[][] getSetGlobalProfileRegData() {
		Object getSetGlobalProfileRegData[][] = Excelutil.getTestData(ExcelPath, "GlobalProfile");
		return getSetGlobalProfileRegData;
	}

	public SSO_UserRegistrationPreRequisites() {

		super(ConfigsReader.getPropValue("SSOUrl"));
	}

	// PreRequisites::
	/*
	 * 
	 */

	/**
	 * Method is for UserRegistration
	 * 
	 */
	/*
	@Test(priority = 0, dataProvider = "UserRegistration", enabled = false)
	public void userRegistration(String Designationval, String firstnameval, String lastnameval, String UserIDval,
			String EmployeeIDval,String Role,String Categoryval, String plantval,
			String Departmentval) {
		this.test = extent.createTest("UserRegistration Flow");
		epiclogin.loginToSSOApplication(ConfigsReader.getPropValue("company"), ConfigsReader.getPropValue("SSOID"),
				ConfigsReader.getPropValue("SSOPWD"));
		UserRegistration.userReg(Designationval, firstnameval, lastnameval, UserIDval, EmployeeIDval,
				ConfigsReader.getPropValue("SSOPWD"));
		this.test = extent.createTest("RoleAssignment Flow");
		RoleAssignment.RoleAssign(UserIDval, Role, ConfigsReader.getPropValue("SSOPWD"));
		this.test = extent.createTest("ProductModule PlantAssignment Flow");
		UserProductModuleAssignment.UserProduct(UserIDval, Categoryval, Role, plantval, Departmentval,
				ConfigsReader.getPropValue("SSOPWD"));
		this.test = extent.createTest("ProductModule PlantAssignment Flow");
		ProductModulePlantAssignment.UserProductPlantAssign(ConfigsReader.getPropValue("SSOPWD"));
		epiclogin.loginToSSONewApplication(ConfigsReader.getPropValue("company"));
		UserRegistration.userReg();
		UserRegistration.userResetPWD(ConfigsReader.getPropValue("SSOPWD"));
		epiclogin.loginSSONewUserApplication(ConfigsReader.getPropValue("company"),ConfigsReader.getPropValue("SSOPWD"));
		
		driver.quit();
		
		}
	@Test(priority = 0, dataProvider = "UserReg", enabled = true)
	public void userReg(String Designationval, String firstnameval, String lastnameval, String UserIDval,
			String EmployeeIDval) {
		this.test = extent.createTest("User Registration Flow");
		epiclogin.loginToSSOApplication(ConfigsReader.getPropValue("company"), ConfigsReader.getPropValue("SSOID"),
				ConfigsReader.getPropValue("SSOPWD"));
		UserRegistration.userReg(Designationval, firstnameval, lastnameval, UserIDval, EmployeeIDval,
				ConfigsReader.getPropValue("SSOPWD"));
	}
	
	/**
	 * Method is for RoleAssignment
	 * 
	 */
	
	/*
	@Test(priority = 1, dataProvider = "RoleAssignment", enabled = true)
	public void Role_Assignment(String user, String Role) {
		this.test = extent.createTest("RoleAssignment Flow");
		RoleAssignment.RoleAssign(user, Role, ConfigsReader.getPropValue("EPICPWD"));
	}
	
	/**
	 * Method is for UserProductModuleAssignment
	 * 
	 */
	/*
	@Test(priority = 2, dataProvider = "UserProductModuleAssignment", enabled = true)
	public void UserProductModuleAssignment(String user, String Categoryval, String Roleval, String plantval,
			String Departmentval) {
		this.test = extent.createTest("UserProduct ModuleAssignment Flow");
		UserProductModuleAssignment.UserProduct(user, Categoryval, Roleval, plantval, Departmentval,
				ConfigsReader.getPropValue("SSOPWD"));
	}

	/**
	 * Method is for ProductModulePlantAssignment/
	 * 
	 */
	/*
	@Test(priority = 3, dataProvider = "ProductModulePlantAssignment", enabled = true)
	public void IM_ProductModulePlantAssignment(String user) {
		this.test = extent.createTest("ProductModule PlantAssignment Flow");
		ProductModulePlantAssignment.UserProductPlantAssign(ConfigsReader.getPropValue("SSOPWD"));
		epiclogin.loginToSSONewApplication(ConfigsReader.getPropValue("company"));
		UserRegistration.userReg();
		UserRegistration.userResetPWD(ConfigsReader.getPropValue("SSOPWD"));
		epiclogin.loginSSONewUserApplication(ConfigsReader.getPropValue("company"),ConfigsReader.getPropValue("SSOPWD"));
		
		driver.quit();
	}
*/
}

