package com.jayanthi.selenium.base;


import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions extends DriverEngine {
public  void click(String locator,String locatorType,String imagePath)
{
	WebElement ele;
	switch(locatorType)
	{
	case "id":
		    		    
		    try{
		    	IsEnable e1=(WebElement e)->{
		    		System.out.println("hello");
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.click();
		    		}
    };
		    	e1.isEnabled(getDriver().findElement(By.id(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "name":
		 try{
		    	IsEnable e1=(WebElement e)->{
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.click();
		    		}
		    			};
		    	e1.isEnabled(getDriver().findElement(By.name(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "cssSelector":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.cssSelector(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "xpath":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.xpath(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "classname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.className(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "linktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.linkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "partiallinktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.partialLinkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "tagname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.click();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.tagName(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	}
}
public  void ScreenShot(String imagePath)
{
	TakesScreenshot tsh=(TakesScreenshot)getDriver();
	File file=tsh.getScreenshotAs(OutputType.FILE);
	try
	{
	FileUtils.copyFile(file, new File("F:\\Selenium\\Screenshot\\"+imagePath+".bmp"));
	
	}
	catch(Exception e)
	{
		System.out.println("");
	}
}
public void sendKeys(String textdata,String imagePath,String locatorType,String locator,String droplocate)
{
	WebElement ele;
	
	
	switch(locatorType)
	{
	case "id":
		    		    
		    try{
		    	IsEnable e1=(WebElement e)->{
		    				    			    		
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.sendKeys(textdata);
		    			System.out.println("send");
		    			WebElement autoOptions = getDriver().findElement(By.id(droplocate));
		    			WebDriverWait wait=new WebDriverWait(getDriver(),90);
		    			wait.until(ExpectedConditions.visibilityOf(autoOptions));

		    			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		    			for(WebElement option : optionsToSelect){
		    				System.out.println(option.getSize());
		    				System.out.println(option.getText());
		    		        if(option.getText().contains(textdata)) {
		    		        	System.out.println("Trying to select: ");
		    		            option.click();
		    		            break;
		    			}
		    			}
		    		}
		    			};
		    	e1.isEnabled(getDriver().findElement(By.id(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "name":
		 try{
		    	IsEnable e1=(WebElement e)->{
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.sendKeys(textdata);;
		    		}
		    			};
		    	e1.isEnabled(getDriver().findElement(By.name(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "cssSelector":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);;
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.cssSelector(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "xpath":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);;
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.xpath(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "classname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);;
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.className(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "linktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);;
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.linkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "partiallinktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);;
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.partialLinkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "tagname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.sendKeys(textdata);
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.tagName(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
}
}
public void radio(String locator)
{
	WebElement radio=getDriver().findElement(By.xpath(locator));
/*	List<WebElement>radios=getDriver().findElements(By.xpath("//nav[//nav[@class='row fieldRow tripType']/ul]"));*/
		String rtxt=radio.getText();
		if(radio.isDisplayed()&&radio.isEnabled())
		{
			radio.click();
		}
	}
public void  getDate(String locator,String locatorType,String day)
{
	/*Date d=new Date();
	d.getDay();*/
	WebElement ele;
	switch(locatorType)
	{
	case "xpath":
		  try{
			List<WebElement>eles= getDriver().findElements(By.xpath(locator));
			System.out.println("size"+eles.size());
			//Thread.sleep(3000);
			for(WebElement d:eles)
			{
				System.out.println(d.getText());
				System.out.println("gg");
				IsEnable e1=(WebElement e)->{
					System.out.println("jj");
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			System.out.println("calender");
		    			if(e.getText().equalsIgnoreCase(day))
		    			{
		    				Actions a=new Actions(getDriver());
		    				a.click(e).build().perform();
		    				//a.clickAndHold(e).build().perform();
		    			
		    			}
		    		}
		    			};
		    	e1.isEnabled(d);
			}
				
		  }
		  catch(Exception e)
		  {
			  
		  }
		 break;
	}
}
public void dropDown(String locator,String locatorType,String option)
{
	
	switch(locatorType)
	{
	case "id":
		     Select s=new Select(getDriver().findElement(By.id(locator)));
		     s.selectByValue(option);
		     
		break;
	}
}
public  void submit(String locator,String locatorType,String imagePath)
{
	WebElement ele;
	switch(locatorType)
	{
	case "id":
		    		    
		    try{
		    	IsEnable e1=(WebElement e)->{
		    		System.out.println("hello");
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.submit();
		    		}
		    			};
		    	e1.isEnabled(getDriver().findElement(By.id(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "name":
		 try{
		    	IsEnable e1=(WebElement e)->{
		    		if(e.isDisplayed()&&e.isEnabled())
		    		{
		    			e.submit();
		    		}
		    			};
		    	e1.isEnabled(getDriver().findElement(By.name(locator)));
		    }
		    catch(Exception e)
		    {
		    	ScreenShot(imagePath);
		    }
		    break;
	case "cssSelector":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.cssSelector(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "xpath":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.xpath(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "classname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.className(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "linktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.linkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "partiallinktext":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.partialLinkText(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	case "tagname":
		try{
	    	IsEnable e1=(WebElement e)->{
	    		if(e.isDisplayed()&&e.isEnabled())
	    		{
	    			e.submit();
	    		}
	    			};
	    	e1.isEnabled(getDriver().findElement(By.tagName(locator)));
	    }
	    catch(Exception e)
	    {
	    	ScreenShot(imagePath);
	    }
	    break;
	}
}
}
