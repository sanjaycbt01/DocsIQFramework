package com.Automation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.Base.ActionEngine;
import com.Automation.Utils.ConfigsReader;
import com.Automation.Utils.Excelutil;

public class Epiqplanttest  extends ActionEngine {

	
	
	public Epiqplanttest() {

		super(ConfigsReader.getPropValue("http://10.10.3.1/epiqByCaliber_GM_TST/Pages/PlantSelection?ref=login"));

	}


	public void plantoq(String plantepictest)
	{

		

		epiqplant.epicplant();
		
	}
	
}
