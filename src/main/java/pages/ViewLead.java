package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement firstName;
	
	public ViewLead verifyfirstName(String fName) {
		
		verifyExactText(firstName, fName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[3]")
	private WebElement editLead;
public CreateLead clickEditLead() {
		
		click(editLead);
		return new CreateLead();
	}
@FindBy(how=How.XPATH,using="(//a[@class='subMenuButtonDangerous']")
private WebElement deleteLead;
public MyLeads clickDeleteLead() {
	
	click(deleteLead);
	return new MyLeads();
	}}