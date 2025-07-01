package pages.usual_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class LoginOrSignupPage extends MenusPage {
    public LoginOrSignupPage(MainPageManager pages) {
        super(pages);
    }
    public LoginOrSignupPage ensurePageLoaded() {
        super.ensurePageLoaded();
        waitBig.until(ExpectedConditions.presenceOfElementLocated(By.className("signup-form")));
        return this;
    }

    public LoginOrSignupPage typeUsername(String username){
        log.info("Fill 'Name' textbox '"+ username +"'");
        driver.findElement(By.name("name")).sendKeys(username);
        return this;
    }

    public LoginOrSignupPage typeSignupEmail(String email){
        log.info("Fill 'Email Address' textbox '"+ email +"'");
        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
        return this;
    }

    public RegisterPage clickSignupBtn(){
        log.info("Click 'Signup' button");
        driver.findElement(By.xpath("//button[text()='Signup']")).click();

        return pages.registerPage.ensurePageLoaded();
    }
}
