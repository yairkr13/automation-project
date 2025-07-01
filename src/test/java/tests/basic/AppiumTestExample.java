package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import tests.supers.TestBase;

public class AppiumTestExample extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			log.info("Click AC");
			driver.findElement(By.id("com.google.android.calculator:id/clr")).click();

			log.info("Click PI");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"pi\"]")).click();

			log.info("Click *");
			driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();

			log.info("Click PI");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"pi\"]")).click();

			log.info("Click -");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();

			log.info("Click 5");
			driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();

			log.info("Click =");
			driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();

			log.info("Get result...");
			String result = driver.findElement(By.className("android.widget.TextView")).getText();
			log.info("Result is : " + result);

			log.info("Rotate Landscape");
			((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE);
			log.info("Rotate Portrait");
			((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);


			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
