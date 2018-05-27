package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.XPATH,using="//a[@href=\"/crmsfa/control/createLeadForm\"]")
	private WebElement createLead;
	@And("click create lead")
	public CreateLead clickCreateLead() {
		
		click(createLead);
		return new CreateLead() ;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement findLead;
	
public FindLead clickFindLead() {
		
		click(findLead);
		return new FindLead() ;
	
}
	}



	
	