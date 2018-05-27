/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLead {
	public static RemoteWebDriver driver;
	
	@Given("open the browser")
	public void openBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
		}
	@And("max the browser")
	public void maximize()
	
	{driver.manage().window().maximize();

	}
	@And("set time out")
	public void timeOut()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("enter the URL")
	public void enterURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("enter the username as (.*)")
	public void enterUserName(String data)
	{
		driver.findElementById("username").sendKeys(data);
		
	}
	@And("enter the password as (.*)")
	public void enterPassword(String data)
	{
		driver.findElementById("password").sendKeys(data);
		
	}
	@And("click on login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	@And("click on crmsfa")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	@And("click on Leads")
	public void clickLeads()
	{
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		
	}
	@And("click create lead")
	public void clickCreateLead()
	{
		driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").click();
		
	}
	@And("enter company name as (.*)")
	public void enterCompanyName(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		
	}
	
	@And("enter first name as (.*)")
	public void enterFirstName(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		
	}
	@And("enter last name as (.*)")
	public void enterLastName(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		
	}
	
	@And("click on create lead")
	public void clickCreateLead2()
	{
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}
	@Then("lead should be created")
	public void leadIsCreated()
	{
	
	System.out.println("Lead is created");
	
	}
	}
*/