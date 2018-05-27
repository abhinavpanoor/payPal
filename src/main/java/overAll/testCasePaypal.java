package overAll;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.signUpPage;
import wdMethods.ProjectMethods;

public class testCasePaypal extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC001_CreateLead";
			testDescription="Creating a Account in PayPal";
			testNodes="Leads";
			category="Smoke";
			authors="Abhinav";
			browserName="chrome";
			dataSheetName="TCPayPal";
		}
		@Test(dataProvider="fetchData")
		public void payPal(String email,String pwd,String country) {
			
			new signUpPage()
			.clickSignUp();
//			.clickNextButton()
//			.selectdropDown(country)
//			.enterEmail(email)
//			.enterPassword(pwd)
//			.reenterPassword(pwd)
//			.clickNext2();
		
			
		}
		}
	
	
	

