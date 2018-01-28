package com.jayanthi.selenium.businesscript;

import org.testng.annotations.Test;

import com.jayanthi.selenium.Pojo.Pojo;
import com.jayanthi.selenium.base.DriverEngine;
import com.jayanthi.selenium.constants.AppConstants;

public class ClearTrip extends DriverEngine {
	/*@Test
	public void train()
	{
	   getDriver().get(Pojo.getProp(AppConstants.getConfig()).getProperity("url"));
	   Pojo.getSA().click(Pojo.getProp(AppConstants.getOrpath()).getProperity("train_xpath"), "xpath",Pojo.getProp(AppConstants.getOrpath()).getProperity("train_xpath"));
	   Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",0,0),Pojo.getProp(AppConstants.getOrpath()).getProperity("train_xpath"),"id", Pojo.getProp(AppConstants.getOrpath()).getProperity("from_id"));
	   Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",0,1),Pojo.getProp(AppConstants.getOrpath()).getProperity("train_xpath"),"id", Pojo.getProp(AppConstants.getOrpath()).getProperity("to_id"));
	   
	}*/
	@Test(priority=0)

	public void flights()
	{
		getDriver().get(Pojo.getProp(AppConstants.getConfig()).getProperity("url"));
		 Pojo.getSA().click(Pojo.getProp(AppConstants.getOrpath()).getProperity("flight_xpath"), "xpath",Pojo.getProp(AppConstants.getOrpath()).getProperity("flight_xpath"));
		 Pojo.getSA().radio(Pojo.getProp(AppConstants.getOrpath()).getProperity("roundtrip_xpath"));
		 Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",3,1),Pojo.getProp(AppConstants.getOrpath()).getProperity("fromAirCity_id"),"id", Pojo.getProp(AppConstants.getOrpath()).getProperity("fromAirCity_id"),Pojo.getProp(AppConstants.getOrpath()).getProperity("fromdrop_id"));
		 Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",3,0),Pojo.getProp(AppConstants.getOrpath()).getProperity("toAirCity_id"),"id", Pojo.getProp(AppConstants.getOrpath()).getProperity("toAirCity_id"),Pojo.getProp(AppConstants.getOrpath()).getProperity("todrop_id"));
		 Pojo.getSA().getDate(Pojo.getProp(AppConstants.getOrpath()).getProperity("d_date_xpath"), "xpath","3");
		 // Pojo.getSA().getDate(Pojo.getProp(AppConstants.getOrpath()).getProperity("r_date_xpath"), "xpath","9");
		 Pojo.getSA().click(Pojo.getProp(AppConstants.getOrpath()).getProperity("i"),"xpath",Pojo.getProp(AppConstants.getOrpath()).getProperity("i"));
		 Pojo.getSA().getDate(Pojo.getProp(AppConstants.getOrpath()).getProperity("d_date_xpath"), "xpath","7");
		 Pojo.getSA().dropDown(Pojo.getProp(AppConstants.getOrpath()).getProperity("adults_id"),"id","3");
		 Pojo.getSA().click(Pojo.getProp(AppConstants.getOrpath()).getProperity("search"),"xpath",Pojo.getProp(AppConstants.getOrpath()).getProperity("SearchBtn"));
	}
	@Test
	public void multiCities()
	{
		getDriver().get(Pojo.getProp(AppConstants.getConfig()).getProperity("url"));
		 Pojo.getSA().click(Pojo.getProp(AppConstants.getOrpath()).getProperity("flight_xpath"), "xpath",Pojo.getProp(AppConstants.getOrpath()).getProperity("flight_xpath"));
		 Pojo.getSA().radio(Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_Xpath"));
		 Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",0, 0),Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_FirstCity_id"), "id",Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_FirstCity_id"), Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_FirstCity_Drop_id"));
		 Pojo.getSA().sendKeys(Pojo.getExcel(AppConstants.getExpath()).getData("sheet1",0, 1),Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_SecondCity_id"), "id",Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_SecondCity_id"), Pojo.getProp(AppConstants.getOrpath()).getProperity("multiCities_First_SecondCity_Drop_id"));
		// Pojo.getSA().getDate(locator, locatorType, day);
	}
}
	
