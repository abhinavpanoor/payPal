package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	public FindLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement firstName;
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLead;
	
	
	
	public FindLead enterFindLeadName(String fName) throws InterruptedException
	
	{   Thread.sleep(3000);
		type(firstName, fName);
		click(findLead);
		
		
		
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement clickOnFirstRow;
	String text = clickOnFirstRow.getText();
	
public ViewLead clickFirstLead() throws InterruptedException
	
	{//Thread.sleep(2000);
	String text = clickOnFirstRow.getText();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		click(clickOnFirstRow);
		
		
		
		return new ViewLead();
	}
@FindBy(how=How.XPATH,using="(//input[@class=' x-form-text x-form-field ']")
private WebElement ID;
public FindLead enterFindLeadID()

{
	type(ID, text);
	click(findLead);
	
	
	
	return this;
}
	
	
	
}
