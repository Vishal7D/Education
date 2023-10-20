package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class Recruitment extends BaseClass {


	public Recruitment()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[text()='Recruitment'])[1]")
     WebElement recruitment;
	 
	@FindBy(xpath="(//*[text()='Candidates'])[1]")
     WebElement candidatesTab;		
	
	@FindBy(xpath="(//*[text()='Vacancies'])[1]")
	WebElement vacanciesTab;
	

	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	WebElement jobTitleDropDown;
	
	@FindBy(xpath="//div[text()='Account Assistant']")
	WebElement jobTitle_AccountAssistant;

	@FindBy(xpath="//div[text()='Chief Executive Officer']")
	WebElement jobTitle_ChiefExecutiveOfficer;
	
	@FindBy(xpath="//div[text()='Chief Financial Officer']")
	WebElement jobTitle_ChiefFinancialOfficer;
	
	@FindBy(xpath="//div[text()='Chief Technical Officer']")
	WebElement jobTitle_ChiefTechnicalOfficer;
	
	@FindBy(xpath="//div[text()='Content Specialist']")
	WebElement jobTitle_ContentSpecialist;
	
	//------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath="(//div[text()='-- Select --'])[2]")
	WebElement vacancies;
	

	@FindBy(xpath="//div[text()='akakaka']")
	WebElement vacancy_akakaka;
	 

	@FindBy(xpath="//div[text()='Junior Account Assistant']")
	WebElement JuniorAccountAssistant;
	 
	@FindBy(xpath="((//div[text()='Associate IT Manager'])[1]")
	WebElement AssociateITManager;
	 
    @FindBy(xpath="//div[text()='Payroll Administrator']")
	WebElement PayrollAdministrator;
    	 
    @FindBy(xpath="(//div[text()='Sales Representative'])[1]")
    WebElement SalesRepresentative;
    
	@FindBy(xpath="(//div[text()='-- Select --'])[3]")
	WebElement hiringManager;
	//------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath="//*[text()='Odis Adalwin']]")
    WebElement OdisAdalwin;

    @FindBy(xpath="//*[text()='Linda Anderson']")
    WebElement LindaAnderson;

    @FindBy(xpath="//*[text()='Dominic Chase']")
    WebElement DominicChase;

    @FindBy(xpath="//*[text()='Kevin Mathews']")
    WebElement KevinMathews;
  
    @FindBy(xpath="//*[text()='as s']']")
    WebElement as_s;
  //-------------------------------------------------------------------------------------------------------------------------  
    @FindBy(xpath="(//div[text()='-- Select --'])[4]")
	WebElement status;
	
    @FindBy(xpath="//*[text()='Application Initiated']")
	WebElement ApplicationInitiated;
	

    @FindBy(xpath="//*[text()='Shortlisted']")
	WebElement Shortlisted;


    @FindBy(xpath="//*[text()='Rejected']")
	WebElement Rejected;
    

    @FindBy(xpath="//*[text()='Interview Scheduled']")
	WebElement InterviewScheduled;

    @FindBy(xpath="//*[text()='Interview Passed']")
	WebElement InterviewPassed;
	
    @FindBy(xpath="(//div[text()='-- Select --'])[5]")
	WebElement methodOfApplication;
    

    @FindBy(xpath="//*[text()='Online']")
	WebElement Online;
    

    @FindBy(xpath="//*[text()='Manual']")
	WebElement Manual;
  //--------------------------------------------------------------------------------------------
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement candidateName;
		
	@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']")
	WebElement keywords;
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement dateOfApplicationFrom;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement dateOfApplicationTo;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement resetButton;
	

	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	public void clickOnRecruitment() {
		
		recruitment.click();
	 
		
	}
}
