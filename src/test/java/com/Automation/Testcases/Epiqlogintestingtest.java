package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Epiqlogintestingtest   extends ActionEngine {
	
	
	
	public Epiqlogintestingtest() {

		super(ConfigsReader.getPropValue("EpicapplicationUrltestingOQnewversion"));
	}
	
	

	void Loginofnew(){  
	
	
			
		epiqnewtest1newperson.epicdmsLogin(ConfigsReader.getPropValue("companycodeepiq1"),ConfigsReader.getPropValue("usernameepic1"),ConfigsReader.getPropValue("pwdepic1"));
		
	
	}
}