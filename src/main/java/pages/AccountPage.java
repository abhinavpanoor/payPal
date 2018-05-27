package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountPage  extends ProjectMethods{
		public AccountPage() {		
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.LINK_TEXT,using="Next")
		private WebElement nextButton;
		
		public PersonalInfo clickNextButton()
		{click(nextButton);
		return new PersonalInfo();
		
		}
	}

