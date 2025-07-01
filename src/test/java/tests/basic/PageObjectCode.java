package tests.basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import tests.supers.TestBase;
import util.GenUtils;


public class PageObjectCode extends TestBase {

	private final static String SITE_NAME ="https://www.automationexercise.com/";
	private String timestamp;
	private String title;
	private String username;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String country;
	private String city;
	private String zipcode;
	private String mobileNum;
	
	
	@Test
	public void test() {
		try {
			initParameters();
			
			WebDriver driver = app.getDriver();

			log.info("Opening site '"+SITE_NAME+"'...");
			driver.get(SITE_NAME);
			//app.pages().menusPage.clickSignupLoginLink();

			app.pages().homePage.ensurePageLoaded().clickSignupLoginLink()

					.typeUsername(username).typeSignupEmail(email)

					.clickSignupBtn()
					.chooseTitle(title)
					.typePassword(password)
					.typeName(firstName)
					.typeLastName(lastName)
					.typeAddress(address)
					.chooseCountry(country)
					.typeState(state)
					.typeCity(city)
					.typeZipcode(zipcode)
					.typeMobileNumber(mobileNum)
					.clickCreateAccountButton()
					.clickContinue()
					.verifyLogoutLink()
					.verifyDeleteLink();

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
	
	private void initParameters() {
		String timestamp = GenUtils.getCurrentTimestamp(GenUtils.TIME_FORMAT_ddMMyyHHmmSSS);
		username= "Yair" + timestamp;
		email = "yairkr" + timestamp + "@edu.hac.ac.il";
		title= "Mr.";
		password = "qwe12345";
		firstName= "Yair";
		lastName= "Krothamer";
		address= "Barak 8";
		country= "Israel";
		state= "Israel";
		city= "Jerusalem";
		zipcode= "93391";
		mobileNum= "052123456";
	}
}



