package pages.usual_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class RegisterPage extends MenusPage{

	public RegisterPage(MainPageManager pages) {
		super(pages);
	}

	public RegisterPage ensurePageLoaded() {
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		return this;
	}

	public RegisterPage chooseTitle(String title)
	{
		log.info("Select '" + title + "' radio button");
		driver.findElement(By.id("id_gender1")).click();
		return this;
	}

	public RegisterPage typePassword(String password)
	{
		log.info("Fill 'Password' textbox '"+ password +"'");
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public RegisterPage typeName(String firstName)
	{
		log.info("Fill 'First name' textbox '"+ firstName +"'");
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		return this;
	}

	public RegisterPage typeLastName(String lastName)
	{
		log.info("Fill 'Last name' textbox '"+ lastName +"'");
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		return this;
	}

	public RegisterPage typeAddress(String address)
	{
		log.info("Fill 'Address' textbox '"+ address +"'");
		driver.findElement(By.id("address1")).sendKeys(address);
		return this;
	}

	public RegisterPage chooseCountry(String country)
	{
		log.info("Select '" + country + "' from the 'Country' dropdown");
		Select countryDropdown = new Select(driver.findElement(By.id("country")));
		countryDropdown.selectByVisibleText(country);
		return this;
	}

	public RegisterPage typeState(String state)
	{
		log.info("Fill 'State' textbox '"+ state +"'");
		driver.findElement(By.id("state")).sendKeys(state);
		return this;
	}

	public RegisterPage typeCity(String city)
	{
		log.info("Fill 'City' textbox '"+ city +"'");
		driver.findElement(By.id("city")).sendKeys(city);
		return this;
	}

	public RegisterPage typeZipcode(String zipcode)
	{
		log.info("Fill 'Zipcode' textbox '"+ zipcode +"'");
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		return this;
	}

	public RegisterPage typeMobileNumber(String mobileNumber)
	{
		log.info("Fill 'Mobile number' textbox '"+ mobileNumber +"'");
		driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);
		return this;
	}

	public MessagesPage clickCreateAccountButton(){
		log.info("Submit 'Create Account' button");
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).submit();

		return pages.messagesPage.ensurePageLoaded();
	}
}
