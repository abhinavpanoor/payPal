package pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import wdMethods.ProjectMethods;

	public class signUpPage  extends ProjectMethods{
		public signUpPage() {		
			PageFactory.initElements(driver,this);
		}	
		@FindBy(how=How.ID,using="signup-button")
		private WebElement signUpButton;
		
		public AccountPage clickSignUp() {
			click(signUpButton);
			return new AccountPage();
		}
		
}
