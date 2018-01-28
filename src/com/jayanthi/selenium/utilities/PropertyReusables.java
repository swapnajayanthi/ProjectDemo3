package com.jayanthi.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReusables {

	private String filePath;
	private File file;
	private FileInputStream fip;
	private Properties prop;
	public PropertyReusables(String filepath)
	{
		this.filePath=filepath;
		try
		{
		file=new File(filePath);
		fip=new FileInputStream(file);
		prop=new Properties();
		prop.load(fip);
		}
		catch(Exception e)
		{
			
		}
	}
	public String getProperity(String key)
	{
		String value=prop.getProperty(key);
		return value;
	}
	public String getProperity(String key,String defaultvalue)
	{
		String value=prop.getProperty(key, defaultvalue);
		return value;
	}

}
