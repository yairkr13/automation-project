package pages.usual_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

    public class MessagesPage extends MenusPage {
        public MessagesPage(MainPageManager pages) {
            super(pages);
    }

    public MessagesPage ensurePageLoaded() {
        super.ensurePageLoaded();
        waitBig.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Continue"))));
        return this;
    }

    public HomePage clickContinue(){
        log.info("Click 'Continue' button");
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        return pages.homePage.ensurePageLoaded();
    }
}
