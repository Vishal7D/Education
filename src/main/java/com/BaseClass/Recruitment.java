package com.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment extends BaseClass{
	
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
	

	@FindBy(xpath="//div[text()='akakaka']")
	WebElement vacancy_akakaka;
	
	@FindBy(xpath="(//div[text()='-- Select --'])[2]")
	WebElement vacancies;
	
	@FindBy(xpath="(//div[text()='-- Select --'])[3]")
	WebElement hiringManager;
	

	@FindBy(xpath="(//div[text()='-- Select --'])[4]")
	WebElement status;
	

	@FindBy(xpath="(//div[text()='-- Select --'])[5]")
	WebElement methodOfApplication;
	
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
