package com.test;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeMethod;

import com.BaseClass.BaseClass;

public class RecruitmentTest extends BaseClass {

	@BeforeMethod
 public void setUp() {	
	 try {
		launchTheWeb();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	
}
