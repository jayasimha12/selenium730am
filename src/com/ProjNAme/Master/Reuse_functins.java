package com.ProjNAme.Master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reuse_functins {
	
	
	WebDriver d;
	
	public String launchapp(String url)
	{
	   String	expres="OrangeHRM";
		
		d=new FirefoxDriver();
		d.get(url);
		
		String actres= d.getTitle();
		System.out.println("The ctual title is===="+actres);
		
		
		if(expres.equals(actres))
		
		return "Passs";
		else
			return "fail";
		
	}
	
	
	
	public String loginApp(String un,String psd) throws IOException
	{
		String exp="Welcome Admin";
		
		
		Properties pr=new Properties();
		FileInputStream fi=new FileInputStream("E:\\WorkSpace12\\RealProject\\src\\com\\ppname\\properties\\HRM.properties");
		
		pr.load(fi);
		
		d.findElement(By.id(pr.getProperty("usern"))).sendKeys(un);
		d.findElement(By.id(pr.getProperty("passw"))).sendKeys(psd);
		d.findElement(By.id("btnLogin")).click();
		
		String act= d.findElement(By.xpath(pr.getProperty("wellink"))).getText();
		
		if(exp.equalsIgnoreCase(act))
		
		return "pass";
		else
			return "fail";
	
	
	}
	

}
