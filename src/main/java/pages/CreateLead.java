package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;
	@And("enter company name as (.*)")
	public CreateLead enterCName(String cName)
	{type(companyName,cName);
	return this;}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	@And("enter first name as (.*)")
	public CreateLead enterfName(String fName)
	{type(firstName,fName);
	return this;
	
	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	@And("enter last name as (.*)")
	public CreateLead enterlName(String lName)
	{type(lastName,lName);
	return this;
	
	
	
	}
	@FindBy(how=How.NAME,using="submitButton")
	WebElement createleadButton;
	
	@And("click on create lead")
	public ViewLead clickCreateLead() {
		
		click(createleadButton);
		return new ViewLead() ;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	WebElement updateButton;
	public ViewLead clickUpdate() {
		
		click(updateButton);
		return new ViewLead() ;
	}
	
	

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement updatecompanyName;
	
	public CreateLead updateCName(String cName)
	{type(updatecompanyName,cName);
	return this;}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement updateFirstName;
	
	public CreateLead updateFName(String fName)
	{type(updateFirstName,fName);
	return this;
	
	
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement updateLastName;
	
	public CreateLead updateLName(String lName)
	{type(updateLastName,lName);
	return this;
	
	}
	}