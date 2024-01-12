package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
  public static WebDriver driver;
  public static Properties prop;
  FileInputStream file;
     public static String projectPath = System.getProperty("user.dir");
     
     public void setUp()  {
	  try {
		file = new FileInputStream(projectPath+"\\src\\main\\resources\\com\\Property\\config.properties");
	} catch (FileNotFoundException e) {
		
	
	  prop=new Properties();
	  try {
	  prop.load(file);
	} catch (IOException e) {

		e.printStackTrace();
	}
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  prop.getProperty("weburl");
	 
	  driver.get(prop.getProperty("weburl"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  }
