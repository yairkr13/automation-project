package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import tests.supers.TestBase;
import util.GenUtils;

public class OldCodeTest extends TestBase {

	final static String ACCOUNT_CREATED= "ACCOUNT CREATED";
	final static String ACCOUNT_DELETED= "ACCOUNT DELETED";
	private String title;
	private String username;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String country;
	private String state;
	private String city;
	private String zipcode;
	private String mobileNumber;
	private final static String SITE_NAME ="https://www.automationexercise.com/";
	
	@Test
	public void test() {
		try {

			initParameter();
			
			WebDriver driver = app.getDriver();

			log.info("Opening site '"+ SITE_NAME +"'...");
			driver.get(SITE_NAME);

			log.info("Get 'Test Cases' button text");
			String text = driver.findElement(By.xpath("//button[text()='Test Cases']")).getText();
			log.info("The Button text is " + text);

			log.info("Verify that main page opened successfully");
			driver.findElement(By.className("features_items"));
			log.info("Click 'Signup / Login' link");
			driver.findElement(By.linkText("Signup / Login")).click();
			log.info("Verify that page 'Signup/Login' opened successfully");
			driver.findElement(By.className("signup-form"));
			log.info("Fill 'Name' textbox '"+ username +"'");
			driver.findElement(By.name("name")).sendKeys(username);
			log.info("Fill 'Email Address' textbox '"+ email +"'");
			driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
			log.info("Click 'Signup' button");
			driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
			log.info("Verify that register page opened successfully");
			driver.findElement(By.cssSelector("button[data-qa='create-account']"));
			GenUtils.sleepMillis(2000);

			log.info("Select '" + title + "' radio button");
			driver.findElement(By.id("id_gender1")).click();
			log.info("Fill 'Password' textbox '"+ password +"'");
			driver.findElement(By.id("password")).sendKeys(password);
			log.info("Fill 'First name' textbox '"+ firstName +"'");
			driver.findElement(By.name("first_name")).sendKeys(firstName);
			log.info("Fill 'Last name' textbox '"+ lastName +"'");
			driver.findElement(By.name("last_name")).sendKeys(lastName);
			log.info("Fill 'Address' textbox '"+ address +"'");
			driver.findElement(By.id("address1")).sendKeys((address));
			log.info("Select '" + country + "' from the 'Country' dropdown");
			Select countryDropdown = new Select(driver.findElement(By.id("country")));
			countryDropdown.selectByVisibleText(country);
			log.info("Fill 'State' textbox '"+ state +"'");
			driver.findElement(By.id("state")).sendKeys(state);
			log.info("Fill 'City' textbox '"+ city +"'");
			driver.findElement(By.id("city")).sendKeys(city);
			log.info("Fill 'Zipcode' textbox '"+ zipcode +"'");
			driver.findElement(By.id("zipcode")).sendKeys(zipcode);
			log.info("Fill 'Mobile number' textbox '"+ mobileNumber +"'");
			driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);

			GenUtils.sleepMillis(2000);

			log.info("Submit 'Create Account' button");
			driver.findElement(By.cssSelector("button[data-qa='create-account']")).submit();
			log.info("Click 'Continue' button");
			driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
			log.info("Verify that main page opened successfully");
			driver.findElement(By.className("features_items"));
			log.info("Ensure 'Logout' link appears above");
			driver.findElement(By.cssSelector("a[href='/logout']"));
			log.info("Ensure 'Delete Account' link appears above");
			driver.findElement(By.cssSelector("a[href='/delete_account']"));

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
	
	private void initParameter() {
		String timestamp = GenUtils.getCurrentTimestamp(GenUtils.TIME_FORMAT_ddMMyyHHmmSSS);
		title= "Mr.";
		username= "Yair" + timestamp;
		email = "yairkr" + timestamp + "@edu.hac.ac.il";
		password = "qwe12345";
		firstName= "Yair";
		lastName= "Krothamer";
		address= "Barak 8";
		country= "Israel";
		state= "Israel";
		city= "Jerusalem";
		zipcode= "93391";
		mobileNumber= "052123456";
	}
}
