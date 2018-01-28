package com.jayanthi.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReusables {
	private static String filePath;
	private static Workbook wr;
	private static Sheet sheet;
	private static Row row;
	private static Cell cell;
	private static File file;
	private static FileInputStream fip;
	private static String cellValue;
	public ExcelReusables(String filePath)
	{
		this.filePath=filePath;
		try
		{
			file=new File(filePath);
			fip=new FileInputStream(file);
			wr=WorkbookFactory.create(fip);
		}
		catch(Exception e)
		{
			
		}
	}
	public static Sheet getSheet(String sheetname)
	{
		sheet=wr.getSheet(sheetname);
		return sheet;
	}
	public static Row getRow(int rowno)
	{
		row=sheet.getRow(rowno);
		return row;
	}
	public static String getCellData(int cellno)
	{
		cell=row.getCell(cellno);
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			cellValue=cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			cellValue=cell.getNumericCellValue()+"";
		}
		else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		{
			cellValue=cell.getBooleanCellValue()+"";
		}
		return cellValue;
	}
	public static String getData(String sheetname,int rowno,int cellno)
	{
		sheet=wr.getSheet(sheetname);
		row=sheet.getRow(rowno);
		cell=row.getCell(cellno);
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			cellValue=cell.getStringCellValue();
			
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			cellValue=cell.getNumericCellValue()+"";
			
		}
		else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		{
			cellValue=cell.getBooleanCellValue()+"";
			
		}
		return cellValue;
	}
	public static List<String> getAllData(String sheetname,int rowno,int cellno)
	{
		sheet=wr.getSheet(sheetname);
		row=sheet.getRow(rowno);
		cell=row.getCell(cellno);
		List<String> list=new ArrayList();
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			cellValue=cell.getStringCellValue();
			list.add(cellValue);
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			cellValue=cell.getNumericCellValue()+"";
			list.add(cellValue);
		}
		else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		{
			cellValue=cell.getBooleanCellValue()+"";
			list.add(cellValue);
		}
		return list;
	}

}
