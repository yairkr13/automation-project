package pages.usual_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class HomePage extends MenusPage {
    public HomePage(MainPageManager pages) {
        super(pages);
    }
    public HomePage ensurePageLoaded() {
        super.ensurePageLoaded();
        log.info("Verify that main page opened successfully");
        waitBig.until(ExpectedConditions.presenceOfElementLocated(By.className("features_items")));
        return this;
    }

    public HomePage verifyLogoutLink(){
        log.info("Ensure 'Logout' link appears above");
        driver.findElement(By.cssSelector("a[href='/logout']"));
        return this;
    }

    public HomePage verifyDeleteLink(){
        log.info("Ensure 'Delete Account' link appears above");
        driver.findElement(By.cssSelector("a[href='/delete_account']"));
        return this;
    }
}
