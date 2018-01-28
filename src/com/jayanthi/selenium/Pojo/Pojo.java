package com.jayanthi.selenium.Pojo;
import com.jayanthi.selenium.base.SeleniumActions;
import com.jayanthi.selenium.utilities.ExcelReusables;
import com.jayanthi.selenium.utilities.PropertyReusables;

public class Pojo {

	private static PropertyReusables pr;
	private static ExcelReusables ex;
	private static SeleniumActions sa;
	public static PropertyReusables getProp(String filePath)
	{
		  pr=new PropertyReusables(filePath);
		return pr;
	}
	public static ExcelReusables getExcel(String filePath)
	{
		ex=new ExcelReusables(filePath);
		return ex;
	}
	public static SeleniumActions getSA()
	{
		sa=new SeleniumActions();
		return sa;
	}

}
