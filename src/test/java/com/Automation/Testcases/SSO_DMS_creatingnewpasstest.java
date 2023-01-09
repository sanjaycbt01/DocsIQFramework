package com.Automation.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class SSO_DMS_creatingnewpasstest  extends ActionEngine {
	
		
	//String ExcelPath = "./TestData/EPIC.xlsx";
	 
	String ExcelPath = "./TestData/Newsheet.xlsx";
	
	@DataProvider(name = "RoleData1")
	public Object[][] getRoleData1() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Newrole1");
		return getRoleData;
	}
	
	@DataProvider(name = "RoleData2")
	public Object[][] getRoleData2() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "setglobalprofile");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData3")
	public Object[][] getRoleData3() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Designation");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData4")
	public Object[][] getRoleData4() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "ssouserregistration");
		return getRoleData;
	}
	

	@DataProvider(name = "RoleData5")
	public Object[][] getRoleData5() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "roleasignment");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData6")
	public Object[][] getRoleData6() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "creatingnewpass");
		return getRoleData;
	}
	
	
	@DataProvider(name = "RoleData7")
	public Object[][] getRoleData7() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "plantregistration");
		return getRoleData;
	}
	
	@DataProvider(name = "RoleData8")
	public Object[][] getRoleData8() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "plantremarks");
		return getRoleData;
	}
	

	@DataProvider(name = "RoleData9")
	public Object[][] getRoleData9() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "userproduct");
		return getRoleData;
	}
	

	@DataProvider(name = "RoleData10")
	public Object[][] getRoleData10() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "setsecurityprofile");
		return getRoleData;
	}
	/*
	@DataProvider(name = "RoleData11")
	public Object[][] getRoleData11() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "Newroleandglobalprofileepic");
		return getRoleData;
	}
	
	
	
	
	@DataProvider(name = "RoleData12")
	public Object[][] getRoleData12() {
		Object getRoleData[][] = Excelutil.getTestData(ExcelPath, "epicuserproduct");
		return getRoleData;
	}
	
	*/
	
	
	
	
	
	public SSO_DMS_creatingnewpasstest() {

		super(ConfigsReader.getPropValue("applicationUrl"));
		
		//super(ConfigsReader.getPropValue("EpicapplicationUrl"));
	}
	
	
	/**
	 * Method is for Role registration/
	 * 
	 */
	

	
	@Test(priority = 1, dataProvider = "RoleData1", enabled = true)
	public void ssoroleregistration( String Emplevel, String Emprole) {
		this.test = extent.createTest("Role registartion Flow");
		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
	
		
	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
	
}
	
	/**
	 * Method is for Creating GlobalProfile registration/
	 * 
	 */
	
	@Test(priority = 2, dataProvider = "RoleData2", enabled = true)
	public void ssoglobalprofile( String Roleval) {
		this.test = extent.createTest("ssodmsglobalprofile Flow");
		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		
	ssodmsglobalprofile.ssodmsglobalprofile(Roleval, ConfigsReader.getPropValue("pwdsso"));
}
	
	/**
	 * Method is for Designation/
	 * 
	 */
	
	
	
	
	@Test(priority = 3, dataProvider = "RoleData3", enabled = true)
	public void ssodesignation( String EmpDesignationcode, String EmpDesignation, String EmpLevel) {
		this.test = extent.createTest("ssodesignation Flow");
		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		
		
		ssodesignation.ssodmsdesignation(EmpDesignationcode, EmpDesignation, EmpLevel, ConfigsReader.getPropValue("pwdsso"));
		
		
} 
	
	/**
	 * Method is for UserRegistration/
	 * 
	 */
	
	
	
	@Test(priority = 4, dataProvider = "RoleData4", enabled = true)
	public void ssouserregistration(String Dsearch, String Efirstname, String Elastname, String Euserid, String Empid, String Eemailid)
	{
		this.test = extent.createTest("ssodmsuserregistration Flow");
		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
//	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
		ssodmsuserregistration.ssouserregistration(Dsearch, Efirstname, Elastname, Euserid, Empid,
	Eemailid,ConfigsReader.getPropValue("pwdsso"));
		
	//	UserRegistration.userReg(Dsearch, Efirstname, Elastname, Euserid, Empid, ConfigsReader.getPropValue("pwdsso"));		
}
	
	
	
	/**
	 * Method is for Role Assignment/
	 * 
	 */
	
	@Test(priority = 5, dataProvider = "RoleData5", enabled = true)
	public void ssoroleassignment(String userna,String role) {
		
		this.test = extent.createTest("RoleAssignment Flow");

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		//roleassignment.RoleAssign(username, role, ConfigsReader.getPropValue("pwdsso"));
//	dmsrolereg.ssodmsroleregistor(Emplevel, Emprole, ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsroleassignment.ssodmsroleassignment( username, role,ConfigsReader.getPropValue("pwdsso"));
		ssodmsroleassignment.ssodmsroleassignment(userna, role,ConfigsReader.getPropValue("pwdsso"));
	
	
	}
	
	
	/**
	 * Method is for Login with temp pwd and creating new password/
	 * 
	 */
	
	
	@Test(priority = 6, dataProvider = "RoleData6", enabled = true)
	public void ssoLoginwithtemppwdandcreatnewpwd(String newpass, String renewpass ,String pwdssonepwd) 
	{

		this.test = extent.createTest("loginwithtemppassandcreatingnewpass Flow");
		//loginwithtemppwd.ssoLoginwithtemppwd(ConfigsReader.getPropValue("usernamessotpu"));
		loginwithtemppwd.ssoLoginwithtemppwd();
		//Rolereg.roleReg();
		
		ssodmscreatingnewpwd.ssodmscreatingnewpwd(newpass, renewpass , pwdssonepwd);
		
	}
	
	

	/**
	 * Method is for plant registration/
	 * 
	 */
	
	
	
	@Test(priority = 7, dataProvider = "RoleData7", enabled = true)
	public void ssodmsplantregistration(String ssoplantname, String ssoplantcode, String ssoplantaddress,
			String ssotimezonesearchbar, String ssoshortdateformat, String ssolongdateformat, String comments) {
		
		this.test = extent.createTest("ssodmsplantregistration");
		

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"), ConfigsReader.getPropValue("usernamesso"),
				ConfigsReader.getPropValue("pwdsso"));
		// Rolereg.roleReg();

		ssodmsplantreg.ssodmsplantregistration(ssoplantname, ssoplantcode, ssoplantaddress, ssotimezonesearchbar,
				ssoshortdateformat,ssolongdateformat, comments, ConfigsReader.getPropValue("pwdsso"));

	
	}
	

	/**
	 * Method is for plant or product module assignment/
	 * 
	 */
	
	@Test(priority = 8, dataProvider = "RoleData8", enabled = true)
	public void ssodmsplantorproductmoduleassignment( String plantremarksfield) {
		
		this.test = extent.createTest("ssodmsplantpromoduleass");

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
		plantproductormoduleass.ssodmsplantpromoduleass(plantremarksfield, ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}
	

	/**
	 * Method is for user product or module assignment/
	 * 
	 */
	
@Test(priority = 9, dataProvider = "RoleData9", enabled = true)
	
	public void ssouserproductmoduleassignment(String userplantname, String Categoryval, String Roleval, String plantval) {
	
	this.test = extent.createTest("ssouserproductormoduleass");

		ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
		//Rolereg.roleReg();
		
		ssouserproductormoduleass.UserProduct(userplantname, Categoryval, Roleval, plantval,ConfigsReader.getPropValue("pwdsso"));
		
		//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}



/**
 * Method is for set security profile/
 * 
 */
	
@Test(priority = 10, dataProvider = "RoleData10", enabled = true)
public void SSOSetsecurityprofile(String minuseridlen,String minpasslen,String maxtanureofpass, String passexpalert , String retainhislastpass, String Accountlockout, String idealsessiontimeout , String remarks)
{

	this.test = extent.createTest("ssosetsecurity");
	ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
	//Rolereg.roleReg();
	
	ssosetsecurity.ssodmssetsecurityprofile(minuseridlen, minpasslen, maxtanureofpass, passexpalert, retainhislastpass, Accountlockout, idealsessiontimeout, remarks, ConfigsReader.getPropValue("pwdsso"));
	
	
	
	//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}



/**
 * Method is Epic role and global profile creation/
 * 
 */

/*

@Test(priority = 11, dataProvider = "RoleData11", enabled = true)
public void Epicroleandglobalprofilecreation( String Emplevelepic, String Emproleepic,
		String Rolevalepic, String Emplevelepic2,String Emproleepic2,String Rolevalepic2,
		String Emplevelepic3,String Emproleepic3,String Rolevalepic3)
{
	
	this.test = extent.createTest("epicroleandglobalprofilecreation");
	
//	int i=3;
//	for(i=0;i<=3;i++){
		
		epicloginpageoq.epicdmsLogin(ConfigsReader.getPropValue("usernameepic"),ConfigsReader.getPropValue("pwdepic"));
	//Rolereg.roleReg();
	
	epicroleandglobalprofilecre.epicroleandglobalprofilecreation(Emplevelepic, Emproleepic, Rolevalepic, Emplevelepic2, Emproleepic2, Rolevalepic2, Emplevelepic3, Emproleepic3, Rolevalepic3, ConfigsReader.getPropValue("pwdsso"));
	
	//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
//}

}


/**
 * Method is for Mapping epic role and global profile in sso /
 * 
 */
/*
@Test(priority = 12, dataProvider = "RoleData12", enabled = true)

public void Mappingepicroleandglobalprofileinsso(String userplantnameepic, String Categoryvalepic, String Rolevalepic, String plantvalepic,String userplantnameepic2, String Categoryvalepic2, String Rolevalepic2, String plantvalepic2, String userplantnameepic3, String Categoryvalepic3, String Rolevalepic3, String plantvalepic3){
	
	
	this.test = extent.createTest("mappingepicroleandglobalprofileinsso");

	ssodmslogin.ssodmsLogin(ConfigsReader.getPropValue("companycodesso"),ConfigsReader.getPropValue("usernamesso"), ConfigsReader.getPropValue("pwdsso"));
	//Rolereg.roleReg();
	
	mappingepicroleandglobalprofileinsso.UserProductepic(userplantnameepic, Categoryvalepic, Rolevalepic, plantvalepic, userplantnameepic2, Categoryvalepic2, Rolevalepic2, plantvalepic2, userplantnameepic3, Categoryvalepic3, Rolevalepic3, plantvalepic3, ConfigsReader.getPropValue("pwdsso"));
	
	//ssodmsglobalprofile.ssodmsglobalprofile(Categoryval, Roleval, ConfigsReader.getPropValue("pwdsso"));
}

*/



}

	
	

