package pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import wdMethods.ProjectMethods;

	public class PersonalInfo  extends ProjectMethods{
		public PersonalInfo() {		
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.ID,using="country")
		private WebElement dropDown;
		
		public PersonalInfo selectdropDown(String country) {
			selectDropDownUsingText(dropDown, country);
			return this;
		}
		
		@FindBy(how=How.ID,using="email")
		private WebElement email;
		
		public PersonalInfo enterEmail(String emailID)
		{type(email, emailID);
		return this;
		
	}
		@FindBy(how=How.ID,using="password")
		private WebElement password;
		public PersonalInfo enterPassword(String password)
		{type(email, password);
		return this;
		
	}
		@FindBy(how=How.ID,using="confirmPassword")
		private WebElement repassword;
		public PersonalInfo reenterPassword(String password)
		{type(email, password);
		return this;
		
	}
		@FindBy(how=How.ID,using="_eventId_personal")
		private WebElement clicknext;
		public PersonalInfo2 clickNext2()
		{click(clicknext);
		return new PersonalInfo2();
		
	}
		
		
		
		
		
}