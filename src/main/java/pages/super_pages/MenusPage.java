package pages.super_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages._pages_mngt.MainPageManager;
import pages.usual_pages.HomePage;
import pages.usual_pages.LoginOrSignupPage;
import pages.usual_pages.RegisterPage;

public class MenusPage extends AnyPage{

	public MenusPage(MainPageManager pages) {
		super(pages);
	}

	
	public MenusPage ensurePageLoaded() {
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
		return this;
	}

	public LoginOrSignupPage clickSignupLoginLink() {

		log.info("Click SignUp/Login link");
		driver.findElement(By.linkText("Signup / Login")).click();

		return pages.loginOrSignupPage.ensurePageLoaded();
	}

}
